package Ejercicio8;

public class App {
    public static void main(String[] args) {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        int[] temperatura = new int[12];
        for(int i = 0; i < 12; i++){
            temperatura[i] = Integer.parseInt(System.console().readLine("Introduzca la temperatura media de "+ meses[i] + ": "));
        }

        for(int i = 0; i < 12; i++){
            System.out.print("|");
            for(int j = 0; j < temperatura[i]; j++){
                System.out.print("*");
            }
            System.out.print(" " + temperatura[i] + "ºC");
            System.out.println();
        }
    }
}
