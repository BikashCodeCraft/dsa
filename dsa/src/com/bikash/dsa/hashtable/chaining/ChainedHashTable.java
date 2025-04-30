package com.bikash.dsa.hashtable.chaining;


import java.util.*;

public class ChainedHashTable {

    private LinkedList<StoreEmployee>[] hashTable;

    public ChainedHashTable() {
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++) {
            hashTable[i] = new LinkedList<StoreEmployee>();
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        //My code
        return hashTable[hashedKey].stream()
                .filter(item -> item.employee.getLastname().equals(key))
                .findFirst()
                .get().employee;

        //Tutors Code

//        Iterator<StoreEmployee> itr = hashTable[hashedKey].iterator();
//        while (itr.hasNext()) {
//            StoreEmployee se = itr.next();
//            if (se.key.equals(key)) {
//                return se.employee;
//            }
//        }
//        return null;
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashTable[hashedKey].add(new StoreEmployee(key, employee));
    }

    private int hashKey(String key) {
//        return key.length() % hashTable.length;
        // We can also use String class hash code method
        return Math.abs(key.hashCode() % hashTable.length);
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);

        //My Code
        List<StoreEmployee> storeEmployees = new ArrayList<>();
        hashTable[hashedKey].forEach(storeEmployee -> {
                    if (storeEmployee.key.equals(key)){
                        storeEmployees.add(storeEmployee);
                        hashTable[hashedKey].remove(storeEmployee);
                    }
                });

        //Tutors Code

//        Iterator<StoreEmployee> itr = hashTable[hashedKey].iterator();
//        StoreEmployee storeEmployee = null;
//        int index = 0;
//        while (itr.hasNext()) {
//            storeEmployee = itr.next();
//            if (storeEmployee.key.equals(key)) {
//                break;
//            }
//            index++;
//        }
//        if (storeEmployee == null || !storeEmployee.key.equals(key)) {
//            return null;
//        } else {
//            hashTable[hashedKey].remove(index);
//            return storeEmployee.employee;
//        }
        return storeEmployees.get(0).employee;

    }

    public void printHashtable(){
        for(int i = 0; i<hashTable.length; i++){
            if(hashTable[i].isEmpty()){
                System.out.println("Position "+i+" : "+"Empty");
            }else{
                System.out.print("Position "+i+" : ");
                hashTable[i].forEach(storeEmployee -> System.out.print(storeEmployee.employee+"->"));
                System.out.println("null");
            }
//            System.out.println(hashTable[i]);
        }
    }
}
