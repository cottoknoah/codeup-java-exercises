package util;

//input is similar to Scanner - allows us to create a tool with less code - input validation

public class Input {

    private Scanner sc;

    public Input() {
        this.sc = new Sanner(System.in);
    }

    public String getString() {
        return sc.nextLine()
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.print("Will you continue? ");

        System.out.println("Please enter your favorite word");
        String favWord = in.getString();

//        boolean yesNo = in.yesNo();
//        System.out.println(yesNo);

//        System.out.println("Please enter a whole number");
//        int num = in.getInt();
//        System.out.println("You entered: " + num);
//
//        System.out.println("Please enter a whole number between 1 and 10: ");
//        int numInRange = in.getInt(1, 10);
//        System.out.println("You entered " + numInRange);
//
//        System.out.println("Please enter a number");



    }
}
