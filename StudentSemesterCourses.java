class StudentSemesterCourses {
    private String semesterName;
    private String[] courseNames;
    private int[] courseMarks;
    private int courseCount;

   StudentSemesterCourses(String semesterName, int numberOfCourses) {
        this.semesterName = semesterName;
        this.courseNames = new String[numberOfCourses];
        this.courseMarks = new int[numberOfCourses];
        this.courseCount = 0;
    }

    public void addCourse(String courseName, int marks) {
        if (courseCount < courseNames.length) {
            courseNames[courseCount] = courseName;
            courseMarks[courseCount] = marks;
            courseCount++;
        } else {
            System.out.println("Cannot add more courses. Limit reached for " + semesterName);
        }
    }

    public void displayCourses() {
        System.out.println("Semester: " + semesterName);
        System.out.println("Courses and Marks:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("Course: " + courseNames[i] + ", Marks: " + courseMarks[i]);
        }
    }
}
