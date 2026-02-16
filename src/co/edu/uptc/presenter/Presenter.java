package co.edu.uptc.presenter;

import co.edu.uptc.view.IOManager;

/*Author: Paula Andrea Betancourt Matamoros
 * Date: 
 * Description: 
 */
public class Presenter {
    private IOManager io; 

    public String saludar(){
        String saludo = "Hola mundo"; 
        return saludo; 
    }

    public void init() {
        io.showMessage(saludar());
    }
}
