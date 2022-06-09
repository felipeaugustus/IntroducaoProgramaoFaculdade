import java.util.Scanner;

public class Uni04Exe20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double not1 = tec.nextDouble();
        double not2 = tec.nextDouble();
        double not3 = tec.nextDouble();
        double media = (not1 + not2 + not3)/3;
        System.out.println(media);

        if (media >= 9) {
            System.out.println("CONCEITO A");
            System.out.println("Aprovado");
        }
        else if (media >=7.5 && media < 9) {
            System.out.println("CONCEITO B");
            System.out.println("Aprovado");
        }
        else if (media >=6 && media < 7.5) {
            System.out.println("CONCEITO C");
            System.out.println("Aprovado");
        }
        else if (media >=4 && media < 6) {
            System.out.println("CONCEITO D");
            System.out.println("Reprovado");
        }
        else {
            System.out.println("CONCEITO F");
            System.out.println("Reprovado");
        }   
        tec.close();

    }
}
