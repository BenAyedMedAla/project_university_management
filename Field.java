import java.util.ArrayList;
public class Field {
    private ArrayList<Student> studentList;
    private ArrayList<Instructor> instructorList;
    private ArrayList<Course> courses;
    private ArrayList<ClassRoom> classroomList;
    private String name;
    private int capacity;
    public Field(String name,int capacity){
        studentList=new ArrayList<Student>();
        instructorList=new ArrayList<Instructor>();
        courses=new ArrayList<Course>();
        classroomList=new ArrayList<ClassRoom>();
        this.name=name;
        this.capacity=capacity;
    }
    public void addStudent(Student s){
        
        if (studentList.size()<capacity){
            studentList.add(s);
            s.setField(this);
        }
    }
    public void addClassroom(ClassRoom c){
        classroomList.add(c);
    }
    public void addInstructor(Instructor i){
        instructorList.add(i);
    }
    public void addCourse(Course c){
        courses.add(c);
    }
    public void studentsOfField(){
        for(Student s: studentList)
        s.display1();
    }
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public int getCapacity() {
        return capacity;
    }
    public void display(){
        System.out.println("this field is :"+this.name);
        System.out.println("courses: ");
        for (Course c:courses)
        c.display1();
        System.out.println(" instructors :");
        for (Instructor i:instructorList)
        i.display();
        System.out.println(" classrooms :");
        for (ClassRoom c:classroomList)
        c.display();
    }
}
