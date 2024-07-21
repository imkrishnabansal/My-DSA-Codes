public class palindromic_substring {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(CountPalindromic(s));
    }
    public static int CountPalindromic(String s) {
        int odd = 0;
        int even;
        for(even = 0; even < s.length(); ++even) {
            for(int orbit = 0; even - orbit >= 0 && even + orbit < s.length() && s.charAt(even - orbit) == s.charAt(even + orbit); ++orbit) {
                ++odd;
            }
        }
        even = 0;
        for(double axis = 0.5; axis < (double)s.length(); ++axis) {
            for(double orbit = 0.5; axis - orbit >= 0.0 && axis + orbit < (double)s.length() && s.charAt((int)(axis - orbit)) == s.charAt((int)(axis + orbit)); ++orbit) {
                ++even;
            }
        }
        return odd + even;
    }
}
