package com.bikash.dsa.hashtable.chaining;



public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane","Jones",123);
        Employee johnDoe = new Employee("John","Doe",4567);
        Employee marrySmith = new Employee("Marry","Smith",22);
        Employee mikeWilson = new Employee("Mike","Wilson",3245);
//        Employee billEnd = new Employee("Bill","End",78);

        ChainedHashTable ht = new ChainedHashTable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marrySmith);
//        ht.put("End", billEnd);

        ht.printHashtable();
        System.out.println("Retrieve key Smith : "+ht.get("Smith"));

//        System.out.println("Retrieve key Wilson : "+ ht.get("Wilson"));
//        System.out.println("Retrieve key Smith : "+ ht.get("Smith"));
//        System.out.println("Retrieve key End : "+ ht.get("End"));
//        System.out.println("Retrieve key Doe : "+ ht.get("Doe"));


        ht.remove("Doe");
        ht.remove("Jones");
        System.out.println("====================");
        ht.printHashtable();
//        System.out.println("Retrieve key Smith : "+ ht.get("Smith"));
    }
}
