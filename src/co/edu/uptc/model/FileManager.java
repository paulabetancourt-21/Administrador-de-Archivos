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
        return sourceFolder.exists() && sourceFolder.isDirectory(); 
    }
    
    public File[] content(String nombreSubDirectorio){
        File[] listFiles; 
        File dir = new File(sourceFolder, nombreSubDirectorio); 
        if (dir.exists() && dir.isDirectory()) {
            listFiles = dir.listFiles(); 
        }else {
            listFiles = null; 
        }
        return listFiles; 
    }

}
