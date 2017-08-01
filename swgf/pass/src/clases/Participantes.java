package clases;
/**
 *
 * @author qwerty-shoni
 */
import java.io.Serializable;

public class Participantes implements Serializable{
    String nombre,cedula;
    int id;

    public Participantes(){
    
}
    public Participantes(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula=cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
    
    
    
    

