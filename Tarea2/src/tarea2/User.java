package tarea2;

/**
 *
 * @author Andrea
 */
public class User {
    private int Contraseña;
    private String Nombre;
    
    public User(int Contraseña, String Nombre){
        this.Contraseña = Contraseña;
        this.Nombre = Nombre;
    }

    /**
     * @return the Contraseña
     */
    public int getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(int Contraseña) {
        this.Contraseña = Contraseña;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

}
