public class Array01 {
    public static void main(String[] args) {
       String brandCar[] = new String[5];
        brandCar[0] = "BMW";
        brandCar[1] = "Ferrari";
        brandCar[2] = "Mercedes";
        brandCar[3] = "Ford";
        brandCar[4] = "Nissan";

        System.out.println(brandCar.length);
        System.out.println(brandCar[3]);

        System.out.println("-------------");
        Integer primeNumbers[] = new Integer[6];
        primeNumbers[0] = 1;
        primeNumbers[1] = 2;
        primeNumbers[2] = 3;
        primeNumbers[3] = 4;
        primeNumbers[4] = 5;
        primeNumbers[5] = 6;

        for (Integer i=0; i<primeNumbers.length; i++){
            System.out.println(primeNumbers[i]);
        }

    }
}