package battle2023.ucp;

public class PieceSquare {
    int matrizStick [][] = {
        {0,0,0,0}, 
        {0,0,0,0}, 
        {1,1,0,0}, 
        {1,1,0,0}    
    };
    public PieceSquare(int[][] value) {
        this.matrizStick = value;
    }
    public int[][] getMatrizStick() {
        return matrizStick;
    }
    public void setMatrizStick(int[][] matrizStick) {
        this.matrizStick = matrizStick;
    }
}