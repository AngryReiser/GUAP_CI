import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class InputTest {
    DFS DFS;

    @Before
    public void initTest() {
        DFS = new DFS();
    }

    @After
    public void afterTest() {
        DFS = null;
    }
    //неправильно задана точка finish+
    @org.junit.Test
    public void test_input1() throws Exception{;
        Integer[][] test = {{1,1},{0,0}};
        Assert.assertEquals("Fail! Incorrect vertex",(Object) DFS.Search_way(test,1,5));
    }
    //тест на нормальное функционирование
    @org.junit.Test
    public void test_input_2() throws Exception{;
        Integer[][] test = new Integer[1][1];
        test[0][0]=0;
        Assert.assertEquals("1",(Object) DFS.Search_way(test,1,1));
    }

    //неправильно задана матрица резолюций
    @org.junit.Test
    public void test_input_3() throws Exception{;
        Integer[][] test = {{1,1},{0,0},{1,0}};
        Assert.assertEquals("Graph not correct!",(Object) DFS.Search_way(test,1,1));
    }

    //поиск пути в графе из одной точки
    @org.junit.Test
    public void test_input_5() throws Exception{;
        Integer[][] test = new Integer[0][0];
        Assert.assertEquals("graph null!",(Object) DFS.Search_way(test,1,1));
    }
}
