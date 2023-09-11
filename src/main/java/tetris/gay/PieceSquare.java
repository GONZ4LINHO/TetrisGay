package tetris.gay;

public class PieceSquare extends PieceBase{
    public PieceSquare(){
        this.name = "cubo";
        this.matrizforma = new int[][]{
            {0,0,0,0}, 
            {0,0,0,0}, 
            {1,1,0,0}, 
            {1,1,0,0}  
        };
    }
}