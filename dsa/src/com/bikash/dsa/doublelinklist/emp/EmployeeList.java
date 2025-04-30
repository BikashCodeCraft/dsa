package com.bikash.dsa.doublelinklist.emp;

import com.bikash.dsa.Employee;

import java.util.Arrays;

public class EmployeeList {

    EmployeeNode head;
    EmployeeNode tail;
    int size;

    public void addToFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        if(isEmpty()){
            tail=employeeNode;
        }else {
            employeeNode.setNext(head);
            head.setPrevious(employeeNode);
        }
        head = employeeNode;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        if(isEmpty()){
            head=employeeNode;
        }else {
            employeeNode.setPrevious(tail);
            tail.setNext(employeeNode);
        }
            tail=employeeNode;
            size++;
    }

    public void removeFromFront(){
        if(isEmpty()){
            System.out.println("[]");
            return;
        }else if (size == 1) {
           removeOnlyElement();
        }else{
            head.getNext().setPrevious(null);
            head=head.getNext();
        }
        size--;
    }

    public void removeFromEnd(){
        if(isEmpty()) {
            System.out.println("[]");
            return;
        }else if(size==1){
            removeOnlyElement();
        }else{
            tail.getPrevious().setNext(null);
            tail = tail.getPrevious();
        }
        size--;
    }

    private void removeOnlyElement(){
        head=null;
        tail=null;
    }

    public void print(){
        EmployeeNode current = head;
        if(current==null){
            System.out.println("[]");
            return;
        }
        while(current != null){
            System.out.println(current.getEmployee());
            current=current.getNext();
        }
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD->");
        while(current != null){
            System.out.print(current);
            System.out.print("<===>");
            current=current.getNext();
        }
        System.out.println("null");
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null && tail==null;
    }

    public void sort(){
        Employee[] arr = toArray();
        Arrays.sort(arr);
        EmployeeNode tempNode = head;
        for(int i=0; i<arr.length && tempNode != null; i++){
            tempNode.setEmployee(arr[i]);
            tempNode = tempNode.getNext();
        }
    }

    public Employee[] toArray(){
        Employee[] empArr = new Employee[size];
        EmployeeNode tempNode = head;
        for (int i=0; i<empArr.length && tempNode !=null; i++){
            empArr[i] = tempNode.getEmployee();
            tempNode= tempNode.getNext();
        }
        return empArr;
    }
}
