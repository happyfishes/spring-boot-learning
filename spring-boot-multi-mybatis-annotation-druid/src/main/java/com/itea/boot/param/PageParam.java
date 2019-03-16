package com.itea.boot.param;

/**
 * @ClassName PageParam
 * @Describe
 * @create 2019-03-16 16:56
 * @Version 1.0
 **/
public class PageParam {

    private int beginLine;       //起始行
    private Integer pageSize = 3;
    private Integer currentPage=0; 	   // 当前页

    public int getBeginLine() {
        return pageSize*currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString() {
        return "PageParam{" +
                "beginLine=" + beginLine +
                ", pageSize=" + pageSize +
                ", currentPage=" + currentPage +
                '}';
    }
}
