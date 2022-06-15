public class App {
    private App() {
        int vet[] = new int[4];
        vet[0] = 10; vet[1] = 40; vet[2] = 5; vet[3] = 30;
        int bubble;  
        //for (int i = 0; i < vet.length - 1; i++) {
        //    if (vet[i] > vet[i+1]) {
        //        bubble = vet[i];
        //        vet[i] = vet[i+1];
        //        vet[i+1] = bubble;
        //        i = -1;
        //    }
        //}
        for (int i = 0; i < vet.length-1; i++) {
            for (int j = 0; j < vet.length-i -1; j++) {
                if (vet[j]> vet[j+1]) {
                    bubble = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = bubble;
                }
            }
        }   
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }
    
    public static void main(String[] args) throws Exception {
        new App();
    }
}
