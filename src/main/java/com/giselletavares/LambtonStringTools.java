package com.giselletavares;

import java.util.*;

public class LambtonStringTools {

    String reverse(String s) {
        String reversedString = "";

        for (int i = s.length()-1; i >= 0; i--) {
            reversedString += s.substring(i,i+1);
        }

        return reversedString;
    }


    // "1000" = 8 -> 128 | 64 | 32 | 16 | 8 | 4 | 2 | 1
    int binaryToDecimal(String s) {
        int convertedToDecimal = 0;
        int count = 0;

        if(s.isEmpty() || s.contains(".")){
            return -1;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if(!s.substring(i,i+1).contains("0") && !s.substring(i,i+1).contains("1")) {
                    count++;
                }
            }
            if(count > 0) { // count if there are some char different from 0 or 1
                return -1;
            }
        }

        int binaryValue = 1;

        for (int i = s.length()-1; i >= 0; i--) {
            if(s.substring(i,i+1).contains("1")) {
                convertedToDecimal += binaryValue;
            }
            binaryValue *= 2;
        }

        return convertedToDecimal;
    }

    String initials(String s) {
        String treated = s.trim();
        String[] resultSplit = treated.split(" ");
        String initials1 = "";
        String initials2 = "";
        String initials3 = "";

        int countSpaces = 0;

        for (int i = 0; i < treated.length(); i++) {
            if(treated.substring(i, i+1).contains(" ")){
                countSpaces++;
            }
        }

        if(countSpaces == 2) {
            initials1 = resultSplit[0].substring(0,1).toUpperCase();
            initials1 += ". ";
            initials2 = resultSplit[1].substring(0,1).toUpperCase();
            initials2 += ". ";
            initials3 = resultSplit[2].substring(0,1).toUpperCase();
            initials3 += resultSplit[2].substring(1).toLowerCase();
        } else {
            return null;
        }

        return initials1 + initials2 + initials3;
    }

    Character mostFrequent(String s) {
        Character mostFrequentChar = null;
        Map<String, Integer> countChar = new HashMap<>();
        int countCharNumber = 0;

        for (int i = 0; i < s.length(); i++) {
            if(!countChar.containsKey(s.substring(i, i+1))) {
                countChar.put(s.substring(i, i+1), 1);
            } else {
                countChar.replace(s.substring(i, i+1), +1);
            }
        }



        return mostFrequentChar;
    }

    String replaceSubString(String s1, String s2, String s3) {
        String[] resultSplit = s1.split(" ");
        String finalSentence = "";

        for(String word: resultSplit) {
            if(word.equals(s2)) {
                word = s3;
            }
            finalSentence += word + " ";
        }

        return finalSentence;
    }



}
