package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.JFrmPrincipal;
import vistas.VistaCategorias;

/**
 *
 * @author javam2019
 */
public class PrincipalControlador implements ActionListener{
    VistaCategorias frmcategorias=new VistaCategorias();
    JFrmPrincipal principal=new JFrmPrincipal();

    public PrincipalControlador(JFrmPrincipal principal) {
        this.principal= principal;
        principal.cutMenuCategorias.addActionListener(this);
        
    }

    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.principal.cutMenuCategorias) {
            
            principal.add(frmcategorias);
            frmcategorias.setVisible(true);
        }
    }
    
    
}
