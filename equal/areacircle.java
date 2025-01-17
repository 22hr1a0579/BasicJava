'''Implement a program to find the area of the circle

Input Format

radius value

Constraints

no

Output Format

area of the circle (round to two decimals)'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double res=Math.PI*r*r;
        System.out.printf("%.2f",res);
      
    }
}
