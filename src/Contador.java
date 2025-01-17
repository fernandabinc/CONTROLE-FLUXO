import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Utilize nextInt() para ler um número inteiro

        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Utilize nextInt() para ler um número inteiro
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.err.println("Erro: " + e.getMessage()); // Imprima a mensagem de erro da exceção
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = parametroDois - parametroUm;

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
