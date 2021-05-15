import java.util.Scanner;
import java.util.Random;
public class JavaThird {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    private int c;
    private int[] array;
    public void setN(){
        System.out.print("Введите кол-во случайных символов: ");
        c = scanner.nextInt();
    }
    public int getC(){
        return c;
    }
    public void setArray(int N){
        array = new int[N];
        for (int i = 0; i<N; i++){
            array[i] = random.nextInt(1000);
        }

    }
    public void showMyArray(){
        System.out.print("Случайные числа от 0 до 1000 без перехода на новую строку: " );
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
    public void showLnMyArray(){
        System.out.println("Случайные числа от 0 до 1000 с переходом на новую строку: ");
        for (int i = 0; i< array.length; i++){
            System.out.println(array[i] + "; ");
        }
    }
}
class Main {
    public static void main(String[] args){
        JavaThird num = new JavaThird();
        num.setN();
        num.setArray(num.getC ());
        num.showMyArray();
        num.showLnMyArray();
    }
}