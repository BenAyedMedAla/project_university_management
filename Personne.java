
public class Personne {
    protected String firstName;
    protected String lastName;
    protected int age;
    public Personne(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    } 
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    } 
    public int getage(){
        return this.age;
    } 
    public void setAge(int age) {
        this.age = age;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    } 
}
