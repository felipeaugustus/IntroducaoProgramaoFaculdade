import java.util.Scanner;

/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,
 cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
 o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).*/

public class Uni4Exe01 {
    public static void main(String[] args) {
        System.out.println("ENtre com as horas trabalhadas no mês:");
        Scanner teclado = new Scanner(System.in);
        int horas = teclado.nextInt();
        System.out.println("Valor pago por horas:");
        int valor = teclado.nextInt();
        int salarioTotal = horas * valor;

        if (horas >= 160) {
            int salarioextra = (horas - 160) * (valor / 2);
            salarioTotal = salarioTotal + salarioextra;
        }

        System.out.println("O sálario total é = R$" + salarioTotal);

        teclado.close();
    }
}
