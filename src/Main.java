/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear array de Passwords
        System.out.print("Ingrese la cantidad de contraseñas a crear: ");
        int n = scanner.nextInt();
        Password[] passwords = new Password[n];

        // Pedir longitud de las contraseñas
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitud = scanner.nextInt();

        // Crear objetos Password y verificar si son fuertes
        boolean[] esFuerteArray = new boolean[n];
        for (int i = 0; i < n; i++) {
            passwords[i] = new Password(longitud);
            esFuerteArray[i] = passwords[i].esFuerte();
        }

        // Imprimir contraseñas y si son fuertes o no
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + passwords[i].getContrasenia() + " " + esFuerteArray[i]);
        }

        // Crear objetos Libro
        scanner.nextLine();
        System.out.print("\nIngrese el ISBN del primer libro: ");
        String isbn1 = scanner.nextLine();
        System.out.print("Ingrese el título del primer libro: ");
        String titulo1 = scanner.nextLine();
        System.out.print("Ingrese el autor del primer libro: ");
        String autor1 = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del primer libro: ");
        int numPaginas1 = scanner.nextInt();
        scanner.nextLine();
        Libro libro1 = new Libro(isbn1, titulo1, autor1, numPaginas1);

        System.out.print("\nIngrese el ISBN del segundo libro: ");
        String isbn2 = scanner.nextLine();
        System.out.print("Ingrese el título del segundo libro: ");
        String titulo2 = scanner.nextLine();
        System.out.print("Ingrese el autor del segundo libro: ");
        String autor2 = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del segundo libro: ");
        int numPaginas2 = scanner.nextInt();
        Libro libro2 = new Libro(isbn2, titulo2, autor2, numPaginas2);

        // Imprimir información de los libros
        System.out.println("\n" + libro1.toString());
        System.out.println(libro2.toString());

        // Comparar número de páginas de los libros
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("\nEl primer libro tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("\nEl segundo libro tiene más páginas.");
        } else {
            System.out.println("\nLos dos libros tienen la misma cantidad de páginas.");
        }
    }
}
