'''Implement a program to extract last three digits numbers from the given four digit number and calcualte sum of those three digits numbers.

Input Format

a four digit integer number as input

Constraints

no

Output Format

sum of last three digit numbers'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n%10+(n/10)%10+(n/100)%10);
    }
}
