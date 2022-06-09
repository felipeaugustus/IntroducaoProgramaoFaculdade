import java.util.Scanner;
public class Uni06Exe05 {
    private Uni06Exe05() {
        Scanner tec = new Scanner(System.in);
        int afinidade = 0;
        System.out.println("vai dar namoro 2022");
        System.out.println(String.format("Gosta de música sertaneja? %nGosta de futebol? %nGosta de seriados? %nGosta de redes sociais? %nGosta da Oktoberfest?"));
        String rapaz[] = new String[5];
        String moca[] = new String[5];
        Questionario(rapaz, moca, tec);
        afinidade = AfinidadeCalculo(rapaz, moca, afinidade);
        AfinidadeFinal(afinidade);

        
    }
    private void Questionario(String rapaz[], String moca[], Scanner tec) {
        for (int i = 0; i < moca.length; i++) {
            
            rapaz[i] = tec.next().toUpperCase();
            moca[i] = tec.next().toUpperCase();
        }
    }
    private int AfinidadeCalculo(String rapaz[], String moca[], int afinidade) {
        for (int i = 0; i < moca.length; i++) {
            if (rapaz[i].equals(moca[i])) {
                afinidade +=3;
            }
            else if (!rapaz[i].equals(moca[i]) && rapaz[i].equals("IND")) {
                afinidade +=1;
            }
            else if (!rapaz[i].equals(moca[i]) && moca[i].equals("IND")) {
                afinidade +=1;
            }
            else if (!rapaz[i].equals(moca[i])){
                afinidade -=3;
            }
        }
        return afinidade;
    }
    
    private void AfinidadeFinal(int afinidade) {
        System.out.println("Resultado:");
        if (afinidade == 15) {
            System.out.println("CASEM!!!!");
        }
        else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vai dar bom");
        }
        else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Vale um encontro");
        }
        else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Talvez não de certo, talvez da");
        }
        else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        }
        else if (afinidade <= -10) {
            System.out.println("Voces se odeiam!!!!!!");
        }
    }
    public static void main(String[] args) {
        new Uni06Exe05();
    }
}
