import java.util.Scanner;

public class Task08;
public static final double V = 330.0;
public static void main(String[] args) {
    double t, s;
    Scanner sc = new Scanner(System.in);
    System.out.println("введите разницу в секундах между громом и молнией  ");
    t = sc.nextDouble();
    s = t * V;
    System.out.println("расстояние до молнии " + s);
}



