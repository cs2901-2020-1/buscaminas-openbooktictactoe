import java.util.Scanner;

public class Juego{
    //Atributos
    private int puntaje;
    Tablero tablero = new Tablero();
    Ventana ventana = new Ventana();
    //Metodos
    public void iniciar(){
        tablero.setTablero(10);
        ventana.imprimirTablero(tablero);
        Scanner myObj = new Scanner(System.in);
        while(true){
            //getmove
            System.out.println("Ingrese posición en x: ");
            int x = myObj.nextInt();
            System.out.println("Ingrese posición en y: ");
            int y = myObj.nextInt();
            tablero.cambiarEstado(x, y);
            ventana.imprimirTablero(tablero);
            if(validate(x,y)){
                break;
            }
        }
        System.out.println("GameOver GG\n");
    }
    public void reiniciar(){
        iniciar();
    }
    public boolean validate(int x,int y){
        if( (tablero.tablero[x][y]).mina == true){
            return true;
        }
        return false;
    }
}