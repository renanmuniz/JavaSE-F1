public class Exer37 {
    public static void main(String[] args) {
        //Usando if normal
        int vl=10;
        int a;
        if(vl>20){
            a=50;
        }else{
            a=100;
        }
        System.out.println(a);

        //Usando operador ternario:
        int b=vl > 20 ? 50:100;
        System.out.println(b);

    }
}
