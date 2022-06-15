import java.util.Arrays;
import java.util.Scanner;

public class Uni06Exe10 {
    Uni06Exe10() {
        Scanner tec = new Scanner(System.in);
        int vetMenu[] = new int[10];
        boolean isProgramRunning = true;
        int n = 0;
        do {
            System.out.println(String.format(
                    "1-Incluir valor %n 2-Pesquisar valor %n 3-Alterar valor %n 4-Excluir valor %n 5-Mostrar valores %n 6-Ordenar valores %n 7-Inverter valores %n 8-Sair do sistema"));
            n = tec.nextInt();
            switch (n) {
                case 1:
                IncluirValor(vetMenu, tec);
                    break;
                case 2:
                PesquisarValor(vetMenu, tec);
                    break;
                case 3:
                AlterarValor(vetMenu, tec);
                    break;
                case 4:
                ExcluirValor(vetMenu, tec);
                    break;
                case 5:
                MostrarValores(vetMenu);
                    break;
                case 6:
                OrdenarValores(vetMenu);
                    break;
                case 7:

                    break;
                case 8:
                isProgramRunning = Encerrar();
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (isProgramRunning = true);
    }
    void IncluirValor(int vetMenu[], Scanner tec) {
        int numero = tec.nextInt();
        if (vetMenu[vetMenu.length-1] == 0) {
            vetMenu[vetMenu.length-1] = numero;
            System.out.println("numero inserido");
        }
        else {
            System.out.println("numero não inserido");
        }
        
    }
    void PesquisarValor(int vetMenu[], Scanner tec) {
        int pesquisa = tec.nextInt();
        boolean aparece = false;
        for (int i = 0; i < vetMenu.length; i++) {
            if (vetMenu[i] == pesquisa) {
                System.out.println("O valor consta na posição: " + i);
                aparece = true;
            }
        }
        if (aparece = false) {
            System.out.println("O valor não consta no vetor");
        }
    }
    void AlterarValor(int vetMenu[], Scanner tec) {
        System.out.println("Insira um numero a ser trocado");
        int alterado = tec.nextInt();
        System.out.println("Insira o que entrara no lugar do anterior");
        int novo = tec.nextInt();
        boolean trocou = false;
        for (int i = 0; i < vetMenu.length; i++) {
            if (vetMenu[i] == alterado && trocou == false) {
                vetMenu[i] = novo;
                trocou = true;
                System.out.println("O numero na posição [" + i + "] agora é: " + novo);
            }
        }
        if (trocou == false) {
            System.out.println("O numero indicado não consta no vetor");
        }

    }
    void ExcluirValor(int vetMenu[], Scanner tec) {
        int excluido = tec.nextInt();
        boolean operacaoConcluida = false;
        for (int i = 0; i < vetMenu.length ; i++) {
            if (vetMenu[i] == excluido && operacaoConcluida) {
                for (int j = 0; j < vetMenu.length - i -1; j++) {
                    {
                        vetMenu[i+j] = vetMenu[i+j+1];
                        operacaoConcluida = true;
                    }
                    
                }
                System.out.println("Numero removido");
            }
        }
        if (operacaoConcluida == false) {
            System.out.println("O numero escolhido não consta no vetor");
        }
    }
    void MostrarValores(int vetMenu[]) {
        for (int i = 0; i < vetMenu.length; i++) {
            if (vetMenu[i] != 0) {
                System.out.println(vetMenu[i]);
            }
        }
    }
    void OrdenarValores(int vetMenu[]) {
        Arrays.sort(vetMenu);
        System.out.println("Vetor ordenado");
    }
    



    boolean Encerrar() {
        return false;
    }

    public static void main(String[] args) {
        new Uni06Exe10();
    }
}
