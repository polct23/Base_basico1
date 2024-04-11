
import edu.upc.dsa.ProductManager;
import edu.upc.dsa.ProductManagerImp;
import edu.upc.dsa.Order;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductManagerImpTest {
    ProductManager pm;
   @Before
    public void setUp(){
       this.pm = new ProductManagerImp();
       pm.addProduct("B001", "Coca cola", 2);
       pm.addProduct("C002", "Café amb gel", 1.5);
       pm.addProduct("A002", "Donut", 2.25);
       pm.addProduct("A003", "Croissant", 1.25);
       pm.addUser("1111111", "Juan", "lopez");
       pm.addUser("2222222",  "David", "Rincon");
       pm.addUser("3333333",  "Juan", "Hernández");

   }

   @After
    public void tearDown(){this.pm = null;}

    @Test
    public void testPedido(){
        Order o1 = new Order("1111111");
        o1.addLP(3, "B001");
        o1.addLP(2, "C002");
        pm.addOrder(o1);

    }
    @Test
    public void testServir(){
        Order o1 = new Order("1111111");
        o1.addLP(3, "B001");
        o1.addLP(2, "C002");
        pm.addOrder(o1);
        Order o2 =  pm.processOrder();
        String user = o2.getUser();
        Assert.assertEquals("1111111", user);

    }
    @Test
    public void testUsuario(){
        Order o1 = new Order("1111111");
        o1.addLP(3, "B001");
        o1.addLP(2, "C002");
        pm.addOrder(o1);
        System.out.println(pm.ordersByUser("1111111"));


    }

}
