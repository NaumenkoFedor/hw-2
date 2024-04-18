import java.util.Scanner;
public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("введите число Х: ");
        int x = sc.nextInt();
        System.out.print("введите число Y: ");
        int y = sc.nextInt();
        int div = x / y;
        int divper = x % y;
        double sqrt = Math.sqrt(x);
        System.out.println("деление = " + div);
        System.out.println("остаток от деления = " + divper);
        System.out.println("квадратный корень Х = " + sqrt);
    }
}
