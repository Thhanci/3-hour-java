package l10_1;

public class Profession {

    String name;

    void work() {
        System.out.println("我正在工作");
    }

    public Profession() {
        System.out.println("父类构造");
    }

    public Profession(String name) {
        this.name = name;
        System.out.println("我正在调用全参构造器");
    }
}