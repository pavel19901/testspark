package com.microtest.converter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloWorld {

    public static void main(String args[]) throws IOException

    {
        System.out.println("Hello World");

        System.out.println("yjykhkjhkjhk".toUpperCase());

        char c ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вводите символы, 'q' — для выхода.");

        do
        {
            c = (char) br.read();
            System.out.println(c);
        } while(c != 'q') ;
    }
}
