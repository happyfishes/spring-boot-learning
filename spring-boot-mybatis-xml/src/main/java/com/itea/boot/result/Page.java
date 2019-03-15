package com.itea.boot.result;

import com.itea.boot.param.PageParam;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Page
 * @Describe
 * @create 2019-03-15 22:01
 * @Version 1.0
 **/
public class Page<E> implements Serializable {

    private int currentPage = 1;
    private long totalPage;
    private long totalNumber;
    private List<E> list;

    public static Page NULL = new Page(0,0,15, new ArrayList());

    public Page() {
        super();
    }

    public Page(int beginLine, long totalNumber, int pageSize, List<E> list) {
        super();
        this.currentPage = beginLine / pageSize + 1;
        this.totalNumber = totalNumber;
        this.list = list;
        this.totalPage = totalNumber % pageSize == 0 ?
                totalNumber / pageSize : totalNumber / pageSize + 1;
    }

    public Page(PageParam pageParam, long totalNumber, List<E> list) {
        super();
        this.currentPage = pageParam.getCurrentPage();
        this.totalNumber = totalNumber;
        this.list = list;
        this.totalPage = totalNumber % pageParam.getPageSize() == 0 ?
                totalNumber / pageParam.getPageSize() : totalNumber / pageParam.getPageSize() + 1;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(long totalNumber) {
        this.totalNumber = totalNumber;
    }

    public List<E> getList() {
        return list;
    }

    public void setList(List<E> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", totalNumber=" + totalNumber +
                ", list=" + list +
                '}';
    }
}
