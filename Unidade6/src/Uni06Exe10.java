import java.util.Scanner;
public class Uni06Exe10 {
    Uni06Exe10() {
        Scanner tec = new Scanner(System.in);
        int menuNumber[] = new int[50];        
        do {
            System.out.println(String.format("1-Incluir valor %n 2-Pesquisar valor %n 3-Alterar valor %n 4-Excluir valor %n 5-Mostrar valores %n 6-Ordenar valores %n 7-Inverter valores %n 8-Sair do sistema"));
            
        } while (true);
    }
    public static void main(String[] args) {
        new Uni06Exe10();
    }
}
