/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author idont
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Main {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<Integer>(List.of(1,2,4,6,8));
        //Scanner input = new Scanner(System.in);
        //Quicksort(arr, 0, arr.size()-1);
        System.out.print(arr);
        int ind= search(arr, 0, arr.size()-1, 6);
        System.out.print(ind);
    }
    static int search(ArrayList<Integer> arr, int l, int r, int a){
        while(l<=r){
        int m = (l + r)/2;
        
        if(arr.get(m)==a){
            return m;
        }
        if(arr.get(m)>a)
            r=m-1;
        
        else
            l=m+1;
        }
        return -1;
        
    }
    
    public static int Partition(ArrayList<Integer> arr, int low, int high){
        int i=low, j;    
        for(j=i;j<high;j++){
            if(arr.get(j) < arr.get(high)){
                swap(arr, (i), (j));
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }
    
    public static void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
    
    public static void Quicksort(ArrayList<Integer> arr, int low, int high){
        if(low<high){
            int p= Partition(arr, low, high);//pivot
            Quicksort(arr, low, p-1);//left side
            Quicksort(arr, p+1, high);//right side
            }
    }   
}



