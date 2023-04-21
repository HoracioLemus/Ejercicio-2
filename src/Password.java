/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
        this.contrasena = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }

    public boolean esFuerte() {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracterActual = contrasena.charAt(i);

            if (Character.isUpperCase(caracterActual)) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(caracterActual)) {
                contadorMinusculas++;
            } else if (Character.isDigit(caracterActual)) {
                contadorNumeros++;
            }
        }

        return (contadorMayusculas >= 2 && contadorMinusculas >= 1 && contadorNumeros >= 5);
    }

    public String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasenaAleatoria = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterAleatorio = caracteres.charAt(indice);
            contrasenaAleatoria.append(caracterAleatorio);
        }

        return contrasenaAleatoria.toString();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }

    public String getContrasenia() {
        return contrasena;
    }

    @Override
    public String toString() {
        return contrasena + " " + (esFuerte() ? "Fuerte" : "Débil");
    }
}