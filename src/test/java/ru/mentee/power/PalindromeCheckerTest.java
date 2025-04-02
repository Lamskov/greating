package ru.mentee.power;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeCheckerTest {

    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    @DisplayName("Тест проверки палиндрома - базовые случаи")
    void testPalindromeBasic() {
        // Проверяем что простые палиндромы определяются правильно
        assertThat(checker.isPalindrome("топот")).isTrue();
        assertThat(checker.isPalindrome("А роза упала на лапу Азора")).isTrue();
        assertThat(checker.isPalindrome("Java")).isFalse();
    }

    @Test
    @DisplayName("Тест проверки палиндрома - особые случаи")
    void testPalindromeSpecial() {
        // Пустая строка и один символ - тоже палиндромы
        assertThat(checker.isPalindrome("")).isTrue();
        assertThat(checker.isPalindrome("a")).isTrue();

        // Проверяем работу с пробелами и знаками препинания
        assertThat(checker.isPalindrome("Madam, I'm Adam")).isTrue();
        assertThat(checker.isPalindrome("А роза упала на лапу Азора!")).isTrue();
    }

    @Test
    @DisplayName("Тест проверки палиндрома - граничные случаи")
    void testPalindromeBoundary() {
        // Проверяем граничные случаи с числами и спецсимволами
        assertThat(checker.isPalindrome("12321")).isTrue();
        assertThat(checker.isPalindrome("123 321")).isTrue();
        assertThat(checker.isPalindrome("12345")).isFalse();
    }
}