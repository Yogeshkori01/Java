import java.util.HashMap; 
class Main{
public static void main(String[] args){
  String str="aaabcccdeeff";
 // HashMap<String,Integer> map=new HashMap<>();
  HashMap<Character,Integer> map=new HashMap<>();
  char[] ch=str.toCharArray();
  for(char c:ch)
    {
      map.put(c,map.getOrDefault(c,0)+1);
    }
    for(char c:ch)
      {
        if(map.get(c)==1)
        {
          System.out.println(c);

          break;
        }

      }



}}