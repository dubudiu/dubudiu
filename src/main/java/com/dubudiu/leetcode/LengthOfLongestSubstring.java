package com.dubudiu.leetcode;


import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {



    public static void main(String[] args) {
        String s = "wwwsssskkjijwer";
        System.out.println(lengthOfLongestSubstring(s));
    }

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     */

    public static int lengthOfLongestSubstring(String s) {
        int strMaxlength = 0;
        if(s.equals("")){
            return strMaxlength;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int strLength;
            List<String> strings = new ArrayList<>();
            for (int j = i; j < chars.length; j++) {
                String str = String.valueOf(chars[j]);
                if(!strings.contains(str)){
                    strings.add(str);
                }else{
                    break;
                }
            }
            strLength = strings.size();
            if(strLength>strMaxlength){
                strMaxlength = strLength;
            }
        }
        return strMaxlength;
    }

}
