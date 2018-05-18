package exemplo07_JRadioButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

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
		formulario.setTitle("Utilizando JRadioButton");
		formulario.setLayout(null);
				
		//JCheckBox
		JRadioButton rbtMasculino = new JRadioButton("Masculíno");
		rbtMasculino.setBounds(10, 10, 100, 20);
				
		JRadioButton rbtFeminino = new JRadioButton("Feniníno");
		rbtFeminino.setBounds(110, 10, 100, 20);
				
		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);
				
		//Ação
		botao.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {

				if((rbtMasculino.isSelected()) && (rbtFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				}else if(rbtMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculíno selecionado");
				}else if(rbtFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminíno selecionado");
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum selecionado");
				}
						
				}
			});
				
		//Adicionar componentes ao JFrame
		formulario.add(rbtMasculino);
		formulario.add(rbtFeminino);
		formulario.add(botao);
				
		//Exibir toda a estrutura
		formulario.repaint();
		formulario.setVisible(true);
		
	}

}
