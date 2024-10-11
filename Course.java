import java.util.ArrayList;

public class Course {
        private String courseName;
        private ArrayList <Instructor> instructorListc;
        public Course(String cname){
            courseName=cname;
            instructorListc=new ArrayList<Instructor>();
        }
        public String getCourseName(){
            return courseName;
        }
        public void addInstructor(Instructor i){
            instructorListc.add(i);
        }
        public ArrayList<Instructor> getInstructorList() {
            return instructorListc;
        }
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
        public ArrayList<Instructor> getInstructorListc() {
            return instructorListc;
        }
        public void display1(){
            System.out.println("name : "+this.getCourseName());
        }
        public void display2(){
            System.out.println("name : "+this.getCourseName());
            System.out.println(" instructors : ");
            for (Instructor i : instructorListc){
                i.display();
            }
        }
}
    
