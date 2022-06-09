import java.util.Scanner;
public class Uni08Exe08 {
    private Uni08Exe08() {
        Scanner tec = new Scanner(System.in);
        int n = 0;
        do {
             n = tec.nextInt();
            } while (n <=20);
        double vet[] = new double[n]; 
        int auxFreq[] = new int[n];
        boolean auxPrint[] = new boolean[n];
        for (int i = 0; i < auxPrint.length; i++) {
            auxPrint[i] =true;
        }
        Leitor(vet, tec);
        Iguais(vet, auxFreq, auxPrint);
        Escrever(vet, auxFreq, auxPrint);

    }
    private void Leitor(double vet[], Scanner tec) {
        
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tec.nextDouble();
            
        }
        }
    
    private void Iguais(double vet[], int aux[], boolean aux2[]) {
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                
                if (vet[i] == vet[j]) {
                    aux[i]++;
                    if (i < j) {
                        aux2[i] = false;
                    }
                }
            }
        }
    }
    private void Escrever(double vet[], int aux[], boolean aux2[]) {
        for (int i = 0; i < aux.length; i++) {
            if (aux2[i] == true) {
                System.out.println(vet[i]);
            System.out.println(aux[i]);
            }
            
        }
    }
    public static void main(String[] args) {
        new Uni08Exe08();
    }
}
