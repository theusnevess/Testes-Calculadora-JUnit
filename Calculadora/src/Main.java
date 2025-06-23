import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Faz a instanciação do scanner, utilizado para fazer o input dos valores
        Calculadora calculadora = new Calculadora();

        while (true) {
            System.out.println("---------------------------- CALCULADORA ----------------------------");
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Adição ");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Fechar programa ");

            while (!scan.hasNextInt()) { // Caso o input não seja de inteiros, a mensagem de erro será exibida
                System.out.println("Erro: Entrada inválida. Digite um número válido.");
                scan.next();
            }

            try {
                int escolha = scan.nextInt();
                if (escolha == 5) {
                    System.out.println("Encerrando programa...");
                    break;
                }
                if (escolha < 1 || escolha > 4) {
                    System.out.println("Opção inválida!  Digite um número entre 1 e 5");
                    continue;
                }

                System.out.println("Digite o primeiro elemento da operação: ");
                while (!scan.hasNextDouble()) {
                    System.out.println("Erro: entrada inválida. Digite um número válido.");
                    scan.next(); // Descarta o valor inválido
                }
                double num1 = scan.nextDouble();

                System.out.println("Digite o segundo elemento da operação: ");
                while (!scan.hasNextDouble()) {
                    System.out.println("Erro: entrada inválida. Digite um número válido.");
                    scan.next(); // Descarta o valor inválido
                }
                double num2 = scan.nextDouble();

                switch (escolha) {
                    case 1:
                        double adicao = calculadora.somar(num1, num2);
                        System.out.println("Resultado: " + adicao);
                        break;
                    case 2:
                        double subtracao = calculadora.subtrair(num1, num2);
                        System.out.println("Resultado: " + subtracao);
                        break;
                    case 3:
                        double multiplicacao = calculadora.multiplicar(num1, num2);
                        System.out.println("Resultado: " + multiplicacao);
                        break;
                    case 4:
                        double divisao = calculadora.dividir(num1, num2);
                        System.out.println("Resultado: " + divisao);
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scan.next(); // Limpar entrada inválida
            }
        }
        scan.close();
    }
}

