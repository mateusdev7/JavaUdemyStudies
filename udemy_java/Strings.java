public class Strings {
    public static void main(String[] args) {
        String original = "abcde FGHIJ ABC abc DEFG    ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        //String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("\nString original: -" + original + "-");
        System.out.println("\nString com letras minusculas: -" + s01 + "-");
        System.out.println("\nString com letras maisuculas: -" + s02 + "-");
        System.out.println("\nString sem espaços no final: -" + s03 + "-");
        System.out.println("\nString do index 2 em diante: -" + s04 + "-");
        System.out.println("\nString do index 2 até o 9: -" + s05 + "-");
        System.out.println("\nString trocando o 'a' minusculo pelo 'x' minusculo: -" + s06 + "-");
        System.out.println("Index Of 'bc': " + i);
        System.out.println("Last Index Of 'bc': " + j);




        String s = "potato apple lemon orange";
        String vect[] = s.split(" ");
        System.out.println();
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }

}
