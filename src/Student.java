public class Student {
    public int studentID;
    public String name;
    public float pointTheory;
    public float pointPractice;

    public Student() {
    }

    public Student(int studentID, String name, float pointTheory, float pointPractice) {
        this.studentID = studentID;
        this.name = name;
        this.pointTheory = pointTheory;
        this.pointPractice = pointPractice;
    }

    public float average() {
        return (pointPractice + pointTheory) / 2;
    }

    public void display() {
        System.out.printf("%3d\t %-15s %8.2f %18.2f %19.2f \n", studentID, name, pointTheory, pointPractice, average());
    }
}
