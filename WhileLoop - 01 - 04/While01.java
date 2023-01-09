import java.util.concurrent.TimeUnit;

public class While01 {
    public static void main(String[] args) {
        while (true){
        System.out.println("I am in loop");
            try {
                TimeUnit.SECONDS.sleep(1L);
            } catch (InterruptedException e) {
            }
        }

    }
}
