
package computadora;
import java.util.*;


public class Computadora {

   
    private String nombre;
    private String tipo;
    private String contenido;
    private Date fechaDeCreacion;
    
    public Computadora(){}
    
    public Computadora( String nombre, int año, int mes, int dia ){
        this.nombre = nombre;
        GregorianCalendar calendario = new GregorianCalendar(año,mes-1,dia);
        this.fechaDeCreacion = calendario.getTime();
        
    }
    
    //Setter y Getter (s) 
    public void setNombre(String nombre){
        this.nombre = nombre;
        
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
  
    public void setfechaCreacion(int año, int mes, int dia){
        GregorianCalendar calendario = new GregorianCalendar(año,mes-1,dia);
        this.fechaDeCreacion = calendario.getTime();
    }
    
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    
    public String getNombre(){
        return this.nombre;
        
    }
       
    public String getTipo(){
        return this.tipo;
    }
    
    public Date getFechaCreacion(){
       return this.fechaDeCreacion;    
    } 
    
    
    public String getContenido(){
        return this.contenido;
    }
    
    public static void main(String[] args) {
        // TODO ejercicio1
        Computadora ordenador = new Computadora("Pc",1997,01,04 );
      
        Computadora ordenador1 = new Computadora();
        Computadora ordenador2 = new Computadora();
        Computadora ordenador3 = new Computadora();
        
        ordenador1.setNombre("PC1");
        ordenador2.setNombre("PC2");
        ordenador3.setNombre("PC3");
        
        System.out.println("Nombre: " + ordenador1.getNombre());
        System.out.println("Nombre: "+ ordenador2.getNombre());
        System.out.println("Nombre: "+ ordenador3.getNombre());
        
        ordenador1.setTipo("Portatil");
        ordenador2.setTipo("Server");
        ordenador3.setTipo("Escritorio");
        
         System.out.println("PC1: "+ ordenador1.getTipo());
         System.out.println("PC2: "+ ordenador2.getTipo());
         System.out.println("PC3: "+ ordenador3.getTipo());
        
        ordenador1.setfechaCreacion(1998, 01, 01);
        ordenador2.setfechaCreacion(1999, 02, 13);
        ordenador3.setfechaCreacion(2000, 12, 04);
        
        System.out.println("PC1, creada: "+ ordenador1.getFechaCreacion());
        System.out.println("PC2, creada: "+ ordenador2.getFechaCreacion());
        System.out.println("PC3, creada: "+ ordenador3.getFechaCreacion());
        
       
    }
    
}
