package co.edu.uptc.run;
/*Author: Paula Andrea Betancourt Matamoros y Jhosep Pizarro Avila
 * Date: 
 * Description: 
 */
//import co.edu.uptc.presenter.Presenter;

public class Runner {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Debe enviar una ruta al ejecutar el programa");
            return;
        }

        String ruta = args[0];
        System.out.println("Ruta recibida: " + ruta);
        //Presenter object = new Presenter(); 
        //object.init();
    }
}
