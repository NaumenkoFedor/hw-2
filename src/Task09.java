public class Task09 {
    public static void main(String[] args) {
        System.out.println("задание 9 ");
        double number = 8;
        String securityAnswer = ((number - (int) number) == 0) ? "integer number!" : "fractal number";
        System.out.println(securityAnswer);
    }
}
