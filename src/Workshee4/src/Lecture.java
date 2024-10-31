import java.util.ArrayList;

public class Lecture extends Person {
    private  String position;
    Department department;

    ArrayList<Course> coursesTeaching = new ArrayList<>();

    public Lecture(String name, String position) {
        super(name);
        this.position = position;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    void displayInfo(){
        System.out.println("Lecture name:"+super.getName());
        System.out.println("Lecture position:"+position);
        if (department != null) {
            displayDepartmentInfo();
        }

    }

    public void displayDepartmentInfo() {
        if (department != null) {
            System.out.println("Department: " + department.getName());
        }
    }




    void addCourse(Course course){
        coursesTeaching.add(course);
    }
    void removeCourse(Course course){
        coursesTeaching.remove(course);
    }

    void listCoursesTeaching(){
        System.out.println("Course Teaching");
        for(Course course : coursesTeaching){
            course.displayInfo();
        }
    }

}
