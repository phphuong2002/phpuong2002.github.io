public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Student student1 = new Student();
        student1.studentID = 1;
        student1.name = "James";
        student1.pointTheory = 8f;
        student1.pointPractice = 9f;
        

        Student student2 = new Student();
        student2.studentID = 2;
        student2.name = "Claire";
        student2.pointTheory = 10f;
        student2.pointPractice = 9f;
        

        Student student3 = new Student();
        student3.studentID = 3;
        student3.name = "Jay";
        student3.pointTheory = 9f;
        student3.pointPractice = 7f;
       

        Student student4 = new Student(4, "Elen", 6f, 8f);
    
        System.out.printf("%4s %9s %24s %18s %18s \n", "ID", "Name", "Theorical point", "Practical point", "Average score");
        student1.display();
        student2.display();
        student3.display();
        student4.display();

    }
}



