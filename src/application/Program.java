package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Line(s) number: ");
		int n = sc.nextInt();
		
		System.out.print("Column(s) number: ");
		int m = sc.nextInt();
		
		int [][] a = new int[n][m];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.printf("Digite o elemento a[%d][%d]: ", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("");
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.print("Enter a element in Matriz: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				
				if(a[i][j] == x) {
					System.out.printf("Position %d, %d:%n", i, j);
					
					if (j-1 >= 0) {
						System.out.println("Left: " + a[i][j-1]);
					}
					
					if (i-1 >= 0) {
						System.out.println("Up: " + a[i-1][j]);
					}
					
					if (j+1 < a[i].length) {
						System.out.println("Right: " + a[i][j+1]);
					}
					
					if (i+1 < a.length) {
						System.out.println("Down: " + a[i+1][j]);
					}
					
				}
				
			}
		}
		

	}

}
