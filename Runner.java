package com.ds;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList program");
        //creating object(list) for LinkedList class
        LinkedList list = new LinkedList();
        list.appendNode(56);
        list.appendNode(30);
        list.appendNode(70);
        list.print();
    }
}
