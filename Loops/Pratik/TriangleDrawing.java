package Pratik;

import java.util.Scanner;

public class TriangleDrawing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("n sayisini girin: ");
		int n = input.nextInt();
		
		 for(int i=0;i<n;i++){
	         int yildiz, bosluk;
	         if(i<n/2) {
	        	 yildiz = 2*i+1;
	         } else if(i == n) {
	        	 yildiz = 2*(i-1) + 1 ;
	         } else {
	        	 yildiz = 2*(n-i-1)+1;
	         }
	         
	         bosluk = (n-yildiz) / 2;
	         
	         for(int j = 0; j< bosluk; j++) {
	        	 System.out.print(" ");
	         }
	         
	         for(int j = 0; j< yildiz; j++) {
	        	 System.out.print("*");
	         }
		     System.out.println();
		 }

	}

}
