package com.test.study.Book;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        // 统计字符串中每个字符出现的次数
        String s = "houdunren.com";
        char[] cs = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : cs){
            map.merge(c,1,(p,v) -> p+v);
        }

        System.out.println(map);

        Set<Character> keys = map.keySet();
        for(char key : keys){
            System.out.println(key);
        }

        Collection<Integer> values = map.values();
        for(int value : values){
            System.out.println(value);
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entries)
            System.out.println(entry.getKey() + "->"+ entry.getValue());
    }
}
