import java.util.Scanner;

public class Uni06Exe02 {
    private Uni06Exe02() {
        Scanner teclado = new Scanner(System.in);
        double vet[] = new double[12];
        Leitor(vet, teclado);
        Medias(vet);
    }
    private void Leitor(double vet[], Scanner teclado ) {
       
        double x = 0;
        for (int i = 0; i < vet.length; i++) {
            x = teclado.nextDouble();
            vet[i] = x;

        }
    }
    private void Medias(double vet[]) {
        double soma = 0;
        double medias = 0;
        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }
        medias = soma/vet.length;
        Escrever(vet, medias);
        
    }
    private void Escrever(double vet[], double medias) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > medias) {
                System.out.println(vet[i]);
            }
            
        }
    }

    public static void main(String[] args) {
        new Uni06Exe02();
    }
}
