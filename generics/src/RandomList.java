import java.util.ArrayList;
import java.util.Random;

/**
 * @author yuyz
 * @date 2019-01-10 16:04
 */
public class RandomList<T> {
    private ArrayList<T> arrayList;
    Random random;
    public RandomList(){
        arrayList = new ArrayList<T>();
        random = new Random(47);
    }
    public void add(T t) {
        arrayList.add(t);
    }
    public T select() {
        return arrayList.get(random.nextInt(arrayList.size()));
    }

    public static void main(String[] args) {
        RandomList<String> randomList = new RandomList<String>();
        for(String str : ("The quick brown fox jumped over").split(" "))
            randomList.add(str);
        for(int i = 0; i < 11; i++)
            System.out.print(randomList.select() + " ");
    }
}
