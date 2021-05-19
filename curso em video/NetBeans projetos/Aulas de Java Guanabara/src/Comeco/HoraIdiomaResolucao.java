package Comeco;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HoraIdiomaResolucao {
	
	public static void main(String[] args) {
		Date hora = new Date();
		
		System.out.println(hora.toString());// converte objwto data para uma string!
		System.out.println(hora);
		
		  //idioma do meu sistema
	    Locale idioma = Locale.getDefault();
	    System.out.println("Idioma: "+ idioma.getDisplayLanguage() +" "+ idioma.getLanguage());
	  
	    
	    //Resolução da tela
	    Toolkit tela = Toolkit.getDefaultToolkit();
	    Dimension d = tela.getScreenSize();
	    System.out.println("Resolução do Display: "+d.width+" x "+d.height);
	}
	
}
 