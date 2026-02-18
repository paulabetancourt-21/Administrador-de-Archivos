package co.edu.uptc.model;

import java.io.File;

public class FileManager {
    private File sourceFolder; 

    //carpeta raiz
    public FileManager(String route){
        sourceFolder = new File(route); 
    }

    //existe esta carpeta? 
    public boolean isValid(){
        return sourceFolder.exists(); 
    }
    //Es un directorio? 
    public boolean isDirectory(){
        return sourceFolder.isDirectory(); 
    }
    
    //Contenido de la carpeta 
    public String content(){
        String files = ""; 
        File[] listFiles = sourceFolder.listFiles(); 
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    files += "[CARPETA] " + listFiles[i].getName() + "\n"; 
                }else{
                    files += "[ARCHIVO] " + listFiles[i].getName() + " - " + listFiles[i].length()+ " bytes " +"\n"; 
                }
            }
        }
        return files; 
    }

}
