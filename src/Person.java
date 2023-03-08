import java.util.HashSet;
import java.util.Set;

public class Person implements Comparable<Person> {

    private int nummer;
    private String fnavn;
    private String enavn;
    private char klasse;
    private int gennemsnot;

    public Person(int nummer, String fnavn, String enavn, char klasse,int gennemsnot) {
        this.nummer = nummer;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.klasse = klasse;
        this.gennemsnot = gennemsnot;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public char getKlasse() {
        return klasse;
    }

    public void setKlasse(char klasse) {
        this.klasse = klasse;
    }

    public int getGennemsnot() {
        return gennemsnot;
    }

    public void setGennemsnot(int gennemsnot) {
        this.gennemsnot = gennemsnot;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nummer=" + nummer +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", klasse=" + klasse +
                ", gennemsnot=" + gennemsnot +
                '}';
    }

    @Override public int compareTo(Person p){
        // return  this.fnavn.compareTo(p.getFnavn());
        if(this.klasse < (p.getKlasse()))
            return -1;
        else if(this.klasse==p.getKlasse())
            return 0;
        else
            return 1;
    }
}