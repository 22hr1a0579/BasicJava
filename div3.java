'''Implement a program to read a number and check whether it is divisible by 3 or not.

Input Format
an integer value
Constraints
no
Output Format
Yes or No
Sample Input 0'''



import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n%3==0)?"Yes":"No");
    }
}
