package org.example.generics;
/**
 * 10:27 AM
 * 05-08-2022
 */

import java.util.Scanner;

public class Ex1<T>{
    void genericsPrint(T t){
        System.out.println(t);
    }
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        StringBuffer stringBuffer;
        String a="a";
        String  b="b";
        a.compareTo(b);


        Ex1 ex1=new Ex1();
        ex1.genericsPrint(12);
    }
}
