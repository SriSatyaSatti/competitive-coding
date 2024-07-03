    boolean dfs(int i,ArrayList<ArrayList<Integer>> adj,boolean[] v,int p){
        v[i]=true;
        for(Integer x:adj.get(i)){
            if(!v[x]){
                boolean ans=dfs(x,adj,v,i);
                if(ans)
                return true;
            }
            else if(x!=p)
            return true;
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean v[]=new boolean[V];
        //boolean path[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(v[i]==false){
                boolean ans=dfs(i,adj,v,-1);
                if(ans==true)
                return true;
            }
        }
        return false;
    }
