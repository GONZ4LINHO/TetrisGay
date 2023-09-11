package tetris.gay;


public class Board {
    int[][] matrizBoard;
    PieceBase pieza;
    int X;
    int Y;

    public int getX() {
        return X;
    }
    public int getY() {
        return Y;
    }
    public Board(int[][] matriz){
        this.matrizBoard = matriz;
    }
    public int[][] getMatrizBoard() {
        return matrizBoard;
    }
    public void setMatrizBoard(int[][] matrizBoard) {
        this.matrizBoard = matrizBoard;
    }
    public PieceBase getpiece(){
        return pieza;
    }

    public void newpiece(PieceBase newPieza, int columna){
        this.pieza = newPieza;
        this.X = columna;
        this.Y = 0;
    }

    public void movedown(){
        Y++;
    }

    public void moveside(int direction){
        if (direction == 1) {
            X = X + 1;
        } else {
            X = X - 1;
        }
    }


    public void placedown(){
            for (int i = Y; i < Y+4; i++) {
                for (int j = X; j < X+4; j++) {
                    matrizBoard[i][j] = pieza.getform()[i][j];
                }
        }
           
    }

    public void drawboard(){
        for (int i = 0; i < matrizBoard.length; i++) {
            System.out.print("|1|");
            for (int j = 0; j < matrizBoard.length; j++) {
                if (i == Y && j == X && pieza.getform()[i][j] == 1) {
                    System.out.print("1");
                } else {
                    System.out.print(matrizBoard[i][j]);
                }
                
            }
            System.out.println("");
        }
    }
}
