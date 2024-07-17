package com.demo;

public class Strings {

    public static int countWords(String str) {
        int count = 0;
        if (str.isEmpty()) {
            return 0;
        }
        boolean spaceFound = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                if (!spaceFound) {
                    count++;
                    spaceFound = true;
                }
            } else {
                spaceFound = false;
            }
        }
        return count + 1;
    }

    public static String findLongestWord(String str) {
        String[] words = str.split("[^a-zA-Z]+"); 
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }


    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String swapFirstLast(String str) {
        if (str.length() == 1) {
            return str;
        }
        return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    public static String shiftLastToFirst(String str) {
        return swapFirstLast(str);
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "India";
        String str2 = "This is an international airport";
        String str3 = "Never odd or even";

        System.out.println("Number of words in \"" + str2 + "\": " + countWords(str2));
        System.out.println();
        
        System.out.println("Longest word in \"" + str2 + "\": " + findLongestWord(str2));
        System.out.println();
        System.out.println("\"" + str3 + "\" is a palindrome: " + isPalindrome(str3));
        System.out.println();
        System.out.println("Swapping first and last character of \"" + str1 + "\": " + swapFirstLast(str1));
        System.out.println();
        System.out.println("Shifting last character to first of \"" + str1 + "\": " + shiftLastToFirst(str1));
        System.out.println();
        System.out.println("Number of vowels in \"" + str2 + "\": " + countVowels(str2));
    }
}
