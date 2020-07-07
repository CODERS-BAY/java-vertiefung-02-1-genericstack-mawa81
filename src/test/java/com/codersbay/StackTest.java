package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void checkPeekForEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            new Stack<Integer>().peek();
        });
    }

    @Test
    void checkPopForEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            new Stack<Integer>().pop();
        });
    }

    @Test
    void lengthTest() {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.push(9);
        assertEquals(4, stack.length());
    }

    @Test
    void popTest() {
        Stack<String> stack = new Stack<String>();
        stack.push("monday");
        stack.push("tuesday");
        stack.push("wednesday");
        stack.push("thursday");
        assertEquals("thursday", stack.pop());

        assertEquals(new ArrayList<String>(Arrays.asList("monday", "tuesday", "wednesday")).toString(), stack.toString());
    }

    @Test
    void peekTest() {
        Stack<Boolean> stack = new Stack<Boolean>();
        stack.push(true);
        stack.push(true);
        stack.push(false);
        stack.push(true);

        Stack testStack = Arrays.asList(true, true, false, true);
        assertSame(testStack, stack);
    }

    @Test
    void pushTest() {
    }
}