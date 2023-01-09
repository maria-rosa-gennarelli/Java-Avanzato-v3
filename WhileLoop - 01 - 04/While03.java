public class While03 {
    public static void main(String[] args) {
        int[] fibonacciSequence = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        System.out.println("The first 10 numbers of the Fibonacci:");

        int i = 0;
        while(i < 10){
            System.out.println(fibonacciSequence[i]);
            i++;
        }
    }
}
