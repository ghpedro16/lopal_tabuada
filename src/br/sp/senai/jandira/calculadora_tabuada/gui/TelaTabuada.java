package br.sp.senai.jandira.calculadora_tabuada.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {

	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Calculadora de Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		// Criar um label para inserir no JFrame
		// Multiplicando
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 150, 30);
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);
		
		// Minimo Multiplicador
		JLabel lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Mín. Multiplicador:");
		lblMinMultiplicador.setBounds(20, 50, 150, 30);
		
		JTextField txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(180, 50, 50, 30);
		
		// Maximo Multiplicador
		JLabel lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx. Multiplicador:");
		lblMaxMultiplicador.setBounds(20, 90, 150, 30);
		
		JTextField txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(180, 90, 50, 30);
		
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(lblMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador);
		
		
		tela.getContentPane().add(buttonCalcular);
		
		
		tela.setVisible(true);
		
	}

}
