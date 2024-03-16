import java.util.Scanner;
import dispensador.*;

public class App {
    public static void main(String[] args) {
        // Solicitar al usuario que ingrese la cantidad a dispensar
        System.out.println("Ingrese la cantidad a dispensar (debe ser un múltiplo de 5,000):");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        
        // Verificar si la cantidad es un múltiplo de 5,000
        if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad ingresada no es un múltiplo de 5,000");
            return; // Finalizar el programa
        }
        
        // Crear instancias de los dispensadores específicos
        Dispensador100000 dispensador100k = new Dispensador100000();
        Dispensador50000 dispensador50k = new Dispensador50000();
        Dispensador20000 dispensador20k = new Dispensador20000();
        Dispensador10000 dispensador10k = new Dispensador10000();
        Dispensador5000 dispensador5k = new Dispensador5000();
        
        // Establecer la cadena de responsabilidad
        dispensador100k.establecerSiguiente(dispensador50k);
        dispensador50k.establecerSiguiente(dispensador20k);
        dispensador20k.establecerSiguiente(dispensador10k);
        dispensador10k.establecerSiguiente(dispensador5k);
        
        // Llamar al método dispensar en la instancia de DispensadorBase
        DispensadorBase dispensadorBase = dispensador100k;
        dispensadorBase.dispensar(cantidad);
        
        // Cerrar el scanner
        scanner.close();
    }
}
