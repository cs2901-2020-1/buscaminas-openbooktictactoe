//import Tablero.Tablero;

public class Ventana{
    //Atributos

    //Metodos
    void imprimirTablero(Tablero tablero){
        for(int i = 0; i < tablero.tamano; i++){
            for(int j = 0; j < tablero.tamano; j++){
                if (tablero.tablero[i][j].visible == true){
                    if (tablero.tablero[i][j].mina == true){
                        System.out.print("O");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("X");
                }
            }
            System.out.print("\n");
        }
    }
}