import java.util.Scanner;
import java.util.Arrays;

public class AppAtleta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota da Banca A:");
        double bancaA = in.nextDouble();

        System.out.println("Digite a nota 1 da Banca B:");
        double nota1 = in.nextDouble();

        System.out.println("Digite a nota 2 da Banca B:");
        double nota2 = in.nextDouble();

        System.out.println("Digite a nota 3 da Banca B:");
        double nota3 = in.nextDouble();

        System.out.println("Digite a nota 4 da Banca B:");
        double nota4 = in.nextDouble();

        System.out.println("Digite a nota 5 da Banca B:");
        double nota5 = in.nextDouble();

        System.out.println("Digite a nota 6 da Banca B:");
        double nota6 = in.nextDouble();

        if (bancaA < 0 || bancaA > 10 ||
                nota1 < 0 || nota1 > 10 ||
                nota2 < 0 || nota2 > 10 ||
                nota3 < 0 || nota3 > 10 ||
                nota4 < 0 || nota4 > 10 ||
                nota5 < 0 || nota5 > 10 ||
                nota6 < 0 || nota6 > 10) {
            System.out.println("Erro: notas devem estar entre 0 e 10.");
        } else {
            Atleta atleta = new Atleta(bancaA, nota1, nota2, nota3, nota4, nota5, nota6);

            System.out.println("Maior nota da banca B: " + atleta.maiorNota());
            System.out.println("Menor nota da banca B: " + atleta.menorNota());
            System.out.println("Média da banca B: " + atleta.mediaBancaB());
            System.out.println("Nota final do atleta: " + atleta.notaFinal());
            System.out.println("Notas ordenadas: " + Arrays.toString(atleta.notasOrdenadas()));
        }
    }
}
