package l13.practice;

public class Text {
    public static void main(String[] args){
        Snake snake=new Snake();
        snake.eat();
        snake.bark();

        System.out.println("______");

        Cat cat=new Cat();
        cat.eat();
        cat.bark();

        System.out.println("______");

        Dog dog=new Dog();
        dog.eat();
        dog.bark();

    }
}
