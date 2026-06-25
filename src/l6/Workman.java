package l6;

public class Workman {

    public String name;
    int age;
    String position;

    public Workman() {
        System.out.println("我正在构造");
    }//Tip:这是 Workman 类的构造方法（也叫构造函数），它的作用是：在创建对象时自动执行，用来初始化对象。

    void work() {
        System.out.println("我正在从事" + position + "的工作");
    }

    void eat() {
        System.out.println("我正在吃饭");
    }

    void sleep() {
        System.out.println("zzz......");
    }

    public static void main(String[] args) {
        // 把3赋给i
        // 输入了一个3，把3通过整数构造的方式，变成一个整数，然后赋给i
        Integer i = new Integer(3);

        Workman engineer = new Workman();
        Workman jack = new Workman();

        engineer.position = "程序员";
        jack.position = "搬砖工人";

        engineer.work();
        System.out.println("---");
        jack.work();

        System.out.println("我让你吃饭了");
    }
}

/*

    对象：对象是类的一个实例，有状态和行为
    例如，一个打工人是一个对象，它的状态有：
    姓名、年龄、职位等；
    行为有：打工、吃饭、睡觉等。
    类：类是一个模板，它描述一组对象的状态和行为。
*/