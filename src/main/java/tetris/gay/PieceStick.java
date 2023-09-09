package tetris.gay;

public class PieceStick {
    int matrizStick [][] = {
        {1,0,0,0}, 
        {1,0,0,0}, 
        {1,0,0,0}, 
        {1,0,0,0}    
    };
    boolean matrizBoolean[][] = new boolean[4][4];

    public void convertirMatriz() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrizStick[i][j] == 0) {
                    matrizBoolean[i][j] = false;
                } else if (matrizStick[i][j] == 1) {
                    matrizBoolean[i][j] = true;
                }  
            }
        }  
        
    }
    public void setMatrizStick(int[][] value) {
        this.matrizStick = value;
    }
    
    public int[][] getMatrizStick() {
        return this.matrizStick;
    }


    public PieceStick() {
        this.matrizStick = matrizStick;
    }

    public void imprimirMatrizStick() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(this.matrizStick[i][j] + " ");
            }
            System.out.println();
        }
    }
}

