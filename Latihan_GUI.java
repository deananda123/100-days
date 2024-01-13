package tugasddp;
import javax.swing.*;
public class Latihan_GUI {
    public static void main(String[] args) {
        JFrame jf = new JFrame("BIODATA");
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        
        JPanel jp = new JPanel();
        JLabel jl = new JLabel("NAMA");
        JLabel jm = new JLabel("NIM");
        JLabel jn = new JLabel("KELAS");
        
        
        JTextField jtf = new JTextField(15);
        JTextField jtt = new JTextField(15);
        JTextField jft = new JTextField(15);
        JButton jb = new JButton("SUBMIT");
        
        jb.addActionListener(e ->{
            String text = jtf.getText();
            String text2 = jtt.getText();
            String text3 = jft.getText();
            JOptionPane.showMessageDialog(jf," Nama  :  " + text + "\n NIM     : " + text2 + "\n Kelas  : " + text3);

        });
        jp.add(jl);
        jp.add(jtf);
        jp.add(jm);
        jp.add(jtt);
        jp.add(jn);
        jp.add(jft);
        jp.add(jb);

        
        jf.getContentPane().add(jp);
        jf.setVisible(true);
    }
}
