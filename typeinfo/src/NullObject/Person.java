package NullObject;

/**
 * @author yuyz
 * @date 2019-01-05 10:50
 */
public class Person implements Null{
    public final String first;
    public final String last;
    public final String address;
    public Person(String first, String last, String address) {
        this.first = first;
        this.last = last;
        this.address = address;
    }
    public String toString() {
        return "Person: " + first + " " + last + " " + address;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    public static class NullPerson extends Person{
        private NullPerson() {
            super("None", "None", "None");
        }
        public String toString() {
            return "NullPerson";
        }
        @Override
        public boolean isNull() {
            return true;
        }
    }
    public static final Person NULL = new NullPerson();
}