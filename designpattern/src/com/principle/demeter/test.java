package com.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployee(new CollageManager());
    }
}


class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollageEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class CollageManager{
    public List<CollageEmployee> getAllEmployee(){
        List<CollageEmployee> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            CollageEmployee emp = new CollageEmployee();
            emp.setId("collage_id="+i);
            list.add(emp);
        }
        return list;
    }
}

class SchoolManager{
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            Employee emp = new Employee();
            emp.setId("school_id="+i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollageManager sub){
        List<CollageEmployee> list1 = sub.getAllEmployee();
        for(CollageEmployee c :list1){
            System.out.println(c.getId());
        }

        List<Employee> list2 = this.getAllEmployee();
        for(Employee c :list2){
            System.out.println(c.getId());
        }
    }
}