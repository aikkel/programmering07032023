import java.util.Comparator;

public class PersonObjektComparator implements Comparator<Person>{
    public  int compare(Person p1, Person p2){
        return p1.getEnavn().compareTo(p2.getEnavn());
    }
}