import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private List<Integer> rates;
    private double avg;

    public Student(String name, List<Integer> rates) {
        this.name = name;
        this.rates = new ArrayList<>(rates);
        this.avg = avgRate();
    }

    public void addRate(int rate){
        rates.add(rate);
        avg = avgRate();
    }


    @Override
    public String toString() {
        return name + '\'' +
                ", rates=" + rates + " (" + avg +")";
    }

    public double getAvg() {
        return avg;
    }

    private double avgRate(){
        if (rates==null || rates.size()==0){
            return 0;
        }
        double sum = 0.0;
        for (Integer i : rates){
            sum+=i;
        }
        return sum/rates.size();
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(avg, otherStudent.avg);

    }
}
