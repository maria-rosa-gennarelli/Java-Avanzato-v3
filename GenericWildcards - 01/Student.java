import java.util.ArrayList;
import java.util.List;

public class Student {

    String studentName;
    String studentSurname;
    double marksAverage;

    List<Double> individualMarks = new ArrayList<>(2);
    List<Integer> projectsMarks = new ArrayList<>(2);


    Student (String studentName, String studentSurname, double marksAverage){
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    public static double getAverageMark(List<?extends Number>listofMarks){
    double somma = 0;
    double average = 0;
    for (int i = 0; i < listofMarks.size(); i++){
        somma = somma + listofMarks.get(i).doubleValue();
    }
    average = somma/listofMarks.size();

    return average;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }


}
