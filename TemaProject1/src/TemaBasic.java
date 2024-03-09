import java.util.Scanner;
public class TemaBasic {
    public static void problem1() {
    	Scanner scan = new Scanner(System.in);
        System.out.println("Introdu un număr: ");
        int nr = scan.nextInt();
        if(nr>5) {
        	System.out.println("Admis");
        }else
        	{System.out.println("Respins");}
        if(nr<1 ||  nr>10) {
        	System.out.println("Invalid");
        }
    }
    public static void problem2() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Introdu un numar:");
    	int nr=scan.nextInt();
    	switch(nr) {
    	case 1:
    		System.out.println("UNU");
    		break;
    	case 2:
    		System.out.println("DOi");
    		break;
    	case 3:
    		System.out.println("TREI");
    		break;
    	case 4:
    		System.out.println("PATRU");
    		break;
    	case 5:
    		System.out.println("Cinci");
    		break;
    	default:
    		System.out.println("INVALID");
    	}
    }
    public static void problem3() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Introdu doua numere");
    	int nr1=scan.nextInt();
    	int nr2=scan.nextInt();
   
    	if(nr1%2==0 && nr2%2==0)
    	{
    		int medie=(nr1+nr2)/2;
    		System.out.println("Media aritmetica:"+medie);
    	}
    	else {
    	    int produs=nr1*nr2;
    	    System.out.println("Produsul numerelor:"+produs);
    	}  
       if(nr1%2==0 && nr2%2==1)
       {
    	   int suma=nr1+nr2;
    	    System.out.println("Suma numerelor:"+suma);
       }
    }
    public static void problem4() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Introdu 3 numere:");
    	int nr1=scan.nextInt();
    	int nr2=scan.nextInt();
    	int nr3=scan.nextInt();
    	int min=1000;
    	if(nr1<min)
    		min=nr1;
    	if(nr2<min)
    		min=nr2;
    	if(nr3<min)
    		min=nr3;
    	System.out.println("Valoarea minima: "+min);
    }
    public static void problem5() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("n:");
    	int nr=scan.nextInt();
    	int suma=0;
    	for(int i=0;i<nr;i++)
    	{
    		if(nr%2==0)
    		   suma=suma+nr;
    	}
    	System.out.println("suma"+suma);
    }
    public static void problem6() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("n:");
    	int nr=scan.nextInt();
        int suma=0;
        int nrimpar=1;
        for(int i=0;i<nr;i++)
        {  suma=suma+nrimpar;
           nrimpar=nrimpar+2;
        	
        }
        System.out.println("suma"+suma);
    }
    public static void problem7() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("n:");
    	int nr=scan.nextInt();
    	int suma=0;
        for(int i=0;i<nr;i++)
        {
        	int x=scan.nextInt();
        	 suma=suma+x;
        }
        System.out.println("Media"+suma/nr);
    }
    public static void problem8() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("n:");
    	int nr=scan.nextInt();
    	int factorial=1;
    	 for (int i = 1; i <= nr; i++) {
             factorial *= i;
         }
    System.out.println("Factorial:"+factorial);
    }   
    public static void problem9() {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("n:");
    	int nr=scan.nextInt();
    	int c=0;
    	 if(nr<=1){
    		 System.out.println("NU");
    	 }else
    	      {
    		 for(int d=2;d*d<=nr;d++) {
    			 if(nr%d==0 && d!=nr) {
    				 c++;
    			 }
    		 }
    	 }
    	 if(c==0) {
    		 System.out.println("Da");}
    	 else {
    		 System.out.println("NU");
    	 }
    }
  
   public static boolean problem10(int nr) {
	  
	   if(nr<=1) {
		   return false;}
	   for(int i=2;i*i<=nr;i++) {
		   if(nr%i==0) {
			   return false;
		   }
	   }
	   return true;
			   
   }
   public static void problem12() {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("N:");
	   int nr=scan.nextInt();
	   int t=nr;
	   for(int d=2;d*d<=t;d++) {
		   if(nr%d==0) {
			   int c=0;
			   while(nr%d==0) {
				   c++;
				   nr=nr/d;
			   }
			 System.out.println(d+"^"+c);
		  
	   }
		 
   }
	if(nr>1) {
		System.out.println(nr+"^1");
	}
   }
   public static void problem11() {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("n:");
	   int nr=scan.nextInt();
	   int c=0;
	   for(int d=1;d<=nr;d++) {
		   if(nr%d==0) {
			   c++;
		   }
			   
	   }
	  System.out.println("divizori "+c);
   }
 
 
	  
   }
		   
   
    		 
        
    	
    
    
  

    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    	    
    
    
    

    		
    
    		
    	
    
    	
    	
    

