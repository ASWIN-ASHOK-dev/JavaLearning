//OOP learning
package com.ak;
class Student{
    String name;
    byte age;

    Student(){
        System.out.println("Object : "+ this +" Note:Using normal create is not a good practise,Consider Initialising it with name and age.");
    }
    Student(String name,byte age){
        this.name = name;
        this.age = age;
    }

    String getInfo(){
        return  name + " " + age;
    }
}
public class Main{
    public static void main(String[] arg) {
        Student student1 = new Student();
        student1.name = "Alan";
        student1.age = 23;
        System.out.println(student1.getInfo());
        Student student2 = new Student("Alex",(byte)20);
        System.out.println(student2.getInfo());
    }
}