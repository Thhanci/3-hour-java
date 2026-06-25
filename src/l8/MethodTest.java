package l8;

import l6.Workman;

import java.util.Scanner;

public class MethodTest {

    static int myMethod (int num1,int num2){
        return (num1+num2)*250/13+7;
    }

    public static void main(String[] args){
        //Scanner_d();

        int a=3;
        int b=4;
        int c=5;
        int result1=myMethod(a,b);
        int result2=myMethod(result1,c);
        //System.out.printf("r1:%d %nr2:%d %n",result1,result2);

        int i=3;
        Workman workman=new Workman();  // 第1次构造，打印“我正在构造”
        workman.name="jack";

        //Tip:Java里一切都是值传递(不传递修改地址)
        workmanMethod(workman);
        System.out.println(workman.name);
    }

    static void workmanMethod(Workman workmanl) {
        workmanl = new Workman();   //第2次构造，打印“我正在构造”
        workmanl.name = "peter";
        System.out.println(workmanl.name);
    }


    private static void Scanner_d() {
        Scanner d = new Scanner(System.in);//如果后面有代码需要从键盘读取数据，扫描器必须先创建好，

        // ======================== 方式一：直接输入 int ========================
        System.out.println("========== 直接输入 int ==========");
        System.out.print("请输入一个整数：");
        int num1 = d.nextInt();          // 直接读整数
        System.out.println("你输入的整数是：" + num1);
        System.out.println();

        // 消耗掉 nextInt 遗留的换行符
        d.nextLine();

        // ======================== 方式二：输入字符串，再转成 int ========================
        System.out.println("========== 输入字符串，转成 int ==========");
        System.out.print("请输入一个数字（字符串形式）：");
        String str = d.nextLine();        // 读入字符串
        int num2 = Integer.parseInt(str); // 把字符串转成 int
        System.out.println("字符串 \"" + str + "\" 转成整数后是：" + num2);
        System.out.println();

        // ======================== 打印 d 的状态 ========================
        System.out.println("========== 打印 d 的状态 ==========");
        System.out.println("d 的值：" + d);
        System.out.println("d 的类型：" + d.getClass().getName());
    }

}

/*

============================================================
Java 输入输出 & Scanner 知识点笔记
============================================================

【System.in 和 System.out】

System.in
  - 类型：InputStream（字节输入流）
  - 作用：标准输入流，通常指键盘输入
  - 通俗理解：从键盘读数据进来的“管道”

System.out
  - 类型：PrintStream（字节输出流）
  - 作用：标准输出流，通常指控制台输出
  - 通俗理解：把数据打印到屏幕的“管道”

注意：System.in 和 System.out 都是 System 类的静态成员变量，
     不需要创建对象，直接用类名调用。

============================================================
【Scanner 扫描器】

Scanner d = new Scanner(System.in);
  - Scanner：类型名（类）
  - d：变量名，指向 Scanner 对象的引用
  - new Scanner(System.in)：创建 Scanner 对象，绑定到键盘输入

d 的类型是 Scanner，不是 int，不能直接转成 int。
d 是一个“扫描器工具”，它的作用是“从键盘读取数据”，
它本身不是数字，你不能把 d 变成 int。

============================================================
【从键盘读取整数】

方式一：直接用 nextInt()
  int num = d.nextInt();

方式二：先读字符串，再转 int
  String str = d.nextLine();
  int num = Integer.parseInt(str);

两种方式都能得到 int 类型的值。

============================================================
【Integer.parseInt() 详解】

Integer.parseInt(str) 是把字符串转成 int 的方法。
  - Integer：整数包装类（整数的工具箱）
  - parseInt：方法名，解析字符串为整数

示例：
  int num = Integer.parseInt("123");  // "123" → 123

注意事项：
  - 字符串必须是纯数字，否则抛 NumberFormatException
  - "123" → 123  ✅
  - "abc" → ❌ 异常
  - "12.5" → ❌ 异常（小数点不行）
  - " 123 " → 123  ✅（前后空格会自动去掉）

============================================================
【Scanner 的常用方法】

d.nextInt()    读取一个整数（int）
d.nextDouble() 读取一个浮点数（double）
d.nextLine()   读取一整行（String）
d.next()       读取一个单词（String，遇到空格停止）
d.hasNextInt() 判断下一个输入是否是整数

============================================================
【注意事项：nextInt() 和 nextLine() 混用的坑】

问题：
  int n = d.nextInt();   // 用户输入 25 后按回车
  String s = d.nextLine(); // ❌ 会读到空字符串

原因：
  nextInt() 只读数字，不读后面的换行符，
  nextLine() 会读取换行符，所以直接读到空。

解决办法：
  在 nextInt() 后加一行 d.nextLine() 吃掉换行符：
  int n = d.nextInt();
  d.nextLine();           // 吃掉换行符
  String s = d.nextLine(); // ✅ 正常读取

============================================================
【print vs println vs printf 对比】

print：   打印内容，不换行
println： 打印内容，自动换行（print line）
printf：  支持格式化输出（%d、%s、%n 等）

错误写法：
  System.out.println("r1:%d, r2:%d", a, b);   ❌ println 不支持占位符
  System.out.print("r1:%d, r2:%d", a, b);     ❌ print 也不支持

正确写法：
  System.out.printf("r1:%d, r2:%d%n", a, b);  ✅ 用 printf 格式化输出
  System.out.println("r1:" + a + ", r2:" + b); // ✅ 用 + 拼接

============================================================
【Scanner 常见错误】

❌ 错误写法：
   Scanner d = new Scanner(System.in);
   int num = (int) d;   // Scanner 不能转成 int

✅ 正确写法：
   Scanner d = new Scanner(System.in);
   int num = d.nextInt();   // 从 Scanner 里取一个整数出来

*/


/*

    ============================================================
    构造方法 & 值传递 知识点笔记
    ============================================================

    【构造方法（Constructor）】

    public Workman() {
        System.out.println("我正在构造");
    }

    什么是构造方法？
      - 方法名必须和类名完全一致（Workman）
      - 没有返回值类型（连 void 都不能写）
      - 在 new 对象时自动执行，不需要手动调用

    什么时候执行？
      每次 new 对象时执行一次。
      Workman engineer = new Workman();   → 执行一次，打印“我正在构造”
      Workman jack = new Workman();       → 执行一次，打印“我正在构造”
      new 两次 → 打印两次

    构造方法的实际用途：
      用来给对象的字段赋初始值，而不是只打印一句话。
      示例：
      public Workman(String name, int age) {
          this.name = name;
          this.age = age;
      }

    ============================================================
    【main 方法为什么不执行？】

    public static void main(String[] args) 是程序的入口。

    一个 Java 程序只有一个入口。
      - 运行 Workman 时 → Workman 里的 main 执行
      - 运行 MethodTest 时 → MethodTest 里的 main 执行

    你运行的是 MethodTest，所以 Workman 里的 main 不会执行。
    只有你主动运行 Workman 这个类时，它里面的 main 才会执行。

    ============================================================
    【值传递（Java 里一切都是值传递）】

    示例代码：
      Workman workman = new Workman();
      workman.name = "jack";
      workmanMethod(workman);
      System.out.println(workman.name);   // 输出 jack

      static void workmanMethod(Workman workmanl) {
          workmanl = new Workman();
          workmanl.name = "peter";
      }

    为什么输出是 jack 而不是 peter？

    图解：
      main 中：
          workman ──────→ 对象A (name = "jack")

      调用 workmanMethod(workman)：
          workmanl ─────→ 对象A (name = "jack")   // 传入的是地址值

      执行 workmanl = new Workman()：
          workmanl ─────→ 新对象B (name = null)   // workmanl 改指向新对象
          workman  ─────→ 对象A (name = "jack")   // workman 没变

      执行 workmanl.name = "peter"：
          workmanl ─────→ 新对象B (name = "peter")
          workman  ─────→ 对象A (name = "jack")   // workman 还是指向对象A

      方法结束：
          workmanl 消失
          workman 仍然指向对象A，name 还是 "jack"

    关键结论：
      - Java 传递的是地址值（对象引用），不是对象本身
      - 方法内部重新 new，只是让局部变量指向新对象
      - 外部变量不受影响，仍然指向原来的对象

    ============================================================
    【this 关键字】

    this 指代当前实例（当前对象本身）。

    两种用法：
      1. this.xxx → 指代当前对象的字段或方法
         例：this.name = name;  // 把参数 name 赋给当前对象的 name 字段

      2. this() → 调用当前类的另一个构造方法（必须写在第一行）
         例：Person(String name) {
                this();        // 先调用无参构造
                this.name = name;
             }

    为什么 this() 必须放开头？
      保证先完成公共初始化，再执行当前构造的个性化逻辑。

    ============================================================
    【类与对象】

    类（Class）：
      是一个模板，描述一组对象共有的状态（字段）和行为（方法）。
      例：Workman 类定义了 name、age、position 字段，和 work()、eat() 方法。

    对象（Object）：
      是类的一个实例，有具体的状态和行为。
      例：engineer 是一个 Workman 对象，name = null，position = "程序员"。
          jack 是另一个 Workman 对象，position = "搬砖工人"。

    关系：
      类 = 设计图
      对象 = 根据设计图造出来的具体房子

*/