package exemplo04_JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		//Intanciar JFrame
		JFrame formulario = new JFrame();
		//Tornar visivel
		formulario.setVisible(true);
		//Finalizar quando fechar
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Tamanho
		formulario.setSize(500, 300);
		//Centralizar
		formulario.setLocationRelativeTo(null);
		//T�tulo
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10, 10, 150, 20);
				
		//JtextField
		JTextField campo = new JTextField();
		campo.setBounds(120, 10, 150, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setText("Clique aqui");
		botao.setBounds(60, 50, 150, 20);
		
		//Adicionar uma a��o ao bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Exibir nome
				JOptionPane.showMessageDialog(null, "Ol� "+campo.getText());
				
				//Limpar o campo contendo o nome
				campo.setText("");
				
				//Selecionar o campo nome
				campo.requestFocus();
				
			}
		});
				
		//Adicionar elementos ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		formulario.add(botao);
				
		//Exibir o formul�rio
		formulario.setVisible(true);
	}

}
