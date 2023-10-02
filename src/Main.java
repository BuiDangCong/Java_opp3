import Model.Class_of_student;
import Model.Date_of_birth;
import Model.Student;
import Service.Test;

public class Main {
    public static void main(String[] args) {
        Class_of_student classOfStudent1 = new Class_of_student("1A1","toán tin 1");
        Class_of_student classOfStudent2 = new Class_of_student("1A2","toán tin 2");
        Class_of_student classOfStudent3 = new Class_of_student("1A3","toán tin 3");
        Date_of_birth dateOfBirth1 = new Date_of_birth(15,05,1994);
        Date_of_birth dateOfBirth2 = new Date_of_birth(16,06,1995);
        Date_of_birth dateOfBirth3 = new Date_of_birth(17,07,1996);
        Student student1 = new Student(1,"Bùi Đăng Công",dateOfBirth1,5.6,classOfStudent1);
        Student student2 = new Student(2,"Bùi Đăng Dương",dateOfBirth2,8.6,classOfStudent2);
        Student student3 = new Student(3,"Nguyễn Việt Huy",dateOfBirth3,9.4,classOfStudent3);
         //cho biết tên khoa mà học sinh theo học
        System.out.println("Học sinh 1 :");
        student1.getNameFaculty();
        System.out.println("Học sinh 2 :");
        student2.getNameFaculty();
        System.out.println("Học sinh 3:");
        student3.getNameFaculty();
        //Cho biết học sinh có đậu hay không , đậu diểm trung bình >5.0
        Test test = new Test();
        test.checkMedium(student1);
        test.checkMedium(student2);
        test.checkMedium(student3);
         // kiểm tra ngày sinh
        System.out.println(   student1.checkDateofbirth(student2));
        System.out.println(   student1.checkDateofbirth(student3));
        System.out.println(   student2.checkDateofbirth(student3));

    }
}