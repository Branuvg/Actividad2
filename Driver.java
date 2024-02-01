import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Driver {

    private File Archv;

    // constructor
    public Driver() {
        this.Archv = new File("datos.txt");
    }

    public String leer(ArrayList<String> operators) {
        String operation = "";
        try {
            // Lector
            BufferedReader br = new BufferedReader(new FileReader(Archv));
            
            String line;
            
            while ((line = br.readLine()) != null) { 

                operation = line;
                String [] op = line.split(" ");
                for (String c : op) {
                    if (c.equals("+") || c.equals("-")||c.equals("*")||c.equals("/")){
                        operators.add(c);
                    }}
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return operation;
    }

    public static void main(String[] args) {
        Driver driver = new Driver();
        ArrayList<String> operators = new ArrayList<>();
        driver.leer(operators);
        
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
                        System.out.println("La operación es: " + operacion.leer());
                        for (int i = 0; i < operators.size(); i++) {
                            
                        }
                        //System.out.println("Resultado: " + posfixOperation.postfixOperate());
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
