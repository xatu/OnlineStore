/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

/**
 *
 * @author cpd
 */
@ManagedBean
@RequestScoped
public class AgregarManagedBean {

    private Producto producto;
    private List<Producto> productos;

    /**
     * Creates a new instance of AgregarManagedBean
     */
    public AgregarManagedBean() {
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
    
    public void addImagen(FileUploadEvent event){
        UploadedFile imagen = event.getFile();
        this.producto.setImagen((File) imagen);
    }
}
