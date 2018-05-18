package exemplo06_JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		formulario.setTitle("Utilizando JRadioButton");
		formulario.setLayout(null);
		
		//JCheckBox
		JCheckBox cbxMasculino = new JCheckBox("Masculino");
		cbxMasculino.setBounds(10, 10, 100, 20);
		
		JCheckBox cbxFeminino = new JCheckBox("Feminíno");
		cbxFeminino.setBounds(110, 10, 100, 20);
		
		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if((cbxMasculino.isSelected()) && (cbxFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				}else if(cbxMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Masculíno selecionado");
				}else if(cbxFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Feminíno selecionado");
				}else{
					JOptionPane.showMessageDialog(null, "Nenhum selecionado");
				}
				
			}
		});
		
		//Adicionar componentes ao JFrame
		formulario.add(cbxMasculino);
		formulario.add(cbxFeminino);
		formulario.add(botao);
		
		//Exibir toda a estrutura
		formulario.setVisible(true);
		
	}

}
