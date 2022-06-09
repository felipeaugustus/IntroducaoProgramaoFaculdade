import java.util.Scanner;

public class Uni04Exe15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite seu salario");
        int salario = tec.nextInt();
        System.out.println("digite a quantos meses foi admitido");
        int tempo = tec.nextInt();
        if (tempo >= 13 && tempo <= 48) {
            Double reajuste = salario + (salario*0.07);
            System.out.println("Reajuste: " + reajuste);
        }
        else {
            Double reajuste = salario + (salario*0.05);
            System.out.println("Reajuste: " + reajuste);
        }
      
        tec.close();
}}
