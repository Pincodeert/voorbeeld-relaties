import java.util.ArrayList;
import java.util.List;

public class Appartment {

    private String streetName;
    private String houseNumber;
    private List<Person> persons;

    //Constructor 1
    public Appartment(String streetName, String houseNumber, List<Person> persons){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.persons = persons;
    }

    //constructor 2
    public Appartment(String streetName, String houseNumber){
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        persons = new ArrayList<>();
    }

    public String getStreetName(){
        return streetName;
    }

    public String getHouseNumber(){
        return houseNumber;
    }

    public List<Person> getPersons(){
        return persons;
    }

    public void setPersons(List<Person> persons){
        this.persons = persons;
    }


    public void addPerson(Person person){
        persons.add(person);
    }

    public void showInformation(){
        System.out.println("Er wonen " + persons.size() + " mensen in het appartement op " + streetName);
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Op ").append(streetName).append(" ").append(houseNumber).append(" wonen ").
                append(persons.size()).append(" mensen:");

        for(Person inhabitant: persons){
            stringBuilder.append("\n\r").append(inhabitant.toString()).append(".");
        }
        stringBuilder.append("\n\r");
        return stringBuilder.toString();
    }

}
