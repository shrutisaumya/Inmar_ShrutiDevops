/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Shruti
 */
public class fizzbuzz {
    public static void main(String[] args)	
	{
	
	for (int i = 1; i <= 100; i++)
	{
	if (i % 3 == 0 && i % 5 ==0) 
	{
	  System.out.println("fizzbuzz");
	}
	else if (i % 3  == 0 )
	{
	  System.out.println("fizz");
	}
	else if (i % 5== 0)
	{
	  System.out.println("buzz");
	}
	else{
	System.out.println(i);
	}
	}
	}
}
