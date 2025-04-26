package activity1;

public class Loop {

    public static void main(String[] args) {
        int check_number = 10;
        String message = "";

        for (int i = 1; i <= check_number; i++) {
            message += i + (i % 2 == 0 ? " Even" : " Odd") + " number\n";
        }

        System.out.println(message);

    }
}
