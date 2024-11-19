public class Calculadora {

    // Método para somar dois números inteiros
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para somar três números inteiros
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Método para somar dois números de ponto flutuante
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para somar três números de ponto flutuante
    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testando a soma de dois inteiros
        int resultado1 = calc.somar(5, 3);
        System.out.println("A soma de 5 e 3 é: " + resultado1);

        // Testando a soma de três inteiros
        int resultado2 = calc.somar(5, 3, 2);
        System.out.println("A soma de 5, 3 e 2 é: " + resultado2);

        // Testando a soma de dois números de ponto flutuante
        double resultado3 = calc.somar(5.5, 3.3);
        System.out.println("A soma de 5.5 e 3.3 é: " + resultado3);

        // Testando a soma de três números de ponto flutuante
        double resultado4 = calc.somar(5.5, 3.3, 2.2);
        System.out.println("A soma de 5.5, 3.3 e 2.2 é: " + resultado4);
    }
}
