import java.util.Scanner;

public class Uni06Ex04 {
    private Uni06Ex04() {
        Scanner tec = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];
        Leitor(vetor1, vetor2, tec);
        Somador(vetor1, vetor2, vetorSoma);
        Escrever(vetor1, vetor2, vetorSoma);
    }
    private void Leitor(int vetor1[], int vetor2[], Scanner tec) {
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = tec.nextInt();
            vetor2[i] = tec.nextInt();
        }
    }
    private void Somador(int vetor1[], int vetor2[], int vetorSoma[]) {
        for (int i = 0; i < vetor1.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }
    }

    private void Escrever(int vetor1[], int vetor2[], int vetorSoma[]) {
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println(vetor1[i] + ", " + vetor2[i] + ", " + vetorSoma[i] + ", ");
        }
    }
    public static void main(String[] args) {
        new Uni06Ex04();
    }
}
