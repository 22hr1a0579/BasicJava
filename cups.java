'''Implement a program to clcualte the free number of cups the user gets for a specified number of cups bought by the user. The user get 1 cup free for every 6 cups bought.

Input Format

number of cups

Constraints

no

Output Format

total number of coffee cups'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        System.out.println(s+s/6);
}
}
