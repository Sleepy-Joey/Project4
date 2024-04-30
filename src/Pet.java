import java.util.ArrayList;

public class Pet {
    private String name;
    private String type;
    private int age;
    private double height;

    public Pet(String animalName, String animalType, int animalAge, double animalHeight){
        this.name = animalName;
        this.type = animalType;
        this.age = animalAge;
        this.height = animalHeight;
    }
    public Pet(){}
    public String getName(){
        return name;
    }
    public void setName(String name){
       this.name = name;
    }

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public String toString(){
        return String.format("Pet Name: %s Pet Type: %s Pet Age: %d Pet Height: %s", name,type,age,height);
    }
}
