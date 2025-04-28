 
import java.awt.Insets;
import java.util.Scanner;
public class Main {

 //  public static int linearsearch(int[] arr,int target)
 //  {
 //    int i;
 //    for(i=0;i<arr.length;i++)
 //      {
 //        if(arr[i]==target)
 //         { 
 //         return i;}
            
 //      }
 //     //System.out.println("found "+target+" at index"+i);
    
    
 // return -1; }
    
 //  public static void main(String[] args) {
 //    int[] arr={134,2,33,40,50,6,7};
 //    int target=5;
 //    int i =linearsearch(arr,target);
 //     System.out.println("found "+target+" at index"+i);
    // binary search
    public static int binarysearch(int[] arr,int target){
      int start=0;
      int end=arr.length-1;
      while(start<=end)
        {
          int mid=(start+end)/2;
          if(arr[mid]==target)
            {
              return mid;
            }
          else if(arr[mid]<target)
            {
              start=mid+1;
            }
          else
            {
              end=mid-1;
            }
        }
      return -1;
      
    }
    public static void main(String[] args){
      int[] arr={1,2,3,4,6,7};
      int target=4;
      int i =binarysearch(arr,target);
      if(i==-1){
      System.out.println("not found");
      }
      else
      System.out.println("found "+target+" at index  "+i);
      
    
    }
       
      
  }
   


  
