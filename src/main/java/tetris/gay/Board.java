package tetris.gay;


public class Board {
    int[][] matrizBoard = new int[20][10];
    PieceBase pieza;

    public int[][] getMatrizBoard() {
        return matrizBoard;
    }
    public void setMatrizBoard(int[][] matrizBoard) {
        this.matrizBoard = matrizBoard;
    }


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
            
        }
    }
}
