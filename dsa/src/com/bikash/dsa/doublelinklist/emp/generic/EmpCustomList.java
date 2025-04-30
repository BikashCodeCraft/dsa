package com.bikash.dsa.doublelinklist.emp.generic;


import com.bikash.dsa.Employee;
import com.bikash.dsa.doublelinklist.emp.generic.inf.CustomLinkedList;
import com.bikash.dsa.singleList.generic.CustomList;

import java.util.Collections;
import java.util.LinkedList;

public class EmpCustomList {

    public static void main(String[] args) {
        CustomLinkedList<Employee> employeeLinkedList = new CustomLinkedList<>();
        employeeLinkedList.addFirst(new Employee(1, "Jhon"));
        employeeLinkedList.addFirst(new Employee(2, "Vikram"));
        employeeLinkedList.addFirst(new Employee(3, "Jack"));

        employeeLinkedList.add(new Employee(4, "Mahesh"));
        employeeLinkedList.add(new Employee(5, "Marry"));

//        System.out.println("Total Size : "+employeeLinkedList.size());
//        employeeLinkedList.printInLine();
//
//
//        employeeLinkedList.remove(3);
//        System.out.println("Size after removal at index 3 : "+employeeLinkedList.size());
//        employeeLinkedList.printInLine();
//
//        employeeLinkedList.addBefore(new Employee(10, "Bikash"), new Employee(3, "Jack"));
//        System.out.println("Size after addBefore : "+employeeLinkedList.size());
//        employeeLinkedList.printInLine();
//
//        employeeLinkedList.removeFirst();
//        System.out.println("Size after remove first : "+employeeLinkedList.size());
//        employeeLinkedList.printInLine();
//
//        employeeLinkedList.remove();
//        System.out.println("Size after remove call : "+employeeLinkedList.size());
//        employeeLinkedList.printInLine();

        System.out.println("!!!!!!!!!!!!!!!!!!!");
        employeeLinkedList.sort();
        employeeLinkedList.printInLine();

        CustomLinkedList<Integer> intList = new CustomLinkedList<>();
        intList.add(19);
        intList.add(5);
        intList.add(6);
        intList.add(7);
        intList.add(2);
        intList.add(0);
        intList.add(1);
        System.out.println("************************");
        intList.sort();
        intList.printInLine();

        CustomLinkedList<String> strList = new CustomLinkedList<>();
        strList.add("Zebra");
        strList.add("Yak");
        strList.add("Apple");
        strList.add("Lion");
        strList.add("Tiger");
        strList.add("Mango");
        strList.add("Ball");

        strList.sort();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        strList.printInLine();
    }
}

