'''Implement a program to perform multiplication operation on given and next to given number.

Input Format

an integer value

Constraints

no

Output Format

multiplication of current and next number'''


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n*(n+1));
        
    }
}
