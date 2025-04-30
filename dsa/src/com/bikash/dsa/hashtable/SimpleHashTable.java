package com.bikash.dsa.hashtable;

public class SimpleHashTable {

    private StoreEmployee[] hashTable;

    public SimpleHashTable() {
        hashTable = new StoreEmployee[10];
    }

    public void put(String key, Employee value) {
        int hashedKey = hashCode(key);
//        int stopIndex = hashedKey;
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashTable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashTable.length;
            }
        }
//        int condt = hashTable.length;
//        for(int i = hashedKey; i< condt; i++){
//            if(occupied(i)){
//                if(i == condt-1){
//                    condt = stopIndex;
//                    i=0;
//                }
//            }else{
//                hashedKey=i;
//                break;
//            }
//        }

        if (occupied(hashedKey)) {
            System.out.println("Sorry, theres already an employee at position " + hashedKey);
        } else {
            hashTable[hashedKey] = new StoreEmployee(key, value);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        } else {
            return hashTable[hashedKey].employee;
        }

    }

    public Employee remove(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            System.out.println("No such key exist !!!!");
            return null;
        }
        Employee result = hashTable[hashedKey].employee;
        hashTable[hashedKey] = null;
         StoreEmployee[] oldHashTable = hashTable;
         hashTable = new StoreEmployee[oldHashTable.length];
         for(int i=0; i< oldHashTable.length; i++){
             if(oldHashTable[i] != null){
                 put(oldHashTable[i].key, oldHashTable[i].employee);
             }
         }
        return result;
    }

    private int hashCode(String key) {
        return key.length() % hashTable.length;
    }

    private int findKey(String key) {
        int hashedKey = hashCode(key);
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashTable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashTable[hashedKey] != null && !hashTable[hashedKey].key.equals(key) && hashedKey != stopIndex) {
            hashedKey = (hashedKey + 1) % hashTable.length;
        }
        if (hashTable[hashedKey] != null && hashTable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    private boolean occupied(int index) {
        return hashTable[index] != null;
    }

    public void printHashTable() {
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                System.out.println("Position : " + i + ": " + hashTable[i].employee);
            } else {
                System.out.println("Position : " + i + ": " + "null");
            }

        }
    }
}
