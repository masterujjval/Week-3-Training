package stringbuilder.remove_duplicates;
import java.util.*;
public class RemoveDuplicates {

    static Set<Character> set=new HashSet<>();
   static  StringBuilder ans=new StringBuilder();
    public static String remove(String s){
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        for(Character c :set){
            ans.append(c);
        }
        return ans.toString();
    }


}
