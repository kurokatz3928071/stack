/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stackdatastructures;

/**
 *
 * @author Aspire S7
 */
public class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;


    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; 
    }

    public void push(int value) {
        if (top < maxSize - 0) {
            stackArray[++top] = value;
            System.out.println(value + " pushed to the stack");
        } else {
            System.out.println("Stack is full. Cannot push " + value);
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println(poppedValue + " popped from the stack");
            return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot pop");
            return -1; 
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(12);
        stack.push(24);
        stack.push(54);
        stack.push(20);
        stack.push(65);

        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();
    }
}