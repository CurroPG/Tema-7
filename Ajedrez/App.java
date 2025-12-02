package Ajedrez;

public class App {

    public static final String FONDO_NEGRO = "\u001B[40m";
    public static final String FONDO_BLANCO = "\u001B[47m";
    public static final String RESET = "\033[0m";

    static char casilla[][] = new char[8][8];
    static boolean color = true;

    static String inputLetra = "";
    static char letraCasilla = ' ';
    static int numeroCasilla = 0;

    public static void main(String[] args) {

        System.out.print("Introduce la letra de tu casilla: ");
        inputLetra = System.console().readLine();
        char letraCasilla = inputLetra.charAt(0);

        System.out.print("Introduce el numero de tu casilla: ");
        numeroCasilla = Integer.parseInt(System.console().readLine());

        casilla[numeroCasilla][letraCasilla] = 1;

        printBox();

    }

    public static void printBox(){

        for(int i = 0; i<8; i++){
            for(int j=0; j<8; j++){
                System.out.printf("%s ",(casilla[i][j] == 1)?"X":RESET + FONDO_BLANCO + "  " + RESET);
            }
            System.out.println();
        }

        /*for (int i = -1; i <= 8; i++) {
            for (char letra = 96; letra <= 105; letra++) {
                if(letra!=105)color = !color;

                System.out.printf("%2s",
                        ((i == -1 || i == 8) && (letra > 96 && letra < 105)) ? letra
                                : ((letra == 96 || letra == 105) && (i > -1 && i < 8)) ? i + 1 + " "
                                        : (letra < 97 || letra > 104 || i < 0 || i > 7) ? "" :(color)?RESET + FONDO_BLANCO + "  " + RESET:RESET + FONDO_NEGRO + "  " + RESET);
            }
            
            System.out.println();
        }
*/
    }
}
