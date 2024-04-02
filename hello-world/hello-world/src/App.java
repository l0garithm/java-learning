import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(text);
        scan.close();
    }
}
