package com.itea.boot.param;

/**
 * @ClassName PageParam
 * @Describe
 * @create 2019-03-15 22:02
 * @Version 1.0
 **/
public class PageParam {

    private int beginLine;
    private Integer pageSize = 10;
    private Integer currentPage = 0;

    public int getBeginLine() {
        return beginLine;
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
