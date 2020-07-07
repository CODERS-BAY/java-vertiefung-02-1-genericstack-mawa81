package com.codersbay;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private List<T> stack;

    public Stack() {
        this.stack = new ArrayList<T>();
    }

    public int length() {
        return stack.size();
    }

    // returniert das letzte Element im Stack und löscht es vom Stack
    //   wirft eine StackEmptyException falls der Stack leer ist
    public T pop() {
        if (stack.size() > 0) {
            T item = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return item;
        } else {
            throw new EmptyStackException();
        }
    }

    //  returniert das letzte Element im Stack, lässt den Stack aber unverändert
    //  wirft eine StackEmptyException falls der Stack leer ist*/
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

        Stack<?> stack1 = (Stack<?>) o;

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
    // Teste deine Implementierung ausführlich mit Unit Tests. Verwende mindestens
    // einen MyStack, MyStack und MyStack. Bill darf dabei eine ganz simple Klasse
    // zur Repräsentation einer Rechnung sein.

}
