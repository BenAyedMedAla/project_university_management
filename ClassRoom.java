public class ClassRoom {
    private int number;
    private int capacity;
    public ClassRoom(int number,int capacity){
        this.capacity=capacity;
        this.number=number;
    }
    public void display(){
        System.out.println(" class number "+this.number+"  ,capacity :"+this.capacity);
    }
    
}
