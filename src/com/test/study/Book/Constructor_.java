import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Constructor_ {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("houdunren.com");
        names.add("hdcms.com");
        names.add("yahoo.com");
        // (s) -> new Person(s);
        Stream<Person> stream = names.stream().map(Person::new);
//        List<Person> collect = stream.collect(Collectors.toList());
        Person[] people = stream.toArray(Person[]::new);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}

class Person {
    private String name = "";

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}