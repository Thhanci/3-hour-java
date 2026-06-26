package p2;

import l12.Solution;
import p1.Father;

public class Son extends Father{

    public static  void main(String[] args){
        String father_pub =new Father().pub;
        String Son_pub = new Son().pub;
        String str_pro = new Son().pro;
        Son son=new Son();
        Father father=new Father();

        new Solution().solve(1,2);


    }

}
