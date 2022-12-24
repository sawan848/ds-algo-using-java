package org.example.string;

/**
 * 06:25 PM
 * 06-09-2022
 */

public class Q2 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("sawankumar");
        stringBuffer.append(12);
        CharSequence charSequence = stringBuffer.subSequence(2, 4);
        System.out.println("charSequence = " + charSequence);

        StringBuilder stringBuilder=new StringBuilder();


    }
}
