package view;

import java.awt.*;  
import javax.swing.*;

public class DadosPessoais{

    DadosPessoais(){  

        JFrame f= new JFrame("Dados Pessoais");    
        JPanel panel=new JPanel();  

        panel.setBounds(100,80,250,250);    
        JLabel l = new JLabel("<html>Dados Pessoais</html>");
        l.setFont(new Font("SansSerif", Font.BOLD, 15));


        panel.add(l);

        f.add(panel);  
                f.setSize(500,500);    
                f.setLayout(null);    
                f.setVisible(true);    
        } 
    }
      
