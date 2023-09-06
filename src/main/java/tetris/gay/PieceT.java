package tetris.gay;

public class PieceT {
    int matrizT [][] = {
        {0,0,0,0}, 
        {0,0,0,0}, 
        {0,1,0,0}, 
        {1,1,1,0}    
    };
    
    public void setMatrizT(int[][] matrizT) {
        this.matrizT = matrizT;
    }
    public int[][] getMatrizT() {
        return matrizT;
    }
    public PieceT(int[][] matrizT) {
        this.matrizT = matrizT;
    }
    
}
