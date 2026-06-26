package l13.practice;

import javax.xml.namespace.QName;

public class Snake extends Animal{
    public Snake(){
        this.name="Snake";
    }
    protected void bark(){
        System.out.println(name+"嘶嘶");
    }
}
