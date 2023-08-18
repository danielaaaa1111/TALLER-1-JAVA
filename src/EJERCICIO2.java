import java.util.Scanner;

public class EJERCICIO2{

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");

        char caracter2 = sc.next().charAt(0);


        if (java.lang.Character.isLetter(caracter2)) {
        if (java.lang.Character.isUpperCase(caracter2)) {

        System.out.println("El carácter es una letra mayúscula.");
        } else {
        System.out.println("El carácter es una letra minúscula.");
        }
        } else if (java.lang.Character.isDigit(caracter2)) {

        System.out.println("El carácter es un número.");

        } else {

        System.out.println("El carácter no es una letra ni un número.");

        }


        }

        }

