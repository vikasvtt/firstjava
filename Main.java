public class Main {
    public static void main(String[] args) {
        // Create example student
        Student student = new Student("John Doe", "2004-05-15");
        student.displayStudentInfo();

        // Semester 1 courses
        StudentSemesterCourses semester1 = new StudentSemesterCourses("Semester 1", 3);
        semester1.addCourse("Mathematics", 85);
        semester1.addCourse("Physics", 78);
        semester1.addCourse("Chemistry", 90);

        // Semester 2 courses
        StudentSemesterCourses semester2 = new StudentSemesterCourses("Semester 2", 2);
        semester2.addCourse("Biology", 88);
        semester2.addCourse("English", 92);

        // Display semester details
        semester1.displayCourses();
        semester2.displayCourses();
    }
}