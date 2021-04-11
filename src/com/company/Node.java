package com.company;

public class Node {

    Node left;
    Node right;
    int data;

    public Node (int data){
        this.data = data;
    }


    public static void main(String[] args) {
        Node theTree = new Node();

        theTree.insert(50);
        theTree.insert(25);
        theTree.insert(30);
        theTree.insert(17);
        theTree.insert(60);
        theTree.insert(75);

    }


    //PŘIDÁNÍ PRVKU
    public void insert (int value){


        if (value <= data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
            } else {
                if (right == null){
                    right = new Node(value);
                }else{
                    right.insert(value);
                }

        }
    }

    //ODSTRANĚNÍ


    //VYHLEDÁNÍ
    public boolean jeTu (int value){
        if (value == data){
            return true;
        }else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.jeTu(value);
            }
        }else{
            if (right == null){
                return false;
            }else{
                return right.jeTu(value);
            }
        }
    }




}
