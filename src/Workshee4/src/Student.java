import java.util.ArrayList;

public class Student extends Person{
    private String studentID;
    private String year;

    Degree degree;
    ArrayList<Course> courseEnrolled=new ArrayList<>();

    public Student(String name, String studentID, String year) {
        super(name);
        this.studentID = studentID;
        this.year = year;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }



    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }

    @Override

        void displayInfo(){
            System.out.println("Student Name:"+super.getName());
            System.out.println("Student ID:"+studentID);
            System.out.println("Student year"+year);

            if (degree != null) {
                displayDegreeInfo();
            }
        }
        public void registerDegree(Degree degree) {
            this.degree = degree;
        }

        public void displayDegreeInfo() {
            if (degree != null) {
                degree.displayInfo();
            }
        }

        public void enrollCourse(Course course) {
            courseEnrolled.add(course);
        }

        public void unenrollCourse(Course course) {
            courseEnrolled.remove(course);
        }
        public void listCoursesEnrolled() {
            System.out.println("Courses Enrolled:");
            for (Course course : courseEnrolled) {
                course.displayInfo();
            }



    }



}
