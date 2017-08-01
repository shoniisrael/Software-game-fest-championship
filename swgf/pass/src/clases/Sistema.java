package clases;
import java.io.*;
import java.util.*;

public class Sistema {
   Participantes a = new Participantes();
Vector vec=new Vector();
String nombres="";
int cuenta;

public int guardar(String nombre, String cedula,int cont) {
    cuenta=Posicion();
    a=new Participantes(nombre,cedula);   // nuevo objeto que deseo almacenar en el fichero
     File fc=new File("registro.bin");
    FileOutputStream fo=null;
    ObjectOutputStream ob=null;
     FileInputStream fi=null;
     ObjectInputStream obi=null;
    if(fc.exists()){ // en caso de que el fichero exista cargo la informacion en el vector
        System.out.println("Actualizando información del fichero...");
                try{
                    fi=new FileInputStream(fc);
                    obi=new ObjectInputStream(fi);
                    vec=(Vector)obi.readObject();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien***** \n Estamos esperimentando ciertas dificultades técnicas con la lectura de su información");
                }    
        }
    vec.add(a); //añado el objeto al final del vector
        try{
            fo=new FileOutputStream(fc);
            ob=new ObjectOutputStream(fo);
            ob.writeObject(vec);
            
        }catch(Exception ex){
            System.out.println("Existió un problema en el almacenamiento de datos******");
        }finally{
            try{
                if(ob!=null){
                    obi.close();
                     fi.close();
                     ob.close();
                     fo.close();
                     
                }
            }catch(Exception ex2){
                System.out.println("No se pudo cerrar los ficheros correctamente*****");
            }
        }
        return(cont);
    }

public int Posicion() {
        int posicion=0;
                File fc=new File("registro.bin");
                FileInputStream fi;
                ObjectInputStream ob;
                Vector vec=new Vector();
                try{
                    fi=new FileInputStream(fc);
                    ob=new ObjectInputStream(fi);
                    vec=(Vector)ob.readObject();
                    ob.close();
                    fi.close();
                }catch(IOException | ClassNotFoundException ex3){
                    System.out.println("***** al parecer algo no a salido bien, estamos esperimentando ciertas dificultades al asignar un numero de cuenta***");
                   
                }
                Participantes aux=new Participantes();
                for(int i=0;i<vec.size();i++){
                     posicion++;
                }    
                 return (posicion);
    }
}
