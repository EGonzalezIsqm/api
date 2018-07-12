package com.prueba.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Document(collection = "materiales")
public class Materiales {

    @Id
    Integer id;
    String nombre;
    String descripcion;
    String tipo;
    Integer serial;
    Integer numeroInventario;
    String peso;
    String alto;
    String ancho;
    String largo;
    Integer valorCompra;
    Date fechaCompra;
    Date fechaBaja;
    String estadoActual;
    String color;

    public Materiales() {
    }

    public Materiales(Integer id, String nombre, String descripcion, String tipo, Integer serial, Integer numeroInventario, String peso, String alto, String ancho, String largo, Integer valorCompra, Date fechaCompra, Date fechaBaja, String estadoActual, String color) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.serial = serial;
        this.numeroInventario = numeroInventario;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.valorCompra = valorCompra;
        this.fechaCompra = fechaCompra;
        this.fechaBaja = fechaBaja;
        this.estadoActual = estadoActual;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    public Integer getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(Integer numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public Integer getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(Integer valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
