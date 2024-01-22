package lesson7_generics;

import java.util.Collections;
import java.util.List;

public class SearchResult <T> {
        private List<T> data;
        private Pagination pagination;

    public SearchResult(List<T> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }
}
