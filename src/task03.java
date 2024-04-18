import java.util.Scanner;

public class task03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("введите вещественное число с ненулевой дробной частью: ");
        float n = Math.round(sc.nextFloat());
        System.out.println("Result=" + n);


    }
}
