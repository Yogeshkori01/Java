// class student{

//     // String str1="satyam";
//     // String str2="chodu";
  
//    void area(int a,int  b)
//     {
//    // System.out.println(str1+str2);
//       //a=side;
//       //int area=side*side;
//       System.out.println("area= "+(a*b));
//   }
// }
// public class Main{
//   public static void main(String[] args){
//   student obj =new student();
//   obj.area(4,5);
// }}
// import java.util.Scanner;
// class car{
  

//   void indata(
//              String brand,
//              String colour,
//              int year,
//              int price)
//   {
//     // System.out.println("BRAND :- "+brand);
//     // System.out.println("COLOUR :- "+colour);
//     // System.out.println("YEAR :- "+year);
//     // System.out.println("PRICE :- "+price);
//      System.out.println("CAR DETAILS :- \n BRAND :- "+brand+"\n COLOUR :- "+colour+"\n YEAR :- "+year+"\n PRICE :- "+price);
    
    
//   }
// }
// public class Main{
//   public static void main(String[] args){
//     car obj=new car();
//     obj.indata("bmw","black",2019,1000000000);
//   }
// }
class student{
  void indata(String name,int rollno,String branch){
    System.out.println("NAME :- "+name);
    System.out.println("ROLL NO :- "+rollno);
    System.out.println("BRANCH :- "+branch);
  }
}
public class Main{
  public static void main(String[] args)

  {
    student obj=new student();
    obj.indata("satyam",123,"cse");
  }
}
