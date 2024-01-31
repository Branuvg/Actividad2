public class Calculadora {

    public int calculate(char operator, int a, int b){
        switch (operator) {
            case '+':
                return add(a, b);
            case '-':
                return dif(a, b);
            case '*':
                return mult(a, b);
            case '/':
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
