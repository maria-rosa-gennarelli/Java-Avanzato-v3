public class ForLoop2 {
    public static void main(String[] args) {
        int[] fibonacciSequence = new int[]{
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        };

        for(int i = 0; i < 10; i++){
            System.out.println(fibonacciSequence[i]);
        }
    }
}
