package tetris.gay;

public class Board {
    int[][] matrizBoard = new int[10][20];

    public int[][] getMatrizBoard() {
        return matrizBoard;
    }
    public void setMatrizBoard(int[][] matrizBoard) {
        this.matrizBoard = matrizBoard;
    }
    public static void Imprimir(Board board) {
        int[][] matriz = board.getMatrizBoard();
        for (int i = 0; i < 10; i++) {
            for (int x = 0; x < 20; x++) {
                System.out.print(matriz[i][x] + " ");
            }
            System.out.println();
        }
    }
}
