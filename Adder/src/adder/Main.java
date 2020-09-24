package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.pribtln("Please provide two or more arguments");
        } catch (NumberFormatException e) {
            System.err.println("Arguments should be integers");
        }
    }

    private static int addArguments(String... args) {
        int output = 0;
        for(int i = 0; i < args.length; i++) {
            output += Integer.valueOf(args[i]);
        }
        return output;
    }
}
