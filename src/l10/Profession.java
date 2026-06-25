package l10;

public class Profession {

    String name;

    void work(){
        System.out.println("work");
    }

    public Profession(){
        System.out.println("父类构造");
    }

    public Profession(String name){
        this.name=name;
        System.out.println("我正在调用全参构造器");
    }

}


