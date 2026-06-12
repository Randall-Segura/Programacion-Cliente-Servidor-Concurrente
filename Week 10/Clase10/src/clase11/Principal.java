package clase11;

import clase11.Vista.frmMenu;

//orden: Principal, Articulo, ConectarBD, DatosArticulo, frmArticulo, frmConsulta, frmMenu
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        frmMenu m = new frmMenu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
       
    }

}
