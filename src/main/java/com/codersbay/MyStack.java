package com.codersbay;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack<T> {
    private List<T> stack;

    public MyStack() {
        this.stack = new ArrayList<T>();
    }

    public int length() {
        return stack.size();
    }

    public T pop() {
        if (stack.size() > 0) {
            T item = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return item;
        } else {
            throw new EmptyStackException();
        }
    }

    public T peek() {
        if (stack.size() > 0) {
            T item = stack.get(stack.size() - 1);
            return item;
        } else {
            throw new EmptyStackException();
        }
    }

    public void push(T element) {
        stack.add(element);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyStack<?> stack1 = (MyStack<?>) o;

        return stack != null ? stack.equals(stack1.stack) : stack1.stack == null;
    }

    @Override
    public int hashCode() {
        return stack != null ? stack.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "" + stack;
    }

}
