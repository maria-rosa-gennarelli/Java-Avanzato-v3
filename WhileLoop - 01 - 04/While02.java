import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userCommand;
        do {
            System.out.println("Please enter a command: ");
            userCommand = input.nextLine();
            System.out.println("The command stop when: " + userCommand);
        } while(!userCommand.equals("stop"));

        input.close();

    }
}
