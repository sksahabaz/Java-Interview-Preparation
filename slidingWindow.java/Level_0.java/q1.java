class q1{
    public static void main(String[] args) {
        
  int arr[] = {9,8,5,3,4,3};
  int k =3;

 int currsum =0;
 int max = Integer.MIN_VALUE;
  for(int i=0;i<k;i++){
    currsum+=arr[i];
  }

  max = currsum;
  for(int i=k;i<arr.length;i++){
    currsum -=arr[i-k];
    currsum+=arr[i];
    max = Math.max(currsum,max);
  }
System.out.println(max);






    }
}