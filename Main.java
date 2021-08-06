
package brickbreaker;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main  {
    
    public static void main(String args[])
    {
         JFrame mf = new JFrame();
         PlayGame gameplay = new PlayGame();
         mf.setBounds(10, 10, 700, 600);
         mf.setTitle("Break Out Ball");
          mf.setIconImage(new ImageIcon("Images/ball_pic.png").getImage());
         mf.setResizable(false);
         mf.setVisible(true);
        
         mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         mf.add(gameplay);
    }
    
}
