public class Damas {
    public static void main(String[]args){



        char[][] blancas = {
            {'O', 'O', 'O', 'O', 'O',},
            {'O', 'O', 'O', 'O', 'O',},
            {'O', 'O', 'O', 'O', 'O',},
            {'O', 'O', 'O', 'O', 'O',},
        };

        char[][] negras = {
            {'Ø', 'Ø', 'Ø', 'Ø', 'Ø',},
            {'Ø', 'Ø', 'Ø', 'Ø', 'Ø',},
            {'Ø', 'Ø', 'Ø', 'Ø', 'Ø',},
            {'Ø', 'Ø', 'Ø', 'Ø', 'Ø',},
        };

        char[][] tabla = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',},
        };

    }

    static void procesador (char[][] array2d) {

        System.out.println(" "+array2d [0][0] + " | "+array2d[0][1] + " | " + array2d [0][2] + " | "+array2d [0][3] + " | "+array2d[0][4] + " | " + array2d [0][5] + " | "+array2d [0][6] + " | "+array2d[0][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println(" "+array2d [1][0] + " | "+array2d[1][1] + " | " + array2d [1][2] + " | "+array2d [1][3] + " | "+array2d[1][4] + " | " + array2d [1][5] + " | "+array2d [1][6] + " | "+array2d[1][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println(" "+array2d [2][0] + " | "+array2d[2][1] + " | " + array2d [2][2] + " | "+array2d [2][3] + " | "+array2d[2][4] + " | " + array2d [2][5] + " | "+array2d [2][6] + " | "+array2d[2][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println(" "+array2d [3][0] + " | "+array2d[3][1] + " | " + array2d [3][2] + " | "+array2d [3][3] + " | "+array2d[3][4] + " | " + array2d [3][5] + " | "+array2d [3][6] + " | "+array2d[3][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println(" "+array2d [4][0] + " | "+array2d[4][1] + " | " + array2d [4][2] + " | "+array2d [4][3] + " | "+array2d[4][4] + " | " + array2d [4][5] + " | "+array2d [4][6] + " | "+array2d[4][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println(" "+array2d [5][0] + " | "+array2d[5][1] + " | " + array2d [5][2] + " | "+array2d [5][3] + " | "+array2d[5][4] + " | " + array2d [5][5] + " | "+array2d [5][6] + " | "+array2d[5][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");    
        System.out.println(" "+array2d [6][0] + " | "+array2d[6][1] + " | " + array2d [6][2] + " | "+array2d [6][3] + " | "+array2d[6][4] + " | " + array2d [6][5] + " | "+array2d [6][6] + " | "+array2d[6][7] + " ");
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println(" "+array2d [7][0] + " | "+array2d[7][1] + " | " + array2d [7][2] + " | "+array2d [7][3] + " | "+array2d[7][4] + " | " + array2d [7][5] + " | "+array2d [7][6] + " | "+array2d[7][7] + " ");

    }
    
}
