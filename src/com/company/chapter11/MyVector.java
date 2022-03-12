package com.company.chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List {
    Object[] data = null;
    int capacity = 0;
    int size = 0;

    public MyVector(int capacity) {
        if(capacity < 0){
            throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
        }
        this.capacity = capacity;
        data = new Object[capacity];
    }
    public MyVector(){
        this(10);
    }
    public void trimToSize(){
        setCapacity(size);
    }
    public void ensureCapacity(int minCapacity){
        if(minCapacity - data.length > 0)
            setCapacity(minCapacity);
    }
    private void setCapacity(int capacity){
        if(this.capacity == capacity){
            return;
        }
        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < size; ++i)
            if(o.equals(data[i]))
                return true;

        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[size];
        System.arraycopy(data, 0, result, 0, size);

        return result;
    }

    @Override
    public boolean add(Object o) {
        ensureCapacity(size + 1);
        data[size++] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for(int i = 0; i <size; ++i)
            if(o.equals(data[i])){
                remove(i);
                return true;
            }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for(int i =0; i < size; ++i)
            data[i] = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[index];
    }

    @Override
    public Object set(int index, Object element) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        data[index] = element;
        return data[index];
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        Object oldObj = null;
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        oldObj = data[index];
        if(index != size -1)
            System.arraycopy(data, index+1, data, index, size-index-1);
        data[size-1] = null;
        size--;
        return oldObj;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

}
