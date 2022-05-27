package application;

public class Program {
    public static void main(String[] args) {

        // Boxing e Unboxing
        int x = 20;
        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);

        // wrraper classe (Classe referente ao int)
        int z = 30;

        Integer obj2 = z;

        System.out.println(obj2);

        int w = obj2;

        System.out.println(w);
    }
}
