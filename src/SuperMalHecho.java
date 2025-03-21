import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String producto;
        double precio;
        double impuesto;
        double descuento;
        double total;
        double suma = 0;

        
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Escriba el nombre del producto " + i + ":");
            producto = scanner.nextLine(); 
            
            System.out.println("Ingrese el precio:");
            precio = scanner.nextDouble();
            scanner.nextLine(); 
 
            impuesto = precio * 0.19;
            descuento = (precio > 10000) ? (precio * 0.10) : 0;
            total = precio + impuesto - descuento;
 
            System.out.println("Producto: " + producto + ", Precio final: " + total);
            
            suma += total;
        }

        System.out.println("El total de la compra es: " + suma);
    }
}

