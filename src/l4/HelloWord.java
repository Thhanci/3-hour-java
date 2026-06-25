package l4;/*
    public:访问控制符
    class:类关键字
    HellolorId：类名，首字母大写


 */


import java.lang.reflect.Array;
import java.util.Arrays;

public class HelloWord {
    /*
    static:Java关键字，表示“静态的”
    void:方法返回值，表示“无返回值”
    main：方法名，main函数是Java程序的主入口
    String[] args:方法入参，在main涵数中特指控制台输入的参数
    */

    //argument args参数
    public static void main(String[] args) {
        //打印 Hello World!
        System.out.println("Hello World!");

        for (int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }

        Arrays.stream(args).forEach(System.out::println);
        /*

        Array.stream(args)	把数组 args 转换成一个流（Stream），类似于一条“数据传送带”，数据会逐个流出来
        .forEach(...)	遍历（循环）流中的每一个元素，对每个元素执行括号里指定的操作
        System.out::println	对每个元素执行打印操作，相当于 System.out.println(x)

         */

        /*
        Python
            add = lambda x, y: x + y
            等价于
            def add(x, y):
                return x + y

        */
    }
}

/*
    Java 核心概念笔记
    ───────────────────────────────────────────────────────────────────────────────

    一、基础概念
    ───────────────────────────────────────────────────────────────────────────────
    类     Class      对一类事物的抽象描述，是创建对象的模板
    对象   Object     根据类创建的具体实例，拥有实际属性值

    二、对象创建
    ───────────────────────────────────────────────────────────────────────────────
    构造函数   Constructor   用于初始化对象，在创建实例时自动调用

    三、设计原则
    ───────────────────────────────────────────────────────────────────────────────
    封装         Encapsulation         将数据和行为包装在一起，隐藏内部实现细节
    抽象类       Abstract Class        不能被实例化，可包含抽象方法和具体方法
    接口         Interface             定义行为规范，类通过实现接口来扩展功能

    四、方法特性
    ───────────────────────────────────────────────────────────────────────────────
    重载         Overload              同一类中方法名相同，参数列表不同
    重写         Override              子类重新实现父类的方法，方法签名必须相同

    五、类关系
    ───────────────────────────────────────────────────────────────────────────────
    继承         Inherit               子类获得父类的属性和方法，实现代码复用
    多态         Polymorphic           同一个方法调用，在不同对象上产生不同行为

    六、设计契约
    ───────────────────────────────────────────────────────────────────────────────
    契约设计     Contract Design       通过接口或抽象类约定行为规范，保证系统扩展性

    七、修饰符
    ───────────────────────────────────────────────────────────────────────────────
    static       表示静态成员，属于类本身，不属于实例
    final        表示不可变：类不可继承、方法不可重写、变量不可变

    八、访问控制
    ───────────────────────────────────────────────────────────────────────────────
    访问控制     Access Control        通过 private、default、protected、public 控制可见范围

    九、异常处理
    ───────────────────────────────────────────────────────────────────────────────
    异常处理     Exception Handling    使用 try-catch-finally 捕获并处理程序运行时的错误

    十、数据存储
    ───────────────────────────────────────────────────────────────────────────────
    集合框架     Collection & Map      提供 List、Set、Map 等数据结构，用于存储和操作对象组




    JAVA特性:
        多线程
        分布式
        动态性
        安全性

    JDK
    = Java SDK
    = Java Software Development Kit
    =Java软件开发工具包

    IDE
    = Integrated Development Environment
    =集成开发环境
    CodeBlocks、PyCharm、Eclipse、MyEclipse
    IntelliJ IDEA..

    D:\Program Files\Java\jdk-26.0.1\
    https://www.jetbrains.com/zh-cn/
    D:\Program Files\JetBrains\IntelliJ IDEA 2026.1.3
    https://www.oracle.com/java/technologies/downloads/#jdk26-windows

*/
