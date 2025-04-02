package ru.mentee.power;

public class PalindromeChecker {
    /**
     * Проверяет, является ли строка палиндромом.
     * Палиндром - строка, которая читается одинаково слева направо и справа налево.
     * Метод игнорирует регистр и все символы кроме букв и цифр.
     *
     * @param str строка для проверки
     * @return true если строка является палиндромом, false в противном случае
     */
    public boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;

        while (backward > forward) {
            if (clean.charAt(forward) != clean.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
}

