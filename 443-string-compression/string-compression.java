class Solution {
    public int compress(char[] chars) {
         if (chars.length == 0) {
            return 0;
        }
        
        int index = 0; 
        int count = 1; 
        
        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
            } else {
                chars[index++] = chars[i]; 
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    for (char c : countStr.toCharArray()) {
                        chars[index++] = c;
                    }
                }
                count = 1; 
            }
        }
        return index; 
    }
}