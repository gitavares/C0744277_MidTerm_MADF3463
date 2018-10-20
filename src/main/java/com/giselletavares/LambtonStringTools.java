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
        String initials = "";
        String treated = s.trim();
        int countSpaces = 0;
        int iValue = 0;
        System.out.println(treated);

        for (int i = 0; i < treated.length(); i++) {
            if(treated.substring(i, i+1).contains(" ")){
                countSpaces++;
            }
        }

        if(countSpaces == 2) {
            initials += treated.substring(0,1).toUpperCase();
            initials += ". ";

            for (int i = 2; i < treated.length(); i++) {
                if(treated.substring(i, i+1).contains(" ")){
                    initials += treated.substring(i+1, i+2).toUpperCase();
                    initials += ". ";
//                    initials += treated.substring(i+1, j+2).toUpperCase();
//                    initials += treated.substring(j+i+2).toLowerCase();
//                    for (int j = 6; j < treated.length(); j++) {
////                        System.out.println(treated.substring(j, j+1));
//                        if(treated.substring(j+i, j+i+1).contains(" ")){
//                            initials += treated.substring(j+i+1, j+i+2).toUpperCase();
//                            initials += treated.substring(j+i+2).toLowerCase();
//                        }
//                    }
//                    if(treated.substring(i+7, i+8).contains(" ")){
//                        i++;
//                    }
//                    initials += treated.substring(i, i+1).toUpperCase();
//                    initials += treated.substring(i+1).toLowerCase();
//
//                    break;
                }


            }

        } else {
            return null;
        }

        return initials;
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
//        String replacedSubString = "";

//        s1.replace(s2, s3);

        return s1.replace(s2, s3);
    }



}
