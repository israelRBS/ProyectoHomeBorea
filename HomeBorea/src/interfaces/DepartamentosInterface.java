package interfaces;

import Modelo.Departamentos;
import java.util.ArrayList;

public interface DepartamentosInterface {
    public Departamentos buscarDepartamentos(Departamentos departamentos);
    public ArrayList<Departamentos> listarDepartamentos();
    public String eliminarDepartamentos(Departamentos departamentos);
    public String agregarDepartamentos(Departamentos departamentos);
    
}
