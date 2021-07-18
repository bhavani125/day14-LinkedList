package com.ds;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Welcome to LinkedList program");
        //creating object(list) for LinkedList class
        LinkedList list = new LinkedList();
        list.insert(56);
        list.insert(70);
        list.insertMid(2, 30);
        list.print();

        int pop = list.popAtFirst();
        System.out.println(pop);
        list.print();
    }
}