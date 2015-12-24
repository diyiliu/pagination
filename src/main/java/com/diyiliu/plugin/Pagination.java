package com.diyiliu.plugin;

/**
 * Description: Pagination
 * Author: DIYILIU
 * Update: 2015-11-19 17:12
 */
public class Pagination {

    private int pageSize = 10;
    private int currentPage = 1;

    private int maxPage = 0;
    private int totalCount = 0;

    public Pagination() {

    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage < 0 ? 0 : currentPage;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize > 0 ? pageSize : 1;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getMaxPage() {
        maxPage = totalCount % pageSize == 0 ? totalCount / pageSize : totalCount / pageSize + 1;
        return maxPage;
    }

}
