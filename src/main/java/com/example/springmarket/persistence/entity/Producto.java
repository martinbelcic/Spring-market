package com.example.springmarket.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;

    public Integer getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
