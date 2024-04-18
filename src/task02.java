import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите твехзначное число n: ");
        int n = sc.nextInt();
        int a = n / 100;
        int b = n / 10 % 10;
        int c = n % 10;
        int d = a + b + c;
        System.out.println("Сумма цифр в вашем числе = " + d);
    }
}

