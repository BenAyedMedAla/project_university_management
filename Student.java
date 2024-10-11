import java.util.ArrayList;

public class Student extends Personne {
    private int studentId;
    private Field field;

    public Student(String fname,String lname,int age,int id){
        super(fname, lname, age);
        this.studentId=id;
    }
    public int getStudentId(){
        return this.studentId;
    }
    public Field getField() {
        return field;
    }
    public void setField(Field field) {
        this.field = field;
    }
    public void display1(){
        System.out.println("ID : "+this.studentId+" name :"+this.getFirstName()+" "+this.getLastName()+" age : "+this.getage());

    }
    public void display2(){
        System.out.println("ID : "+this.studentId+" name :"+this.getFirstName()+" "+this.getLastName()+" age : "+this.getage());
        System.out.println(" this student belong to ");
        field.display();
    }
}
