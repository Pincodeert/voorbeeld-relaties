import java.util.ArrayList;
import java.util.List;

public class AppartmentExample {
    public static void main(String[] args) {
        Person bea = new Person("Beatrix", "van Nassau");
        Person willie = new Person("Willem-Alexander", "van Nassau");
        Person max = new Person("Maxima", "van Nassau");
        Person amalia = new Person("Amalia", "van Nassau");

        Appartment soestdijk = new Appartment("Amsterdamsestraatweg", "1");
        soestdijk.addPerson(bea);
        soestdijk.addPerson(willie);
        soestdijk.addPerson(max);
        soestdijk.addPerson(amalia);

        soestdijk.showInformation();
        System.out.println(soestdijk.toString());


        Person studentOne = new Person("Jacques", "Patat");
        Person studentTwo = new Person("Nel", "Frikandel");
        Person studentThree = new Person("Ed", "Kroket");
        Person studentFour = new Person("Piet", "Friet");

        List<Person> personList = new ArrayList<>();
        personList.add(studentOne);
        personList.add(studentTwo);
        personList.add(studentThree);
        personList.add(studentFour);

        Appartment krot = new Appartment("Groot Hertoginnelaan", "30", personList);
        krot.showInformation();
        System.out.println(krot.toString());

    }


}
