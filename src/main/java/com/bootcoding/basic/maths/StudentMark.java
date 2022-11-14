package com.bootcoding.basic.maths;

public class StudentMark {
    static double percentage;
    public static void main(String[] args)
    {
        StudentMark sm = new StudentMark();
        Student student = sm.convert("Ramesh,88,77,66,55");
        System.out.println("Student Average Marks = " + student.getAverageMarks());
        System.out.println("Student Percentage = " + student.getPercentage()  + "%");

        String grade = null;
        switch((int) (percentage/10))
        {
            // for >= 90
            case 9:
                grade = "A";
                break;
        }

       //        if(percentage>80)
//        {
//            System.out.println("You have Grade A");
//        }
//        else if (percentage > 60)
//        {
//            System.out.println("You have Grade B");
//        }
//        else if (percentage >50)
//        {
//            System.out.println("You have Grade C");
//        }
//        else if (percentage >40)
//        {
//            System.out.println("You have Grade D");
//        }
//        else
//        {
//            System.out.println("");
//        }
    }
    public Student convert(String text){
        //1) Split input / break
        String[] tokens = text.split(",");
        Student student = new Student();
        student.setName(tokens[0]);
        student.setPhysics(Integer.parseInt(tokens[1]));
        student.setChemistry(Integer.parseInt(tokens[2]));
        student.setMaths(Integer.parseInt(tokens[3]));
        student.setBiology(Integer.parseInt(tokens[4]));

        // calcualte average marks
        int obtainedMarks = student.getPhysics() + student.getChemistry() + student.getMaths() + student.getBiology();

        double average = obtainedMarks / (tokens.length - 1);
        student.setAverageMarks(average);

         percentage = (obtainedMarks / 400.00 ) * 100;
         student.setPercentage(percentage);

        return student;
    }
}
