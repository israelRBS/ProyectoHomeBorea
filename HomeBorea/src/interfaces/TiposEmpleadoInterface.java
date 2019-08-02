package interfaces;

import Modelo.TiposEmpleado;
import java.util.ArrayList;

public interface TiposEmpleadoInterface {
    public TiposEmpleado buscarTipEmpleado(TiposEmpleado tiposEmpleado);
    public ArrayList<TiposEmpleado> listarTipEmpleado();
    public String eliminarTipEmpleado(TiposEmpleado tiposEmpleado);
    public String insertarTipEmpleado(TiposEmpleado tiposEmpleado);
    
}
