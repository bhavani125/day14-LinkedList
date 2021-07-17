package com.ds;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList program");
        //creating object(list) for LinkedList class
        LinkedList list = new LinkedList();
        list.addNode(70);
        list.addNode(30);
        list.addNode(56);
        list.print();
    }
}
