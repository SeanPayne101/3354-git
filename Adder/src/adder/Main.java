package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide multiple integers to add");
        }
    }

    private static int addArguments(String... args) {
        int output = 0;
        
        if (args[0] == '-') {
            for(int i = 1; i < args.length; i++) {
                output -= Integer.valueOf(args[i]);
            }
        }
        else {
            for(int i = 0; i < args.length; i++) {
                output += Integer.valueOf(args[i]);
            }
        }
        
        return output;
    }
}
