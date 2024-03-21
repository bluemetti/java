package teste;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.ScrollPane;

public class Teste extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JButton btnNewButton_1;
	private JPasswordField Senha;
	private JLabel txt_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txt = new JLabel("Login");
		txt.setBounds(83, 48, 46, 14);
		contentPane.add(txt);
		
		txtNome = new JTextField();
		txtNome.setBounds(83, 73, 192, 28);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings({ "unlikely-arg-type", "deprecation" })
			public void actionPerformed(ActionEvent e) {
				String a = new String();	
				Abc d = new Abc();
				if ((txtNome.getText().equals("usuario"))&& (Senha.getText().equals("123"))) {
				d.setVisible(true);
				}
			}
		});
		btnNewButton.setBounds(91, 189, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBounds(203, 189, 89, 23);
		contentPane.add(btnNewButton_1);
		
		Senha = new JPasswordField();
		Senha.setBounds(83, 139, 192, 28);
		contentPane.add(Senha);
		
		txt_1 = new JLabel("Senha");
		txt_1.setBounds(83, 114, 46, 14);
		contentPane.add(txt_1);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(412, 0, 22, 251);
		contentPane.add(scrollPane);
	}
}
