class Solution {
    public int minTimeToType(String word) {
		if(word == null) return 0;

		int lastIdx = 0;
		int res = 0;
		for(int i = 0 ; i < word.length() ; i++) {
			int nextPos = word.charAt(i) - 'a';
			res += 1 + Math.min(Math.abs(nextPos - lastIdx), 
							26 - Math.max(lastIdx, nextPos) + Math.min(lastIdx, nextPos));
			lastIdx = nextPos;
		}
		return res;
	}
}
