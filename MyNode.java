package com.ds;

public class MyNode {
     int data;
     MyNode next;

    public MyNode(int data) {
        this.data = data;
        this.next = null;
    }


    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

}