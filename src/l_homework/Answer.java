package l_homework;

public class Answer {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            int tmp = Integer.parseInt(args[i]);
            if (tmp >= 100) {
                System.out.println(tmp);
                return;
            }
        }
    }
}
