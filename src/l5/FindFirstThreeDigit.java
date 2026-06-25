/*
 * 导包：告诉编译器要去哪里找 Scanner 这个类
 * java.util 是工具包，Scanner 是里面用来读取用户输入的类
 * 相当于“我要用个扫描器，它在工具包里头”
 */
import java.util.Scanner;  //util    Utility    工具/实用程序

/*
 * 类的声明：public 表示这个类是公开的
 * class 是“类”的关键字，FindFirstThreeDigit 是类名
 * 类名要和文件名完全一致（大小写也得一样）
 */
public class FindFirstThreeDigit {

    /*
     * main 方法是程序的入口，是 Java 程序的“起点”
     * public static void main(String[] args)
     * 这个格式是固定的，照着写就行，不能改
     */
    public static void main(String[] args) {

        /*
         * Scanner scanner = new Scanner(System.in);
         * 这行分成三段来看：
         * 1. Scanner   —— 类型，表示这是一个“扫描器”对象
         * 2. scanner   —— 变量名，给扫描器起的名字，叫啥都行
         * 3. new Scanner(System.in) —— 创建新的扫描器，绑定了键盘输入
         * System.in 就是“标准输入”，也就是键盘
         */
        Scanner scanner = new Scanner(System.in);

        // System.out.println 是打印一行文字到控制台
        // System.out 是“标准输出”，.println 是打印并换行
        System.out.println("请输入数字（用空格、回车或逗号分隔）：");

        /*
         * scanner.nextLine() 是读取一整行用户输入的内容
         * 用户按回车键之前输入的所有内容，都会被读进来
         * 返回值是一个 String（字符串）类型
         * 例如用户输入 "98，101，104"，line 就是 "98，101，104"
         */
        String line = scanner.nextLine();

        /*
         * line.split("[^\\d]+")
         * split 是 String 类自带的方法，按指定的规则把字符串切成多段
         * 例如 "98，101，104" 按非数字切，会得到 ["98", "101", "104"]
         *
         * "[^\\d]+" 是“正则表达式”，用来匹配“非数字字符”
         * \\d 表示数字，^\\d 表示“非数字”，+ 表示“至少一个”
         * 所以它会把所有非数字字符当成“切刀”来切分
         */
        String[] parts = line.split("[^\\d]+");

        // result 用来存找到的第一个三位数
        // -1 是一个“哨兵值”，表示“还没找到”
        int result = -1;

        /*
         * for (String part : parts) 是“增强型 for 循环”
         * 意思是：从 parts 数组里一个一个取出元素，每次取出的叫 part
         * 相当于：for (int i = 0; i < parts.length; i++) { String part = parts[i]; ... }
         * 但写法更简洁
         */
        for (String part : parts) {

            /*
             * part.isEmpty() 判断这个字符串是不是空的
             * 因为切分时可能出现空串，比如开头是空格时
             * 如果为空，跳过本次循环，看下一个
             */
            if (part.isEmpty()) {
                // continue 是“跳过本次，继续下一次循环”
                continue;
            }

            /*
             * Integer.parseInt(part)
             * Integer 是 int 的“包装类”，把字符串转成 int 数字
             * parseInt 是“解析整数”，part 必须是纯数字字符串
             * 例如 "101" 转成 101，如果 "abc" 转就会报错
             */
            int num = Integer.parseInt(part);

            // 判断这个数字是不是三位数（100 到 999 之间）
            if (num >= 100 && num <= 999) {
                // 是三位数就存到 result 里
                result = num;
                // break 是“跳出整个循环”，不再继续往后找了
                break;
            }
        }

        /*
         * if (result != -1) 判断是否找到了三位数
         * result 还是 -1 说明没找到，否则就是找到了
         */
        if (result != -1) {
            System.out.println("找到的第一个三位数是：" + result);
        } else {
            System.out.println("未找到三位数");
        }

        /*
         * scanner.close() 是关闭扫描器，释放资源
         * 用完要关掉，是个好习惯（但不关程序结束也会自动释放）
         */
        scanner.close();
    }
}

/*
System.out.println()	打印并换行（print line）
System.out.print()	只打印，不换行（print）
*/