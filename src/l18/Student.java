package l18;

import java.util.Objects;

public class Student implements Cloneable{

    private String name;
    private double score;
    private static final  double times=1.5;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score*times;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Double.compare(score, student.score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}


/*

    ============================================================
    instanceof 运算符
    ============================================================

    【基本语法】

    对象 instanceof 类型

    返回 true 或 false。


    【作用】

    判断一个对象是不是某个类型（类、子类、接口）的实例。


    【代码示例】

    // 基本使用
    String str = "hello";
    System.out.println(str instanceof String);   // true
    System.out.println(str instanceof Object);   // true（String 是 Object 的子类）

    // 子类判断
    class Animal {}
    class Dog extends Animal {}

    Animal a = new Dog();
    System.out.println(a instanceof Dog);     // true（a 实际是 Dog）
    System.out.println(a instanceof Animal);  // true（Dog 是 Animal 的子类）


    【常见场景：安全类型转换】

    先判断再强转，避免 ClassCastException。

    Animal a = new Dog();

    if (a instanceof Cat) {
        Cat c = (Cat) a;   // 只有确认是 Cat 才转换
        System.out.println("转换成功");
    } else {
        System.out.println("a 不是 Cat 类型");
    }


    【返回值规则】

    情况                                   结果
    ────────────────────────────────────────────────────
    对象是同一个类                         true
    对象是子类                             true（子类也是父类的一种）
    对象是父类（实际指向子类）             true
    对象完全无关                           false
    null instanceof 任何类型               false（null 不属于任何类型）


    【生活类比】

    就像问："这只动物是狗吗？"
    是 → true，不是 → false。


    【一句话总结】

    instanceof 就是判断"这个对象是不是这个类型的实例"，返回 true 或 false。
    常用于类型转换前的安全判断。

    ============================================================

*/

/*

    ============================================================
    hashCode() 方法
    ============================================================

    【全称】

    hash = Hash（哈希/散列）
    hashCode = Hash Code（哈希码/散列码）


    【什么是 hashCode】

    hashCode() 是 Object 类的方法，返回一个整数。
    可以理解为对象的"数字指纹"或"数字身份证号"。


    【代码示例】

    public int hashCode() {
        return Objects.hash(name, score);
    }

    Objects.hash(name, score)：把 name 和 score 组合起来，
    由 JDK 自动计算出一个整数哈希值。
    内容相同的对象，计算出的哈希值也相同。


    【生活类比】

    每个人的指纹 → 对象的 hashCode
    指纹唯一标识一个人 → 哈希值唯一标识一个对象的内容
    警察用指纹快速找人 → 集合用哈希值快速找对象


    【为什么需要 hashCode】

    在 HashMap、HashSet 等集合中，
    哈希值用来快速定位对象的存储位置，实现快速存取。


    【hashCode 和 equals 的约定】

    规则：
    - 两个对象 equals 相等 → 必须有相同的 hashCode ✅
    - 两个对象 hashCode 相同 → 不一定 equals 相等（哈希碰撞）


    【一句话总结】

    hashCode() 返回对象的数字指纹，用于在集合中快速定位对象。
    重写 equals 时必须重写 hashCode，保证逻辑一致。

    ============================================================

*/

/*

    ============================================================
    toString() 方法 & 转义字符
    ============================================================

    【代码示例】

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    【输出格式】

    假设 name = "张三"，score = 90
    输出：Student{name='张三', score=90}


    【逐段拆解】

    "Student{"                     → Student{
    "name='"                        → name='
    + name                          → 张三（变量值）
    + '\''                          → '（单引号字符）
    ", score="                      → , score=
    + score                         → 90（变量值）
    '}'                             → }

    拼合结果：Student{name='张三', score=90}


    【\' 是什么】

    \' 是转义字符，用来表示一个单引号 '。
    因为单引号在 Java 中用于包裹 char 类型，
    直接用 ' 会引起语法歧义，所以需要用 \' 转义。

    '\'' 拆解：
      最外层 '' → char 类型
      里面的 \' → 转义后的单引号

    等价写法（用双引号字符串代替 char）：
      "'"   // 更清晰，效果相同


    【常见转义字符】

    转义符     含义
    ────────────────────────────────────────────────────
    \'         单引号
    \"         双引号
    \\         反斜杠
    \n         换行
    \t         制表符（Tab）
    \r         回车


    【toString() 的作用】

    定义对象的字符串表示形式。
    当打印对象（System.out.println(obj)）或拼接字符串时自动调用。


    【一句话总结】

    \' 是转义字符，表示一个单引号。
    这段 toString() 输出格式为 Student{name='张三', score=90}。

    ============================================================

*/

/*


    ============================================================
    clone() 方法 & CloneNotSupportedException
    ============================================================

    【clone() 是什么】

    clone() 是 Java 中用来复制对象的方法。
    创建一个当前对象的副本（内容相同，内存地址不同）。


    【代码模板】

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();   // 调用 Object 类的 clone 方法
    }


    【为什么需要克隆】

    直接赋值：Student s2 = s1;   → s2 和 s1 指向同一对象，改一个另一个也变
    克隆：Student s2 = (Student) s1.clone(); → s2 是独立副本，互不影响


    【完整使用步骤】

    // 1. 实现 Cloneable 接口（必须）
    class Student implements Cloneable {
        String name;
        int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }

        // 2. 重写 clone 方法，改为 public
        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    // 3. 使用克隆
    Student s1 = new Student("张三", 90);
    Student s2 = (Student) s1.clone();   // 复制副本
    s2.name = "李四";   // 修改副本不影响原对象


    【CloneNotSupportedException 含义】

    中文翻译：克隆不支持异常

    异常抛出原因：类没有实现 Cloneable 接口

    解决方式：在类声明中添加 implements Cloneable


    【图解】

    原对象（地址 0x100）         克隆得到的新对象（地址 0x200）
    ┌─────────────────┐          ┌─────────────────┐
    │ name = "张三"    │          │ name = "张三"    │  ← 内容相同
    │ score = 90       │          │ score = 90       │
    └─────────────────┘          └─────────────────┘


    【一句话总结】

    clone() 用来复制对象，内容相同但地址不同。
    类必须实现 Cloneable 接口，否则抛出 CloneNotSupportedException。

    ============================================================


*/