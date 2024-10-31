public class Course {
    private  String name;
    private String enrollType;
    private  int numberOfStudentsEnrolled;

    Lecture lectureInCharge;
    Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    void displayInfo(){
        System.out.println("Course Name:"+name);
        System.out.println("Enroll Type:"+enrollType);
        System.out.println("Number of Students Enrolled:"+numberOfStudentsEnrolled);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLectureInCharge(Lecture lecture) {
        this.lectureInCharge = lecture;
    }

    public void removeLectureInCharge() {
        this.lectureInCharge = null;
    }

    public void addDegreeBelongsTo(Degree degree) {
        this.degreeBelongsTo = degree;
    }

    public void removeDegreeBelongsTo() {
        this.degreeBelongsTo = null;
    }




}
