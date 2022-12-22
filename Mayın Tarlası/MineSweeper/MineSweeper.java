package MineSweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int rows;
	int columns;
	int mines;
	String[][] board;
	String[][] minesBoard;

	MineSweeper(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.board = new String[rows][columns];
		this.minesBoard = new String[rows][columns];
		this.mines = (rows * columns) / 4;
	}

	public void fillBoard() {
		Random rand = new Random();
		int randRow;
		int randColumn;

		for (int i = 0; i < mines; i++) {
			randRow = rand.nextInt(rows);
			randColumn = rand.nextInt(columns);
			if (minesBoard[randRow][randColumn] != "*") {
				minesBoard[randRow][randColumn] = "*";
			} else {
				i--;
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				board[i][j] = "-";
				if (minesBoard[i][j] != "*") {
					minesBoard[i][j] = "-";
				}
			}
		}
	}

	public void printBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
	}

	public void printMinesBoard() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(minesBoard[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
	}

	public void play() {
		Scanner input = new Scanner(System.in);
		int row, col;
		int moveCount = ((rows * columns) - mines);
		fillBoard();
		System.out.println("---------------| MAYIN TARLASI | ---------------");

		while (moveCount > 0) {
			System.out.print("Satir sayisini girin: ");
			row = input.nextInt();
			System.out.print("Sutun sayisini girin: ");
			col = input.nextInt();

			if ((row < 0 || row >= rows) || (col < 0 || col >= columns)) {
				System.out.println("Hatali hamle yaptiniz!");
				continue;
			}

			if (minesBoard[row][col] == "*") {
				System.out.println("---------------| GAME OVER! | ---------------");
				printMinesBoard();
				break;
			} else {
				if (board[row][col] != "-") {
					System.out.println("Bu hamleyi zaten yaptiniz!");
				} else {

					int minesCounter = 0;

					if (minesBoard[row][col] != "*") {
						//Satır sayısı 0 olamaz çünkü üstünde baska satır olamayacagı için kontrol olmaz.
						if (row != 0) {
							// satır solu 
							if (minesBoard[row - 1][col] == "*") {
								minesCounter++;
							}
							if (col != 0) {
								//sol üst çapraz 
								if (minesBoard[row - 1][col - 1] == "*") {
									minesCounter++;
								}
							}
						}
						//Satır sayısı, tahtanın satır(index olarak) sayısına eşit olmaması gerekir. Çünkü altında baska satır olmayacağı için kontrol olmaz.
						if (row != rows - 1) {
							//satır altı
							if (minesBoard[row + 1][col] == "*")
								minesCounter++;
							if (col != columns - 1) {
								// sağ alt çapraz
								if (minesBoard[row + 1][col + 1] == "*") {
									minesCounter++;
								}
							}
						}
						//Kolon 0 olmaması gerekir. Çünkü 0 olduğunda sol tarafa kontrol olmayacağı için kolonun 0 olmaması gerekir.
						if (col != 0) {
							// kolon solu
							if (minesBoard[row][col - 1] == "*")
								minesCounter++;
							if (row != rows - 1) {
								// sol alt çapraz
								if (minesBoard[row + 1][col - 1] == "*") {
									minesCounter++;
								}
							}
						}
						//son kolondan sağ tarafa kontrol olmayacağı için kolonun, tahtanın kolonuna(index olarak) eşit olmaması gerekir.
						if (col != columns - 1) {
							//sağ yan
							if (minesBoard[row][col + 1] == "*") {
								minesCounter++;
							}
							if (row != 0) {
								//sağ üst çapraz
								if (minesBoard[row - 1][col + 1] == "*") {
									minesCounter++;
								}
							}
						}

						board[row][col] = Integer.toString(minesCounter);
					}
				}

			}

			moveCount--;
			printBoard();
		}

		if (moveCount == 0) {
			System.out.println("---------------| OYUNU KAZANDIN! | ---------------");
		}
		input.close();
	}
}
