package exemplo03_JtextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
		//Título
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10, 10, 150, 20);
		
		//JtextField
		JTextField campo = new JTextField();
		campo.setBounds(120, 10, 150, 20);
		
		//Adicionar elementos ao JFrame
		formulario.add(rotulo);
		formulario.add(campo);
		
		//Exibir o formulário
		formulario.setVisible(true);
		
	}

}
