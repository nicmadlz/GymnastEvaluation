public class Atleta {
    private double bancaA;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;
    private double nota6;

    public Atleta(double bancaA, double nota1, double nota2, double nota3, double nota4, double nota5, double nota6) {
        this.bancaA = bancaA;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.nota6 = nota6;
    }

    public double getBancaA() {
        return bancaA;
    }

    public void setBancaA(double bancaA) {
        this.bancaA = bancaA;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public double getNota6() {
        return nota6;
    }

    public void setNota6(double nota6) {
        this.nota6 = nota6;
    }

    public double maiorNota() {
        double maiorNota = nota1;
        if (nota2 > maiorNota) maiorNota = nota2;
        if (nota3 > maiorNota) maiorNota = nota3;
        if (nota4 > maiorNota) maiorNota = nota4;
        if (nota5 > maiorNota) maiorNota = nota5;
        if (nota6 > maiorNota) maiorNota = nota6;
        return maiorNota;
    }

    public double menorNota() {
        double menorNota = nota1;
        if (nota2 < menorNota) menorNota = nota2;
        if (nota3 < menorNota) menorNota = nota3;
        if (nota4 < menorNota) menorNota = nota4;
        if (nota5 < menorNota) menorNota = nota5;
        if (nota6 < menorNota) menorNota = nota6;
        return menorNota;
    }

    public double mediaBancaB() {
        double maior = maiorNota();
        double menor = menorNota();
        double soma = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
        return (soma - maior - menor) / 4;
    }

    public double notaFinal() {
        return this.bancaA + mediaBancaB();
    }

    public double[] notasOrdenadas() {
        double[] notas = { nota1, nota2, nota3, nota4, nota5, nota6 };
        // Bubble Sort simples
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }
        return notas;
    }
}
