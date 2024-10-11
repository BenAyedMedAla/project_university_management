import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ClassRoom classroom1 = new ClassRoom(101, 30);
        ClassRoom classroom2 = new ClassRoom(102, 25);
        ArrayList<Student>students=new ArrayList<Student>();
        Course course1 = new Course("Java Programming");
        Course course2 = new Course("Database Management");
        Instructor i1= new Instructor("John", "Doe", 35, 1, course1);
        Instructor i2= new Instructor("Jane", "Smith", 40, 2, course2);

         Field GL = new Field("Genie Lgiciel", 3);
        Field RT = new Field("Reseaux et telecommunication", 3);
        Field IIA = new Field("informatique industrielle et automatique", 3);
        Field IMI = new Field("maintenance industrielle", 3);
        
        Student s1= new Student("ala", "Williams", 20, 1);
         Student s2= new Student("ahmed", "Williams", 20, 1);
          Student s3= new Student("samir", "Williams", 20, 1);
           Student s4= new Student("amine", "Williams", 20, 1);
           students.add(s1);
           students.add(s2);
           students.add(s3);
           students.add(s4);
        Employee employee = new Employee("Alice", "Johnson", 28, 101);
        employee.addClass(classroom1);

        for(Student s: students){
            if(GL.getStudentList().size()<=GL.getCapacity()){
            GL.addStudent(s);}
            else if (RT.getStudentList().size()<=GL.getCapacity()){
            RT.addStudent(s);}
            else if (IIA.getStudentList().size()<=GL.getCapacity()){
            IIA.addStudent(s);}
            else{
            IMI.addStudent(s);}

    }
        GL.addInstructor(new Instructor("Eva", "Davis", 45, 3, course1));
        GL.addClassroom(classroom1);
        GL.addCourse(course1);
        GL.addCourse(course2);

        GL.studentsOfField();
        System.out.println("Classroom 1:");
        classroom1.display();

        System.out.println("\nCourse 1:");
        course1.display2();

        System.out.println("\nEmployee:");
        employee.display();

        System.out.println("\nField:");
        GL.display();
        RT.display();

        System.out.println("\nStudent:");
        for(Student s: students){
        s.display2();}
}
}
