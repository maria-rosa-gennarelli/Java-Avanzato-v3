import java.util.ArrayList;
import java.util.List;

public class Testing {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add (9.5);
        individualMarksListLisa.add(9.5);

        List<Integer> individualMarksListJeremy = new ArrayList<>();
        individualMarksListJeremy.add (9);
        individualMarksListJeremy.add(9);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(individualMarksListJeremy);

        List<Student> listStudent = new ArrayList<>();
        Student lisa = new Student("Lisa", "Stuart", lisaAvg);
        Student jeremy = new Student("Jeremy", "Green", jeremyAvg);
        listStudent.add(lisa);
        listStudent.add(jeremy);

        System.out.println(listStudent.get(0));
        System.out.println(listStudent.get(1));


    }
}
