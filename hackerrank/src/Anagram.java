/*
An anagram is a word or phrase formed by rearranging the letters of another word or phrase, typically using all the original letters exactly once.*/
import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "aabbccdd";
        String str2 = "ddccbbaa";
        System.out.println("Anagram: "+checkAnagram(str1,str2));
    }

    public static boolean checkAnagram(String str1, String str2){
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        if(str1.length()!=str2.length()){
            return false;
        }
        for(char element : str1.toCharArray()){
            map1.put(element, map1.getOrDefault(element,0)+1);
        }

        for(char element : str2.toCharArray()){
            map2.put(element, map2.getOrDefault(element, 0)+1);
        }
        return map1.equals(map2);
    }
}