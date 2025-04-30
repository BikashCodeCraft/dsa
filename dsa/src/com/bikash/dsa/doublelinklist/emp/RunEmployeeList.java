package com.bikash.dsa.doublelinklist.emp;

import com.bikash.dsa.Employee;

import java.util.Arrays;

public class RunEmployeeList {

    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();

        list.addToFront(new Employee(2,"Jack"));
        list.addToFront(new Employee(3,"Marry"));
        list.addToEnd(new Employee(1,"Jhon"));
        list.addToEnd(new Employee(10,"Bill"));

//        System.out.println("Size of List : "+list.getSize());
//        list.printList();
//
//        list.removeFromFront();
//        list.removeFromEnd();
//
//        System.out.println("============================");
//        System.out.println("Size of List : "+list.getSize());
//        list.printList();
//        System.out.println("#####################");
//        list.print();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
        list.sort();
        list.print();
//        Arrays.sort();
//        Employee[] empArr = new Employee[5];
//            empArr[0] = new Employee(10,"Bill");
//            empArr[1] = new Employee(2,"Jack");
//            empArr[2] = new Employee(3,"Marry");
//            empArr[3] = new Employee(1,"Jhon");
//            empArr[4] = new Employee(5,"Marry");
//
//            Arrays.sort(empArr);
//
//            for(Employee e : empArr){
//                System.out.println(e);
//            }

    }

}
