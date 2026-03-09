import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        {
            List<Person> personLista = new ArrayList<>();
            personLista.add(new Person("Mostafa", 2006 ));
            personLista.add(new Person("Haroon", 2004));
            personLista.add(new Person("Adam", 2030));

            Collections.sort(personLista);


            for (Person p : personLista) {
                if (p.getNamn().equals("Mostafa")) {
                    p.setNamn("Bobby Ewing");
                    break;
                }

            }

            Iterator<Person> it = personLista.iterator();
            while (it.hasNext()) {
                Person p = it.next();

                // if (p.getNamn().equals("Haroon")) {

                //     it.remove();
                // }
            }
            // for (Person p: personLista){
            // if (p.getNamn().equals("Haroon"))
            // {
            // personLista.remove(p);
            // }
            // }

            System.out.println("Lista efter ändring: " + personLista);
            

        }
    }
}
