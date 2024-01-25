public class Student1 {
    int rollNum;
    String studentName;
    int mark1;
    int mark2;
    int mark3;
    int totalMarks;

    void setStudentDetails(int rollNum, String studentName, int mark1, int mark2, int mark3) {
        this.rollNum = rollNum;
        this.studentName = studentName;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
    }

    void displayStudentDetails() {
        calculateTotal();
        System.out.println("Student number = " + rollNum + ", Student name = " + studentName + ", Total marks = " + totalMarks);
    }
}

class Student1Tester {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.setStudentDetails(103, "Clifford", 79, 95, 84);
        student1.displayStudentDetails();
    }
}
