package interfaces;

import Modelo.TiposCosto;
import java.util.ArrayList;

public interface TiposCostoInterface {
    public TiposCosto buscarTipCosto(TiposCosto tiposCosto);
    public ArrayList<TiposCosto> listarTipCosto();
    public String eliminarTipCosto(TiposCosto tiposCosto);
    public String insertarTipCosto(TiposCosto tiposCosto);
    
}
