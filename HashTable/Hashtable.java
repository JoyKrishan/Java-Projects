package com.JoyKrishanDas.HashTable;

import com.JoyKrishanDas.Student;

public class Hashtable {
    private StdList[] arr;
    private int size;
    private int totalStudents;

    public Hashtable() {
        size = 100;
        arr = new StdList[size];
    }

    public int hashcode(String rollNo) {
        int aschiiSum = 0;
        for (int i = 0; i < rollNo.length(); i++) {
            aschiiSum = aschiiSum + (int) rollNo.charAt(i);
        }
        return aschiiSum % arr.length;
    }

    public void insert(Student data) {
        int key = hashcode(data.getRollNo());
        if (arr[key] == null) {
            arr[key] = new StdList();
        }
        arr[key].insert(data);
        totalStudents++;
    }

    public Student fetchStudentInfo(String rollNo) {
        int key = hashcode(rollNo);
        Student exist = null;
        if (arr[key] != null) {
            exist = arr[key].fetchData(rollNo);
        }
        return exist;
    }

    public void deleteStudent(String rollNo) {
        int key = hashcode(rollNo);
        if (arr[key]!= null){
            arr[key].deleteStudent(rollNo);
            totalStudents --;
        }
    }

    public int showTotal(){
        return totalStudents;
    }

    public void showData (){
        for (int i =0; i< arr.length; i++){
            if (arr[i] != null){
                String collision = arr[i].showAll();
                System.out.println(collision);
            }
        }
    }


}
