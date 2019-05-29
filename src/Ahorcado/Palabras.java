package Ahorcado;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * Archive: Palabras.java

 */

public class Palabras 
{
	private Random random = new Random();
	private static final int LONGITUD_MIN = 4;
	private static final int LONGITUD_MAX = 17;
	private Map<Integer, ArrayList<String>> palabras;
    private String elegida;
    private String[] palabraFormada;
    private int bandera;
    
    
    public Palabras()
    {
    	palabras = new TreeMap<>();
    	BufferedReader in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/palabras.txt")));
    	String palabra;
    	try {
			while ((palabra = in.readLine()) != null) {
				int longitud = palabra.length();
				ArrayList<String> lista = palabras.get(longitud);
				if (lista == null) {
					lista = new ArrayList<>();
					palabras.put(longitud, lista);
				}
				lista.add(palabra);
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
        elegida = escogerPalabra();
        palabraFormada = new String[elegida.length()];
        llenarPalabraFormada();
        bandera = 0;
    }
    
    public String escogerPalabra()
    {
    	int longitud = random.nextInt(LONGITUD_MAX - LONGITUD_MIN + 1) + LONGITUD_MIN; 
    	List<String> lista = palabras.get(longitud);
        return lista.get(random.nextInt(lista.size()));
        
    }
    
    public void llenarPalabraFormada()
    {
        for(int i = 0; i < palabraFormada.length; i++)
        {
            palabraFormada[i] = "*";
        }
    }
    
    public String comparar(char letra)
    {
        /*System.out.println(elegida);*/
        String aux="";
        String nuevaPalabra ="";
        int contador = 0;
        bandera =0;
        
        while(contador < elegida.length())
        {
            if((letra == elegida.charAt(contador)) && (palabraFormada[contador].equals("*")))
            {
                aux += letra;
                palabraFormada[contador] = aux;
                aux="";
                contador++;
                bandera=1;
            }
            else
            {
                contador++;
            }
            
        }
        
        for(int i = 0; i < palabraFormada.length;i++)
        {
            nuevaPalabra += palabraFormada[i];
            
        }
        return nuevaPalabra;
    }
    
    public String getElegida()
    {
        return elegida;
    }
    
    public int getBandera()
    {
        return bandera;
    }
    
//    public static void main(String[] args)
//    {
//        
//        Palabras p = new Palabras();
//        System.out.println(p.comparar('a'));
//        System.out.println(p.comparar('b'));
//        System.out.println(p.comparar('c'));
//        System.out.println(p.comparar('d'));
//        System.out.println(p.comparar('e'));
//        System.out.println(p.comparar('l'));
//        System.out.println(p.comparar('f'));
//        System.out.println(p.comparar('n'));
//        System.out.println(p.comparar('t'));
//    }
}
