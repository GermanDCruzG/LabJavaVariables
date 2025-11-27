package Laboratorios;

import java.util.Scanner;

public class ValidadorPerfilUsuario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Captura de datos
        String nombreUsuario;
        int edad;
        double saldoCuenta;
        boolean esPremium;

        System.out.print("Ingrese su nombre de usuario: ");
        nombreUsuario = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.print("Ingrese el saldo de su cuenta: ");
        saldoCuenta = sc.nextDouble();

        // Limpiar buffer antes de leer boolean con texto
        sc.nextLine();  // <- muy importante

        System.out.print("¿Es usuario premium? (true/false): ");
        esPremium = sc.nextBoolean();

        // 2. Lógica de validación

        // 1. Acceso exclusivo: edad >= 18 Y esPremium
        boolean accesoExclusivo = (edad >= 18) && esPremium;

        // 2. Califica para promoción: saldo > 1000 O edad < 25
        boolean calificaPromocion = (saldoCuenta > 1000) || (edad < 25);

        // 3. Perfil incompleto: saldo == 0 O nombre != "invitado"
        boolean perfilIncompleto = (saldoCuenta == 0) || (!nombreUsuario.equals("invitado"));

        // 4. Perfil activo total: NO perfilIncompleto Y (accesoExclusivo O calificaPromocion)
        boolean perfilActivoTotal = (!perfilIncompleto) && (accesoExclusivo || calificaPromocion);

        // 3. Resultados
        System.out.println("\n----- RESULTADOS DEL PERFIL -----");
        System.out.println("Acceso exclusivo: " + accesoExclusivo);
        System.out.println("Califica para promoción: " + calificaPromocion);
        System.out.println("Perfil incompleto: " + perfilIncompleto);
        System.out.println("Perfil activo total: " + perfilActivoTotal);

        sc.close();
    }
}

