public class CustomNumber {
    int number;

    public CustomNumber() {
        int min = 1;
        int max = 12;
        int randomNumber = (int) Math.floor(Math.random() * (double) (max - min + 1) + (double) min);
        this.number = randomNumber;
        System.out.println("Random number between 1 and 12 is = " + randomNumber);
    }

    public void getMultiplicationTable() {
        for (int i = 12; i >= 1; --i) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

}
