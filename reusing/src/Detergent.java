/**
 * @author yuyz
 * @date 2018-10-30 9:51
 */
class Cleanser{
    private String s = "Cleanser";
    public void append (String s) {
        this.s += s;
    }
    public void dilute(){
        append(" dilute()");
    }
    public void apply(){
        append(" apply()");
    }
    public void scrub(){
        append(" scrub()");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
    }
}
public class Detergent extends Cleanser{
    @Override
    public void scrub(){
        append(" Detergent.scrub()");
    }

    public static void main(String[] args) {
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        System.out.println(d);
        System.out.println("-----------------------");
        Cleanser.main(args);
    }
}
