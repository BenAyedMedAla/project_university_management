import java.util.ArrayList;

public class Employee extends Personne {
    private int employeeId;
    private ArrayList<ClassRoom> working;
    public Employee(String fname, String lname,int age,int id){
        super(fname, lname, age);
        employeeId=id;
        working=new ArrayList<ClassRoom>();
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void addClass(ClassRoom c){
        working.clear();
        working.add(c);
    }
    public boolean verification(ClassRoom c){
        return working.contains(c);
    }
    public void display(){
        System.out.println(" name :"+this.getFirstName()+" "+this.getLastName()+" age : "+this.getage());
    }
}
