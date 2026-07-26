class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqCount = new int[26];
        int maxFreq = 0, maxLength = 0;

        for(int left=0, right=0; right<s.length(); right++) {
            //increasing frequecy of each encountered character
            freqCount[s.charAt(right) - 'A']++;
            //Assigning maximim Frequency encountered so far
            maxFreq = Math.max(maxFreq, freqCount[s.charAt(right)-'A']);

            int window = right - left + 1;
            //if window - maxFreq > k then we adjust left slider
            if(window - maxFreq > k) {
                freqCount[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }
}