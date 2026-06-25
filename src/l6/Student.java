//package l6;
//
//public class Student {
//
//    String id;
//    String name;
//    int age;
//
////    public Student() {
////        //System.out.println("我正在构造");
////    }
//    void print() {
//        System.out.println("Student" + id +" "+name+" "+age+" " );
//    }
//
//
//    public static void main(String[] args) //args 用来接收程序启动时从命令行传入的参数。
//    {
//        Student sA =new Student();
//        Student sB =new Student();
//
//        sA.id="1";
//        sB.id="2";
//        sA.name="A";
//        sB.name="B";
//        sA.age=3;
//        sB.age=4;
//
//        sA.print();
//        sB.print();
//    }
//
//
//}


package l6;

/*
 * Student 类：用来描述一个"学生"对象
 * 类就像是一个"模板"，定义了学生应该有哪些属性（字段）
 */
public class Student {

    // ========== 字段（属性）==========
    // 学号：String 类型，用双引号括起来，比如 "S001"
    String id;

    // 姓名：String 类型，比如 "张三"
    String name;

    // 年龄：int 类型，整数，比如 18
    int age;

    // ========== main 方法（程序的入口）==========
    public static void main(String[] args) {

        /*
         * 创建 Student 对象（也叫"实例化"）
         * new Student() 就是根据 Student 这个模板，造出一个具体的学生
         * 然后用变量 stu1 来"指向"这个学生
         */
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();

        /*
         * 给 stu1 赋值
         * 通过 "对象名.字段名 = 值" 的方式，把数据存进去
         */
        stu1.id = "S001";
        stu1.name = "张三";
        stu1.age = 20;

        // 给 stu2 赋值
        stu2.id = "S002";
        stu2.name = "李四";
        stu2.age = 21;

        // 给 stu3 赋值
        stu3.id = "S003";
        stu3.name = "王五";
        stu3.age = 19;

        /*
         * 打印他们的学号（id）
         * 用 "对象名.字段名" 的方式，取出数据并打印
         */
        System.out.println("第一个学生的学号：" + stu1.id);
        System.out.println("第二个学生的学号：" + stu2.id);
        System.out.println("第三个学生的学号：" + stu3.id);

        // 顺便打印一下完整信息（可选）
        System.out.println("==============================");
        System.out.println("完整信息：");
        System.out.println("stu1：" + stu1.id + "，" + stu1.name + "，" + stu1.age + "岁");
        System.out.println("stu2：" + stu2.id + "，" + stu2.name + "，" + stu2.age + "岁");
        System.out.println("stu3：" + stu3.id + "，" + stu3.name + "，" + stu3.age + "岁");
    }
}