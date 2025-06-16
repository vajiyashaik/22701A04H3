public class DirectedOrNot{
    public static void main(String[] args){
        Graph g=new Graph(4,true);
        g.addEdge(0,1);
          g.addEdge(0,3)  ;g.addEdge(1,2);
          g.print();
    }
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isDirected;
   
    Graph (int vertices,boolean isDirected ){
        this.vertices=vertices;
        this.isDirected=isDirected;
        graph=new int[vertices][vertices];
        
    }
    void addEdge(int src,int dest){
        if(isvalid(src,dest)){
            graph[src][dest]=1;
            if(!isDirected)
             graph[dest][src]=1;
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
    void print(){
        for (int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.print(graph[i][j]+" ");
            }
              System.out.println();
        }
    }
}
