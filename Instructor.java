public class Instructor extends Personne {
    private int instructorId;
    private Course course;
    public Instructor(String fname, String lname,int age,int id,Course c){
        super(fname, lname, age);
        instructorId=id;
        this.course=c;
    }
    public int getInstructorId(){
        return instructorId;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public void display(){
        System.out.println("ID : "+this.instructorId+" name :"+this.getFirstName()+" "+this.getLastName()+" age : "+this.getage());
        System.out.println(" he is the teacher of :");
        course.display1();
    }
}
