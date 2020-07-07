package com.codersbay;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(5);
        stack.push(3);
        stack.push(6);
        stack.push(9);
        System.out.println(stack.length());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.toString());

    }

}
