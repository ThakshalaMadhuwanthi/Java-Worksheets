import java.util.ArrayList;

public class Department {
    private String name;
    Lecture departmentHead;
    private ArrayList<Course> coursesOffering = new ArrayList<>();
    private ArrayList<Lecture> lecturersBelongsTo = new ArrayList<>();

    public Department(String name) {
        this.name = name;

    }


    void displayInfo(){
        System.out.println("Department Name:"+name);
        System.out.println("Department Name: " + name);
        if (departmentHead != null) {
            displayDepartmentHeadInfo();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(Lecture head) {
        this.departmentHead = head;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            System.out.println("Department Head: " + departmentHead.getName());
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecture lecture) {
        lecturersBelongsTo.add(lecture);
    }
    public void removeLecturer(Lecture lecture) {
        lecturersBelongsTo.remove(lecture);
    }




}
