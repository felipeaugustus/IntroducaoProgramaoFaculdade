import java.util.Scanner;
public class Uni06Exe03 {
    private Uni06Exe03() {
        Scanner teclado = new Scanner(System.in);
        double vet[] = new double[12];
        Leitor(vet, teclado);
        Calculos(vet);
        Escritor(vet);
    }
    private void Leitor(double vet[], Scanner teclado ) {
        double x = 0;
        for (int i = 0; i < vet.length; i++) {
            x = teclado.nextDouble();
            vet[i] = x;
        }
    }
    private void Calculos(double vet[]) {
    
        for (int i = 0; i < vet.length; i++) {
           if (vet[i] % 2 ==0) {
               vet[i] = vet[i]*1.02;
           } 
           else {
               vet[i] = vet[i]*1.05;
           }
        }
    }
    private void Escritor(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
    public static void main(String[] args) {
        new Uni06Exe03();
    }
}
