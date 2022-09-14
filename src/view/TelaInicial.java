import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TelaInicial extends JFrame implements ActionListener{
    private JButton B1,B2, B3, B4, B5;
    private JLabel L1, L2;
    private JTextField T1,T2;

    public TelaInicial(){

        B1 = new JButton("Dados Pessoais");
        B1.setBackground(Color.cyan);   

        B2 = new JButton("Consultas");
        B2.setBackground(Color.cyan);   

        B3 = new JButton("Exames");
        B3.setBackground(Color.cyan);

        B4 = new JButton("Notificaçao");
        B4.setBackground(Color.cyan);  

        B5 = new JButton("Contatos Médicos");
        B5.setBackground(Color.cyan); 
  

        B1.addActionListener(this);
        B2.addActionListener(this);
        B3.addActionListener(this);
        B4.addActionListener(this);
        B5.addActionListener(this);

        L1 = new JLabel("Tela Inicial");
        L1.setFont(new Font("SansSerif", Font.BOLD, 20));

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(L1);
        this.getContentPane().add(B1);
        this.getContentPane().add(B2);
        this.getContentPane().add(B3);
        this.getContentPane().add(B4);
        this.getContentPane().add(B5);
        this.setLocation(200,200);
        this.setSize(230,400);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == B1){
           new DadosPessoais();
        }
        if (e.getSource() == B2){}
        if (e.getSource() == B3){}
        if (e.getSource() == B4){}
    }

    public static void main(String args[]){

        JFrame janela = new TelaInicial();
        janela.show();
        WindowListener x = new WindowAdapter (){

            public void windowClosing(WindowEvent e){
                System.exit(0);
            }

        };

        janela.addWindowListener(x);
    }
}
