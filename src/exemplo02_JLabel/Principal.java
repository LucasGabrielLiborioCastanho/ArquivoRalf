package exemplo02_JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

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
				
		//Instanciar JLabel
		JLabel rotulo = new JLabel();
		rotulo.setText("Fala compadre");
		rotulo.setBounds(1, 1, 300, 20);
		
		//Adicionar componente ao JFrame
		formulario.add(rotulo);
		
	}

}