import util.BasicGenerator;
import util.Generator;

/**
 * @author yuyz
 * @date 2019-01-15 14:03
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen =
                BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
    }
}
