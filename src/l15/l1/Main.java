package l15.l1;

public class Main {

    public static void main(String[] args){
        Father father=new Father();
        father.print();

        Son1 son1=new Son1();
        son1.print();

        Father object = new Son2();
        object.print();

    }

}
