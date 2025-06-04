
// class Mythread extends Thread{
//     public void run(){
//        System.out.println("thread ");
      
//       try {
//         Thread.sleep(7000);
//       }
//     catch (Exception e){}
        
//   System.out.println("hello");
// }}

// class Main  {
//     public static void main(String[] args){

//         Mythread t1 = new Mythread();
//         t1.start();
        
     
//     }
// }
// class down{
//     public static void file(String file){
//       for(int i=1;i<=5;i++){
//         System.out.println(file +"downloading..."+(i*20)+"%");
      
//       try{
//         Thread.sleep(2000);
       
//       }catch(Exception e){
        
//       }
//          System.out.flush();
      
      
//     }
//       System.out.println(file+" downloaded");
//     }
// }
// class Main{
//     public static void main(String[] args){
//       // file("hello");
//       // file("hii");

//       down d1 = new down();
//       d1.file("file A  ");
//       d1.file("file B  ");
      
//     }
// }
// class Down implements Runnable {
//   String file;

//   Down(String file) {
//       this.file = file;
//   }

//   public void run() {
//       for (int i = 1; i <= 5; i++) {
//           System.out.println(file + " downloading... " + (i * 20) + "%");
//           try {
//               Thread.sleep(2000);
//           } catch (Exception e) {
//               System.out.println(file + " interrupted");
//           }
//       }
//       System.out.println(file + " downloaded");
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//       Thread t1 = new Thread(new Down("File A  "));
//       Thread t2 = new Thread(new Down("File B  "));

//       t1.start(); // starts file A download
//       t2.start(); // starts file B download (at same time)
//   }
// }

class filedown extends Thread{
   String filename;
  public filedown(String filename){
    this.filename=filename;
  }
  //public static void file(String filename){
  public void run(){
   for(int i=1;i<=5;i++){
      System.out.println(filename+" downloading..."+(i*20)+"%");  
   try{
      Thread.sleep(2000);
      
    }catch(Exception e){
      
    }  }  
    System.out.println(filename+" downloaded");
  }
}
class Main {
  public static void main(String[] args)  {
    filedown f1 = new filedown("file A");
    filedown f2 = new filedown("file B");
    f1.start();
    f2.start();
  }
}