package tetris.gay;

<<<<<<< HEAD
=======

public class Board {
    int[][] matrizBoard = new int[20][10];
    PieceBase pieza;
>>>>>>> 89ba50d2249cf464fd43e8ba241d836a3ee5cc69

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
<<<<<<< HEAD
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
=======


    public void generatepiece(int columna, int tipo, int posicion){
        switch (tipo) {
            case 1:
                pieza = new PieceDog1(posicion);
                break;
        
            case 2:
                pieza = new PieceDog2(posicion);
                break;

            case 3:
                pieza = new PieceL1(posicion);
                break;
            
            case 4:
                pieza = new PieceL2(posicion);
                break;

            case 5:
                //pieza = new PieceStick(posicion);
                break;
            
            case 6:
                pieza = new PieceT(posicion);
                break;

            default:
                pieza = new PieceSquare();
                break;
        }
        this.placepiece(columna, pieza.getform());

    }

    private void placepiece(int columna, int[][] forma){
        for (int i = 0; i < 4; i++) {
            for (int j = columna; j < columna+4; j++) {
                this.matrizBoard[i][j] = forma[i][j-columna];
            }
            
>>>>>>> 89ba50d2249cf464fd43e8ba241d836a3ee5cc69
        }
    }
}
