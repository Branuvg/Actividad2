import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Calculadora implements CalculadoraPOSFIX {

    private Stack<Integer> stack = new Stack();
    private ArrayList<Character> operators = new ArrayList<>();

    public boolean isStringDigit(String str) {
        if (str == null || str.isEmpty()) {
            return false; 
        }
    
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false; 
            }
        }
        return true; 
    }

    public String leer(String Archv) {
        String operation = " ";
        try {
            // Lector
            BufferedReader br = new BufferedReader(new FileReader(Archv));
            
            String line;
            
            while ((line = br.readLine()) != null) { 

                operation = line;
                String [] op = line.split(" ");
                for (String c : op) {
                    if (c.equals("+") || c.equals("-")||c.equals("*")||c.equals("/")){
                        operators.add(c.charAt(0));
                    }
                    else if (isStringDigit(c)== true ) {
                        this.stack.push(Integer.parseInt(c));
                        
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return operation;
    }

    public int posfix(){
        
        int result = 0;
        for (int i = 0; i < operators.size(); i++) {
            if (stack.size() < 2) {
                throw new IllegalStateException("No hay suficientes operandos en la pila.");
            }
            int x = stack.pop();
            int y = stack.pop();
            result =  calcular(operators.get(i),x,y);
            stack.push(result);
        }
        return result;
    }

    public int calcular(char operator, int a, int b){
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return dif(a, b);
            case '*':
                return mult(a, b);
            case '/':
                if (b == 0) {
                throw new ArithmeticException("División por cero.");
                }
                return div(a, b);
            default:
                throw new IllegalArgumentException();
        }
    }

    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int mult(int a, int b){
        return a * b;
    }

    public int div(int a, int b){
        return a / b;
    }

}
