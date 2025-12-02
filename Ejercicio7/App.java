package Ejercicio7;

public class App {
    public static void main(String[] args) {
        int[] numero = new int[100];

        for(int i = 0; i < 100; i++){
            int random = (int)(Math.random()*21);
            numero[i] = random;
            System.out.print(numero[i] + " ");
        }

        System.out.println();
        int numeroSustituir = Integer.parseInt(System.console().
        readLine("Elige un número de los que han salio compi: "));
        int numeroAPoner = Integer.parseInt(System.console().
        readLine("Elige un número pa ponerlo compi: "));
        System.out.println();

        for(int i = 0; i < 100; i++){
            if(numeroSustituir == numero[i])
                System.out.print("*" +numeroAPoner+"* ");
            else
                System.out.print(numero[i] + " ");    
        }
    }
}
