package tb.soft;

import java.util.*;

public class Operations {

    List<Person> linkedList;
    List<Person> arrayList;

    Set<Person> treeSet;
    Set<Person> hashSet;

    Map<Integer, Person> hashMap;
    Map<Integer, Person> treeMap;

    public Operations() {
        this.linkedList = new LinkedList<>();//wskaźnik na kolejne elementy
        this.arrayList = new ArrayList<>();//blok w pamięci
        this.treeSet = new TreeSet<>(Comparator.comparing(Person::hashCode));//uzywa equals, sortuje, nie wyswietla dodatkowych tych samych elementow
        this.hashSet = new HashSet<>();//uzywa compare, nie sortuje
        this.hashMap = new HashMap<>();
        this.treeMap = new TreeMap<>();

    }

    public void addPersonToCollections(Person person, Integer index) {
        this.linkedList.add(person);
        this.arrayList.add(person);
        this.treeSet.add(person);
        this.hashSet.add(person);
        this.hashMap.put(index, person);
        this.treeMap.put(index, person);

    }

    public void displayPeople() {
        Integer index = 1;
        for (Person person : linkedList) {
            System.out.println("Wyświetlenie dla linkedlisty: ");
            System.out.println(index + ". " + person);
            index++;
        }
        index =1;
        for (Person person : arrayList) {
            System.out.println("Wyświetlenie dla arraylisty: ");
            System.out.println(index + ". " + person);
            index++;
        }
        index = 1;
        for (Person person : treeSet) {
            System.out.println("Wyświetlenie dla treesetu: ");
            System.out.println(index + ". " + person);
            index++;
        }
        index = 1;
        for (Person person : hashSet) {
            System.out.println("Wyświetlenie dla hashsetu: ");
            System.out.println(index + ". " + person);
            index++;
        }
        //hashMap.forEach((key, person) -> System.out.println("Wyświetlenie dla hashmapy: \n" index + ". " + person));
        //treeMap.forEach((key, person) -> System.out.println("Wyświetlenie dla treemapy: \n" index + ". " + person));
        System.out.println("Wyświetlenie dla hashmapy: " + hashMap);
        System.out.println("Wyświetlenie dla treemapy: " + treeMap);


    }
    public void removeFromCollection(Integer index){
        linkedList.remove(index-1);
        arrayList.remove(index-1);
        //treeSet.remove();
        //hashSet.remove();
        treeMap.remove(index);
        hashMap.remove(index);
    }
    public void removeFromSet(Person person){
        treeSet.remove(person);
        hashSet.remove(person);
    }
}
