import util.Generator;

import java.util.*;

/**
 * @author yuyz
 * @date 2019-01-15 19:36
 */
class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer() {}
    public String toString() {
        return "Customer" + id;
    }
    //A method to produce Generator objects:
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}
class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller() {}
    public String toString() {
        return "Teller" + id;
    }
    //a single Generator object
    public static Generator<Teller> generator =
        new Generator<Teller>() {
            public Teller next() {
                return new Teller();
            }
        };

}
public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serve " + c);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator, 4);
        for(Customer c : line)
            serve(tellers.get(random.nextInt(tellers.size())), c);
    }
}
