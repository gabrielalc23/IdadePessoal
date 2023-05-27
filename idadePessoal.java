import java.util.Scanner;
public class idadePessoal {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de idades (até 9): ");
        int quantidade = scanner.nextInt();

        if (quantidade > 9) {
            System.out.println("A quantidade de idades não pode ser maior que 9.");
            return;
        }

        int[] idades = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite a idade " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
        }

        int diferencaMaxima = calcularDiferencaMaxima(idades);

        System.out.println("A maior diferença entre as idades é: " + diferencaMaxima);
    }

    public static int calcularDiferencaMaxima(int[] idades) {
        int max = idades[0];
        int min = idades[0];

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > max) {
                max = idades[i];
            }
            if (idades[i] < min) {
                min = idades[i];
            }
        }

        int diferencaMaxima = max - min;
        return diferencaMaxima;
    }
}