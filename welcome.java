'''Implement a program to read user name and display welcome message on the console.

Input Format
read user name
Constraints
no
Output Format
print message in the following form
welcome name'''

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("welcome "+ name);
    }
}
