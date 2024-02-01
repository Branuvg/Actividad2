/** Algoritmos y Estructuras de datos -  seccion 30
 * Luis Francisco Padilla Juárez - 23663
 * Gabrein Bran Bolaños - 23590
 * HT2, Stacks and Postfix
 * 31-01-2324
 * @return Driver
 */


import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(); //instancia de calculadora

        Scanner input = new Scanner(System.in);
        boolean menu = true;

        while (menu) { 
            //impresion de meno
            System.out.println("1. Leer el archivo");
            System.out.println("2.Salir");
            System.out.print("Seleccione una opción: ");
            String option = input.nextLine();

            try {
                int op = Integer.parseInt(option);

                switch (op) {
                    case 1: //operacion y llamado a la calculadora
                        Driver operacion = new Driver();
                        System.out.println("La operación es: " +calculadora.leer("datos.txt") );
                        System.out.println("Resultado: " + calculadora.posfix());
                        break;
                    case 2:
                        menu = false; //salir
                        break;
                    default: //progra defensiva
                        System.out.println("Seleccione una opción del menú");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe seleccionar un número");
            }
        }

    }
}
