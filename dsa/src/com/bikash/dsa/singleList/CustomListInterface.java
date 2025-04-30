package com.bikash.dsa.singleList;

public interface CustomListInterface<T> {

    public <T> void addToFront(T element);

    public int size();
    public <T> void add(T element);
    public <T> void removeFromFront();
    public <T> void print();
    public <T> void remove(T element);

    public boolean isEmpty();

//    public <T> T get(int index);
}
