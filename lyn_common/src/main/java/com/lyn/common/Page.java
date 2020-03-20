package com.lyn.common;

import java.io.Serializable;

/**
 * @Description
 */
public class Page<T> implements Serializable {

    private static final long serialVersionUID = -849440949280551003L;

    private int totalCount;

    private int pageSize = 10;

    private int pageNum;

    private T data;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
