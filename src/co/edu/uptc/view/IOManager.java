package co.edu.uptc.view; 
/*Author: Paula Andrea Betancourt Matamoros
 * Date: 
 * Description: 
 */
import java.util.Scanner; 

public class IOManager {
    private Scanner console; 

    public IOManager(){
        console = new Scanner(System.in); 
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public String readData(String message){
        String data = console.nextLine(); 
        return data;
    }
}
