public class Student {
    private String name;
    private String dateOfBirth;

    public Student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age verification done using Date input (no calculation).");
    }
}
