
public class Persona {
  
  private String nombre;
  private String apellidos;
  private int edad;

  public Persona(String nombre, String apellidos, int edad) {
    this.nombre= nombre; 
    this.apellidos = apellidos;
    this.edad = edad;
  }
  
  public void cumpleanios() {
    System.out.println(edad++);
  }
  
}
