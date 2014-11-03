package controller;

import java.io.Serializable;
import model.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "productoManagedBean")
@SessionScoped
public class ProductoManagedBean implements Serializable {

    private Producto producto;
    private List<Producto> productos;
    
    public ProductoManagedBean() {
        
    }

    @PostConstruct
    public void init() {
        producto = new Producto();
        productos = new ArrayList<>();             
    }
    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProductos() {        
        this.productos.add(this.producto);
    }
}
