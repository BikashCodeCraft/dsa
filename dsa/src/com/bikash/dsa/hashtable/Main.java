package com.bikash.dsa.hashtable;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marrySmith = new Employee("Marry","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
        Employee billEnd = new Employee("Bill","End",78);

        SimpleHashTable ht = new SimpleHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marrySmith);

        ht.printHashTable();

        System.out.println("Retrieve key Wilson : "+ ht.get("Wilson"));
        System.out.println("Retrieve key Smith : "+ ht.get("Smith"));

        ht.remove("Wilson");
        ht.remove("Jones");
        System.out.println("====================");
        ht.printHashTable();
        System.out.println("Retrieve key Smith : "+ ht.get("Smith"));
    }
}
