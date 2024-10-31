public class UniversityManagmentSystem {
    public static void main(String[] args) {
        Department department = new Department("Software Engineering");
        Degree degree = new Degree("Computer Science", 200);
        Course course = new Course("Object-Oriented Programming", "Full-time", 30);
        Lecture lecture = new Lecture("Dr. John Smith", "Professor");
        Student student = new Student("Alice Brown", "S12345", "Freshman");

        department.appointDepartmentHead(lecture);
        department.offerCourse(course);
        department.addLecturer(lecture);

        degree.offerCourse(course);

        lecture.setDepartment(department);
        lecture.addCourse(course);

        student.registerDegree(degree);
        student.enrollCourse(course);

        department.displayInfo();
        degree.displayInfo();
        course.displayInfo();
        lecture.displayInfo();
        student.displayInfo();
    }
}
