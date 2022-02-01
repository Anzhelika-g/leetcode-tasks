public class SecondTask {
    //You are given two non-empty linked lists representing two non-negative integers.
    // The digits are stored in reverse order, and each of their nodes contains a single digit.
    // Add the two numbers and return the sum as a linked list.
    //
    //You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    public static int lengthOfLongestSubstring(String s) {

        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            String newWord = String.valueOf(s.charAt(i));
            int count = 1;

            for (int j = i + 1; j < s.length(); j++) {

                if (!newWord.contains("" + s.charAt(j))) {
                    count++;
                    newWord += "" + s.charAt(j);
                } else {
                    break;
                }

            }
            if (maxCount < count) {
                maxCount = count;
            }
        }

        return maxCount;

    }



}
