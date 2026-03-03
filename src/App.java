import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
    {
    List<Person> personlista = new ArrayList<>();
personlista.add(new Person("Mostafa", 2007));
personlista.add(new Person("Haroon", 2007));
personlista.add(new Person("Adam", 2007));

for (Person p: personlista){
    if (p.getNamn().equals("Mostafa"))
    {
        p.setNamn("Bobby Ewing");
        break;
    }
    
}

for (Person p: personlista){
    if (p.getNamn().equals("Haroon"))
    {
        personlista.remove(p);
    }
}

System.out.println("Lista efter ändring: " + personlista);

}}}
