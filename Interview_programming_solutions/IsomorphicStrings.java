package InterviewQuestionsJava;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s, t));
    }


    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if( !map.get(s.charAt(i)).equals(t.charAt(i)) )
                {
                    return false;
                }
            }
            else
            {
                if( map.containsValue(t.charAt(i)) ) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
