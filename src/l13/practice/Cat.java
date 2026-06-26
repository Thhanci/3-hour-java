package l13.practice;

public class Cat extends Animal{

    protected Cat(){
        this.name="Cat";
    }

    protected void bark(){
        System.out.println(name+":喵喵");
    }

}
