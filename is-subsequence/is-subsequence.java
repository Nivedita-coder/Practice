class Solution {
    public boolean isSubsequence(String s, String t) {
         boolean[][] mem = new boolean[s.length()+1][t.length()+1];
        
        
        mem[0][0] = true;
        
        for(int i=1; i<=s.length(); i++) {
            mem[i][0] = false; 
        }
        
        for(int j=1; j<=t.length(); j++) {
            mem[0][j] = true;
        }
        
        for(int i=1; i<=s.length(); i++) {
            for(int j=1; j<=t.length(); j++) {
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    mem[i][j] = mem[i-1][j-1];
                } else {
                    mem[i][j] = mem[i][j-1];
                }  
            }
        }
        
        return mem[s.length()][t.length()];
    }
}