package toys;

/**
 * @author yuyz
 * @date 2019-01-01 12:48
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftyClass = FancyToy.class;
        FancyToy fancyToy = ftyClass.newInstance();
        Class<? super FancyToy> up = ftyClass.getSuperclass();
        //class<Toy> up2 = ftyClass.getSuperclass();
        Object obj = up.newInstance();
    }
}
