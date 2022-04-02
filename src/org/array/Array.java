package org.array;

public class Array {
public static void main(String[] args) {
	
//2d array
	
	
	
	int a[][]={{1,0,1},{4,2,2},{3,9,3},{1,2,3}};    
	int b[][]={{1,1,0},{2,0,2},{3,5,1}};    
	    
	    
	int c[][]=new int[4][3];  
	 
	  	for(int i=0;i<4;i++)
	  	{    
	for(int j=0;j<3;j++)
	{    
	 c[i][j]=0;      
	for(int k=0;k<3;k++)      
	{      
	c[i][j]+=a[i][k]*b[k][j];      
	}
	System.out.print(c[i][j] +"\t");   
	} 
	System.out.println();   
	}    
	  	}}
	
	
