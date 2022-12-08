package it.cefi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Applicazione extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JTextArea area1;
	private JTextField field1;
	private JButton bottone;
	private JButton parolaChiaveButton;

	private List<String> parole = new ArrayList<>();
	private List<String> anagrammi = new ArrayList<>();

	private String parolaUtente = new String();

	private JButton bottone2;

	private boolean controllo(String stringa, String parolaUtente) {

		
		char [] s1 = stringa.toCharArray();
		char [] s2 = parolaUtente.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);

		
		String final1 = new String(s1);
		String final2 = new String(s2);
		
		
		if(final1.equals(final2)) {
			return true;
		}else {
			return false;
		}
		
	
	}
	
	
	
	private boolean isString(String str) {
	
		char[] chars = str.toCharArray();
	
		      for(char c : chars){
		         if(Character.isDigit(c)){
		            return false;
		         }
		      }
			
			
			return true;
		}
		
	
		
	

	public Applicazione() {

		super("Anagramma");

		panel1 = new JPanel();
		label1 = new JLabel("Parola Chiave");
		label2 = new JLabel("Parole");

		parolaChiaveButton = new JButton("INSERISCI PAROLA");

		area1 = new JTextArea(10, 16);

		field1 = new JTextField(32);
		bottone2 = new JButton("Aggiungi");
		bottone = new JButton("Controlla");

		add(panel1);
		panel1.add(label1);
		panel1.add(field1);
		panel1.add(parolaChiaveButton);
		panel1.add(label2);
		panel1.add(area1);

		panel1.add(bottone);
		panel1.add(bottone2);
		
		bottone2.setEnabled(false);
		bottone.setEnabled(false);
		area1.setEnabled(false);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setSize(500, 250);
		setLocationRelativeTo(null);

	

		parolaChiaveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String parola = field1.getText();

				if (parola != null && !parola.isBlank() && isString(parola)) {

					parola = parola.toLowerCase();
					parolaUtente = parola;
					
					JOptionPane.showMessageDialog(null,
							"parola inserita correttamente", "OK",
							JOptionPane.INFORMATION_MESSAGE);
					
					bottone2.setEnabled(true);
					bottone.setEnabled(true);
					area1.setEnabled(true);

				}

			}
		});
	
		bottone2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String listaParole = area1.getText();
				String[] split = listaParole.split("\n");

				for (int i = 0; i < split.length; i++) {

					parole.add(split[i]);
				}

		

			}

		});

		
		bottone.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				for(String s : parole) {
					
					if(controllo(s, parolaUtente)) {
						
						anagrammi.add(s);
					}
					
				}
				if(anagrammi != null) {
					JOptionPane.showMessageDialog(Applicazione.this,
							anagrammi.stream().map(s -> String.valueOf(s)).collect(Collectors.joining("\n")), "anagrammi",
							JOptionPane.INFORMATION_MESSAGE);
				}

			}

		});

	}



//				Pattern regex = Pattern.compile("[a-z]+");

//				Matcher regexMatcher = regex.matcher(input);

//				if (regexMatcher.matches() || input.equals("\n"))



	public static void main(String[] args) {

		new Applicazione();

	}

}