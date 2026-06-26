package l15.l2;

public class Classroom {

    public void classBegin(Teacher teacher){
//        if (ChineseTeacher.class.equals(teacher.getClass())){//判断类class是否相等
//            System.out.println("上语文课");
//        }
//        else if (MathTeacher.class.equals(teacher.getClass())){
//            System.out.println("上数学课");
//        }
       teacher.giveLecture();

    }

    public static void main(String[] args){
        new Classroom().classBegin(new ChineseTeacher());
    }


}

/*

    public void classBegin(String teacherType) {
        if ("语文老师".equals(teacherType)) {
            System.out.println("上语文课");
        } else if ("数学老师".equals(teacherType)) {
            System.out.println("上数学课");
        }
    }

    public static void main(String[] args) {
        new Classroom().classBegin("语文老师");
    }

*/