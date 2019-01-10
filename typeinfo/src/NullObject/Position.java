package NullObject;

/**
 * @author yuyz
 * @date 2019-01-05 22:13
 */
public class Position {
    private String title;
    private Person person;
    public Position(String jobTitle, Person employee) {
        this.title = jobTitle;
        this.person = employee;
        if(person == null)
            this.person = Person.NULL;
    }
    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person newPerson) {
        person = newPerson;
        if(person == null)
            person = Person.NULL;
    }
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
