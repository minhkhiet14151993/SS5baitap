package baitap2;

public class Student {
    private String name = "john";
    private String classes = "CO2";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public void display(){
        System.out.println("name: "+name+", "+" classes: "+ classes );
    }
}
