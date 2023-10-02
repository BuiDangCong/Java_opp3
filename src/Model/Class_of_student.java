package Model;

public class Class_of_student {
    private String nameClass;
    private String  nameFaculty;

    public Class_of_student(String nameClass, String nameFaculty) {
        this.nameClass = nameClass;
        this.nameFaculty = nameFaculty;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
}
