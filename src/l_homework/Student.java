package l_homework;

public class Student {

    String id;
    String name;
    Integer age;

    public static void main(String[] args) {
        Student jack = new Student();
        Student peter = new Student();
        jack.id = "1234";
        peter.id = "2222";
        System.out.println(jack.id);
        System.out.println(peter.id);
    }

}
