package com.gqt.corejava.pattern;
import java.util.Scanner;
 public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner (System.in);
	        System.out.println("enter the size:");
	        int n=sc.nextInt(); 
	       int n1=0;  
	        for(int i=1;i<=n;i++) {
	        	for( int j=1;j<=n;j++) {
	              System.out.print(j+n1+" ");
	              
	        }
	        	n1=n1+5;
	        	 System.out.println();	
	}
  
}
}

