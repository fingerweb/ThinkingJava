package tuple;

/**
 * @author yuyz
 * @date 2019-01-10 14:30
 */
class Amphibian {}
class Vehicle{}
public class TupleTest {
    static TwoTuple<String, Integer> f(){
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<String, Integer, Amphibian> g(){
        return new ThreeTuple<String, Integer, Amphibian>("hi", 47, new Amphibian());
    }
    static FourTuple<String, Integer, Amphibian, Vehicle> h() {
        return new FourTuple<String, Integer, Amphibian, Vehicle>("hi", 47, new Amphibian(), new Vehicle());
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> twoTuple = new TwoTuple<String, Integer>("hello", 47);
        System.out.println("twoTuple.first = " + twoTuple.first);
        //Compile Error:final
        //twoTuple.first = "hi";
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
    }
}
