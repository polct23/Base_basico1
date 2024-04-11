package edu.upc.dsa;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.ArrayList;


public class ProductManagerImp implements ProductManager {

    ArrayList<Product> l;
    HashMap<String, User> h;
    Queue<Order> q;
    final static Logger logger = Logger.getLogger(ProductManagerImp.class);

    public ProductManagerImp() {
        q = new LinkedList<>();
        l = new ArrayList<>();
        h = new HashMap<>();

    }

    private static ProductManager instance;
    public static ProductManager getInstance() {
        if (instance==null) instance = new ProductManagerImp();
        return instance;
    }
    public List<Product> productsByPrice() {
        ArrayList<Product> productosOrdenados = l;
        productosOrdenados.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        return productosOrdenados;
    }
    public int getNumProducts() {
        return l.size();
    }

    public List<Product> productsBySales() {

        ArrayList<Product> productosOrdenados = l;
        productosOrdenados.sort((p2, p1) -> Double.compare(p1.getSales(), p2.getSales()));

        return productosOrdenados;
    }


    public void addOrder(Order order) {

        logger.info("Nueva orden de:" + order.user);
        q.offer(order);
    }

    public Order processOrder() {

        Order o = q.poll();
        addSalesOrder(o);
        User user = h.get(o.user);
        user.addOrder(o);
        return o;
    }

    public ArrayList<Order> ordersByUser(String userId) {
        User user = h.get(userId);
        ArrayList<Order> ordenes;
        ordenes = user.orders();
        return ordenes;

    }

    public void addUser(String s, String name, String surname) {
        User nuevo = new User(s, name, surname);
        h.put(nuevo.s, nuevo);


    }

    public void addProduct(String productId, String name, double price) {
        Product p = new Product(productId, name, price);
        l.add(p);
    }
    public void addSalesOrder(Order o){
        ArrayList<PedidosProductos> lista = o.getListaPedidos();

        for (int i=0; i<lista.size(); i++){

            PedidosProductos p = lista.get(i);
            int num = p.getN();
            String id = p.getS();
            for(int j=0;j<l.size();j++){

                Product prod = l.get(j);
                if(Objects.equals(prod.getProductID(), id)){
                    prod.AddSales(num);
                    l.set(j,prod);
                }
            }

        }


    }
}
