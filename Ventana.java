//import Tablero.Tablero;

public class Ventana{
    //Atributos

    //Metodos
    void imprimirTablero(Tablero tablero){

      int n = tablero.tamano;
        for(int i = 0; i < 2*n -1; i++){
            for(int j = 0; j < 2*n -1; j++){
                if(j%2==1 &&	i%2 == 0){
                  System.out.print("|");
                }
                else if (i%2 == 1){
                  System.out.print("-");
                }
                 
                else if(tablero.tablero[i/2][j/2].visible == true){

                    if (tablero.tablero[i/2][j/2].mina == true){
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
