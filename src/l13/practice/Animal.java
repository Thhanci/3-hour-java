package l13.practice;

public abstract class Animal {
    String name;

    protected void  eat(){
        System.out.println(name+" eat.");
    }

    protected  abstract void bark();
}
