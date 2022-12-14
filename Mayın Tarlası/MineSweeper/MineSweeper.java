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
						//Sat??r say??s?? 0 olamaz ????nk?? ??st??nde baska sat??r olamayacag?? i??in kontrol olmaz.
						if (row != 0) {
							// sat??r solu 
							if (minesBoard[row - 1][col] == "*") {
								minesCounter++;
							}
							if (col != 0) {
								//sol ??st ??apraz 
								if (minesBoard[row - 1][col - 1] == "*") {
									minesCounter++;
								}
							}
						}
						//Sat??r say??s??, tahtan??n sat??r(index olarak) say??s??na e??it olmamas?? gerekir. ????nk?? alt??nda baska sat??r olmayaca???? i??in kontrol olmaz.
						if (row != rows - 1) {
							//sat??r alt??
							if (minesBoard[row + 1][col] == "*")
								minesCounter++;
							if (col != columns - 1) {
								// sa?? alt ??apraz
								if (minesBoard[row + 1][col + 1] == "*") {
									minesCounter++;
								}
							}
						}
						//Kolon 0 olmamas?? gerekir. ????nk?? 0 oldu??unda sol tarafa kontrol olmayaca???? i??in kolonun 0 olmamas?? gerekir.
						if (col != 0) {
							// kolon solu
							if (minesBoard[row][col - 1] == "*")
								minesCounter++;
							if (row != rows - 1) {
								// sol alt ??apraz
								if (minesBoard[row + 1][col - 1] == "*") {
									minesCounter++;
								}
							}
						}
						//son kolondan sa?? tarafa kontrol olmayaca???? i??in kolonun, tahtan??n kolonuna(index olarak) e??it olmamas?? gerekir.
						if (col != columns - 1) {
							//sa?? yan
							if (minesBoard[row][col + 1] == "*") {
								minesCounter++;
							}
							if (row != 0) {
								//sa?? ??st ??apraz
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
