import java.util.Scanner;

public class UniExe18 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o dia do vencimento:");
        int vencimento = tec.nextInt();
        System.out.println("Qual o dia do pagamento:");
        int pagamento = tec.nextInt();
        System.out.println("Qual o valor da fatura:");
        double fatura = tec.nextInt();
        if (pagamento<= vencimento) {
            System.out.println("pagemento em dia");
            Double desc = fatura - (fatura*0.1);
            System.out.println("Valor com desconto =" +desc);
        }
        else {
            if(pagamento - vencimento <= 5) {
                System.out.println("Pagamento regularizado Fatura = " + fatura);
            }
            else {
                double multa = fatura + (pagamento-vencimento*0.2);
                System.out.println("Fatura com multa = " + multa);

            }
        }
        tec.close();
    }

}
