'''Implement a program to find division and modulo division of given two integer values.

Input Format

two integer values (seperated by new line char)

Constraints

no

Output Format

division and modulo division'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a/b+" "+a%b);
    }
}
