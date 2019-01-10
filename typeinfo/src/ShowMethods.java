import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

/**
 * @author yuyz
 * @date 2019-01-01 13:50
 * Using reflection to show all the methods of a class
 * even if the methods are defined in the base class.
 */
public class ShowMethods {
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        try{
            Class<?> c = List.class;
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            Field[] fileds = c.getFields();
            Matcher matcher = p.matcher(methods[0].toString());
            System.out.println(matcher);
            while(matcher.find()){
                System.out.println(matcher.group() + ": " + matcher.start() + ":" + (matcher.end()-1));
            }
            System.out.println("分割线--------------------构造器");
            for(Constructor ctor : ctors) {
                System.out.println(p.matcher(ctor.toString()).replaceAll(""));
            }
            System.out.println("分割线--------------------字段");
            for(Field filed : fileds) {
                System.out.println(p.matcher(filed.toString()).replaceAll(""));
            }
            System.out.println("分割线--------------------方法");
            for(Method method : methods){
                System.out.println(p.matcher(method.toString()).replaceAll(""));
            }
        }catch(Exception e) {
            System.out.println("No such class: " + e);
        }
    }

}
