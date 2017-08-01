package clases;
/**
 *
 * @author qwerty-shoni
 */
import java.io.Serializable;

public class Evento implements Serializable{
    String descripcion,fecha_inicio,premio,nombre,reglas,categoria;
    float precio;
    int id,cupo_participante;
   

    public Evento(){
    
}
    public Evento(String nombre, String descripcion, String fecha_inicio, String premio, String reglas, String categoria, float precio, int cupo_participante) {
        this.nombre = nombre;
        this.descripcion=descripcion;
        this.fecha_inicio=fecha_inicio;
        this.categoria=categoria;
        this.cupo_participante=cupo_participante;
        this.precio=precio;
        this.premio=premio;
        this.reglas=reglas;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }

    public String getReglas() {
        return reglas;
    }

    public void setReglas(String reglas) {
        this.reglas = reglas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCupo_participante() {
        return cupo_participante;
    }

    public void setCupo_participante(int cupo_participante) {
        this.cupo_participante = cupo_participante;
    }

}
    
    
    
    

