import java.util.Scanner;
public class FelipeAugustoDeCarvalho_1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int opcao = 0;
        int diarias = 0;
        String nome = "";
        double pagamento = 0;
        int qtdDiarias = 0;
        do {
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                System.out.print("nome: ");
                nome = tec.next();
                System.out.print("diarias: ");
                diarias = tec.nextInt();

                if (diarias  < 7) {
                    pagamento = 10 * diarias + 7.3;
                }
                else if (diarias == 7) {
                    pagamento = 10 * diarias + 6.3;
                }
                else if (diarias > 7) {
                    pagamento = 10 * diarias + 5.3;
                }

                System.out.println("Nome: " + nome);
                System.out.println("Total: " + pagamento);

                qtdDiarias++;
                    break;
                case 2:
                System.out.println("Numero de contas encerradas: " + qtdDiarias);
                    break;
                case 3:

                    break;
            
                default:
                System.out.println("opção invalida");
                    break;
            }
            
        } while (opcao != 3);

        tec.close();
    }   
}
