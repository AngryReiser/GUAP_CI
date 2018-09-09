import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest{
    Main main;

    @Before
    public void initTest() {
        main = new Main();
    }

    @After
    public void afterTest() {
        main = null;
    }
    //пустой граф===================================
    @org.junit.Test
    public void test_Create_Graph_1() throws Exception{;
        Integer[][] test = new Integer[0][0];
        Assert.assertEquals("Hey! Graph not exist!",(Object) Main.Search_way(test,1,5));
    }
    //поиск пути в графе из одной точки
    @org.junit.Test
    public void test_Create_Graph_2() throws Exception{;
        Integer[][] test = new Integer[1][1];
        test[0][0]=0;
        Assert.assertEquals("1",(Object) Main.Search_way(test,1,1));
    }

    //петля при одной точке
    @org.junit.Test
    public void test_Create_Graph_3() throws Exception{;
        Integer[][] test = new Integer[1][1];
        test[0][0]=2;
        Assert.assertEquals((Object) "1",(Object) Main.Search_way(test,1,1));
    }
    //поиск пути в графе из двух точек связаных
    @org.junit.Test
    public void test_Create_Graph_4() throws Exception{;
        Integer[][] test = {{1,1},{0,0}};
        Assert.assertEquals((Object) " 1 2",(Object) Main.Search_way(test,1,2));
    }
    //поиск пути в графе из двух точек не связаных
    @org.junit.Test
    public void test_Create_Graph_5() throws Exception{;
        Integer[][] test = {{0,0},{0,0}};
        Assert.assertEquals("Bad! No way out.",(Object) Main.Search_way(test,1,2));
    }
    //поиск пути при петле
    @org.junit.Test
    public void test_Create_Graph_6() throws Exception{;
        Integer[][] test = {{0,0},{0,2}};

        Assert.assertEquals("Bad! No way out.",(Object) Main.Search_way(test,1,2));
    }
    //поиск пути в полносвязном графе
    @org.junit.Test
    public void test_Create_Graph_7() throws Exception{;
        Integer[][] test = {{1, 0, 0, 1}, {1,1,0,0}, {0,1,1,0}, {0,0,1,1}};
        Assert.assertEquals((Object)" 1 4",(Object) Main.Search_way(test,1,4));
    }
    //поиск пути в графе который дает разные значения для разных обходов
    @org.junit.Test
    public void test_Create_Graph_8() throws Exception{;
        Integer[][] test = {{1, 0, 0, 1}, {1, 1, 0, 0},{0,1,1,0},{0,0,1,1}};
        Assert.assertEquals((Object)" 1 4",(Object) Main.Search_way(test,1,4));
    }
    //поиск пути в графе из 4 трех точек
    @org.junit.Test
    public void test_Create_Graph_9() throws Exception{;
        Integer[][] test = {{1, 0, 0, 1} , {1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 1, 1}};
        Assert.assertEquals((Object)" 1 4",(Object) Main.Search_way(test,1,4));
    }
}
