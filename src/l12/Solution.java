package l12;

import p1.Father;
import p2.Son;

public class Solution {

    int _a=1;//static int _a=1;//静态变量属于类，实例变量属于对象
    int _b=2;//static int _b=2;

    public int solve (int a,int b){
        //很多复杂的逻辑
        call1();
        call2();
        return 0;
    }

    private void call1(){
        System.out.println("call1()");
    }

    private void call2(){

    }

    public void main(String[] args){
        Solution solution = new Solution();
        int result = solution.solve(1, 2);

        solve(_a,_b);
    }

}


/*

    ============================================================
    访问控制修饰符
    ============================================================

    【意义】

    保护内部逻辑，只开放应该开放的。

    ============================================================

*/