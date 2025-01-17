'''Implement a program to read number of days and convert it into number of months.
Note: consider 30 days per month

Input Format
number of days
Constraints
no
Output Format
months'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(s/30);
        
    }
}
