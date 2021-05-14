import java.util.Scanner;

public class JavaThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Введите кол-во случайных символов");
        int count = scanner.nextInt ();
        int a= 0;
        int b= 1000;
        System.out.print ("Случайные числа от 0 до 1000 без перехода на новую строку: ");
        while (count >= 1) {
            System.out.print (a + (int) (Math.random () * b) + "; ");
            count--;
        }
        System.out.println ();
        System.out.println ("Случайные числа от 0 до 1000 с переходом на новую строку");
    }
}