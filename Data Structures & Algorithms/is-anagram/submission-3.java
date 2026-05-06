class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> mapS = new HashMap<>();//hashmap banata S ka Char+count ka isse char plus voh kitni baar repeat hue yeh store hota hai
        HashMap<Character, Integer> mapT = new HashMap<>();//hashmap banata T ka Char+count ka isse char plus voh kitni baar repeat hue yeh store hota hai

        for (char c : s.toCharArray()){ // c matlab one char at a time lete hue iss string ko array me convert karo
            mapS.put(c, mapS.getOrDefault(c, 0) + 1);}//“Take the current character c. Check how many times I’ve already seen it (0 if never). Add 1 to that count. Store the updated count back into the map.”

        for (char c : t.toCharArray()) {// c matlab one char at a time lete hue iss string ko array me conver karo
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);}//“Take the current character c. Check how many times I’ve already seen it (0 if never). Add 1 to that count. Store the updated count back into the map.”


        return mapS.equals(mapT);
    }
}
