package com.splguyjr.chap99.comprehensive.persistence;

import java.util.List;

public interface Storage<T> {
    void save(List<T> list);
    List<T> load();
}
