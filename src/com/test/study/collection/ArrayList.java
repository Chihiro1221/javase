package com.test.study.collection;

public class ArrayList<T> {
    private int size = 0;
    private int capacity = 10;
    private Object[] value = new Object[capacity];

    public void insert(T element, int index) {
        if (index < 0 || index > capacity)
            throw new ArrayIndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ " + size);
        if (size >= capacity) expand();
        for (int i = size; i > index; --i) value[i] = value[i - 1];
        value[index] = element;
        ++size;
    }

    @SuppressWarnings("unchecked")
    public T remove(int index) {
        if (index < 0 || index > size - 1)
            throw new ArrayIndexOutOfBoundsException("删除位置非法，合法的删除位置为：0 ~ " + (size - 1));
        T target = (T) value[index];
        for (int i = index; i < size; i++) value[i] = value[i + 1];
        --size;
        return target;
    }

    @SuppressWarnings("unchecked")
    public T indexOf(int index) {
        if (index < 0 || index > size - 1)
            throw new ArrayIndexOutOfBoundsException("获取元素位置非法，合法的索引位置为：0 ~ " + (size - 1));
        return (T) value[index];
    }

    public int length() {
        return size;
    }

    private void expand() {
        capacity = capacity + (capacity >> 2);
        Object[] arr = new Object[capacity];
        System.arraycopy(value, 0, arr, 0, size);
        value = arr;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(value[i]);
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
