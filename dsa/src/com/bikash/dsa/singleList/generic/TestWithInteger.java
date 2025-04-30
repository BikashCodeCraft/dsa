package com.bikash.dsa.singleList.generic;

import com.bikash.dsa.Employee;

public class TestWithInteger {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
//        list.add(2);
//        list.add(5);
        list.insertSorted(10);
        list.insertSorted(3);
        list.insertSorted(2);
        list.insertSorted(20);
        list.insertSorted(28);
        list.insertSorted(1);
        list.insertSorted(15);
        list.insertSorted(50);
        list.insertSorted(49);
        list.remove(2);
//        list.add(50);
//        list.add(49);
        list.removeFromFront();
        list.remove(10);
//        System.out.println("Size : "+list.size());
        list.print();
        System.out.println();
        System.out.println("Size : "+list.size());

        CustomList<Double> listDouble = new CustomList<>();
        listDouble.insertSorted(7.5);
        listDouble.insertSorted(4.2);
        listDouble.insertSorted(3.8);
        listDouble.insertSorted(6.1);
        listDouble.insertSorted(4.1);
        listDouble.print();
        System.out.println("Size : "+listDouble.size());

        CustomList<Employee> listEmp = new CustomList<>();
        listEmp.insertSorted(new Employee(10,"Jhon"));
        listEmp.insertSorted(new Employee(5,"Megha"));
        listEmp.insertSorted(new Employee(50,"Jill"));
        listEmp.insertSorted(new Employee(3,"Max"));
        listEmp.insertSorted(new Employee(7,"Bill"));
        listEmp.print();
        System.out.println("Size of Emp List : "+listEmp.size());


    }
}
