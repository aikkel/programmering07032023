import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // StoryDupeTrimmer opg1 = new StoryDupeTrimmer();
        // opg1.StoryDupeTrimmer();
/*
        String str1 = "Hi!";
        String str2 = "ABC";

        System.out.println(str1 + " " + str1.hashCode());
        System.out.println(str2 + " " + str2.hashCode());

        int pladsnr=str1.hashCode()%5;
        System.out.println(pladsnr);

        Person p1 = new Person(1,"Carl","Simmonsen",'c',7);
        Person p2 = new Person(2,"Marlet","Jensen",'c',4);
        Person p3 = new Person(3,"John","Johnson",'b',02);
        Person p4 = new Person(4,"Harry","Osborn",'a',10);
        Person p5 = new Person(5, "Sofia", "Mostgaard", 'a',2);

        Set<Person> personsSet = new TreeSet<>(new PersonObjektComparator());
        personsSet.add(p1);
        personsSet.add(p2);
        personsSet.add(p3);
        personsSet.add(p4);
        personsSet.add(p5);
        System.out.println(personsSet.toString());

        //PersonObjektComparator poc = new PersonObjektComparator();

        if (personsSet.contains(p1)) {
            System.out.println("p1 is in the set");
        }

        if (personsSet.remove(p3)){
            System.out.println("p3 is no longer in the set");
        }
        Map<String, Double> personer = new HashMap<>();
        personer.put("Mikkel", 10.5);
        personer.put("Sofia", 2.4);

        System.out.println(personer.keySet());
        System.out.println(personer.values());
        System.out.println(personer);
        personer.clear();
        System.out.println(personer);

        Map<String, Double> linkedPersoner = new LinkedHashMap<>();
        linkedPersoner.put("Mikkel", 10.0);
        linkedPersoner.put("Sofia", 12.0);

        System.out.println(linkedPersoner.keySet());
        System.out.println(linkedPersoner.values());
        linkedPersoner.remove("Mikkel");
        System.out.println(linkedPersoner);

        Map<String, Double> treePersoner = new TreeMap<>();
        treePersoner.put("Mikkel", 02.0);
        treePersoner.put("Sofia", -10.9);
        System.out.println(treePersoner.keySet());
        System.out.println(treePersoner.values());
        treePersoner.remove("Sofia");
        System.out.println(treePersoner);
        */

        //HashMap finder antal af hvor mange gange tal forekommer
        Map<Integer, Integer> findNumbers = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv!");

        while (true){
            int n = input.nextInt();

            if (n == 0){
                break;
            }
            if (findNumbers.containsKey(n)){
                findNumbers.put(n, findNumbers.get(n).intValue()+1);
            }
            else {
                findNumbers.put(n, 1);
            }
        }

        //System.out.println(findNumbers);
        int maxValue = Collections.max(findNumbers.values());
        //System.out.println(maxValue);

        findNumbers.forEach((k, v) -> {if (v == maxValue) System.out.println(k + " " + v);});
    }
}

//(Count the occurrences of numbers entered) Write a program that reads an
//unspecified number of integers and finds the one that has the most occurrences.
//The input ends when the input is 0. For example, if you entered 2 3 40 3 5 4 –3
//3 3 2 0, the number 3 occurred most often. If not one but several numbers have
//the most occurrences, all of them should be reported. For example, since 9 and 3
//appear twice in the list 9 30 3 9 3 2 4, both occurrences should be reported.