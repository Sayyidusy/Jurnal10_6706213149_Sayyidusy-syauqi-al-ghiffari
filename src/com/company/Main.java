package com.company;

public class Main {

    public static void main(String[] args) {
        //jurnal 10
	 int arr [] = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3 };
     Heapordered h = new Heapordered(arr);

     while  (h.getSize()>0){
         System.out.print(h.extractRoot()+", ");
       }
    }
}
