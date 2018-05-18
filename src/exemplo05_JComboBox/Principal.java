package exemplo05_JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
		formulario.setTitle("Utilizando JComboBOx");
		formulario.setLayout(null);
				
		//JComboBoz
		JComboBox<String> combo = new JComboBox();
		combo.setBounds(10, 10, 270, 30);
		combo.addItem("Item 01");
		combo.addItem("Item 02");
		combo.addItem("Item 03");
		
		//Ação no combo
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
		});
		
		//Adicionar ao JFrame
		formulario.add(combo);
		
		//Exibir os componentes
		formulario.setVisible(true);
		
	}

}