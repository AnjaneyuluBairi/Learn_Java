import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        
   
    String[] strs={"eat","tea","tan","ate","nat","bat"};

    Map<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] chars=s.toCharArray();
            Arrays.sort(chars);
            String s1=new String(chars);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(s);
        }
        List<List<String>> li=new ArrayList<> (map.values());
        System.out.println(li.size());
    }
    
}
