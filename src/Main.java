import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(Permission(65, 20));
        System.out.println(Permission(70, 30));
        System.out.println(Permission(20, 30));
        System.out.println(Permission(19, 25));
        System.out.println(Permission(30, -25));
        System.out.println(Permission(generateRandomAge(), 26));
    }

    public static String Permission(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}