import java.util.Scanner;

public class Uni04Exe19 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int x = tec.nextInt();
        int y = tec.nextInt();
        if (x==0 && y == 0) {
            System.out.println("Quadrante 0");
        }
        else if (x>0 && y>0) {
            System.out.println("Quadrante 1");
        }
        else if (x>0 && y<0) {
            System.out.println("Quadrante 2");
        }
        else if (x<0 && y<0) {
            System.out.println("Quadrante 3");
        }
        else if (x<0 && y>0){
            System.out.println("Quadrante 4");
        }
        tec.close();
    }
}
