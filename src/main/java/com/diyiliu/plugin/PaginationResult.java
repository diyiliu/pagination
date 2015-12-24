package com.diyiliu.plugin;

import java.util.List;

/**
 * Description: PaginationResult
 * Author: DIYILIU
 * Update: 2015-12-22 15:34
 */
public class PaginationResult {

    private int total;

    private List data;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
