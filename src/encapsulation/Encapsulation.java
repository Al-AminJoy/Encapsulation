package encapsulation;

public class Encapsulation {

    public static void main(String[] args) {
       Test test=new Test();
       test.setName("Al-Amin Islam");
       test.setAge(25);
       System.out.println("Name : "+test.getName());
       System.out.println("Age : "+test.getAge());
    }
    
}
