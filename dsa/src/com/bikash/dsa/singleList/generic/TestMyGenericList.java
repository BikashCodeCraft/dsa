package com.bikash.dsa.singleList.generic;

import com.bikash.dsa.singleList.CustomListInterface;
import com.bikash.dsa.Employee;

public class TestMyGenericList {
    public static void main(String[] args) {
        CustomListInterface<Employee> employeeList = new CustomList<>();
        System.out.println("Check is Empty : "+employeeList.isEmpty());
        employeeList.add(new Employee(1,"John"));
        employeeList.add(new Employee(2,"Jack"));
        System.out.println(employeeList.size());
        employeeList.print();
        System.out.println("Check is Empty : "+employeeList.isEmpty());
        employeeList.addToFront(new Employee(0,"Jill"));
        System.out.println("Print List after addition at the front==========");
        employeeList.print();
        employeeList.removeFromFront();
        System.out.println("Size after removal : "+employeeList.size());
        System.out.println("Print List after removal");
        employeeList.print();
    }
}
