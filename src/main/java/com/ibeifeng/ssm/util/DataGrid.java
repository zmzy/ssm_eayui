package com.ibeifeng.ssm.util;

import java.util.List;

/**
 * Created by zmzy on 2016/12/5.
 */
public class DataGrid<T> {
    private int total;
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
