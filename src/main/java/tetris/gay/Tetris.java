package tetris.gay;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Tetris {
    Board tablero;

    public void newboard(int alto, int ancho){
        this.tablero = new Board(new int[alto][ancho]);
    }
    
    public PieceBase generatepiece(int tipo, int posicion){
        PieceBase pieza;
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
                pieza = new PieceStick(posicion);
                break;
            
            case 6:
                pieza = new PieceT(posicion);
                break;

            default:
                pieza = new PieceSquare();
                break;
        }
        return pieza;
    }

    private void movepiecedown(){
        if (this.checkboard()) {
            this.tablero.movedown();;
            System.out.println("\033[H\033[2j]]");
            this.tablero.drawboard();
        } else {
            this.tablero.placedown();
            timer.stop();
            this.randomgenerator();
        }
    }

    private void rotatepiece(int dir){
        if (this.checkboard(dir)) {
            this.tablero.getpiece().rotate(dir);
            System.out.println("\033[H\033[2j]]");
            this.tablero.drawboard();
        } else {
            
        }
    }

    private boolean checkboard(int dir){
        PieceBase aux = this.tablero.getpiece();
        aux.rotate(dir);
        int X = this.tablero.getX();
        int Y = this.tablero.getY();
        int[][] m = aux.getform();
        boolean condition = true;
        if (X+4 > this.tablero.getMatrizBoard()[0].length) {
        }
        for (int i = Y; i < Y+4; i++) {
            for (int j = X; j < X+4; j++) {
                if (m[i][j] == 1 && this.tablero.getMatrizBoard()[i][j] == 1) {
                    condition = false;
                }
            }
        }
        return condition;
    }

    private boolean checkboard(){
        int X = this.tablero.getX();
        int Y = this.tablero.getY();
        int[][] m = this.tablero.getpiece().getform();
        boolean condition = true;
        for (int i = Y; i < Y+4; i++) {
            for (int j = X; j < X+4; j++) {
                if (m[i][j] == 1 && this.tablero.getMatrizBoard()[i+1][j] == 1) {
                    condition = false;
                }
            }
        }
        return condition;
    }

    public void randomgenerator(){
        double tipoD = Math.random()*7;
        double poseD = Math.random()*4;
        int poseI = (int)poseD + 1;
        int tipoI = (int)tipoD + 1;
        PieceBase pieza = this.generatepiece(tipoI, poseI);
        double columnaD = Math.random()*(20-validarposicion(pieza));
        int columnaI = (int)columnaD;
        tablero.newpiece(pieza, columnaI);
        timer.start();
    }

    public int validarposicion(PieceBase piece){
        int n = 2;
        for (int i = 1; i < 4; i++) {
            if (piece.getform()[i][0] == 0 && piece.getform()[i][1] == 0 && piece.getform()[i][2] == 0 && piece.getform()[i][3] == 0) {
               n++;
            }
        }
        return n;
    }
        Timer timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                movepiecedown();
            }
        });

    
}
