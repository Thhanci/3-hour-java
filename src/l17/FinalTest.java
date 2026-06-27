package l17;

public class FinalTest {
     final static int i=3;
     final static MyObject object=new MyObject();

    public static  void main(String[] args){
        //new FinalTest().i=2;
        //object=new MyObject();
        object.id=3;
        object.id=4;
    }

}


/*

    ============================================================
    final 关键字
    ============================================================

    【用法】

    final 可以修饰变量、方法、类。

    - final 变量：基本类型不能修改值，对象类型不能修改指针；
    - final 方法：不能被子类重写；
    - final 类：不能被继承。

    ============================================================

*/