public class Exer26 {
    public static void main(String[] args) {
        for(int ct=0; ct<10; ct++){
            if(ct==5){
                continue;
            }
            System.out.println("->processando "+ct);
        }
        System.out.println("terminando o programa...");
    }
}
