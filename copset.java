package CoreJava;

import java.util.HashSet;

public class copset {
	 
		 public static void main(String[] args) 
		{
			HashSet<String> h_set1 = new HashSet<String>();
	    // use add() method to add values in the hash set
	    h_set1.add("Ram");
	    h_set1.add("shyam");
	    h_set1.add("Bhura");
	    h_set1.add("kala");
	    System.out.println("Frist HashSet content: "+h_set1);
	    HashSet<String>h_set2 = new HashSet<String>();
	    h_set2.add("Ram");
	    h_set2.add("shyam");
	    h_set2.add("Bhura");
	    h_set2.add("gora");
	    System.out.println("Second HashSet content: "+h_set2);
	    h_set1.retainAll(h_set2);
	    System.out.println("HashSet content:");
	    System.out.println(h_set1);
	    }
	}

