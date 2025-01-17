'''Implement a program that takes two inputs from the user a and b, print 'true' if one of them is 10 or if their sum is 10.

Input Format

a and b value

Constraints

no

Output Format

true or false'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==10||b==10||a+b==10)
            System.out.println(true);
        else
            System.out.println(false);
        
    }
}
