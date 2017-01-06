import java.util.*;

public class AveryHW {

	/**
	 * @author Avery's Asus
	 */

	public static int RandomNumber() {
		int num = (int) (Math.random());
		return num;
	}

	public static void Grid(double[][] pacManPosition, double[][] ghostPosition) {
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 9; i++) {
				if (i == ghostPosition[0][0] && j == ghostPosition[1][1])
					System.out.print("G ");
				else if (i == pacManPosition[j][i] && j == pacManPosition[j][i])
					System.out.print("P ");
				else
					System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void move(double[][] position, int direction) {
		direction = RandomNumber();
		for (int i = 0; i < position.length; i++) {
			int sum = 0;
			for (int j = 0; j < position[i].length; j++) {
				position[i][j] = (int) (Math.random() * 2);
				sum += position[i][j];
			}
		}
	}

	
	// switch (direction) {
	// case 0:
	// case 1:
	// if ((position[0][0] == 0 && 0 <= position[1][1] && position[1][1] <=
	// 8))
	// direction = RandomNumber();
	// else
	// position[0][0]++;
	// break;
	// case 2:
	// if (position[0] == )

	public static void main(String[] args) {
		double[][] PacManPosition = new double[4][4];
		double[][] GhostPosition = new double[4][4];
		int RandomNumber = RandomNumber();

		for (int i = 1; i <= 100; i++) {
			System.out.printf("---- Frame %d ----\n", i);
			Grid(PacManPosition, GhostPosition);

			move(PacManPosition, RandomNumber);
			move(GhostPosition, RandomNumber);

			if (PacManPosition == GhostPosition) {
				i += 1;
				System.out.printf("---- Frame %d ----\n", i);
				Grid(PacManPosition, GhostPosition);
				System.out.println("**** Game End ****\nPacman escaped from the ghost!");
				break;
			}

			else if (PacManPosition == 8 && PacManPosition == 0) {
				i += 1;
				System.out.printf("---- Frame %d ----\n", i);
				Grid(PacManPosition, GhostPosition);
				System.out.println("**** Game End ****\nPacman escaped from the Ghost!");
				break;
			}

			else if (i == 100) {
				System.out.println("**** Game End ****\n");
				break;
			}
		}
	}
}
