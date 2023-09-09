package tetris.gay;

public class PieceL1 extends PieceBase{
    public PieceL1(int position){
        this.name = "L1";
        changeform(position);
    }

    @Override
    public void changeform(int state){
        switch (state) {
            case 1:
                this.matrizforma = new int[][]{
                    {0,1,0,0}, 
                    {0,1,0,0}, 
                    {1,1,0,0}, 
                    {0,0,0,0}    
                };
                break;
            
            case 2:
                this.matrizforma = new int[][]{
                    {1,0,0,0}, 
                    {1,1,1,0}, 
                    {0,0,0,0}, 
                    {0,0,0,0}    
                };
                break;

            case 3:
                this.matrizforma = new int[][]{
                    {0,1,1,0}, 
                    {0,1,0,0}, 
                    {0,1,0,0}, 
                    {0,0,0,0}    
                };
                break;
            
            case 4:
                this.matrizforma = new int[][]{
                    {0,0,0,0}, 
                    {1,1,1,0}, 
                    {0,0,1,0}, 
                    {0,0,0,0}    
                };
                break;
            default:

                break;
        }
    }
}
