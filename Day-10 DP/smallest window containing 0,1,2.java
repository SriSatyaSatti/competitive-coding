class Solution {
    public int smallestSubstring(String S) {
        // Code here
        HashMap<Character,Integer> h=new HashMap<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            h.put(S.charAt(i),i);
            if(h.size()==3){
                min=Math.min(i-Math.min(h.get('0'),Math.min(h.get('1'),h.get('2')))+1,min);
            }
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        return min;
}
}
