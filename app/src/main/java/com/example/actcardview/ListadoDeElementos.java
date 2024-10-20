package com.example.actcardview;

public class ListadoDeElementos {
    private String nombre;
    private String ciudad;
    private String descripcion;
    private int imageResId;
    private String direccion;
    private String telefono;
    private String sitioWeb;

    // Constructor
    public ListadoDeElementos(String nombre, String ciudad, String descripcion, int imageResId,
                              String direccion, String telefono, String sitioWeb) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.imageResId = imageResId;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sitioWeb = sitioWeb;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public String getDescripcion() { return descripcion; }
    public int getImageResId() { return imageResId; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getSitioWeb() { return sitioWeb; }
}