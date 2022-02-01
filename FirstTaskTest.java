import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstTaskTest {
    final FirstTask firstTask = new FirstTask();

    @Test
    public void should_brings_the_indexes_of_the_beginning_and_the_end_of_the_array() {
        int[] result = firstTask.twoSum(new int[]{2, 9, 6}, 8);
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    public void should_brings_the_indexes_in_the_middle_Of_the_array() {
        int[] result = firstTask.twoSum(new int[]{2, 9, 1, 6}, 10);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void should_brings_an_error_in_case_of_no_mutch_numbers() {
        assertThrows(IllegalArgumentException.class, () -> firstTask.twoSum(new int[]{2, 2, 2}, 10));
    }

    @Test
    public void should_brings_an_arra_of_negative_numbers() {
        int[] result = firstTask.twoSum(new int[]{-4, 5, 3}, -1);
        assertArrayEquals(new int[]{0, 2}, result);

    }

    @Test
    public void should_brings_an_error_in_case_of_empty_array() {
        assertThrows(IllegalArgumentException.class, () -> firstTask.twoSum(new int[]{}, 2));
    }

}

