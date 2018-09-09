import java.util.Vector;

public class Main{
    private static Boolean success;
    private static String way;
    private static boolean[] used;
    private static int finish;

    public static String Search_way(Integer[][] Graph, Integer Start, Integer Finish) {
        finish=Finish;
        way="";
        success=false;
        if (Graph.length==0) return "Hey! Graph not exist!";

        if (Start < 0 || Finish < 0) return "Fail! Incorrect vertex!";

        if (Start == Finish)  return Start.toString() ;

        used = new boolean[Graph.length];
        for (int i=0;i<Graph.length;i++){
            used[i]=false;
        }
        dfs(Graph, Start-1);

        if (success)
            return way;
        else
            return "Bad! No way out.";
    }

    public static void dfs(Integer[][] Graph, Integer st)
    {
        int r;
        used[st]=true;
        way+=" "+(st+1);
        if(st+1==finish)
        {
            success = true;
            return;
        }
        else {
            for (r=0; r<Graph.length; r++)
                if(success){return;}
                else {
                    if ((Graph[st][r] != 0) && (!used[r]))
                        dfs(Graph, r);
                }
        }
    }

    public static void main(String[] args) {
        Integer[][] test = {{0,0},{0,0}};
        System.out.println(Search_way(test, 1, 2));
    }

}
