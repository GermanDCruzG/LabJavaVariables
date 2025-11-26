package Laboratorios;
import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Definición de datos
        String nombreProducto;
        double precioProducto;
        int cantidadProducto;
        final double impuesto = 0.21;
        double dineroCliente;

        // 2. Entrada de datos
        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = sc.nextDouble();

        System.out.print("Ingrese la cantidad que desea comprar: ");
        cantidadProducto = sc.nextInt();

        System.out.print("Ingrese el dinero disponible: ");
        dineroCliente = sc.nextDouble();

        // 3. Lógica de negocio
        double subtotal = precioProducto * cantidadProducto;

        double totalAPagar = subtotal + (subtotal * impuesto);

        // Casting a entero para quitar centavos
        int totalRedondeado = (int) totalAPagar;

        // 4. Validación
        boolean puedeComprar = dineroCliente >= totalAPagar;

        // 5. Salida del ticket
        System.out.println("----- TICKET DE COMPRA -----");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: $" + precioProducto);
        System.out.println("Cantidad: " + cantidadProducto);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (21%): $" + (subtotal * impuesto));
        System.out.println("Total a pagar: $" + totalAPagar);
        System.out.println("Total redondeado (sin centavos): $" + totalRedondeado);
        System.out.println("Dinero del cliente: $" + dineroCliente);
        System.out.println("¿Compra aprobada?: " + puedeComprar);

        sc.close();
    }
}

