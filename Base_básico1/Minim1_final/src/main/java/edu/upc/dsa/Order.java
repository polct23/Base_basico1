package edu.upc.dsa;

import edu.upc.dsa.PedidosProductos;

import java.util.ArrayList;


public class Order {

    ArrayList<PedidosProductos> ListaPedidos;
    String user;

    public Order(String user) {
        ListaPedidos = new ArrayList<>();
        this.user = user;
    }

    public ArrayList<PedidosProductos> getListaPedidos() {
        return ListaPedidos;
    }

    public void setListaPedidos(ArrayList<PedidosProductos> listaPedidos) {
        this.ListaPedidos = listaPedidos;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void addLP(int n, String p) {
        PedidosProductos j = new PedidosProductos(n, p);
        ListaPedidos.add(j);
    }
    public Order(){
    }
}
