import java.util.*;

public class List02 {
    public static void main(String[] args) {
        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer> randomNumbers = new ArrayList();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        randomNumbers.addAll(divisorsOf52);

        System.out.println("Elements" + randomNumbers);
        System.out.println("Size of random numbers " + randomNumbers.size());
        System.out.println("--------------------");

        randomNumbers.remove(randomNumbers.indexOf(1));
        randomNumbers.remove(randomNumbers.indexOf(13));

        System.out.println("Elements" + randomNumbers);
        System.out.println("Size of random numbers " + randomNumbers.size());
        System.out.println("--------------------");

        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);

    }

}
