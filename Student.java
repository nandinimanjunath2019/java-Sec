class student{
    String name;
    int age;
    
    void disply(){
        System.out.println("Name:"+ name + "Age:"+age);
    }
 }

public class Student1 {
    public static void main(String[] args) {
        student s1 =new student();
        s1.name= "panavi";
        s1.age=21;
        s1.disply();
    }
}
