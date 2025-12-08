package Ejercicio17;

public class App {
    public static int[] girarDerecha(int[] array, int numero) {
        int posicion = 0;
        int lastDigit = 0;
        int indice = 0;
        int resultado[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero)
                posicion = i;
            if (i == (array.length - 1))
                lastDigit = array[i];
        }
        while (posicion != array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0)
                    resultado[indice++] = lastDigit;
                else
                    resultado[indice++] = array[i - 1];
            }
            for (int i = 0; i < array.length; i++) {
                if (resultado[i] == numero)
                    posicion = i;
                if (i == (array.length - 1))
                    lastDigit = resultado[i];
            }
            indice = 0;
        }
        return resultado;
    }

    public static void main(String[] args) {
        boolean esta = false;
        int numeroIntroducido = 0;
        int numeros[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 101);
            numeros[i] = random;
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        while (!esta) {
            numeroIntroducido = Integer.parseInt(System.console().readLine("Introduzca un valor de la array: "));
            for (int i = 0; i < 10; i++) {
                if (numeros[i] == numeroIntroducido)
                    esta = true;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(girarDerecha(numeros, numeroIntroducido) + " ");
        }
    }
}
