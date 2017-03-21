package com.company;

public class Main {

    public static void main(String[] args) {
	    Shuffle deck=new Shuffle();
        deck.FileRead("Class.txt");
        deck.print();
        deck.Shuffle();
        deck.print();
    }
}
