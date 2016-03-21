/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

import java.util.Scanner;


/**
 *
 * @author Shruti
 */
public class ssnvalidation {
    public static boolean checklen(String s) {
        boolean valid = false;
        if (s.length() == 11) 
            valid = true;
        else 
            valid = false;
        return valid;
	}
		
public static boolean isDigit(String s, int i) {
     return Character.isDigit(s.charAt(i));
}
 
public static boolean isDash(String s, int i) {
     return s.charAt(i) == '-';
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.println("Enter an SSN Number: ");
String s = input.nextLine();
boolean valid = false;

valid = checklen(s) && isDigit(s, 0) && isDigit(s, 1) && isDigit(s, 2) 
                    && isDash(s, 3)
                    && isDigit(s, 4) && isDigit(s, 5) 
                    && isDash(s, 6)
                    && isDigit(s, 7) && isDigit(s, 8) && isDigit(s, 9) && isDigit(s, 10);
					
if(valid == true)
	System.out.println(s + " is a valid SSN number");
else
	System.out.println(s + " is not a valid SSN number");
}
    
}
