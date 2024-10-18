/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 20112
 */
public class CustomSet {
    private Set<Integer> data = new HashSet<Integer>();
    private int size;

    public CustomSet(Set<Integer> set) {
        this.data = set;
    }    
    
    public boolean contains(int num) {
        return this.data.contains(num);
    }

    public Set<Integer> getData() {
        return data;
    }

    public int getSize() {
        return size;
    }

    public void setData(Set<Integer> data) {
        this.data = data;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void display() {
        for (int i : this.data) System.out.print(i + " ");
        System.out.println(" ");
    }
    
    static CustomSet union(CustomSet set1, CustomSet set2){
        CustomSet newSet = new CustomSet(set1.data);
        newSet.data.addAll(set2.data);
        return newSet;
    }
    
}
