package io.spring.application;

public class Page {
    private static final int MAX_LIMIT = 100;
    private int offset = 0;
    private int limit = 20;

    public Page() {
    }



    public Page(int offset, int limit) {
        setOffset(offset);
        setLimit(limit);
    }

    private void setOffset(int offset) {
        if (offset > 0) {
            this.offset = offset;
        }
    }

    private void setLimit(int limit) {
        if (limit > MAX_LIMIT) {
            this.limit = MAX_LIMIT;
        } else if (limit > 0) {
            this.limit = limit;
        }
    }

    public int getLimit() {
        return limit;
    }

    public int getOffset() {
        return offset;
    }

}
