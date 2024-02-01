import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Calculadora calculadora = new Calculadora();
        String Archv = "datos.txt";

        Scanner input = new Scanner(System.in);
        boolean menu = true;

        while (menu) { 
            System.out.println("1. Leer el archivo");
            System.out.println("2.Salir");
            System.out.print("Seleccione una opción: ");
            String option = input.nextLine();

            try {
                int op = Integer.parseInt(option);

                switch (op) {
                    case 1:
                        Driver operacion = new Driver();
                        System.out.println("La operación es: " +calculadora.leer("datos.txt") );
                        System.out.println("Resultado: " + calculadora.posfix());
                        break;
                    case 2:
                        menu = false;
                        break;
                    default:
                        System.out.println("Seleccione una opción del menú");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debe seleccionar un número");
            }
        }

    }
}
