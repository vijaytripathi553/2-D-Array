package com.twodarray.learning;
import java.util.*;

public class CreateAndDisplay2DArrayElement {
	
	
	private static int[][] display(int array1[][],int row,int col) {
		int ans=0;
		for (int i = 0; i < row; i++) {
			System.out.println();
			for (int j = 0; j < col; j++) {
				System.out.print(array1[i][j]+"\t");  
			//	return array1;   
				
			}
		}
		return array1;
	}

	
	// Main mathod
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of rows:");
		int row=sc.nextInt();
		
		System.out.println("Enter the no of cols:");
		int col=sc.nextInt();
		
		int array1[][]=new int[row][col];
		
		System.out.println("Ente"+row+"and "+col+"elements");
		
		for(int i=0; i<row;i++) {
			for (int j = 0; j < col; j++) {
				
				array1[i][j]=sc.nextInt();
				
			}
			
		}
		
		//mathod calling 
		int result[][]=display(array1,row,col);
		System.out.println(result);
	//System.out.println(display(array1,row,col));// [[I@55f96302
	
		
		
		
	}


}
