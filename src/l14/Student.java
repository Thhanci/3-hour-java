package l14;

import java.util.Arrays;

public class Student implements Comparable {

    private String name;
    private Integer score;

    public Student(String name, Integer score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.score > student.score) return 1;
        if (this.score < student.score) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "name: " + name + ", score: " + score;
    }

    public static void main(String[] args) {
        Student student1 = new Student("jack", 90);
        Student student2 = new Student("peter", 85);
        Student student3 = new Student("rose", 95);
        Student students[] = new Student[]{student1, student2, student3};

        Arrays.sort(students);

        Arrays.stream(students).forEach(System.out::println);

        /*

        Arrays.stream(students)    // 1. 把数组变成"流"（像一条传送带）
        .forEach(          // 2. 遍历传送带上的每一个元素
            System.out::println  // 3. 对每个元素执行打印操作
        );

        */

        System.out.println();

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}


//Tip:       :: 是简写符号，意思就是“用这个方法”，让代码少写一些重复内容

/*

    ============================================================
    接口（Interface）
    ============================================================

    【基本概念】

    接口是对一系列看上去不同，但是本质上相同的具体概念的抽象。
    接口为具体子类提供特定能力。

    【代码示例】

    // 定义接口：提供"飞行"能力
    interface Flyable {
        void fly();   // 默认 public abstract
    }

    // 定义接口：提供"游泳"能力
    interface Swimmable {
        void swim();
    }

    // 具体类：实现多个接口
    class Bird implements Flyable {
        @Override
        public void fly() {
            System.out.println("鸟在飞");
        }
    }

    class Fish implements Swimmable {
        @Override
        public void swim() {
            System.out.println("鱼在游泳");
        }
    }

    // 一个类可以实现多个接口
    class Duck implements Flyable, Swimmable {
        @Override
        public void fly() {
            System.out.println("鸭子在飞");
        }

        @Override
        public void swim() {
            System.out.println("鸭子在游泳");
        }
    }

    【核心要点】

    - 接口中的方法默认是 public abstract；
    - 接口中的字段默认是 public static final；
    - 类通过 implements 实现接口；
    - 一个类可以实现多个接口（多实现）；
    - 接口不能实例化（不能 new）。

    ============================================================

*/


/*

============================================================
Comparable 接口 & compareTo 方法
============================================================

【代码示例】

@Override
public int compareTo(Object o) {
    Student student = (Student) o;
    if (this.score > student.score) return 1;
    if (this.score < student.score) return -1;
    return 0;
}

    ============================================================
    【compareTo 方法的作用】

    定义“当前对象”和“另一个对象”谁大谁小。
    Arrays.sort() 排序时会调用这个方法来决定顺序。

    返回值含义：
        返回正数（如 1）  → 当前对象比传入对象大
        返回负数（如 -1） → 当前对象比传入对象小
        返回 0            → 两个对象相等

    【调用示例】
    student1.compareTo(student2);

        this       → student1（当前对象）
        o          → student2（传入对象）

    【Student student = (Student) o 的含义】

    把 Object 类型强制转回 Student 类型。
    因为 compareTo 的参数是 Object，但我们要访问 Student 的 score 字段，
    必须先转型才能用 o.score。

    为什么参数是 Object 而不是 Student？
        因为 Comparable 接口是通用的，任何类都可以实现它，
        所以参数设计为通用的 Object 类型。

    如果不用 (Student) 转型会怎样？
        if (this.score > o.score)   // ❌ 报错！Object 没有 score 字段

    ============================================================
    【完整示例】

    Student student1 = new Student("jack", 90);
    Student student2 = new Student("peter", 85);
    Student student3 = new Student("rose", 95);
    Student students[] = new Student[]{student1, student2, student3};

    Arrays.sort(students);

    排序前： [student1(90), student2(85), student3(95)]
    排序后： [student2(85), student1(90), student3(95)]

    ============================================================
    【类与对象回顾】

    类（Class）：模板/蓝图（如 Student 类）
    对象（Object）：根据类创建的具体实例（如 student1、student2）

    ============================================================

*/

/*

============================================================
接口（Interface）
============================================================

【意义与价值】

- 面向契约设计。
- 提供高自由度的定制化能力。

============================================================
【和抽象类的区别】

- 抽象类中的成员变量可以是各种类型的，
  而接口中的成员变量只能是 public static final 类型的；

- 一个类只能继承一个抽象类，
  而一个类却可以实现多个接口。

============================================================

*/