 class Student {
    int age;
    Student(int age){
        this.age=age;
    }
    void display(){
        int marks=85;
        System.out.println("Object Identiti Hash Code: " + System.identityHashCode(this));
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Loacal Variable (marks): " + marks);


    }
}
public class StackHeapDemo {
    public static void main(String[] args){
        Student student = new Student(20);
        System.out.println("Student Object Created");
        student .display();
    }

}

