public class Person {
    private String name;
    private String nachname;

    public Person (String name, String nachname) {
        this.name = name;
        this.nachname = nachname;
    }

    public String GetName() {
        return this.name;
    }

    public String GetNachname() {
        return this.nachname;
    }

    public void SetName(String n) {
        this.name = n;
    }

    public void SetNachname(String n) {
        this.nachname = n;
    }
}