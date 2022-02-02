import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondTaskTest {
    final SecondTask secondTask = new SecondTask();
    @Test
    public void should_brings_the_max_number_of_substring() {
        int result = secondTask.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3,result);
    }
    @Test
    public void should_brings_one_inCaseof_only_one_kind_of_char() {
        int result = secondTask.lengthOfLongestSubstring("bbbbbbb");
        assertEquals(1,result);
    }
    @Test
    public void should_note_take_into_account_the_subsequence_of_chars() {
        int result = secondTask.lengthOfLongestSubstring("pwwkew");
        assertEquals(3,result);
    }



}