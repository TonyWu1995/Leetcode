package com.solution.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode535 {


    static class Codec {

        Map<String, String> map = new HashMap<>();

        int size = 0;

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            final String url = "http://" + size + "";
            map.put(url, longUrl);
            size++;
            return url;
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map.get(shortUrl);
        }

    }

    public static void main(String[] args) {
//Input: url = "https://leetcode.com/problems/design-tinyurl"
//Output: "https://leetcode.com/problems/design-tinyurl"
        Codec codec = new Codec();
        String encode = codec.encode("https://leetcode.com/problems/design-tinyurl");
        System.out.println(encode);
        String result = codec.decode(encode);
        System.out.println(result);
    }
}


