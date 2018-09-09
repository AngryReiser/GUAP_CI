public interface TestInterface {
    //поиск пути в глубину
    String Search_way(Integer[][] Graph, Integer Start, Integer Finish);
    public void dfs(Integer[][] Graph, Integer node);
}
