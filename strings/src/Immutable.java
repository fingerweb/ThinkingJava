/**
 * @author yuyz
 * @date 2018-12-14 7:29
 */
public class Immutable {
    private static String upcase(String s) {
        return s.toUpperCase();
    }

    public static void main(String[] args) {
        /**
         * String对象是不变的，String类中每一个看起来会修改String值的方法
         * 实际上都是创建一个全新的String对象，以包含修改后的字符串内容。
         */
        String str1 = "yuyz";
        String str2 = str1;
        String str3 = Immutable.upcase(str1);
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
