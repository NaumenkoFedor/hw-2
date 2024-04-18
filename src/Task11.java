public class Task11
{
    public static void main(String[] args) {
        System.out.println("задание 11");
        long startSecond = 2_432_452L;
        long days = startSecond / 86400;
        long hours = (days) / 3600;
        long minutes = (hours) / 60;

        long seconds = (minutes) % 60;
        System.out.println(days
                + " "
                + hours + " "
                +
                minutes + " "
                + seconds);
    }
}
