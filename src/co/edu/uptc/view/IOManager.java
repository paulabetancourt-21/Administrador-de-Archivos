package co.edu.uptc.view; 
/*Author: Paula Andrea Betancourt Matamoros
 * Date: 
 * Description: 
 */
import javax.swing.JOptionPane;

public class IOManager {
    public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }

    public String readData(String message){
        String data = JOptionPane.showInputDialog(message);
        return data;
    }
}
