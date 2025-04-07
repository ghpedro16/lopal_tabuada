package br.sp.senai.jandira.calculadora_tabuada.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.sp.senai.jandira.calculadora_tabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel lblMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinMultiplicador;
	private JTextField txtMinMultiplicador;
	private JLabel lblMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];
	
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(265, 550);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Calculadora de Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		// Criar um label para inserir no JFrame
		// Multiplicando
		lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 150, 30);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 30);
		
		// Minimo Multiplicador
		lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Mín. Multiplicador:");
		lblMinMultiplicador.setBounds(20, 50, 150, 30);
		
		txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(180, 50, 50, 30);
		
		// Maximo Multiplicador
		lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx. Multiplicador:");
		lblMaxMultiplicador.setBounds(20, 90, 150, 30);
		
	    txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(180, 90, 50, 30);
		
		// Botão calcular
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 140, 100, 30);
		
		// Botão limpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 140, 100, 30);
		
		// Lista pra exibir tabuada
		listTabuada = new JList(resultado);
		listTabuada.setBounds(20, 190, 210, 300);
		
		// Adicionar componentes na tela
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(lblMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(lblMaxMultiplicador);
		tela.getContentPane().add(txtMaxMultiplicador);
		
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(listTabuada);
		
		
		// Configurar os ouvintes (listeners) dos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = txtMultiplicando.getText();
				String minMultiplicador = txtMinMultiplicador.getText();
				String maxMultiplicador = txtMaxMultiplicador.getText();
				
				// Casting -> conversão de um tipo para outro
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minMultiplicadorDouble = Double.parseDouble(minMultiplicador);
				double maxMultiplicadorDouble = Double.parseDouble(maxMultiplicador);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();
				
			
			}
		});
		
		
		// Tornar a tela visível
		tela.setVisible(true);
		
	}

}
