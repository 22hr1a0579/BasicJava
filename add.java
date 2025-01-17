'''Implement a program to read two integer values from the user and perform addition operation.

Input Format

two integer values
Constraints
no
Output Format
an integer value on the console'''


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }
}

