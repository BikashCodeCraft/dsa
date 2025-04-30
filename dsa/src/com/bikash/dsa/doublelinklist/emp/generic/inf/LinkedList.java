package com.bikash.dsa.doublelinklist.emp.generic.inf;

public interface LinkedList<T> {

    public <T> void addFirst(T t);
    public <T> void add(T t);
    public <T> void removeFirst();
    public <T> void remove();
    public boolean isEmpty();
    public T get(int index);
}
