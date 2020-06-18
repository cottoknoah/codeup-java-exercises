import java.util.concurrent.ThreadLocalRandom;

public class ServerNameGenerator {

    public static String[] nouns = {"desk", "laptop", "keyboard", "mouse", "iPod", "headphones", "duck", "lamp", "monitor", "webcam"};
    public static String[] adjectives = {"gross", "angry", "jubilant", "black", "proud", "overbearing", "old", "nasty"};

    public static void main(String[] args) {

        ServerNameGenerator server = new ServerNameGenerator();
        String randNoun = server.returnRand(nouns);
        String randAdj = server.returnRand(adjectives);

        System.out.println("Here is a server name:\n" + randAdj + "-" + randNoun);
    }

    public String returnRand(String[] arr) {
        int randomNum = ThreadLocalRandom.current().nextInt(1, arr.length + 1);
        //from google -uses CPU count ?

        return arr[randomNum - 1];
    }

}