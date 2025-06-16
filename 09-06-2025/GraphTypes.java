public class GraphTypes{
    public static void main(String[] args){
      
        //true==Directed true=weighted
        Graph g=new Graph(4,true,true,2);
        g.addEdge(0,1);
          g.addEdge(0,3)  ;g.addEdge(1,2);
          g.print(2);
    }
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isDirected;
    boolean isWeighted;
    int weight;
    Graph (int vertices,boolean isDirected,boolean isWeighted ,int weight ){
        this.vertices=vertices;
        this.isDirected=isDirected;
        this.isWeighted=isWeighted;
        this.weight=weight;
        graph=new int[vertices][vertices];
        
    }
    void addEdge(int src,int dest){
        if(isvalid(src,dest)){
            if(isDirected && !isWeighted)
            graph[src][dest]=1;
            if(!isDirected && !isWeighted){
             graph[src][dest]=1;
             graph[dest][src]=1;
            } 
            if(!isDirected && isWeighted){
            graph[src][dest]=this.weight;
             graph[dest][src]=this.weight;
            }if(isDirected && isWeighted){
                graph[src][dest]=this.weight; 
            }
        }else{
            System.out.println("Invalid source and destination");
            return;
        }
    }
    void removeEdge(int src,int dest){
        if(isvalid(src,dest)){
            
            graph[src][dest]=0;
            if(!isDirected)
             graph[dest][src]=0;
        }else{
            System.out.println("Invalid source and destination");
            return;
        }
    }
    boolean isvalid(int src,int dest){
    return src>=0 && dest>=0 && src!=dest && src<vertices && dest<vertices;
    }
    void print(int weight){
        for (int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(graph[i][j]+" ");
            }
              System.out.println();
        }
    }
}
