
public class oddOrEven {

    public static void main(String... args) {
        if (args.length == 0) {
            System.out.println("Please provide a `config(oe or pn or both) number` as a command line argument");
            return;
        }

        String config = args[0];
        int number = Integer.parseInt(args[1]);

        if ("oe".equals(config)) {
            System.out.println(number + (number % 2 == 0 ? " is even." : " is odd."));
        } else if ("pn".equals(config)) {
            System.out.println(number + (number > 0 ? " is positive." : number < 0 ? " is negative." : " is zero."));
        } else if ("both".equals(config)) {
            System.out.println(number + (number % 2 == 0 ? " is even." : " is odd."));
            System.out.println(number + (number > 0 ? " is positive." : number < 0 ? " is negative." : " is zero."));
        } else {
            System.out.println("Invalid config. Please provide `oe` or `pn` as the first argument.");
        }
    }
}
