package com.masai;

import java.util.Scanner;

public class EvenSum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of rows : ");
		int N = sc.nextInt();
		
		System.out.print("Enter no of columns : ");
		int M = sc.nextInt();
		
		int[][] matrix = new int[N][M];
		
		for(int i=0; i<matrix.length; i++) {
			
			System.out.print("Enter for row "+(i+1)+" : ");
			
			for(int j=0; j<matrix[i].length; j++) {
				int num = sc.nextInt();
				matrix[i][j] = num;
			}
		}
		
		for(int[] arr1:matrix) {
			for(int arr2:arr1) {
				System.out.print(arr2+" ");
			}
			System.out.println();
		}
		sc.close();
		
		// Sum for even element of columns
		
		for(int j=0; j<M; j++) {
			int sum = 0;
			for(int i=0; i<N; i++) {
				if(matrix[i][j]%2==0) {
					sum+=matrix[i][j];
				}
			}
			System.out.println("Sum of coulmn "+(j+1)+" = "+sum);
		}
	}

}
