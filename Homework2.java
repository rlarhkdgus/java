import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        for (int i = 0; i < 3; i ++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요 : ");
            students[i] = new Student();
            students[i].setNumber(sc.nextInt());
            students[i].setName(sc.next());
            students[i].setMajor(sc.next());
            students[i].setPhone(sc.nextInt());
        }
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i ++) {
            String temp = "0" + Integer.toString(students[i].getPhone());
            System.out.printf("%d번째 학생: %d %s %s %s \n",
                    i,students[i].getNumber(),students[i].getName()
                    , students[i].getMajor(),temp
                    );
        }
    }
}

class Student {
    int number;
    String name;
    String major;
    int phone;

    public void setNumber(int input) {
        number = input;
    }
    public void setName(String input) {
        name = input;
    }
    public void setMajor(String input) {
        major = input;
    }
    public void setPhone(int input) {
        phone = input;
    }
    public int getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public String getMajor() {
        return major;
    }
    public int getPhone() {
        return phone;
    }
}
