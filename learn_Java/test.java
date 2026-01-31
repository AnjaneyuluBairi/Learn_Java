import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javafx.util.Pair;



class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        Map<Integer,ArrayList<Pair<Integer,Double>>> adj=new HashMap<>();
        for(int i=0;i<n;i++){
            if(adj.get(edges[i][0])!=null){
                adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));    
                adj.get(edges[i][0]).add(new Pair(edges[i][1],succProb[i]));
            }else{
                adj.put(edges[i][0],new ArrayList<>());
            }
            if(adj.get(edges[i][1])!=null){
                adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
            }else{
                adj.put(edges[i][1],new ArrayList<>());
                adj.get(edges[i][1]).add(new Pair(edges[i][0],succProb[i]));
            }
            
        }
        
        Queue<Pair<Integer,Double>> q = new LinkedList<Pair<Integer,Double>>();
        
        ArrayList<Double> arr=new ArrayList<Double>(n);
        
        q.add(new Pair(start_node,1.0));
        
        while(!q.isEmpty()){
            int node=q.peek().getKey();
            double val=q.peek().getValue();
            Iterator itr=adj.get(node).iterator();
            while(itr.hasNext()){
                int adj_node=itr.next().getKey();
                double adj_dis=itr.next().getValue();
                if(arr.get(adj_node)<val*adj_dis){
                    arr.add(adj_node,val*adj_dis);
                    q.add(new Pair(adj_node,arr.get(adj_node)));
                }
            }
            
        }
        
        return arr.get(end_node);
    }
}


/*


unordered_map<int,vector<pair<int,double>>> adj;
        for(int i=0;i<edges.size();i++){
            adj[edges[i][0]].push_back(make_pair(edges[i][1],succProb[i]));
            adj[edges[i][1]].push_back(make_pair(edges[i][0],succProb[i]));
        }
        queue<pair<int,double>> q;
        
        vector<double> ans(n,0.0);
        q.push({start_node,1.0});
        while(!q.empty()){
            auto it=q.front();q.pop();
            for(auto e:adj[it.first]){
                if(e.second*it.second>ans[e.first]){
                    ans[e.first]=e.second*it.second;
                    q.push({e.first,ans[e.first]});
                }
            }
        }
        return ans[end_node];

*/
}