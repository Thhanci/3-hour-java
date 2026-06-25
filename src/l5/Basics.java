public class Basics {
    int i = 3;
    long l = 4L;
    float f = 3.2F;
    double d = 4.3;
    char c = 'x';
    String s = "hello";
    boolean b = true;

    public static void main(String[] args) {
        int arrayA[] = {12, 3};
        int[] arrayB = {2, 3, 4};
        int[] arrayC = {3, 4, 5};
        int arrayD[] = new int[100];
        int arrayE[];
        arrayE = new int[10];
        arrayE[0] = 3;
        System.out.println(arrayE[0]);

        int i = 0;
        if (i == 0) {
            System.out.println(i);
        } else if (i == 1) {
            System.out.println(i - 1);
        } else {
            System.out.println("i is neither 0 nor 1");
        }

        int sum = 0;
        for (int j = 0; j <= 100; j++) {
            sum += j;
            if (j == 0) continue;
            break;
        }

        while (i <= 100) {
            sum += i;
            i++;
        }
    }



}

