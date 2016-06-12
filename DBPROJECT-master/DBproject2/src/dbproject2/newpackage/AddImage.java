/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject2.newpackage;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author ShellyCheng
 */
public class AddImage extends JFrame{
AddImage()
{
ImageIcon icon = new ImageIcon("/Users/ShellyCheng/Downloads/DBPROJECT-master/DBproject2/src/dbproject2/Joline.png");
JLabel label = new JLabel(icon);
setLayout (new FlowLayout());
add(label);
setSize(500,400);
setLocation(200,200);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);

    
}
public static void main(String args[]){
new AddImage();
}
}