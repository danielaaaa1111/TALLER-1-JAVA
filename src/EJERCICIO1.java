import java.util.Scanner;

public class EJERCICIO1  {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (número a dividir): ");

        int dividendo = sc.nextInt();

        System.out.print("Ingrese el divisor (número por el cual dividir): ");

        int divisor = sc.nextInt();

        double resultado = (double) dividendo / divisor;

        boolean exactDivision = dividendo % divisor == 0;

        System.out.println("Resultado de la división: " + resultado);

        if (exactDivision) {

            System.out.println("La división es exacta.");

        } else {

            System.out.println("La división no es exacta.");

        }




    }

}