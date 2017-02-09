package myPractice.Codewars;

import java.util.ArrayList;

/**
 * Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which
 * are substrings of strings of a2.
 */
public class WhichAreIn {
    public static void main(String[] args) {
        String[] a = {"arp", "live", "strong"};
        String[] b = {"lively", "alive", "harp", "sharp", "armstrong"};

        for (String world : whichaAreIn(a, b)){
            System.out.println(world);
        }


    }
    public static ArrayList<String> whichaAreIn(String[] parts, String[] words){
        ArrayList<String> answer = new ArrayList<>(parts.length );
        for(String partOfWorld : parts){
            for (String word : words){
                String[] massive = word.split(partOfWorld);
                if (word.equals(joinAllPartsFromMassiveInOneWorld(massive))){
                    answer.add(partOfWorld);
                    break;
                }
            }
        }
        return answer;
    }
    public static String joinAllPartsFromMassiveInOneWorld(String[] someParts){
        String answer = "";
        for (String part : someParts){
            answer += part;
        }
        return answer;
    }
}
