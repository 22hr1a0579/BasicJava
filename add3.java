'''Write a program to accept three space seperated integers and print addition of those three numbers.

Input Format

Three space seperated values

Constraints

no

Output Format

addition of those three integers'''


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=a+b+c;
          System.out.println(sum);
        
    }
}
