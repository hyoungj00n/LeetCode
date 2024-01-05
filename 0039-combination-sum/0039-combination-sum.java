class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public void backtracking(int[] candidates, int start, int target,int combLen, List<Integer> list){
        
        if(target == 0){
            result.add(new ArrayList(list)); 
            return;
        }
        
        for(int i = start; i<candidates.length; i++){
            if(candidates[i] <= target){
            list.add(candidates[i]);
            backtracking(candidates,i,target-candidates[i],combLen+1,list);
            list.remove(combLen);
            }
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        
    
        for (int i=0; i<candidates.length; i++){
            List<Integer> comb = new ArrayList<>();
            comb.add(candidates[i]);
            backtracking(candidates, i, target-candidates[i], 1,comb);
        }
        
        return result;
    }
}
