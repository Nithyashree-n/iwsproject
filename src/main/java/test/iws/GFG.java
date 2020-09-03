package test.iws;

  
import java.util.*; 
  
public class GFG { 
  
    public static void main(String args[]) 
    { 
        ArrayList<String> al = new ArrayList<>(); 
  
        al.add("Geeks"); 
        al.add("Geeks"); 
        al.add(1, "Geeks"); 
  
        System.out.println("Initial ArrayList " + al); 
  
        al.set(1, "For"); 
  
        System.out.println("Updated ArrayList " + al); 
    } 
} 