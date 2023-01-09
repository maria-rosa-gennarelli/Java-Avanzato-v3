public class ForLoop3 {
    public static void main(String[] args) {
        String[] arr= new String[]{
               "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ,"Saturday", "Sunday"
        };

        for(int i = 0; i < arr.length; i+=2){
            String theValue = arr[i];
            System.out.println(theValue);
        }
    }
}
