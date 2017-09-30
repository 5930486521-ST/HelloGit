import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[]args) {
		//**Initialized
		int aa,ab,ac;
		int ad = 15;
		int ae = 13+(ac = 12);  //int ae = 13+(int af = 12) incorrect**
		
		//**type
		long ba=100l;
		
		char bb = 'A';
		int bc = bb +  'k';	    //char + char =int
		
		boolean bf = ad==15;
		
		//**conversion	 
		  //* cha <--> int <--> double
		char ca = (char) (bc-100);			int cb = 'b';
		int cc = (int) 5.55;			double cd = (double) 1;
		
		  //*toString
			//String = (int/double/bool/char/arrays/list value) + (str) 
		String cf =  cc+"";
		String cg = new int[] {12,3,4,6,7,9} + "";
		String ch = Arrays.asList(12,3,4,6,7,9) +"";  			// list can print normally
			//.....toString()  --->Type.toString(value)
		String ci = Arrays.toString(new int[] {12,3,4,6,7,9});
		  //*String to ... --> Type.parseType(Str value)
		int cj = Integer.parseInt("5");
		
		//** fix type    int / int = int
		
		//**String
		String a = "dvsd ";
		  //*prop
		String da = a.trim() ;
		int db = a.length();
		String dc = a.toLowerCase();
		String de = a.toUpperCase();
		  //*sub str
		String df = a.substring(2, 5);
		char dh = a.charAt(0) ;
		  //*index
		int di = a.indexOf("v",0);
		  //*bool
		boolean dj = a.contains("5");
		boolean dk = a.equals("str val");		
		boolean dl = a.compareTo("str val") == 0;
		  //*iterate
		for (char x : a.toCharArray()) System.out.println(x);
		  
		
		//**array
		 //*initialized
		int[] ea = new int[5];         
		int[][] eb = {{1,2},{2},{5}};				//int[] eb = new int[]{5,6,8,9} incorrect
		ea = new int[] {1,2,5};			// new int[] {1,2,5} === value
		 //*edit value of member  **not member num**
		ea[0] ++;
		  //* property/meth
		int ec = ea.length;
		String ed = Arrays.deepToString(eb);
		  //*iterate
		for (int x : ea) System.out.println(x);
		
		
		
		
		System.out.println(ed);
		
		
		
		
					  
							
		
		
		System.out.println(dl);
	
		Map<Character,Integer> alcount = new HashMap<>();
		String engal = "abcdefghakwljidslkdadkvnsldaedkiwenir";
		for (char v : engal.toCharArray()) {
			if(alcount.containsKey(v)) {
				alcount.put(v,alcount.get(v) +1);     
			}
			
			else {alcount.put(v,1);}                                                                                                                                                                                                                                                                                                                                                                                                                                             

}}}
