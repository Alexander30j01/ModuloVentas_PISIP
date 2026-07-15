package com.uisrael.pisip.dominio.entidades;

public class Usuarios {

    private int idUsuario;
    private String nombre;
    private String apellido;
    private String rol;
    private String correoUsuario;

    // Nuevos atributos
    private String contrasena;
    private String region;
    private boolean activo;
    private boolean sesionActiva;
    private int numeroVisitas;

    public Usuarios(int idUsuario, String nombre, String apellido, String rol,
            String correoUsuario, String contrasena, String region,
            boolean activo, boolean sesionActiva, int numeroVisitas) {

        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.correoUsuario = correoUsuario;
        this.contrasena = contrasena;
        this.region = region;
        this.activo = activo;
        this.sesionActiva = sesionActiva;
        this.numeroVisitas = numeroVisitas;
    }

    public Usuarios() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isSesionActiva() {
        return sesionActiva;
    }

    public void setSesionActiva(boolean sesionActiva) {
        this.sesionActiva = sesionActiva;
    }

    public int getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(int numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }
    
    public void iniciarSesion() {
        this.sesionActiva = true;
    }
    
    public void cerrarSesion() {
        this.sesionActiva = false;
    }
    
    public void actualizarPerfil(String nombre, String apellido, String correoUsuario) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.correoUsuario = correoUsuario;

    }
    
    public void cambiarContrasena(String nuevaContrasena) {
        this.contrasena = nuevaContrasena;
    }
    public void asignarRol(String rol) {
        this.rol = rol;
    }
    
    public void asignarRegion(String region) {
        this.region = region;
    }
    
    public void activar() {
        this.activo = true;
    }
    
    public void desactivar() {
        this.activo = false;
    }
    
    public void generarReporteVisitas() {
        this.numeroVisitas++;
    }
    
    


}