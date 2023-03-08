package InterviewQuestionsJava;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class ConcatenatedWords {
    public static void main(String[] args)
    {
        String[] words={"cat","do","g","catdog"};
        System.out.println(findallConactWords(words));

    }

    public static List<String > findallConactWords(String[] words) {
        int n = words.length;
        Set<String> st = new HashSet<>();
        Map<String, Boolean> map = new HashMap<>();
        for(String s : words)
            st.add(s);
        List<String> result = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            String word = words[i];

            if(isConcatenated(word, st, map)){
                result.add(word);
            }
        }
        return result;
    }

    public static boolean isConcatenated(String word, Set<String> st, Map<String, Boolean> map) {
        if(map.containsKey(word))
            return map.get(word);
        int l = word.length();
        for(int i = 0 ; i< l; i++){
            String prefix = word.substring(0, i+1);
            String suffix = word.substring(i+1, l);
            if((st.contains(prefix) && st.contains(suffix)) || (st.contains(prefix) && isConcatenated(suffix, st, map))){
                map.put(word, true);
                return true;
            }
        }
        map.put(word, false);
        return false;
    }

}



