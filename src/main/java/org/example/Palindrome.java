package org.example;
import java.util.Scanner;

/* Определяет, является ли строка палиндромом */
public class Palindrome {
    public static void main(String[] args) {
        for (String s : args) {
            if (isPalindrome(s)) {
                System.out.printf("%s is palindrome\n", s);
            }
            else {
                System.out.printf("%s is not palindrome\n", s);
            }
        }
    }

    /* Переворачивает строку */
    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }

    /* Сравнивает строку с перевернутой */
    public static boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
}
