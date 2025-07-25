package com.gqt.corejava.pattern;
import java.util.Scanner;
 public class pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
	        System.out.println("enter the size=:");
	        int n=sc.nextInt(); 
	       int n1=n;
	        for(int i=1;i<=n;i++) {
	        	
	        	for( int j=1;j<=i;j++) {
	              System.out.print("* ");
	        	}
	              n1=n1-1;
	        
	        	
	        	 System.out.println();	
	}
  
}
}

