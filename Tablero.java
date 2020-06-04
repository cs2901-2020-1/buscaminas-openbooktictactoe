//import Casilla.Casilla;

public class Tablero{
    //Atributos
    int tamano;
    long puntaje;
    public Casilla tablero[][];
    //Metodos
    public void setTablero(int _tamano) {
        tamano = _tamano;
        tablero = new Casilla[tamano][tamano];
        for(int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                tablero[i][j] = new Casilla();
            }
        }
        int minaX;
        int minaY;
        for(int i = 0; i < tamano; i++){
            //minaX = Math.random()*tamano;
            //minaY = Math.random()*tamano;
            minaX = (int) (Math.random()*tamano);
            minaY = (int) (Math.random()*tamano);
            generarMinas(minaX, minaY);
        }
    }
    public void reiniciarTablero() {
        setTablero(tamano);
    }
    public void cambiarEstado(int X, int Y){
        tablero[X][Y].cambiarEstado();
    }
    public void generarMinas(int X, int Y){
        tablero[X][Y].mina = true;
    }
}