package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyStackTest {

    @Test
    @DisplayName("Check for EmptyStackException when we try to peek an empty Stack")
    void checkPeekForEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            new MyStack<Integer>().peek();
        });
    }

    @Test
    @DisplayName("Check for EmptyStackException when we try to pop an empty Stack")
    void checkPopForEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            new MyStack<Integer>().pop();
        });
    }

    @Test
    @DisplayName("Check the length method")
    void lengthTest() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.push(9);

        assertEquals(4, stack.length());
    }

    @Test
    @DisplayName("Check whether the pop method returns the last entry and delete it")
    void popTest() {
        MyStack<String> stack = new MyStack<String>();
        stack.push("monday");
        stack.push("tuesday");
        stack.push("wednesday");
        stack.push("thursday");

        assertEquals("thursday", stack.pop());

        assertEquals(new ArrayList<String>(Arrays.asList("monday", "tuesday", "wednesday")).toString(), stack.toString());
    }

    @Test
    @DisplayName("Check whether the peek method returns the last entry of the Queue")
    void peekTest() {
        MyStack<Boolean> stack = new MyStack<Boolean>();
        stack.push(true);
        stack.push(true);
        stack.push(false);
        stack.push(true);

        assertEquals(true, stack.peek());
    }
}