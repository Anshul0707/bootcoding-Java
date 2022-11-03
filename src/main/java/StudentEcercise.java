import java.util.ArrayList;
import java.util.List;

public  class StudentEcercise
{

    public double getSquareOfStudentPercentage(double percentage){
        return percentage * percentage;
    }

    public List<Student> findStudentByPercentage(List<Student> students, double minPercentage)
    {
        List<Student> filteredStudents = new ArrayList<>();
        for(int i = 0 ; i < students.size(); i++)
        {
            Student student = students.get(i);
            if(student.getStdPer() >= minPercentage)
            {
                filteredStudents.add(student);
            }
        }
        return  filteredStudents;
    }

    public List<Student> getStudentCity(List<Student> students, String city)
    {
        List<Student> filteredStudents = new ArrayList<>();

        for(Student s : students){
            if(s.getStdCity().equals(city)){
                filteredStudents.add(s);
            }
        }
        return filteredStudents;
    }

    public static void main(String[] args)
    {
        StudentEcercise se = new StudentEcercise();

        double percentage = 55.00;
        double result = se.getSquareOfStudentPercentage(percentage);
        System.out.println("Square of " + percentage + "% is " + result);

        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.setStdCity("Nagpur");
        s1.setStdPer(60);

        Student s2 = new Student();
        s2.setStdCity("Wardha");
        s2.setStdPer(80);

        Student s3 = new Student();
        s3.setStdCity("Nagpur");
        s3.setStdPer(75.00);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        List<Student> studentByPercentage = se.findStudentByPercentage(students, 40.00);
        for(Student s : studentByPercentage)
        {
            System.out.println(s.getStdPer());
        }

        List<Student> studentByCity = se.getStudentCity(students, "Nagpur");
        for(Student s : studentByCity)
        {
            System.out.println(s.getStdCity());
        }
    }
}
