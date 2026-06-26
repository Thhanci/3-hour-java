package l15.l2;

public class ChineseTeacher extends Teacher{

    private String name;

    @Override
    protected void giveLecture(){
        System.out.println("上语文课,语文老师叫:"+name);
    }

    public String getName(){
        return name;
    }

}
