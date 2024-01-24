class Solution {
    
    
    static HashMap<String,String> map = new HashMap<>();
    
    
    public List<String> letterCombinations(String digits) {
    
        
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8","tuv");
        map.put("9", "wxyz");
        
        List<String> answer = new ArrayList<>();
        
        int size = digits.length();
        answer = dfs(digits,"",size,answer);
        
        return answer;
    }
    public List<String> dfs(String digits, String words,int size,List<String> answer) {
        
        if (size ==0){
            return answer;
        }
        if (size== words.length()) {
            answer.add(words);
            return answer;
        }

        
        String target = map.get(String.valueOf(digits.charAt(0)));

        
        for (int i = 0; i < target.length(); i++) {
            
            dfs(digits.substring(1), words + target.charAt(i),size,answer);
        }
        
        return answer;
    }
}