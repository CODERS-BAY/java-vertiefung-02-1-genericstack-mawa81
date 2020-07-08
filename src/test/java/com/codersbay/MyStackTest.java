package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MyStackTest {

    @Test
    void checkPeekForEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            new MyStack<Integer>().peek();
        });
    }

    @Test
    void checkPopForEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            new MyStack<Integer>().pop();
        });
    }

    @Test
    void lengthTest() {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.push(9);

        assertEquals(4, stack.length());
    }

    @Test
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
    void peekTest() {
        MyStack<Boolean> stack = new MyStack<Boolean>();
        stack.push(true);
        stack.push(true);
        stack.push(false);
        stack.push(true);

        List<Boolean> testStack = Arrays.asList(true, true, false, true);
        assertEquals(testStack.toString(), stack.toString());
    }
}