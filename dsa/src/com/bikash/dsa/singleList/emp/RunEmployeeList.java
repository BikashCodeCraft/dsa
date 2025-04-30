package com.bikash.dsa.singleList.emp;

import com.bikash.dsa.Employee;

public class RunEmployeeList {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        System.out.println("Check : "+list.isEmpty());
//        list.removeFromEnd();
//        EmployeeList list2  = new EmployeeList();
//        list.addToFront(new Employee(1, "Jhon"));
//        list.addToFront(new Employee(2, "Jack"));
//        list.addToFront(new Employee(3, "Marry"));
//        list.addToFront(new Employee(4, "Jill"));
//        list.addToFront(new Employee(5, "Bill"));
//        list.removeFromFront();
        list.addToEnd(new Employee(1, "Jhon"));
        list.addToEnd(new Employee(2, "Jack"));
        list.addToEnd(new Employee(3, "Marry"));
        list.addToEnd(new Employee(4, "Jill"));
        list.addToEnd(new Employee(5, "Bill"));
        list.addToFront(new Employee(0, "Gates"));

        System.out.println("Size of the List : "+list.size());
        list.print();

        list.removeFromFront();
        System.out.println("===================================");
        list.print();
        list.removeFromEnd();
        System.out.println("=========== After removing from end ========================");
        list.print();
    }
}
