public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> mapCS = new HashMap<Character, String>();
        HashMap<String, Character> mapSC = new HashMap<String, Character>();
        String[] strings = str.split("\\s+");
        if (pattern.length() != strings.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            if (!mapCS.containsKey(pattern.charAt(i))) {
                mapCS.put(pattern.charAt(i), strings[i]);
                if (mapSC.containsKey(strings[i])) {
                    return false;
                }
                mapSC.put(strings[i], pattern.charAt(i));
            } else {
                if (!strings[i].equals(mapCS.get(pattern.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
