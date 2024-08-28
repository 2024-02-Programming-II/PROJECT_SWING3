import co.edu.uptc.views.DashBoard;
import co.edu.uptc.views.DashBoard2;
import co.edu.uptc.views.DashBoard3;
import co.edu.uptc.views.View1;
import co.edu.uptc.views.View2;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        testDb3();
        //testDb();
        //testDb2();
        //testV1();
        //testV2();

    }

public static void testDb(){
    DashBoard db = new DashBoard();
    db.setVisible(true);
}
public static void testDb3(){
    DashBoard3 db = new DashBoard3();
    db.setVisible(true);
}

public static void testDb2(){
    DashBoard2 db = new DashBoard2();
    db.run2();
}

public static void testV1(){
    View1 v1 = new View1();
    v1.setVisible(true);
}

public static void testV2(){
    View2 v1 = new View2();
    v1.setVisible(true);
}

}
