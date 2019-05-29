package Ahorcado;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**/

public class Ahorcado extends JFrame implements ActionListener
{
	/*private Teclado panelTeclado;*/
	private JButton botonA;
	private JButton botonB;
	private JButton botonC;
	private JButton botonD;
	private JButton botonE;
	private JButton botonF;
	private JButton botonG;
	private JButton botonH;
	private JButton botonI;
	private JButton botonJ;
	private JButton botonK;
	private JButton botonL;
	private JButton botonM;
	private JButton botonN;
	private JButton boton—;
	private JButton botonO;
	private JButton botonP;
	private JButton botonQ;
	private JButton botonR;
	private JButton botonS;
	private JButton botonT;
	private JButton botonU;
	private JButton botonV;
	private JButton botonW;
	private JButton botonX;
	private JButton botonY;
	private JButton botonZ;


    private Pintar panelGrafico;
    private JPanel panelComponentes;
    private JButton botonReIniciar;
    private JButton botonIniciar;
    private JButton botonSalir;
    private JLabel etiqueta;
    private JLabel etiquetaLetra;
    private JTextField letra;
    private JTextField palabra;
    private Palabras p;
    private int fallos;
    


	public void Comprobar() {
		   String l="";
          l = letra.getText();
          char c = l.charAt(0);
          if(p.comparar(c).equals(p.getElegida()))
          {
              palabra.setText(p.comparar(c)); 
              JOptionPane.showMessageDialog(null,"Ganaste");/*EnseÒa el mensaje de victoria en la pantalla*/
          }   
          else if(fallos == 6)
          {
              JOptionPane.showMessageDialog(null,"Has perdido");/*Muestras */
          }
          else if(p.getBandera() == 1)
          {
              palabra.setText(p.comparar(c));
          }
          else if(p.getBandera() == 0)
          {
              fallos = fallos + 1;
              panelGrafico.error(fallos);
          }
      }
		
	
	

    
    public Ahorcado()
    {
        super("Juego del ahorcado");/*Las letras de la parte de arriba de la ventana*/
        setLayout(new BorderLayout(1,1));
        setSize(616,600);/*MOdifica el tamaÒo total de la ventana del modo grafico*/
        agregarElementos();
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fallos = 0;
        
    }
    
    public void agregarElementos()
    {
    	
    	
        //Panel donde se dibujara 
    	/*panelTeclado = new Teclado();*/
        panelGrafico = new Pintar();
        panelGrafico.setBackground(Color.WHITE);/*Fondo del muÒeco*/
        add(panelGrafico,BorderLayout.CENTER);
        
        //Panel donde estaran los elementos
        panelComponentes = new JPanel();
        panelComponentes.setBackground(Color.GREEN);/*Fondo de la parte de abajo de la interfaz*/
        panelComponentes.setLayout(null);
        
        
         botonA = new JButton("A");
         botonB = new JButton("B");
         botonC = new JButton("C");
         botonD = new JButton("D");
         botonE = new JButton("E");
         botonF = new JButton("F");
         botonG = new JButton("G");
         botonH = new JButton("H");
         botonI = new JButton("I");
         botonJ = new JButton("J");
         botonK = new JButton("K");
         botonL = new JButton("L");
         botonM = new JButton("M");
         botonN = new JButton("N");
         boton— = new JButton("—");
         botonO = new JButton("O");
         botonP = new JButton("P");
         botonQ = new JButton("Q");
         botonR = new JButton("R");
         botonS = new JButton("S");
         botonT = new JButton("T");
         botonU = new JButton("U");
         botonV = new JButton("V");
         botonW = new JButton("W");
         botonX = new JButton("X");
         botonY = new JButton("Y");
         botonZ = new JButton("Z");



        botonReIniciar = new JButton("Reinicar Juego");
        botonIniciar = new JButton("Inicar Juego");
        botonSalir = new JButton("SALIR");
       
        etiquetaLetra = new JLabel("Letra");
        etiqueta = new JLabel("Palabra");
        
        palabra = new JTextField("");
        letra = new JTextField("");/*Relleno de la casilla letra*/
        
        //Colocando elementos en el panel
        botonA.setBounds(300,0,50,30);
        botonB.setBounds(350,0,50,30);
        botonC.setBounds(400,0,50,30);
        botonD.setBounds(450,0,50,30);
        botonE.setBounds(500,0,50,30);
        botonF.setBounds(550,0,50,30);
        
        /*Salto de linea*/
        botonG.setBounds(300,30,50,30);
        botonH.setBounds(350,30,50,30);
        botonI.setBounds(400,30,50,30);
        botonJ.setBounds(450,30,50,30);
        botonK.setBounds(500,30,50,30);
        botonL.setBounds(550,30,50,30);

        /*Salto de linea*/
        botonM.setBounds(300,60,50,30);
        botonN.setBounds(350,60,50,30);
        boton—.setBounds(400,60,50,30);
        botonO.setBounds(450,60,50,30);
        botonP.setBounds(500,60,50,30);
        botonQ.setBounds(550,60,50,30);

        /*Salto de linea*/
        botonR.setBounds(300,90,50,30);
        botonS.setBounds(350,90,50,30);
        botonT.setBounds(400,90,50,30);
        botonU.setBounds(450,90,50,30);
        botonV.setBounds(500,90,50,30);
        botonW.setBounds(550,90,50,30);
        
        /*Salto de linea*/
        botonX.setBounds(300,120,50,30);
        botonY.setBounds(350,120,50,30);
        botonZ.setBounds(400,120,50,30);





        botonIniciar.setBounds(30, 400, 150, 30);
        botonReIniciar.setBounds(30,450,150,30);
        etiquetaLetra.setBounds(350, 240, 50, 30);
        letra.setBounds(390,240,30,30);
        etiqueta.setBounds(250,400,100,30);
        palabra.setBounds(300,400,150,30);
        botonSalir.setBounds(430,500,150,30);
        
        botonIniciar.addActionListener(this);
        botonReIniciar.addActionListener(this);
        botonSalir.addActionListener(this);
        botonA.addActionListener(this);
        botonB.addActionListener(this);
        botonC.addActionListener(this);
        botonD.addActionListener(this);
        botonE.addActionListener(this);
        botonF.addActionListener(this);
        botonG.addActionListener(this);
        botonH.addActionListener(this);
        botonI.addActionListener(this);
        botonJ.addActionListener(this);
        botonK.addActionListener(this);
        botonL.addActionListener(this);
        botonM.addActionListener(this);
        botonN.addActionListener(this);
        boton—.addActionListener(this);
        botonO.addActionListener(this);
        botonP.addActionListener(this);
        botonQ.addActionListener(this);
        botonR.addActionListener(this);
        botonS.addActionListener(this);
        botonT.addActionListener(this);
        botonU.addActionListener(this);
        botonV.addActionListener(this);
        botonW.addActionListener(this);
        botonX.addActionListener(this);
        botonY.addActionListener(this);
        botonZ.addActionListener(this);



        
        
        panelComponentes.add(botonA);
        panelComponentes.add(botonB);
        panelComponentes.add(botonC);
        panelComponentes.add(botonD);
        panelComponentes.add(botonE);
        panelComponentes.add(botonF);
        panelComponentes.add(botonG);
        panelComponentes.add(botonH);
        panelComponentes.add(botonI);
        panelComponentes.add(botonJ);
        panelComponentes.add(botonK);
        panelComponentes.add(botonL);
        panelComponentes.add(botonM);
        panelComponentes.add(botonN);
        panelComponentes.add(boton—);
        panelComponentes.add(botonO);
        panelComponentes.add(botonP);
        panelComponentes.add(botonQ);
        panelComponentes.add(botonR);
        panelComponentes.add(botonS);
        panelComponentes.add(botonT);
        panelComponentes.add(botonU);
        panelComponentes.add(botonV);
        panelComponentes.add(botonW);
        panelComponentes.add(botonX);
        panelComponentes.add(botonY);
        panelComponentes.add(botonZ);
        
        panelComponentes.add(botonReIniciar);
        panelComponentes.add(botonIniciar);
        panelComponentes.add(botonSalir);
        panelComponentes.add(letra);
        panelComponentes.add(etiqueta);
        panelComponentes.add(etiquetaLetra);
        panelComponentes.add(palabra);
        
        add(panelComponentes,BorderLayout.CENTER);
        
    }
   
    public void actionPerformed(ActionEvent evento) 
    {
    	if(evento.getSource() == botonA) {
        letra.setText("a");
        Comprobar();
        
    	}
    	

    	if(evento.getSource() == botonB) {
            letra.setText("b");
            Comprobar();
        	}
    	
    	if(evento.getSource() == botonC) {
            letra.setText("c");
            Comprobar();
        	}
    	if(evento.getSource() == botonD) {
            letra.setText("d");
            Comprobar();
        	}
    	if(evento.getSource() == botonE) {
            letra.setText("e");
            Comprobar();
        	}
    	if(evento.getSource() == botonF) {
            letra.setText("f");
            Comprobar();
        	}
    	if(evento.getSource() == botonG) {
            letra.setText("g");
            Comprobar();
        	}
    	if(evento.getSource() == botonH) {
            letra.setText("h");
            Comprobar();
        	}
    	if(evento.getSource() == botonI) {
            letra.setText("i");
            Comprobar();
        	}
    	if(evento.getSource() == botonJ) {
            letra.setText("j");
            Comprobar();
        	}
    	if(evento.getSource() == botonK) {
            letra.setText("k");
            Comprobar();
        	}
    	if(evento.getSource() == botonL) {
            letra.setText("l");
            Comprobar();
        	}
    	if(evento.getSource() == botonM) {
            letra.setText("m");
            Comprobar();
        	}
    	if(evento.getSource() == botonN) {
            letra.setText("n");
            Comprobar();
        	}
    	if(evento.getSource() == boton—) {
            letra.setText("Ò");
            Comprobar();
        	}
    	if(evento.getSource() == botonO) {
            letra.setText("o");
            Comprobar();
        	}
    	if(evento.getSource() == botonP) {
            letra.setText("p");
            Comprobar();
        	}
    	if(evento.getSource() == botonQ) {
            letra.setText("q");
            Comprobar();
        	}
    	if(evento.getSource() == botonR) {
            letra.setText("r");
            Comprobar();
        	}
    	if(evento.getSource() == botonS) {
            letra.setText("s");
            Comprobar();
        	}
    	if(evento.getSource() == botonT) {
            letra.setText("t");
            Comprobar();
        	}
    	if(evento.getSource() == botonU) {
            letra.setText("u");
            Comprobar();
        	}
    	if(evento.getSource() == botonV) {
            letra.setText("v");
            Comprobar();
        	}
    	if(evento.getSource() == botonW) {
            letra.setText("w");
            Comprobar();
        	}
    	if(evento.getSource() == botonX) {
            letra.setText("x");
            Comprobar();
        	}
    	if(evento.getSource() == botonY) {
            letra.setText("y");
            Comprobar();
        	}
    	if(evento.getSource() == botonZ) {
            letra.setText("z");
            Comprobar();
        	}
    	if(evento.getSource() == botonIniciar) {
    	      panelGrafico.error(0);
              palabra.setText("");
              fallos = 0;
              panelGrafico.error(0);
              p = new Palabras();
              String aux="";
              int contador =0;
              while(contador < p.getElegida().length())
              {
                  aux+="*";
                  contador++;
              }
              palabra.setText(aux);
       
    	}
    		
        if(evento.getSource() == botonReIniciar)/*Defines las acciones que va a desencadenar el echo de tocar ese boton*/
        {
            panelGrafico.error(0);
            palabra.setText("");
            fallos = 0;
            panelGrafico.error(0);
            p = new Palabras();
            String aux="";
            int contador =0;
            while(contador < p.getElegida().length())
            {
                aux+="*";
                contador++;
            }
            palabra.setText(aux);
     
        }
       
        else if(evento.getSource() == botonSalir)
        {
            System.exit(0);
        }
    }
    
    
    public static void main(String[] args) 
    {
        Ahorcado a = new Ahorcado();
    }

}
