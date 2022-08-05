package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JEditorPane;

public class Calculadora_GUI {

	private JFrame frmCalculadora;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_GUI window = new Calculadora_GUI();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora_GUI() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setResizable(false);
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBackground(SystemColor.window);
		frmCalculadora.getContentPane().setBackground(SystemColor.controlHighlight);
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora_GUI.class.getResource("/imgs/indice.png")));
		frmCalculadora.setBounds(100, 100, 279, 463);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btn_B = new JButton("\u2190");
		btn_B.setBackground(SystemColor.scrollbar);
		btn_B.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btn_B.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				StringBuffer BufferTextField = new StringBuffer(textField.getText());
				if(BufferTextField.length()>0)
				{
					BufferTextField.deleteCharAt(BufferTextField.length()-1);
				}
				textField.setText(BufferTextField.toString());
			}
		});
		btn_B.setBounds(10, 101, 52, 44);
		frmCalculadora.getContentPane().add(btn_B);
		btn_B.setFocusable(false);
		
		JButton btn_7 = new JButton("7");
		btn_7.setBackground(SystemColor.scrollbar);
		btn_7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String number=textField.getText()+btn_7.getText();
				textField.setText(number);
			}
		});
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 11, 242, 64);
		frmCalculadora.getContentPane().add(textField);
		textField.setColumns(10);
		btn_7.setBounds(10, 156, 52, 44);
		frmCalculadora.getContentPane().add(btn_7);
		btn_7.setFocusable(false);
		
		JButton btn_4 = new JButton("4");
		btn_4.setBackground(SystemColor.scrollbar);
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_4.getText();
				textField.setText(number);
			}
		});
		btn_4.setBounds(10, 211, 52, 44);
		frmCalculadora.getContentPane().add(btn_4);
		btn_4.setFocusable(false);
		
		JButton btn_1 = new JButton("1");
		btn_1.setBackground(SystemColor.scrollbar);
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setBounds(10, 266, 52, 44);
		frmCalculadora.getContentPane().add(btn_1);
		btn_1.setFocusable(false);
		
		JButton btn_8 = new JButton("8");
		btn_8.setBackground(SystemColor.scrollbar);
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_8.getText();
				textField.setText(number);
			}
		});
		btn_8.setBounds(72, 156, 52, 44);
		frmCalculadora.getContentPane().add(btn_8);
		btn_8.setFocusable(false);
		
		JButton btn_5 = new JButton("5");
		btn_5.setBackground(SystemColor.scrollbar);
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_5.getText();
				textField.setText(number);
			}
		});
		btn_5.setBounds(72, 211, 52, 44);
		frmCalculadora.getContentPane().add(btn_5);
		btn_5.setFocusable(false);
		
		JButton btn_2 = new JButton("2");
		btn_2.setBackground(SystemColor.scrollbar);
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_2.getText();
				textField.setText(number);
			}
		});
		btn_2.setBounds(72, 266, 52, 44);
		frmCalculadora.getContentPane().add(btn_2);
		btn_2.setFocusable(false);
		
		JButton btn_00 = new JButton("00");
		btn_00.setBackground(SystemColor.scrollbar);
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_00.getText();
				textField.setText(number);
			}
		});
		btn_00.setBounds(134, 101, 52, 44);
		frmCalculadora.getContentPane().add(btn_00);
		btn_00.setFocusable(false);
		
		JButton btn_9 = new JButton("9");
		btn_9.setBackground(SystemColor.scrollbar);
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_9.getText();
				textField.setText(number);
			}
		});
		btn_9.setBounds(134, 156, 52, 44);
		frmCalculadora.getContentPane().add(btn_9);
		btn_9.setFocusable(false);
		
		JButton btn_6 = new JButton("6");
		btn_6.setBackground(SystemColor.scrollbar);
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_6.getText();
				textField.setText(number);
			}
		});
		btn_6.setBounds(134, 211, 52, 44);
		frmCalculadora.getContentPane().add(btn_6);
		btn_6.setFocusable(false);
		
		JButton btn_3 = new JButton("3");
		btn_3.setBackground(SystemColor.scrollbar);
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_3.getText();
				textField.setText(number);
			}
		});
		btn_3.setBounds(134, 266, 52, 44);
		frmCalculadora.getContentPane().add(btn_3);
		btn_3.setFocusable(false);
		
		JButton btn_mas = new JButton("+");
		btn_mas.setBackground(SystemColor.scrollbar);
		btn_mas.addActionListener(new ActionListener()
		{
			private boolean isNumeric(String str)
			{ 
				  try
				  {  
				    Double.parseDouble(str);  
				    return true;
				  }
				  catch(NumberFormatException e)
				  {  
				    return false;  
				  }  
			}
			public void actionPerformed(ActionEvent e)
			{
				if(textField.getText().equals(""))
				{
					
				}
				else
				{
					StringBuilder sb = new StringBuilder(textField.getText());
					
					if(this.isNumeric((String) sb.subSequence(sb.length()-1, sb.length())))
					{
							String texto=textField.getText()+btn_mas.getText();
							textField.setText(texto);
					}
					else
					{
						if(sb.subSequence(sb.length()-1, sb.length()).equals("-") && sb.length()<2)
						{
							
						}
						else
						{
							String texto=sb.subSequence(0, sb.length()-1)+btn_mas.getText();
							textField.setText(texto);
							
							if(sb.subSequence(sb.length()-1, sb.length()).equals("-"))
							{
								String texto2=sb.subSequence(0, sb.length()-1).toString();
								textField.setText(texto2);
							}
						}
					}
				}
			}
		});
		btn_mas.setBounds(200, 101, 52, 44);
		frmCalculadora.getContentPane().add(btn_mas);
		btn_mas.setFocusable(false);
		
		JButton btn_menos = new JButton("-");
		btn_menos.setBackground(SystemColor.scrollbar);
		btn_menos.addActionListener(new ActionListener()
		{
			private boolean isNumeric(String str)
			{ 
				  try
				  {  
				    Double.parseDouble(str);  
				    return true;
				  }
				  catch(NumberFormatException e)
				  {  
				    return false;  
				  }  
			}
			public void actionPerformed(ActionEvent e)
			{
				if(textField.getText().equals(""))
				{
					String texto=textField.getText()+btn_menos.getText();
					textField.setText(texto);
				}
				else
				{
					StringBuilder sb = new StringBuilder(textField.getText());
					
					if(this.isNumeric((String) sb.subSequence(sb.length()-1, sb.length())))
					{
							String texto=textField.getText()+btn_menos.getText();
							textField.setText(texto);
					}
					else
					{
						if(sb.subSequence(sb.length()-1, sb.length()).equals("-"))
						{
							
						}
						else
						{
							//Condicion especial menos
							if(sb.subSequence(sb.length()-1, sb.length()).equals("*") || sb.subSequence(sb.length()-1, sb.length()).equals("/"))
							{
								if(sb.subSequence(sb.length()-2, sb.length()-1).equals("*") || sb.subSequence(sb.length()-2, sb.length()-1).equals("/"))
								{
									String texto=sb.subSequence(0, sb.length()-2).toString();
									textField.setText(texto);
								}
								
								String texto=textField.getText()+btn_menos.getText();
								textField.setText(texto);
							}
							else
							{
								String texto=sb.subSequence(0, sb.length()-1)+btn_menos.getText();
								textField.setText(texto);
							}
							

						}
					}
				}
			}
		});
		btn_menos.setBounds(200, 156, 52, 44);
		frmCalculadora.getContentPane().add(btn_menos);
		btn_menos.setFocusable(false);
		
		JButton btn_por = new JButton("*");
		btn_por.setBackground(SystemColor.scrollbar);
		btn_por.addActionListener(new ActionListener()
		{
			private boolean isNumeric(String str)
			{ 
				  try
				  {  
				    Double.parseDouble(str);  
				    return true;
				  }
				  catch(NumberFormatException e)
				  {  
				    return false;  
				  }  
			}
			public void actionPerformed(ActionEvent e)
			{
				if(textField.getText().equals(""))
				{
					
				}
				else
				{
					StringBuilder sb = new StringBuilder(textField.getText());
					
					if(this.isNumeric((String) sb.subSequence(sb.length()-1, sb.length())))
					{
							String texto=textField.getText()+btn_por.getText();
							textField.setText(texto);
					}
					else
					{
						if(sb.subSequence(sb.length()-1, sb.length()).equals("-") && sb.length()<2)
						{
							
						}
						else
						{
							String texto=sb.subSequence(0, sb.length()-1)+btn_por.getText();
							textField.setText(texto);
							
							if(sb.subSequence(sb.length()-1, sb.length()).equals("-"))
							{
								String texto2=sb.subSequence(0, sb.length()-1).toString();
								textField.setText(texto2);
							}
						}
					}
				}
			}
		});
		btn_por.setBounds(200, 211, 52, 44);
		frmCalculadora.getContentPane().add(btn_por);
		btn_por.setFocusable(false);
		
		JButton btn_divide = new JButton("/");
		btn_divide.setBackground(SystemColor.scrollbar);
		btn_divide.addActionListener(new ActionListener()
		{
			private boolean isNumeric(String str)
			{ 
				  try
				  {  
				    Double.parseDouble(str);  
				    return true;
				  }
				  catch(NumberFormatException e)
				  {  
				    return false;  
				  }  
			}
			public void actionPerformed(ActionEvent e)
			{
				if(textField.getText().equals(""))
				{
					
				}
				else
				{
					StringBuilder sb = new StringBuilder(textField.getText());
					
					if(this.isNumeric((String) sb.subSequence(sb.length()-1, sb.length())))
					{
							String texto=textField.getText()+btn_divide.getText();
							textField.setText(texto);
					}
					else
					{
						if(sb.subSequence(sb.length()-1, sb.length()).equals("-") && sb.length()<2)
						{
							
						}
						else
						{
							String texto=sb.subSequence(0, sb.length()-1)+btn_divide.getText();
							textField.setText(texto);
							
							if(sb.subSequence(sb.length()-1, sb.length()).equals("-"))
							{
								String texto2=sb.subSequence(0, sb.length()-1).toString();
								textField.setText(texto2);
							}
						}
					}
				}
			}
		});
		btn_divide.setBounds(200, 266, 52, 44);
		frmCalculadora.getContentPane().add(btn_divide);
		btn_divide.setFocusable(false);
		
		JButton btn_0 = new JButton("0");
		btn_0.setBackground(SystemColor.scrollbar);
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_0.getText();
				textField.setText(number);
			}
		});
		btn_0.setBounds(10, 321, 52, 44);
		frmCalculadora.getContentPane().add(btn_0);
		btn_0.setFocusable(false);
		
		JButton btn_dot = new JButton(".");
		btn_dot.setBackground(SystemColor.scrollbar);
		btn_dot.addActionListener(new ActionListener()
		{
			private boolean isNumeric(String str)
			{ 
				  try
				  {  
				    Double.parseDouble(str);  
				    return true;
				  }
				  catch(NumberFormatException e)
				  {  
				    return false;  
				  }  
			}
			public void actionPerformed(ActionEvent e)
			{
				if(textField.getText().equals(""))
				{
					
				}
				else
				{
					StringBuilder sb = new StringBuilder(textField.getText());
					
					if(this.isNumeric((String) sb.subSequence(sb.length()-1, sb.length())))
					{
						if(sb.toString().contains("."))
						{
							if(sb.toString().contains("+") || sb.toString().contains("-") || sb.toString().contains("*") || sb.toString().contains("/"))
							{
								int countMas = sb.toString().length() - sb.toString().replace("+", "").length();
								int countMenos = sb.toString().length() - sb.toString().replace("-", "").length();
								int countPor = sb.toString().length() - sb.toString().replace("*", "").length();
								int countDiv = sb.toString().length() - sb.toString().replace("/", "").length();
								int total = countMas + countMenos + countPor + countDiv;
								if((sb.toString().length() - sb.toString().replace(".", "").length() - 1)<total)
								{
									String texto=textField.getText()+btn_dot.getText();
									textField.setText(texto);
								}
							}
							else
							{
								String texto=textField.getText();
//								String[] array = texto.split("\\|");
//								String textoPRO = array[array.length -1];
								if(texto.toString().contains("."))
								{
									textField.setText(texto);
								}
								else
								{
									textField.setText(texto+btn_dot.getText());
								}
							}
						}
						else
						{
							String texto=textField.getText()+btn_dot.getText();
							textField.setText(texto);
						}
					}
				}
			}
			
		});

		btn_dot.setBounds(72, 321, 52, 44);
		frmCalculadora.getContentPane().add(btn_dot);
		btn_dot.setFocusable(false);
		
				
		JButton btn_fact = new JButton("!");
		btn_fact.setBackground(SystemColor.scrollbar);
		btn_fact.addActionListener(new ActionListener()
		{
			private boolean isNumeric(String str)
			{ 
				  try
				  {  
				    Double.parseDouble(str);  
				    return true;
				  }
				  catch(NumberFormatException e)
				  {  
				    return false;  
				  }  
			}
			public void actionPerformed(ActionEvent e)
			{
				if(textField.getText().equals(""))
				{
					
				}
				else
				{
					
					StringBuilder sb = new StringBuilder(textField.getText());
					
					if(sb.toString().contains("+") || sb.toString().contains("-") || sb.toString().contains("/") || sb.toString().contains("*") || sb.toString().contains(".") || sb.toString().contains("!"))
					{
						
					}
					else
					{
						if(this.isNumeric((String) sb.subSequence(sb.length()-1, sb.length())))
						{
								String texto=textField.getText()+btn_fact.getText();
								textField.setText(texto);
						}
						else
						{
							if(sb.subSequence(sb.length()-1, sb.length()).equals("-") && sb.length()<2)
							{
								
							}
							else
							{
								String texto=sb.subSequence(0, sb.length()-1)+btn_fact.getText();
								textField.setText(texto);
							}
						}
					}
				}
			}
		});
		btn_fact.setBounds(200, 321, 52, 44);
		frmCalculadora.getContentPane().add(btn_fact);
		btn_fact.setFocusable(false);
		
		JButton btn_Primo = new JButton("P?");
		btn_Primo.setBackground(SystemColor.scrollbar);
		btn_Primo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// Es un numero? Si no no hago nada
				String str = textField.getText();
				Boolean EsNumero;
				try
				{  
				    Integer.parseInt(str);  
				    EsNumero = true;
				}
				catch(NumberFormatException exepcion)
				{  
					EsNumero = false;  
				}
				
				if(EsNumero)
				{
					int EsPrimo = Integer.parseInt(str);
					Calculadora_Archerd6 RealCalculator = new Calculadora_Archerd6();
					Boolean Respuesta = RealCalculator.esPrimo(EsPrimo);
					textField.setText(Respuesta.toString());
					
					btn_0.setEnabled(false);
					btn_00.setEnabled(false);
					btn_1.setEnabled(false);
					btn_2.setEnabled(false);
					btn_3.setEnabled(false);
					btn_4.setEnabled(false);
					btn_5.setEnabled(false);
					btn_6.setEnabled(false);
					btn_7.setEnabled(false);
					btn_8.setEnabled(false);
					btn_9.setEnabled(false);
					btn_B.setEnabled(false);
					btn_divide.setEnabled(false);
					btn_dot.setEnabled(false);
					btn_fact.setEnabled(false);
					btn_mas.setEnabled(false);
					btn_menos.setEnabled(false);
					btn_por.setEnabled(false);
					btn_Primo.setEnabled(false);
					textField.setEditable(false);
				}
			}
		});
		btn_Primo.setBounds(134, 321, 52, 44);
		frmCalculadora.getContentPane().add(btn_Primo);
		btn_Primo.setFocusable(false);

		
		JButton btn_igual = new JButton("=");
		btn_igual.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Boolean IrAlFinal = false;
				
				Calculadora_Archerd6 RealCalculator = new Calculadora_Archerd6();
				String entrada = textField.getText();
				StringBuilder EntradaBuilder = new StringBuilder(entrada);
				StringBuilder Cadenas = new StringBuilder();
				try (Scanner sc = new Scanner(entrada))
				{
					sc.useDelimiter("\\s*[-*+/ ]\\s*");
					while(sc.hasNext())
					{
						Cadenas.append(sc.next()+" ");
					}
				}
				String[] arrayNumeros = Cadenas.toString().split("\\ ");
				if(EntradaBuilder.subSequence(0, 1).equals("-"))
				{
					arrayNumeros[0]= "-"+arrayNumeros[0];
				}
				if(arrayNumeros.length > 1)
				{
					String Operacion = EntradaBuilder.subSequence(EntradaBuilder.lastIndexOf(arrayNumeros[1])-1,EntradaBuilder.lastIndexOf(arrayNumeros[1])).toString();
					if(!Operacion.equals("+") && !Operacion.equals("-") && !Operacion.equals("*") && !Operacion.equals("/"))
					{
						// Combinado *- /-
						Operacion =EntradaBuilder.subSequence(EntradaBuilder.lastIndexOf("-")-1,EntradaBuilder.lastIndexOf("-")+1).toString();;
					}
					Double resultado = 0.0;
					Double uno = Double.parseDouble(arrayNumeros[0]);
					Double dos;
					try
					{
						dos = Double.parseDouble(arrayNumeros[1]);
					}
					catch(Exception ex)
					{
						dos = Double.parseDouble(arrayNumeros[2]);
					}
					
					if(Operacion.equals("+"))
					{
						resultado = RealCalculator.suma(uno, dos);
					}
					if(Operacion.equals("-"))
					{
						resultado = RealCalculator.resta(uno, dos);
					}
					if(Operacion.equals("*"))
					{
						resultado = RealCalculator.mult(uno, dos);
					}
					if(Operacion.equals("/"))
					{
						try
						{
						resultado = RealCalculator.divide(uno, dos);
						}
						catch(ArithmeticException ex)
						{
							IrAlFinal = true;
							textField.setText("No se puede entre cero");
						}
					}
					if(Operacion.equals("*-"))
					{
						resultado = RealCalculator.mult(uno, -dos);
					}
					if(Operacion.equals("/-"))
					{
						resultado = RealCalculator.divide(uno, -dos);
					}
					System.out.println(entrada+" | before -> after |"+resultado);
					if(!IrAlFinal)
					{
						textField.setText(resultado+EntradaBuilder.substring((EntradaBuilder.lastIndexOf(arrayNumeros[1]))+arrayNumeros[1].length()));
					}
					System.out.println(EntradaBuilder.substring((EntradaBuilder.lastIndexOf(arrayNumeros[1]))+arrayNumeros[1].length()));
				}
				
				//Comprobamos !
//				System.out.println();
				if(entrada.contains("!"))
				{
//					System.out.println(EntradaBuilder.substring(0,EntradaBuilder.indexOf("!")));
					String EsUnNumero = EntradaBuilder.substring(0,EntradaBuilder.indexOf("!"));
					Boolean EsNumero;
					try
					{  
					    Integer.parseInt(EsUnNumero);  
					    EsNumero = true;
					}
					catch(NumberFormatException exepcion)
					{  
						EsNumero = false;  
					}
					if(EsNumero)
					{
						int aFactorial = Integer.parseInt(EntradaBuilder.substring(0,EntradaBuilder.indexOf("!")));
						String textfield = "";
						try
						{
							Integer resultado = RealCalculator.fact(aFactorial);
							textfield = resultado.toString();
						}
						catch(IllegalArgumentException NumeroMuGrande)
						{
							textfield = "Calculation too large";
							btn_0.setEnabled(false);
							btn_00.setEnabled(false);
							btn_1.setEnabled(false);
							btn_2.setEnabled(false);
							btn_3.setEnabled(false);
							btn_4.setEnabled(false);
							btn_5.setEnabled(false);
							btn_6.setEnabled(false);
							btn_7.setEnabled(false);
							btn_8.setEnabled(false);
							btn_9.setEnabled(false);
							btn_B.setEnabled(false);
							btn_divide.setEnabled(false);
							btn_dot.setEnabled(false);
							btn_fact.setEnabled(false);
							btn_igual.setEnabled(false);
							btn_mas.setEnabled(false);
							btn_menos.setEnabled(false);
							btn_por.setEnabled(false);
							btn_Primo.setEnabled(false);
						}
						textField.setText(textfield);
					}
				}
				
				
			}
		});
		btn_igual.setBackground(new Color(232, 98, 76));
		btn_igual.setBounds(10, 376, 242, 38);
		frmCalculadora.getContentPane().add(btn_igual);
		btn_igual.setFocusable(false);
		
		JButton btn_C = new JButton("C");
		btn_C.setBackground(SystemColor.scrollbar);
		btn_C.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				textField.setText("");
				btn_0.setEnabled(true);
				btn_00.setEnabled(true);
				btn_1.setEnabled(true);
				btn_2.setEnabled(true);
				btn_3.setEnabled(true);
				btn_4.setEnabled(true);
				btn_5.setEnabled(true);
				btn_6.setEnabled(true);
				btn_7.setEnabled(true);
				btn_8.setEnabled(true);
				btn_9.setEnabled(true);
				btn_B.setEnabled(true);
				btn_divide.setEnabled(true);
				btn_dot.setEnabled(true);
				btn_fact.setEnabled(true);
				btn_igual.setEnabled(true);
				btn_mas.setEnabled(true);
				btn_menos.setEnabled(true);
				btn_por.setEnabled(true);
				btn_Primo.setEnabled(true);
			}
		});
		btn_C.setBounds(72, 101, 52, 44);
		frmCalculadora.getContentPane().add(btn_C);
		btn_C.setFocusable(false);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(SystemColor.controlShadow);
		editorPane.setEnabled(false);
		editorPane.setEditable(false);
		editorPane.setBounds(0, 0, 264, 90);
		frmCalculadora.getContentPane().add(editorPane);
	}
}
