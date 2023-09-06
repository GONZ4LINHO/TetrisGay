package tetris.gay;

public class Tetris {
    public static void main(String[] args) {
        int[][] matrizStick = {
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0},
            {1, 0, 0, 0}
        };

        int[][] rotatematriz = rotarMatriz(matrizStick);

    }

    // Método para rotar una matriz en sentido horario
    public static int[][] rotarMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] rotatematriz = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                rotatematriz[j][filas - 1 - i] = matriz[i][j];
            }
        }

        return rotatematriz;
    }
    
    
}
