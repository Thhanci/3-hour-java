package l13;

import java.util.HashMap;
import java.util.TreeMap;

//Tip:抽象类，类比C# virtual ，约等于C# abstract
//不同在，virtual {//solve}，virtual里面有东西要执行，子类继承可额外写
//而abstract, abstract{}里面是空的，但是在子类里，abstract{// must solve}必须执行

public abstract class MyAbstractClass {

    public abstract void myMethod(int a);

    public void method(){
//        HashMap
//        TreeMap
    }

}


/*

    ============================================================
    abstract vs virtual（C#）
    ============================================================

    【一句话】
    abstract：你必须实现它（没有默认实现）
    virtual：我有一个默认实现，但你可以选择重写它

    【核心区别】

    对比项              abstract                    virtual
    ─────────────────────────────────────────────────────────────
    是否有方法体         ❌ 没有（只有声明）          ✅ 有（提供默认实现）
    子类是否必须重写     ✅ 必须重写                  ❌ 可以选择重写，也可以直接用父类的
    能否在普通类中使用   ❌ 只能在抽象类中            ✅ 可以在普通类中
    能否被 new          ❌ 抽象类不能实例化           ✅ 类可以实例化

    【代码示例】

    abstract class Animal {
        // abstract：没有方法体，子类必须实现
        public abstract void Shout();

        // virtual：有默认实现，子类可以选择重写
        public virtual void Eat() {
            Console.WriteLine("动物正在吃东西");
        }
    }

    class Dog : Animal {
        // 必须实现 abstract 方法
        public override void Shout() {
            Console.WriteLine("汪汪");
        }

        // 可选：不重写 Eat()，直接用父类的
        // 或者重写 Eat()，实现自己的逻辑
        public override void Eat() {
            Console.WriteLine("狗正在啃骨头");
        }
    }

    【使用场景】

    abstract：定义一个“必须做什么”，但不知道怎么做
    virtual：定义一个“可以怎么做”，并提供默认做法

    ============================================================

*/

/*

    ============================================================
    抽象类（Abstract Class）
    ============================================================

    【基本概念】

    抽象类是对一系列看上去不同，但是本质上相同的具体概念的抽象。
    抽象类用作具体子类的一种通用模板。

    【意义与价值】

    提供具体类的默认实现。
    实现最通用的一部分，作为从契约到具体实现的过渡。

    【代码示例】

    // 抽象类：定义通用模板
    abstract class Animal {
        String name;

        // 默认实现（通用逻辑）
        public void eat() {
            System.out.println(name + "正在吃东西");
        }

        // 抽象方法：子类必须实现（具体细节）
        public abstract void shout();
    }

    // 具体子类：实现抽象方法
    class Dog extends Animal {
        public Dog(String name) {
            this.name = name;
        }

        @Override
        public void shout() {
            System.out.println(name + "：汪汪");
        }
    }

    class Cat extends Animal {
        public Cat(String name) {
            this.name = name;
        }

        @Override
        public void shout() {
            System.out.println(name + "：喵喵");
        }
    }

    【核心要点】

    - 抽象类不能直接 new，只能被继承；
    - 抽象类可以包含普通方法（默认实现）和抽象方法；
    - 抽象方法没有方法体，子类必须重写；
    - 抽象类作为“模板”，定义了通用的结构和行为。

    ============================================================

*/