import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList("Budapest", "New York", "Venetia");

        /*Il metodo add da un eccezione e ovviamente non stampa, causa breakpoint
        cityNames.add("Roma");
        cityNames.add("Palermo");
        cityNames.add("Paris");
        cityNames.add("Monaco");*/

        cityNames.set(2,"Tequcigalpa");
        System.out.println("City :"+ cityNames);

        System.out.println("------------");
        List<String> kingsOfRome = new ArrayList<String>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marco");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        String [] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";
        System.out.println("The kings of Rome" + Arrays.toString(kingsOfRomeArray));

    }
}