
public class Arrays {
	public static void main (String[] text) {
		 char yesKey[]; // Deklaration ohne feste Länge
		 yesKey = new char[2]; // Erzeugung
		 yesKey[0] = 'J';   // Zuweisung
		 yesKey[1] = 'A';   // Zuweisung
	char cancelKey[]; // Deklaration ohne feste Länge
    cancelKey = new char [9] ; // erzeugung
    cancelKey[0] ='A' ; // Zuweisung 
    cancelKey[1] ='B' ; // Zuweisung
    cancelKey[2] ='B' ; // Zuweisung 
    cancelKey[3] ='R' ; // Zuweisung 
    cancelKey[4] ='E' ; // Zuweisung 
    cancelKey[5] ='C' ; // Zuweisung 
    cancelKey[6] ='H' ; // Zuweisung 
    cancelKey[7] ='E' ; // Zuweisung 
    cancelKey[8] ='N' ; // Zuweisung 
    char helpKey = '?'; 
    System.out.println("Wollen Sie eine Frage stellen?") ;
    System.out.println("<Ja>  ["+ yesKey[0] + yesKey[1] +"]") ;
    System.out.println("<Abbrechen> [" + cancelKey[0] +  cancelKey[1] +
    cancelKey[2] + cancelKey[3] + cancelKey[4] + cancelKey[5] + 
    cancelKey[6] + cancelKey[7] + cancelKey[8] + "]") ; 
    System.out.println("<Hilfe> [" + helpKey + "]"  ) ; 
    		
    
	}
	
	
  }
