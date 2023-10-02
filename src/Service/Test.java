package Service;

import Model.Student;

public class Test {
    public boolean checkMedium(Student student){
        if (student.getMediumScore()>=5.0)
            System.out.println("sinh viên đậu");
        else
            System.out.println("sinh viên trượt");
        return true;
    }
}
