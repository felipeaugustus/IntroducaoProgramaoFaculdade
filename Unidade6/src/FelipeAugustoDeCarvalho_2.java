import java.util.Scanner;
public class FelipeAugustoDeCarvalho_2 {
    private FelipeAugustoDeCarvalho_2() {
        Scanner tec = new Scanner(System.in);
        int vetTamanho = tec.nextInt();
        int vetA[] = new int[vetTamanho];
        int vetB[] = new int[vetTamanho];
        int vetSoma[] = new int[vetTamanho];

        Leitor(vetA, vetB, tec);
        Soma(vetA, vetB, vetSoma);
        Ordenar(vetSoma);
        Escrever(vetSoma);
        tec.close();
    }
    void Leitor(int vetA[], int vetB[], Scanner tec) {
        System.out.println("Lendo Vetor A");
        for (int i = 0; i < vetA.length; i++) {
            System.out.print("VetA[" + i + "] :" );
            vetA[i] = tec.nextInt();
        }
        System.out.println("Lendo Vetor B");
        for (int i = 0; i < vetB.length; i++) {
            System.out.print("VetB[" + i + "] :" );
            vetB[i] = tec.nextInt();
        }
    }
    void Soma(int vetA[], int vetB[], int vetSoma[]) {
        
        for (int i = 0; i < vetB.length; i++) {
            vetSoma[i] = vetA[i] + vetB[vetB.length - i -1];
        }
    }
    void Ordenar(int vetSoma[]) {
        int bubble = 0;
        for (int i = 0; i < vetSoma.length-1; i++) {
            for (int j = 0; j < vetSoma.length-i -1; j++) {
                if (vetSoma[j]> vetSoma[j+1]) {
                    bubble = vetSoma[j];
                    vetSoma[j] = vetSoma[j+1];
                    vetSoma[j+1] = bubble;
                }
            }
        }   
        System.out.println("Valores ordenados");
    }
    void Escrever(int vetSoma[]) {
        System.out.println("Resultado: ");
        for (int i = 0; i < vetSoma.length; i++) {
            System.out.println(vetSoma[i]);
        }
    }
    public static void main(String[] args) {
        new FelipeAugustoDeCarvalho_2();
    }
}
