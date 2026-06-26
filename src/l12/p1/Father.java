package p1;

public class Father {
    public String pub;
    protected String pro;
    String def;
    private String pri;
}


/*

    ============================================================
    Java 访问修饰符（Access Modifiers）
    ============================================================

    【四种访问权限对比】

    修饰符       同一类      同一包      子类（不同包）    任意位置
    ────────────────────────────────────────────────────────────────
    public       ✅          ✅          ✅               ✅
    protected    ✅          ✅          ✅               ❌
    default      ✅          ✅          ❌               ❌
    （不写）
    private      ✅          ❌          ❌               ❌

    【说明】

    - default 表示不写任何修饰符，也叫“包级私有”（Package-Private）；
    - default 只能在同一个包内访问；
    - private 只能在同一个类内访问；
    - protected 可以在同一个包内访问，也可以在不同包的子类中访问；
    - public 可以在任何位置访问。

    ============================================================

    因为 IDEA 的代码编辑器支持显示 Unicode 字符，你在注释或字符串里写了 ✅，IDE 就会把它渲染出来。

*/