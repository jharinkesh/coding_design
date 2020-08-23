package game.theory;

public class Othello {

    public static void main(String[] args) {
	Board b = new Board(8);
	b.init();
	b.disp();
	System.out.println(b.isValid(b.BLACK, 2, 3));
	System.out.println(b.isValid(b.BLACK, 3, 2));
	System.out.println(b.isValid(b.BLACK, 4, 5));
	System.out.println(b.isValid(b.BLACK, 5, 4));

    }
}

class Board {
    int[][] m;
    final int SIZE;
    final int EMPTY = 0, WHITE = 1, BLACK = 2;
    final int[] XDIR = { -1, -1, 0, 1, 1, 1, 0, -1 };
    final int[] YDIR = { 0, 1, 1, 1, 0, -1, -1, -1 };

    Board(int size) {
	this.SIZE = size;
	m = new int[SIZE][SIZE];
    }

    void init() {
	m[3][3] = WHITE;
	m[3][4] = BLACK;
	m[4][3] = BLACK;
	m[4][4] = WHITE;
    }

    boolean isValid(int color, int x, int y) {
	for (int i = 0; i < XDIR.length; i++) {
	    int cX = x + XDIR[i], cY = y + YDIR[i];
	    int count = 0;
	    while (cX >= 0 && cX < SIZE && cY >= 0 && cY < SIZE) {
		if (count > 0 && m[cX][cY] == color)
		    return true;
		if (m[cX][cY] == 0 || m[cX][cY] == color)
		    break;
		count++;
		cX = cX + XDIR[i];
		cY = cY + YDIR[i];
	    }
	}
	return false;
    }

    ////////////////////////////////////////////////

    void disp() {
	log("  ");
	for (int h = 0; h < SIZE; h++)
	    log(" " + h);
	logL("\n-----------------------");

	for (int i = 0; i < SIZE; i++) {
	    log(i + ":");
	    for (int j = 0; j < SIZE; j++) {
		log(" " + m[i][j]);
	    }
	    logL("");
	}
    }

    void logL(Object s) {
	System.out.println(s);
    }

    void log(Object s) {
	System.out.print(s);
    }

}