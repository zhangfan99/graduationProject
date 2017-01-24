package com.office.automation.bases.others;

import java.io.Serializable;

/**
 * Created by zhangfan on 2017/1/20.
 */
public class Paging implements Serializable {
    private int record;
    private int pageSize = 20;
    private int pages;
    private int currentPage = 1;
    public static final int FIRST_PAGE = 1;
    public static final int DEFAULT_PAGE_SIZE = 20;

    public Paging() {
    }

    public Paging(int var1) {
        this.pageSize = var1;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public void setCurrentPage(int var1) {
        this.currentPage = var1 < 1?1:var1;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int var1) {
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(int var1) {
        this.pageSize = Math.abs(var1);
    }

    public int getRecords() {
        return this.record;
    }

    public void setRecords(int var1) {
        if(var1 != 0) {
            this.record = var1;
            if(this.pageSize > 0) {
                this.pages = (int)Math.ceil((double)((var1 - 1) / this.pageSize)) + 1;
                if(this.currentPage < 1) {
                    this.currentPage = 1;
                }

                if(this.currentPage > this.pages) {
                    this.currentPage = this.pages;
                }
            }

        }
    }

    public int getFirstPage() {
        return 1;
    }

    public int getPrePage() {
        return this.currentPage - 1 >= 1?this.currentPage - 1:1;
    }

    public int getNextPage() {
        return this.currentPage + 1 > this.pages?this.pages:this.currentPage + 1;
    }

    public boolean isFirst() {
        return this.currentPage == 1;
    }

    public boolean isLast() {
        return this.currentPage == this.pages;
    }

    public int getStartRow() {
        return (this.currentPage - 1) * this.pageSize;
    }
}
