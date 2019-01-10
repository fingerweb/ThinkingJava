package NullObject;

import java.util.ArrayList;

/**
 * @author yuyz
 * @date 2019-01-05 22:19
 */
public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));
    }
    public void add(String... titles) {
        for(String title : titles)
            add(new Position(title));
    }
    public Staff(String... titles){
        add(titles);
    }
    public boolean positionAvailable(String title) {
        for(Position position : this)
            if (position.getTitle().equals(title) && position.getPerson() == Person.NULL)
                return true;
        return false;
    }
    public void fillPosition(String title, Person hire) {
        for(Position position : this)
            if(position.getTitle().equals(title) && position.getPerson() == Person.NULL) {
                position.setPerson(hire);
                return;
            }
        throw new RuntimeException(
                "Position " + title + " not available");
    }
    public Person getPerson(String title) {
        for(Position position : this)
            if (position.getTitle().equals(title))
                return position.getPerson();
        return Person.NULL;
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO",
                "Marketing Managerr", "Product Manager", "Product Manager",
                "Project Lead", "SoftWare Engineer", "SoftWare Engineer",
                "SoftWare Engineer", "SoftWare Engineer", "Test Engineer", "Technial Writer");
        staff.fillPosition("President",
                new Person("Me", "Last", "The Top. Lonely At"));
        staff.fillPosition("Project Lead",
                new Person("Janet", "Planer", "The Burbs."));
        if(staff.positionAvailable("SoftWare Engineer"))
            staff.fillPosition("SoftWare Engineer",
                    new Person("Bob", "Coder", "Bright Light City."));
        Person person = staff.getPerson("CTO");
        if(person.isNull())
            System.out.println("no CTO ");
        else
            System.out.println("CTO : " + person);

    }
}