import java.util.Scanner;
//Declaracion clase principal
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Datos usuario
        System.out.println("Nombre de medicamento: ");
        String medicamento = sc.nextLine();

        System.out.println("Precio unitario: ");
        double precioUnitario = sc.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int cantidadPiezas = sc.nextInt();

        //Cálculamos el total
        double totalSinDescuento = precioUnitario*cantidadPiezas;

        //Evaluamos si aplica descuento

        var aplicaDesconto = totalSinDescuento > 500;
        double descuento = aplicaDesconto ? totalSinDescuento * 0.15 : 0;


        //Total a pagar

        double totalConDescuento = totalSinDescuento - descuento;

        //Resumen
        System.out.println("\nResumen de compra: ");
        System.out.println("Nombre del medicamento: " + medicamento);
        System.out.println("Cantidad de piezas: " + cantidadPiezas);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Total sin Descuento: $" + totalSinDescuento);
        System.out.println("Aplica descuento?: " + aplicaDesconto);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        sc.close();
    }
}
