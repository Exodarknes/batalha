package sistemabattle;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.*;
import java.awt.*;
import javax.swing.*;


public class SistemaBattle extends JFrame  {

    public static void main(String[] args) {

        Guerreiro g = new Guerreiro();
        g.setNome("Guerreiro");
        
        Mago m = new Mago();
        m.setNome("Maguin");
        
        Fight f = new Fight();
        f.lutar(m, g);
         
      
    }
    
}
