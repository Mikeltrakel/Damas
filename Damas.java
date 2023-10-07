//Parking de cursores [     ]
// Lo siguiente por hacer es el movimento de las fichas.
// Una ficha se mueve de base en diagonal, si son fichas del jugardor 1 hacia abajo a la izquierda o abajo a la derecha
// si son del jugador dos, se mueven hacia arriba izq o arriba derecha.
// desarrolla una funcion que tenga como parametros de entrada:
//  1) El turno en el que se encuentra (ya sea turno 1,2,3,4... o turno de jugador blanco, turno de jugar negro (te lo dejo a tu decision))
//  2) posicion de la ficha que se quiere mover (ej; la 3,6 o la 1,1 o la 0,4)
//  3) direccion en la que se quiere mover (izq o derecha (implementacion a tu gusto tmb))
// Esta funcion deberá realizar el movimiento de la ficha en el tablero, hacer la accion de comer una ficha (esto dejalo para el final)
// Despues de llamar a esta funcion se deberia imprimir el tablero
// Tener en cuenta que más tarde habrá fichas que sean capaces de moverse libremente en todos los ejes (como si fuera la dama del ajedrez) pero dejalo tambien para el final
// SUERTE XOXO ;)

public class Damas {
    static int ROW = 8;
    static int COL = 8;
    static int EMPTYESPACE = 0;
    static int BLACKINITIALROWS = 3;
    static int BLACKTOKEN = 1;
    static int WHITEINITIALROWS = ROW - BLACKINITIALROWS - 1;
    static int WHITETOKEN = 2;


    public static void main(String[]args){

        int[][] tabla = startTable();
        printTable(tabla);

    }

    private static int[][] startTable() {

        int[][] board = new int[ROW][COL];

        for (int actualRow = 0; actualRow < ROW; actualRow++) {
            for (int actualCol = 0; actualCol < COL; actualCol++) {
                if (actualRow < BLACKINITIALROWS || actualRow > WHITEINITIALROWS){
                    if (actualRow%2==1&&actualCol%2==0 || actualRow%2==0&&actualCol%2==1) {
                        if(actualRow < BLACKINITIALROWS){
                            board[actualRow][actualCol]=BLACKTOKEN;
                        }
                        else {
                            board[actualRow][actualCol]=WHITETOKEN;
                        }
                    }                  
                    else{ 
                        board[actualRow][actualCol]=EMPTYESPACE;
                    }
                }             
            }       
        }
        return board;
        
    }

    private static void printTable (int[][] board) {
        for (int actualRow = 0; actualRow <= ROW; actualRow++) {    
            for (int i = 0; i < ROW; i++) {
                System.out.print(" ---");
            }
            if(actualRow<ROW){
                System.out.println();
                System.out.print("| ");
                for (int actualCol = 0; actualCol < COL; actualCol++) {
                    if (board[actualRow][actualCol] == EMPTYESPACE) {
                        System.out.print("  | ");
                    }
                    if (board[actualRow][actualCol] == WHITETOKEN) {
                        System.out.print(WHITETOKEN + " | ");
                    }
                    if (board[actualRow][actualCol] == BLACKTOKEN) {
                        System.out.print(BLACKTOKEN + " | ");
                    }
                }
            }                
            System.out.println();
        }
                  
    }

}
