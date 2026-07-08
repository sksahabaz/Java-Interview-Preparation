import java.util.Scanner;

/*
 * all pairs type quesrtions covered..........
 */



public class mj {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] =sc.nextInt();
		}
		
		//int k =sc.nextInt();
		
	//pairsofsumofk(arr,k);	
	//evenpairs(arr);
	//oddpairs(arr);
	//pairswithproduct(arr,k);
	 //pairsofsum( arr,k);
	//lesspairsofsum( arr,k);
		//countpairs(arr);
		//pairswithsumofprimenumber(arr);
		//pairswithsmallvalue(arr);
		//pairswithsecondvalue(arr);
		//primeelements(arr);
		//pairscomarison(arr);
		//pairswithDiffernce(arr,k);
		
		//pairwithminimumsum(arr);
		
		
   }
 


public static void pairsofsumofk(int arr[],int k) {
	
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] + arr[j] == k) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	
}
	
public static void evenpairs(int arr[]) {
	
	for(int i=0;i<arr.length-1;i++) {
    for(int j=i+1;j<arr.length;j++) {		
    	 if(arr[i] %2 == 0 && arr[j]%2== 0) {
    		 System.out.println(arr[i]+" "+arr[j]);
    	 }
    }
		
		
	}

}


public static void oddpairs(int arr[]) {
	
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] %2 != 0 && arr[j] %2 !=0) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
		
		
	}
	
}


public static void pairswithproduct(int arr[],int k) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			
			 if(arr[i]*arr[j] == k) {
				 System.out.println(arr[i]+" "+arr[j]);
			 }
			
			
		}
	}
	
	
}



 public static void pairsofsum(int arr[],int k){
	
	 
	 for(int i=0;i<arr.length;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[i]+arr[j] > k) {
				 
		 System.out.println(arr[i]+" "+arr[j]);
			 }
		 }
	 }
	 
	 
}


public static void lesspairsofsum(int arr[],int k){
	 
	 for(int i=0;i<arr.length-1;i++) {
		 for(int j=i+1;j<arr.length;j++) {
			 
			 if(arr[i]+arr[j] < k) {
				 
				 System.out.println(arr[i]+" "+arr[j]);
					 }
			 
		 }
	 }

	 
 }

public static void  countpairs(int arr[]){
	
	int count =0;
    for(int i=0;i<arr.length-1;i++) {
    	for(int j=i+1;j<arr.length;j++) {
    		count++;
    	}
    }

System.out.println(count);


}
  
public static void pairswithsumofprimenumber(int arr[]) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			
			if(isPrime(arr[i]+arr[j])) {
				System.out.println(arr[i]+" "+arr[j]);
			}
			
		}
	}
	
}


public static void pairswithsmallvalue(int arr[]){
	
	
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
			
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
	

}

public static void pairswithsecondvalue(int arr[]) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i] < arr[j]) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
}



public static void primeelements(int arr[]) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j = i+1;j<arr.length;j++) {
			
			if(isPrime(arr[i]) || isPrime(arr[j])) {
				System.out.println(arr[i]+" "+arr[j]);
			}

			
		}
	}
}



public static void pairscomarison(int arr[]){
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]> arr[j]) {
				System.out.println(arr[i]+" "+arr[j]);
			}
		}
	}
}



public static void pairswithDiffernce(int arr[],int k){
	
      for(int i=0;i<arr.length-1;i++) {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]-arr[j] == k || arr[j] -arr[i] == k) {
    			   System.out.println(arr[i]+" "+arr[j]);
    		   }
    	   }
      }


}



public static void pairwithminimumsum(int arr[]) {
	
	 int minSum = arr[0] + arr[1];
     int first = arr[0];
     int second = arr[1];

     for(int i = 0; i < arr.length - 1; i++) {

         for(int j = i + 1; j < arr.length; j++) {

             int sum = arr[i] + arr[j];

             if(sum < minSum) {
                 minSum = sum;
                 first = arr[i];
                 second = arr[j];
             }
         }
     }

     System.out.println(first + " " + second);
 }



  public static  boolean isPrime(int num){
	
	if(num<=1) {
		return false;
	}
	
	for(int i=2;i<num;i++) {
		if(num %i == 0) {
			return false;
		}
	}
	return true;
	
}


	
}
