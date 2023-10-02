package Model;

public class Student {
    private int id;
    private String name;
    private Date_of_birth dateOfBirth;
    private double mediumScore;
    private Class_of_student classOfStudent;

    public Student(int id, String name, Date_of_birth dateOfBirth, double mediumScore, Class_of_student classOfStudent) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.mediumScore = mediumScore;
        this.classOfStudent = classOfStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date_of_birth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date_of_birth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getMediumScore() {
        return mediumScore;
    }

    public void setMediumScore(double mediumScore) {
        this.mediumScore = mediumScore;
    }

    public Class_of_student getClassOfStudent() {
        return classOfStudent;
    }

    public void setClassOfStudent(Class_of_student classOfStudent) {
        this.classOfStudent = classOfStudent;
    }
    public void getNameFaculty(){
        System.out.println( this.classOfStudent.getNameFaculty().toString());
    }
    public boolean checkDateofbirth(Student student){
        return this.dateOfBirth.getDate() == student.dateOfBirth.getDate();
    }


}
