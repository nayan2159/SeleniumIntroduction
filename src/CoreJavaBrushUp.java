
public class CoreJavaBrushUp {

	public static void main(String[] args) {
		// Declareing Data Types
		
		int myNum=5;
	    String website="Nayan Lambat Academy";
        char letter='N';
        double dec=5.99;
        boolean myCard=true;
        
        System.out.println(myNum +" an integer");
        System.out.println(website);
        
        
        //declaring a Array
        int [] arr= new int [5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        
        System.out.println(arr[1]);
        
       // for(int i=0;i<arr.length;i++) {
     //   	System.out.println(arr[i]);
       // }
        
        int arr2[]= {1,2,3,4,5,6,7,8,9,10,122};
        
        //For loop array.length-5
        for(int i=0;i<arr2.length;i++){
        	
        	System.out.println(arr2[i]);
        }
        String[] name= {"Nayan","Lambat","academy"};
        
        for(int i=0;i<name.length;i++) {
        	
        	System.out.println(name[i]);
        
        }
        
        for(String s:name) {
        	System.out.println(s);
        }
        
        
        
        
        

        
        
    
         
        
        
	}

}
