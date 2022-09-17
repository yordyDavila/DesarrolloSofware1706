public class Persona{
    public String nombre;
    public String apellido;
    public int edad;
    public int telefono;
    public void saludar(){
        System.out.println("Hola me llamo " + this.nombre);
    }
    public void despedirse(){
        System.out.println("Me voy. Adios");
    }
  
    Persona( String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
   
}