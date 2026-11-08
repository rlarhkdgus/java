import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}

class Course {
    private String code;
    private String name;

    Course(String code, String name){
        this.name = name;
        this.code = code;
    }
    public String getCode(){
        return code;
    }
    public String getName(){
        return name;
    }
}

class OfflineCourse extends Course{
    OfflineCourse(String code, String name) {
        super(code,name);
    }
    @Override
    public String toString(){
        return "Code: " + getCode() + ", Name: " + getName() + ", Type : Offline";
    }
}

class OnlineCourse extends Course{
    OnlineCourse(String code, String name) {
        super(code,name);
    }
    @Override
    public String toString(){
        return "Code: " + getCode() + ", Name: " + getName() + ", Type : Online";
    }
}