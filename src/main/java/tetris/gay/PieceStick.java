package tetris.gay;

public class PieceStick extends PieceBase{
    public PieceStick(int position){
        this.name = "PALO";
        changeform(position);
    }

    @Override
    public void changeform(int state){
        switch (state) {
            case 1:
                this.matrizforma = new int[][]{
                    {1,0,0,0}, 
                    {1,0,0,0}, 
                    {1,0,0,0}, 
                    {0,0,0,0}    
                };
                break;
            
            case 2:
                this.matrizforma = new int[][]{
                    {1,1,1,1}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}    
                };
                break;

<<<<<<< HEAD
            case 3:
                this.matrizforma = new int[][]{
                    {1,0,0,0}, 
                    {1,0,0,0}, 
                    {1,0,0,0}, 
                    {1,0,0,0}    
                };
                break;
            
                case 4:
                this.matrizforma = new int[][]{
                    {1,1,1,1}, 
                    {0,0,0,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}     
                };
                break;
=======
    public PieceStick() {
        this.matrizStick = matrizStick;
    }
>>>>>>> 89ba50d2249cf464fd43e8ba241d836a3ee5cc69

            default:

                break;
        }
    }
}

