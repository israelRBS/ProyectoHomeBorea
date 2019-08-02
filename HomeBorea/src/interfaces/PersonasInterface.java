package interfaces;

import Modelo.Personas;
import java.util.ArrayList;

public interface PersonasInterface {
    public Personas buscarPersonas(Personas personas);
    public ArrayList<Personas> listarPersonas();
    public String eliminarPersonas(Personas personas);
    public String insertarPersonas(Personas personas);
    
}
