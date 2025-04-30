package com.bikash.dsa.singleList.emp;

import com.bikash.dsa.Employee;

public class EmployeeList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);
        this.head=employeeNode;
        size++;
    }

    public void addToEnd(Employee employee){
        if(head==null){
            addToFront(employee);
            return;
        }else{
            EmployeeNode tempHead = head;
            while(head.getNext()!=null){
                head = head.getNext();
            }
            EmployeeNode newEmployeeNode = new EmployeeNode(employee);
            head.setNext(newEmployeeNode);
            head=tempHead;
            size++;

        }

    }

    public void print(){
        EmployeeList employeeList = new EmployeeList();
        employeeList.head = this.head;
        while (employeeList.head !=null){
            System.out.println(employeeList.head.getEmployee());
            employeeList.head = employeeList.head.getNext();
        }
    }

    public void removeFromFront(){
        try{
            EmployeeNode tempNode = head.getNext();
            head.setNext(null);
            head = tempNode;
        }catch (Exception e){
            System.out.println("List is empty, try adding objects to list first");
            throw new RuntimeException("Exception caught : "+e.getMessage());
        }
    }

    public void removeFromEnd(){
        try{
            EmployeeNode tempNode = head;
            while (head.getNext().getNext() !=null){
                head = head.getNext();
            }
            head.setNext(null);
            head=tempNode;

        }catch (Exception e){
            System.out.println("List is empty, try adding objects to list first");
            throw new RuntimeException("Exception caught : "+e.getMessage());
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }
}
