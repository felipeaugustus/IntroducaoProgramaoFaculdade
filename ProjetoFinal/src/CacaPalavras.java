import java.util.Scanner;

public class CacaPalavras {
    private CacaPalavras() {
        Scanner tec = new Scanner(System.in);
        final int palavrasQtdLin = 5;
        final int palavrasQtdCol = 2;
        final int mapaQtdLin = 10;
        final int mapaQtdCol = 5; 
        String palavras[][] = new String[palavrasQtdLin][palavrasQtdCol];
        char mapa[][] = new char [mapaQtdLin][mapaQtdCol];
        int opcao = 0;
        palavrasEntrada(palavras);
        mapaEntrada(mapa);
        mapaPesquisa(palavras, mapa);
        do {
            System.out.println("_____ Menu: Caça Palavras _____");
            System.out.println("1. listar palavras");
            System.out.println("2. listar mapa");
            System.out.println("3. listar respostas");
            System.out.println("4. sair");
            System.out.print(" __ opção:");
            opcao = tec.nextInt();
            switch (opcao) {
                case 1:
                palavrasImprimir(palavras, palavrasQtdLin);
                    break;
                case 2:
                mapaImprimir(mapa);
                    break;
                case 3:
                palavrasResposta(palavras);
                    break;
                case 4:
                    break;
                    
                default:
                    System.out.println("Opção ERRADA!...");
                    break;
            }
        } while (opcao != 4);
        tec.close();
    }

    private void palavrasEntrada(String palavras[][]) {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";

        for (int i = 0; i < palavras.length; i++) {
            palavras[i][1] = "Palavra NÃO encontrada";
        }

    }

    private void mapaEntrada(char mapa[][]) {
        mapa[ 0][ 0]='D';  mapa[ 0][ 1]='C';  mapa[ 0][ 2]='Q';  mapa[ 0][ 3]='W';  mapa[ 0][ 4]='E';
        mapa[ 1][ 0]='I';  mapa[ 1][ 1]='X';  mapa[ 1][ 2]='F';  mapa[ 1][ 3]='O';  mapa[ 1][ 4]='R';
        mapa[ 2][ 0]='F';  mapa[ 2][ 1]='F';  mapa[ 2][ 2]='R';  mapa[ 2][ 3]='G';  mapa[ 2][ 4]='F';
        mapa[ 3][ 0]='E';  mapa[ 3][ 1]='L';  mapa[ 3][ 2]='I';  mapa[ 3][ 3]='H';  mapa[ 3][ 4]='W';
        mapa[ 4][ 0]='L';  mapa[ 4][ 1]='S';  mapa[ 4][ 2]='F';  mapa[ 4][ 3]='O';  mapa[ 4][ 4]='U';
        mapa[ 5][ 0]='S';  mapa[ 5][ 1]='D';  mapa[ 5][ 2]='G';  mapa[ 5][ 3]='T';  mapa[ 5][ 4]='S';
        mapa[ 6][ 0]='E';  mapa[ 6][ 1]='J';  mapa[ 6][ 2]='H';  mapa[ 6][ 3]='E';  mapa[ 6][ 4]='T';
        mapa[ 7][ 0]='I';  mapa[ 7][ 1]='I';  mapa[ 7][ 2]='I';  mapa[ 7][ 3]='J';  mapa[ 7][ 4]='M';
        mapa[ 8][ 0]='X';  mapa[ 8][ 1]='C';  mapa[ 8][ 2]='K';  mapa[ 8][ 3]='B';  mapa[ 8][ 4]='G';
        mapa[ 9][ 0]='V';  mapa[ 9][ 1]='E';  mapa[ 9][ 2]='T';  mapa[ 9][ 3]='O';  mapa[ 9][ 4]='R';
    }

    private void palavrasImprimir(String palavras[][], int palavrasQtdLin) {
        
        int c = 1;
        for (int i = 0; i < palavrasQtdLin; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println(palavras[i][j]);
            }
        }
    }

    private void mapaPesquisa(String palavras[][], char mapa[][]) {
        
        char procurarChar = 'a';
        int posicaoChar = 0;
        
        
        for (int i = 0; i < palavras.length ; i++) {
            posicaoChar = 0;         
            procurarChar = palavras[i][0].charAt(posicaoChar);
            //esquerda pra direita
                for (int k = 0; k < mapa.length; k++) {
                    for (int k2 = 0; k2 < mapa[0].length; k2++) {
                        
                       if (mapa[k][k2] == procurarChar && posicaoChar < palavras[i][0].length() -1) {
                           
                            posicaoChar++;
                            procurarChar = palavras[i][0].charAt(posicaoChar);
                        }
                        
                        else if (mapa[k][k2] == procurarChar && posicaoChar == palavras[i][0].length() -1) {
                            palavras[i][1] ="[" + k + "," + (k2 - palavras[i][0].length() +1) + "]";
                            

                        }
                        else {
                            
                            posicaoChar = 0;
                            procurarChar = palavras[i][0].charAt(posicaoChar);
                        }
                    }
                }
                //direita pra esquerda
                for (int k = 0; k < mapa.length; k++) {
                    for (int k2 = mapa[0].length -1; k2 >= 0; k2--) {
                        
                        if (mapa[k][k2] == procurarChar && posicaoChar < palavras[i][0].length() -1) {
                            
                             posicaoChar++;
                             procurarChar = palavras[i][0].charAt(posicaoChar);
                         }
                         
                         else if (mapa[k][k2] == procurarChar && posicaoChar == palavras[i][0].length() -1) {
                             palavras[i][1] ="[" + k + "," + (k2 + palavras[i][0].length() -1) + "]";
                             
 
                         }
                         else {
                             
                             posicaoChar = 0;
                             procurarChar = palavras[i][0].charAt(posicaoChar);
                         }
                    }
                }   

                //cima pra baixo
                for (int k2 = 0; k2 < mapa[0].length; k2++) {
                    for (int k = 0; k < mapa.length; k++) {
                        
                        if (mapa[k][k2] == procurarChar && posicaoChar < palavras[i][0].length() -1) {
                            
                             posicaoChar++;
                             procurarChar = palavras[i][0].charAt(posicaoChar);
                         }
                         
                         else if (mapa[k][k2] == procurarChar && posicaoChar == palavras[i][0].length() -1) {
                             palavras[i][1] ="[" + (k - palavras[i][0].length() +1) + "," + k2 + "]";
                             
 
                         }
                         else {
                             
                             posicaoChar = 0;
                             procurarChar = palavras[i][0].charAt(posicaoChar);
                         }
                    }
                } 
                // baixo cima
                for (int k2 = 0; k2 < mapa[0].length; k2++) {
                    for (int k = mapa.length -1; k >= 0; k--) {
                        
                        if (mapa[k][k2] == procurarChar && posicaoChar < palavras[i][0].length() -1) {
                            
                             posicaoChar++;
                             procurarChar = palavras[i][0].charAt(posicaoChar);
                         }
                         
                         else if (mapa[k][k2] == procurarChar && posicaoChar == palavras[i][0].length() -1) {
                             palavras[i][1] ="[" + (k + palavras[i][0].length() -1) + "," + k2 + "]";
                             
 
                         }
                         else {
                            
                             posicaoChar = 0;
                             procurarChar = palavras[i][0].charAt(posicaoChar);
                         }
                    }
                }
        }
 
    }

    private void mapaImprimir(char mapa[][]){
        
        for (int i = 0; i < mapa.length ; i++) { 
            System.out.println("");
            System.out.println("---------------------");
            System.out.print("|");
                for (int j = 0; j < mapa[0].length; j++) {
                    System.out.print(" " + mapa[i][j] + " |");                
            }
        }
        System.out.println("");
        System.out.println("---------------------");
        System.out.println("");
    }

    private void palavrasResposta(String palavras[][]){
        for (int i = 0; i < palavras.length; i++) {
            if (palavras[i][1] != "Palavra NÃO encontrada") {
                System.out.println(palavras[i][1] + " - " + palavras[i][0]);
            }
            else {
                System.out.println("Palavra NÃO econtrada" + palavras[i][0]);
            }
                
            
        }
    }
    public static void main(String[] args) {
        new CacaPalavras();
    }
}
