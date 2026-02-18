package co.edu.uptc.presenter;

import co.edu.uptc.model.FileManager;
import co.edu.uptc.view.IOManager;

/*Author: Paula Andrea Betancourt Matamoros y Jhosep Pizarro Avila
 * Date: 
 * Description: 
 */
public class Presenter {
    private IOManager io; 
    private FileManager fileManager; 

    public Presenter(){
        io = new IOManager(); 
    }

    public void pedirRuta(){
        String ruta = io.readData("Ingresa la ruta del directorio: "); 
        fileManager = new FileManager(ruta); 
    }

    public boolean existe(){
        boolean isExists = fileManager.isValid();
        return isExists; 
    }

    public boolean esCarpeta(){
        boolean carpeta = fileManager.isDirectory(); 
        return carpeta; 
    }

    public String contenido(){
        String list = fileManager.content(); 
        return list; 
    }
    
    public void menu(){
        int opcion = 0;
        do {
            String menu =
                    "\n1. Validar ruta" +
                    "\n2. Mostrar contenido" +
                    "\n3. Salir";
            opcion = Integer.parseInt(io.readData(menu + "\nIngrese una opción: "));
            switch (opcion) {
                case 1:
                    if(existe() && esCarpeta()){
                        io.showMessage("La ruta es válida y es una carpeta");
                    }else{
                        io.showMessage("Ruta inválida");
                    }
                    break;
                case 2:
                    io.showMessage(contenido());
                    break;
                case 3:
                    io.showMessage("Saliendo...");
                    break;
                default:
                    io.showMessage("Opción incorrecta");
            }
        } while(opcion != 3);
    }


    public void init() {
        pedirRuta();
        menu(); 
    }
}
