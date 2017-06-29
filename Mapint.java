import java.util.*;
class Mapint{
public static void main(String[] args){
Map<Integer,String> map=new LinkedHashMap<Integer,String>();  
Mapint obj;
//System.out.println(obj);  
  map.put(105,"Amiti");  
  map.put(108,"Amitq");  
  map.put(100,"Amitw");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  map.put(102,"Rahul");  
  map.put(101,"rAHUL");
  map.put(198 ,"null");
 for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
}
}
