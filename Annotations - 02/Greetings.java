
public class Greetings {


    @DevAnnotation(DevName = "Jonh", DevSurname = "Walker")
   public static void sayWelcome(){
       System.out.println("Welcome");
   }


    @DevAnnotation(DevName = "Mark", DevSurname = "Brown")
    public static void sayGoodbye(){
        System.out.println("Goodbye");
    }
}
