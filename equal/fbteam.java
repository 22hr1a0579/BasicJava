'''Create a program that takes the number of wins, draws and losses and calculates the number of points a football team has obtained so far.

1. wins get 3 points
2. draws get 1 points
3. losses get 0 points


Input Format

number of wins, draws and losses

Constraints

no'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a*3)+(b*1)+(c*0));
        
    }
}
