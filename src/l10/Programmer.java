package l10;

public class Programmer extends Profession {

    static boolean haveHair;

    static void  stayUpLate(){
        System.out.println("我正在熬夜");
    }

    public Programmer(String name) {
        super(name);//super();
        super.name=name;
        //this.haveHair = haveHair;
    }

    String getName(){
        super.work();
        return super.name;
    }

    public static void main(String[] args){
        Programmer programmer = new Programmer("aaa");
        String supername=programmer.getName();
        System.out.println(supername);
        stayUpLate();


    }

}

/*

    子类和父类同名字段时，子类的字段会“遮盖”父类的字段。访问哪个由引用类型决定（不是由实际对象决定），且不参与多态。开发中应尽量避免这种写法，以免造成混淆。

    this 和 super 是“对象专用”关键字，只能在实例方法里用。静态方法里既没有 this，也没有 super。

    Tip:
    为什么 super(name) 必须在第一行？
        Java 规定：在创建子类对象时，必须先初始化父类，再初始化子类。所以调用父类构造方法的

*/


/*

    ============================================================
    Java 继承核心笔记
    ============================================================

            1. 子类调用父类构造方法
       - super() 调用父类无参构造，必须写在子类构造方法第一行
       - super(name) 调用父类全参构造，必须写在子类构造方法第一行
       - super() 只能在构造方法中使用，不能在普通方法中使用

    2. super 关键字的两种用法
       - super()：调用父类构造方法（只能在构造方法第一行）
            - super.xxx：访问父类成员（字段或方法，可在实例方法中使用）

            3. 构造方法执行顺序
       - 子类构造方法第一行会先调用父类构造方法
       - 父类构造方法先执行完毕，再执行子类构造方法剩余代码
       - 原因：必须先初始化父类，再初始化子类

    4. super() 和 super.xxx 的区别
       - super() → 调用构造方法，只能在构造方法第一行
       - super.字段 → 访问父类字段，可在实例方法中使用
       - super.方法() → 调用父类方法，可在实例方法中使用
       - super.构造方法名() → ❌ 错误写法

    5. super(name) 和 super.name = name 的区别
       - super(name) → 调用父类全参构造，父类构造内部完成 this.name = name
       - super.name = name → 手动给父类 name 字段赋值
       - 两者同时写会导致重复赋值

    6. this 和 super 的注意事项
       - this 和 super 只能在非静态方法（实例方法）中使用
       - 静态方法（static）中不能使用 this 和 super

            ============================================================
    代码示例
    ============================================================

    class Profession {
        String name;

        Profession() {
            System.out.println("父类无参构造");
        }

        Profession(String name) {
            this.name = name;
            System.out.println("父类全参构造");
        }

        void work() {
            System.out.println("work");
        }
    }

    class Programmer extends Profession {

        Programmer(String name) {
            super(name);      // ✅ 调用父类全参构造
            // super.name = name; // ❌ 重复赋值，不需要写
        }

        String getName() {
            super.work();     // ✅ 调用父类方法
            return super.name; // ✅ 访问父类字段
        }

        // 错误示例
        // void errorMethod() {
        //     super();       // ❌ super() 只能在构造方法第一行
        // }

        public static void main(String[] args) {
            Programmer p = new Programmer("张三");
            System.out.println(p.getName());
        }
    }

    ============================================================

*/

/*

============================================================
继承
============================================================

【继承规则】

1. 子类会继承父类的所有属性和方法（private 修饰的除外）；
2. 每个类只能继承一个类；
3. 所有类都默认继承 Object 类；
4. 构造对象时，先调用父类构造方法，再调用当前构造方法。

============================================================
super
============================================================

super 和 this 用法非常相似，区别在于：

this 指代当前实例或当前类的构造器；

super 借以访问父类属性方法或指代父类的构造器。

============================================================

*/


/*

============================================================
代码运行顺序
============================================================

【执行顺序】

1. main 方法开始执行
   → Programmer programmer = new Programmer("aaa");

2. 进入 Programmer 构造方法
   → public Programmer(String name) {
         super(name);     // 调用父类全参构造
     }

3. 进入父类 Profession 全参构造
   → public Profession(String name) {
         this.name = name;              // 父类 name = "aaa"
         System.out.println("我正在调用全参构造器");
     }
   → 输出：我正在调用全参构造器

4. 返回子类 Programmer 构造方法继续执行
   → super.name = name;  // 父类 name 再次赋值为 "aaa"（重复操作）

5. Programmer 对象创建完成，返回 main 方法

6. 调用 programmer.getName()
   → 进入 getName() 方法
   → super.work();       // 调用父类 work() 方法
   → 输出：work
   → return super.name;  // 返回父类 name 的值 "aaa"

7. 回到 main 方法
   → System.out.println(supername);
   → 输出：aaa

8. 调用 stayUpLate()
   → 输出：我正在熬夜

============================================================
【最终输出】
============================================================

我正在调用全参构造器
work
aaa
我正在熬夜

============================================================
【关键点】
============================================================

1. super(name) 调用父类全参构造，父类先初始化完成；
2. super.name = name 是重复赋值，实际不需要；
3. super.work() 在实例方法中调用父类方法；
4. super.name 在实例方法中访问父类字段；
5. 静态方法 stayUpLate() 直接用类名或方法名调用。

============================================================

*/