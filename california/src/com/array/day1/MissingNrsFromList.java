package com.array.day1;

public class MissingNrsFromList {

		     String SIGN = "-";
		     String DEL= ",";
		     int MAX = 100;
		     int MIN = 0;

		    public static void main(String... arguments){
		        
		        int[] a = {0,5,7,10,11};
		        System.out.print("Input array: ");
		        for(int i : a){
		            System.out.print(i+ " ");
		        }
		        String m = new MissingNrsFromList().findMissing(a);
		       // m.findMissing(a);
		        System.out.println("Result: " +m);

		    }

		    public String findMissing(int[] a){
		        String missingNrStr = "";

		        for(int i = 0 ; i <= a.length; i++){
		            int previousElement =MIN;
		            if(i != 0){ previousElement = a[i-1];}

		            int currentElement = MAX;
		            if(i != a.length){ currentElement = a[i];}

		            if(previousElement == currentElement-2){
		                if(!missingNrStr.isEmpty()){missingNrStr += DEL;}
		                missingNrStr += currentElement-1;
		            }
		            else if(previousElement < currentElement-2){
		                if(!missingNrStr.isEmpty()){missingNrStr += DEL;}
		                missingNrStr += (previousElement+1) + SIGN + (currentElement-1);
		            }
		        }
		        return missingNrStr; 
		    }


}


