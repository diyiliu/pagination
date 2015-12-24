package com.diyiliu.plugin;

/**
 * Description: PaginationHelper
 * Author: DIYILIU
 * Update: 2015-11-20 16:16
 */
public class PaginationHelper {

    private static ThreadLocal<Pagination> LOCAL_PAGINATION = new ThreadLocal<Pagination>();

    public static void page(int currentPage, int pageSize){
        Pagination pagination = LOCAL_PAGINATION.get();
        if (pagination == null){
            pagination = new Pagination();
        }
        pagination.setCurrentPage(currentPage);
        pagination.setPageSize(pageSize);

        LOCAL_PAGINATION.set(pagination);
    }

    public static Pagination getPage(){

        return LOCAL_PAGINATION.get();
    }

    public static void clear(){

        LOCAL_PAGINATION.remove();
    }
}
