/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbproject2;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author jerry
 */
public class Background extends JFrame {

    public Background() {
        setBak(); //調用背景方法
        Container c = getContentPane(); //獲取JFrame面板
        JPanel jp = new JPanel(); //創建個JPanel
        jp.setOpaque(false); //把JPanel設置為透明 這樣就不會遮住後面的背景 這樣你就能在JPanel隨意加元件了
        c.add(jp);
        setSize(540, 450);
        setVisible(true);
    }
    public void setBak(){
        ((JPanel)this.getContentPane()).setOpaque(false);
        ImageIcon img = new ImageIcon("C:\\Users\\jerry\\Desktop\\JOLINE.jpg");
        JLabel background = new JLabel(img);this.getLayeredPane().add(background, new Integer(Integer.MIN_VALUE));
        background.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
    }
}
