package tetris.gay;

public class PieceBase{

    protected String name;
    protected int[][] matrizforma;
    protected int position;
    
    public String getName(){
        return name;
    }
    public int[][] getform(){
        return matrizforma;
    }

    public void rotateright(){
        if (this.position<4){
            this.position = position+1;
        } else {
            this.position = 1;
        }
    }

    public void rotateleft(){
        if (this.position>1) {
            this.position = position-1;
        } else {
            this.position = 4;
        }
    }
<<<<<<< HEAD

    public void rotate(int dir){
        if (dir == 1) {
            this.rotateleft();
        } else {
            this.rotateright();
        }
    }
=======
>>>>>>> 89ba50d2249cf464fd43e8ba241d836a3ee5cc69
    
    public void changeform(int state){}
}
