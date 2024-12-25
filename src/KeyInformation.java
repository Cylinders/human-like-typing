import java.util.HashMap;

public class KeyInformation {
    private static HashMap<String, String[]> error_keys;

    public KeyInformation() {
        error_keys = new HashMap<String, String[]>();
        error_keys.put("1", new String[]{"2"});
        error_keys.put("2", new String[]{"1","3"});
        error_keys.put("3", new String[]{"2","4"});
        error_keys.put("4", new String[]{"3","5"});
        error_keys.put("5", new String[]{"4","6"});
        error_keys.put("6", new String[]{"5","7"});
        error_keys.put("7", new String[]{"6","8"});
        error_keys.put("8", new String[]{"7","9"});
        error_keys.put("9", new String[]{"8","0"});
        error_keys.put("0", new String[]{"9"});
        error_keys.put("q", new String[]{"w"});
        error_keys.put("w", new String[]{"s"});
        error_keys.put("e", new String[]{"w","r"});
        error_keys.put("r", new String[]{"e","t","f"});
        error_keys.put("t", new String[]{"g","r", "y"});
        error_keys.put("y", new String[]{"t", "u","h"});
        error_keys.put("u", new String[]{"y","i","k","j"});
        error_keys.put("i", new String[]{"o","k"});
        error_keys.put("o", new String[]{"p","l"});
        error_keys.put("p", new String[]{"o"});
        error_keys.put("a", new String[]{"s"});
        error_keys.put("s", new String[]{"a", "w"});
        error_keys.put("d", new String[]{"f", "s", "e"});
        error_keys.put("f", new String[]{"g","d", "r"});
        error_keys.put("g", new String[]{"f", "h", "t" });
        error_keys.put("h", new String[]{"j", "l"});
        error_keys.put("j", new String[]{"h","u"});
        error_keys.put("k", new String[]{"l", "i"});
        error_keys.put("l", new String[]{"p", ":"});
        error_keys.put("z", new String[]{"x"});
        error_keys.put("x", new String[]{"z","c"});
        error_keys.put("c", new String[]{"d","v"});
        error_keys.put("v", new String[]{"f","b", "c"});
        error_keys.put("b", new String[]{"n"});
        error_keys.put("n", new String[]{"m"});
        error_keys.put("m", new String[]{"n"});
        error_keys.put(",", new String[]{"l"});
        error_keys.put(".", new String[]{","});
        error_keys.put(";", new String[]{"l"});
        error_keys.put("'", new String[]{"'"});
        // error_keys.put("[", new String[]{});
        // error_keys.put("{", new String[]{});
        // error_keys.put("}", new String[]{});
    }
    public static String[] getKey(String key){
       
        if(!error_keys.containsKey(key)){
            return new String[]{key};
        }
        return error_keys.get(key);
    } 

}
