/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_2;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Omar Fayed
 */
public class CustomSet {
    //private int[] data;
    private int size;
    //Declaring an object of set class of type integers
    private Set<Integer> data = new HashSet<Integer>();
    
    //Size setter
    public void setSize(int num) {
        size = num;
    }
    
    //Set getter
    public Set<Integer> getData(){
        return data;
    }
    
    //Set setter
    public void setData(Set set_input){
        data.addAll(set_input);
    }
    
    //Displaying elemnts of a set (Getter)
    public void display(){
        for (int i: data) 
            System.out.print(i);
    }
    
    //Indicates if a number is a member of the set
    public boolean contains(int num) {
        return data.contains(num);
    }
    
    //Combines the two sets in a sorted manner
    static CustomSet union(CustomSet set1, CustomSet set2) {
        Set<Integer> unions = new HashSet<Integer>(set1.data);
        unions.addAll(set2.data);
        CustomSet unionSet = new CustomSet();
        unionSet.setData(unions);
        return unionSet;
        }
}
