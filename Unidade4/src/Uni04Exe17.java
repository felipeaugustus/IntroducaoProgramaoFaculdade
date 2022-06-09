import java.util.Scanner;

public class Uni04Exe17 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Salario");
        int renda = tec.nextInt();
        System.out.println("Quantas pessoas são seus dependentes?");
        int dependentes = tec.nextInt();
        double desc = dependentes*0.02;
        if (renda >= 2000 && renda <= 5000) {
            double imposto = (renda*0.05)-(renda*0.05*desc);

        
            System.out.println("Imposto = " + imposto);
        }
        else if (renda >= 5000 && renda <= 10000)
        {
            double imposto = (renda*0.1)-(renda*0.1*desc);
            System.out.println("Imposto = " + imposto);
        }
        else if (renda > 10000) {
            double imposto = (renda*0.15)-(renda*0.15*desc);
            System.out.println("Imposto = " + imposto);
        }
        else { System.out.println("não paga imosto");
     }
        tec.close();


    }
}