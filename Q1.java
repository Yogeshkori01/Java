import java.util.HashMap; 
  class Main{
  public static void main(String[] args){
    String str="programming is a fun and fun is programming";
    HashMap<String,Integer> map=new HashMap<>();
    for(int i=0;i<str.length();i++){
      char ch=str.charAt(i);
      if(map.containsKey(String.valueOf(ch))){
      map.put(String.valueOf(ch),map.get(String.valueOf(ch))+1);
      }
      else{
        map.put(String.valueOf(ch),1);
      }
    // HashMap<Character,Integer> map=new HashMap<>();
    // char[] ch=str.toCharArray();
    // for(char c:ch)
    //   {
    //     map.put(c,map.getOrDefault(c,0)+1);
    //   }


   System.out.println(map);

  }
}

