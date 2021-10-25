/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package butterfly;

/**
 *
 * @author ittr
 */
public class ButterflyS {
 
 public static void main(String[] args) 
 {
   for(int i=-3;i<=3;i++)
   {
	for(int j=1;j<=4-Math.abs(i);j++)
	{
	  System.out.print("*");
	}
	for(int j=1;j<=2*Math.abs(i);j++)
	{
	  System.out.print(" ");
	}
	for(int j=1;j<=4-Math.abs(i);j++)
	{
	  System.out.print("*");
	}
	System.out.println();
   }
 }
}
   

