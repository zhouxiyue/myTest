package com.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class test2 {
    public static void main(String[] args) {
        SchoolManager2 schoolManager2 = new SchoolManager2();
        schoolManager2.printAllEmployee(new CollageManager2());
    }
}


class Employee2{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollageEmployee2{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollageManager2{
    public List<CollageEmployee2> getAllEmployee(){
        List<CollageEmployee2> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            CollageEmployee2 emp = new CollageEmployee2();
            emp.setId("collage_id="+i);
            list.add(emp);
        }
        return list;
    }

    void printEmployee(){
        List<CollageEmployee2> list1 = this.getAllEmployee();
        for(CollageEmployee2 c :list1){
            System.out.println(c.getId());
        }
    }
}

class SchoolManager2{
    public List<Employee2> getAllEmployee(){
        List<Employee2> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            Employee2 emp = new Employee2();
            emp.setId("school_id="+i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollageManager2 sub){
        sub.printEmployee();
        List<Employee2> list2 = this.getAllEmployee();
        for(Employee2 c :list2){
            System.out.println(c.getId());
        }
    }
}