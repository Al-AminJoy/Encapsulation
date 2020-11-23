package encapsulation;

public class Test {
    private String name;
    private int age;
    //For Access private data we need public method(getter & setter)
    //or for set can use constructor
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
