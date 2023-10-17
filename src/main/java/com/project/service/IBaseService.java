package com.project.service;

import java.util.List;

public interface IBaseService<T, Y> {

    public T save(T element);
    public T update(T element);
    public List<T> getAll();
    public T get(Y id);
    public boolean remove(Y id);
}
