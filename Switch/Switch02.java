
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        String x;



        while(true) {
            System.out.println("Enter a string infinite times: ");
             x = scanner.nextLine();
            switch (x) {
                case "size":
                    System.out.println("The list has " + list.size());
                    break;

                case "clear":
                    list.clear();
                    System.out.println("Removed all the elements from the list");
                    break;

                case "print":
                    System.out.println("The list is" + list);
                    break;

                default:
                    list.add(x);
                    System.out.println("Added <" + x + "> to the list!");
                    break;
            }
        }

    }
}
