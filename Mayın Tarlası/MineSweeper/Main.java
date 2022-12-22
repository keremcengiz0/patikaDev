package MineSweeper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	        try(Scanner input = new Scanner(System.in)){
	            System.out.print("Oyun alaninin satir sayisini girin: ");
	            int rows = input.nextInt();
	            System.out.print("Oyun alaninin sutun sayisini girin: ");
	            int columns = input.nextInt();
	            MineSweeper mine = new MineSweeper(rows, columns);
	            mine.play();
	          
	        }
	}

}
