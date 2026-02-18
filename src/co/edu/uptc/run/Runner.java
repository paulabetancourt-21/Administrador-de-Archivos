package co.edu.uptc.run;
/*Author: Paula Andrea Betancourt Matamoros y Jhosep Pizarro Avila
 * Date: 
 * Description: 
 */
//import co.edu.uptc.presenter.Presenter;

import java.io.File;
import java.util.Scanner;

import co.edu.uptc.presenter.Presenter;


public class Runner {
    public static void main(String[] args) {
        Presenter object = new Presenter(); 
        object.init();
//         //PARAMETRO DEL MAIN
//         if(args.length == 0){
//             System.out.println("Debe enviar una ruta al ejecutar el programa");
//             return;
//         }

//         String ruta = args[0];
//         System.out.println("Ruta recibida: " + ruta);
//         //LA CARPETA EXISTE? 
//         File route = new File(args[0]); 
//         System.out.println("¿la ruta o carpeta existe? " + route.exists());
//         System.out.println("¿Es un directorio? " + route.isDirectory());
        
// //______________________________________________________________________
//         //LISTAR EL CONTENIDO DE LA CARPETA
//         System.out.println("\nContenido de la carpeta:\n");
//         File[] listFiles = route.listFiles();
//         if(listFiles != null){
//             for(File f : listFiles){
//                 if(f.isDirectory()){
//                     System.out.println("[CARPETA] " + f.getName());
//                 }else{
//                     System.out.println("[ARCHIVO] " + f.getName() + " - " + f.length() + " bytes");
//                 }
//             }
//         }

//         //TAMAÑO DE LA CARPETA
//         long total = 0;
//         for (int i = 0; i < listFiles.length; i++) {
//             if (listFiles[i].isFile()) {
//                 total += listFiles[i].length();
//                 System.out.println("Total de archivos sueltos: " + total);
//             }else{
//                 if (listFiles[i].isDirectory()) {
//                     File[] subFiles = listFiles[i].listFiles(); 
//                     for (int j = 0; j < subFiles.length; j++) {
//                         total+= subFiles[j].length(); 
//                         System.out.println("Total de carpetas con archivos dentro " + total);
//                     }
//                 }
//             }
//         }
//         System.out.println("Total: " + total + "bytes");
//     }
    }
}

