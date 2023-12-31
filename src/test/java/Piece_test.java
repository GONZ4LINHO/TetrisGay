import static org.junit.Assert.*;

import org.junit.Test;

import tetris.gay.*;


public class Piece_test{
    @Test
    public void stick_test(){
        PieceStick stick = new PieceStick();

        assertNotNull(stick);
    }
    @Test
    
    public void square_test(){
        PieceSquare square = new PieceSquare();
        assertNotNull(square);
    }
    @Test
    public void testStickComparison_test() {
        PieceStick pieceStick = new PieceStick();
        
        int[][] expectedMatriz = {
            {1, 0, 0, 0}, 
            {1, 0, 0, 0}, 
            {1, 0, 0, 0}, 
            {1, 0, 0, 0}
        };

        //int[][] actualMatriz = pieceStick.getMatrizStick();
        
        assertNotNull(pieceStick.getMatrizStick());
        assertArrayEquals(expectedMatriz, actualMatriz);
    }
    @Test
    public void rotateSticktest(){
        
    }
}

