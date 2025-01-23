package oop;

public class Solution {
    public static void main(String[] args) {
        String s1 = new String("Java");
        s1 = "Java";
        String s2 = "JavaENU";
        s2 = new String("Java");
        String s3 = "Java";
// s3 = new String("Java");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}