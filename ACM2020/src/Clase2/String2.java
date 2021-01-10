package Clase2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String2 {

	public static int numeroAlfabeto(Character palabra) {
		int i=0;
		for(char letra = 'A'; letra<='Z'; letra++) {
			i++;
			if(palabra==letra)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numeroAlfabeto('L'));
		
		
		//Expresiones Regulares
		String cad = "X + 2Y - 19Z = 1231+*";
		/*
		\\w 	-> Para remplazar todos los caracteres alfanumericos
		\\w+ 	-> Agrupa los caracteres que sean consecutivos para remplazar
		\\W		-> Para remplazar los caracteres que no sean alfanumericos 
		\\W+	-> Agrupa los caracteres que no sean alfanumericos para ser remplazados una sola vez
		\\s 	-> Para remplazar los espacios vacios
		\\S		-> Para remplazar los caracteres que no sean un espacion vacio
		\\S+	-> Agrupa los caracteries consecutivos que no sean un espacion vacio para remplazarlos
		\\d		-> Para remplazar los digitos
		\\D		-> Para remplazar los caracteres distintos a un digito
		\\b 	-> Agrega una caracter al inicio y al final de 
		 		   cada palabra(o conjunto de caracteres alfanumericos que sean consecutivos)
		*/
		System.out.println(cad);
		//cad = cad.replaceAll("\\b","W");
		cad = cad.replaceAll("\\w+","W").replaceAll("[+,/,-]", "*");
		System.out.println(cad);
		
//		cad = cad.replaceAll("\\w+","W");
//		System.out.println(cad);
		
		
		//Contenga sucesion a*b
		Pattern patron = Pattern.compile("a*b");
		
		Matcher encaja = patron.matcher("aabmanoloaaaaaaaaabmanoloabmanolob");
		String resultado = encaja.replaceAll("-");
		System.out.println(resultado);
		
		
		//Contenga el patron abc dentro de la cadena
		String cadena = "abcmanoloabcmanoloabmanolob";
		Pattern pat = Pattern.compile(".*abc.*");
		Matcher mat = pat.matcher(cadena);
		if(mat.matches())
			System.out.println("SI");
		else
			System.out.println("NO");
		
		//Inicie con el patron abc 
		Pattern patt = Pattern.compile("^abc.*");
		Matcher matc = patt.matcher(cadena);
		if(matc.matches())
			System.out.println("Valido");
		else
			System.out.println("No valido");
		
		//Inicio el patron con abc, ignarondo si 'a' es mayuscula o miniscula
		Pattern patM = Pattern.compile("^[aA]bc.*");
		Matcher matM = patM.matcher(cadena);
		if(matM.find())
			System.out.println("Si");
		else
			System.out.println("No");
		
		//Inicio con algun digito
		cadena="asdkjrklasdra";
		System.out.println();
		System.out.println("Digito");
		Pattern patD = Pattern.compile("^[\\d].*");
		Matcher matD = patD.matcher(cadena);
		if(matD.matches())
			System.out.println("Si");
		else 
			System.out.println("No");
		
		
//		Pattern patFD = Pattern.compile(".*[\\d].*");
//		Matcher matFD = patFD.matcher(cadena);
//		if(matFD.matches())
//			System.out.println("Si");
//		if(matFD.matches())
//			System.out.println("No");
		
		
		//Si dentro de la cadena hay el digito 1, que no este seguido del digito 2
		System.out.println();
		cadena="lonasdunmiddu1k2asfr";
		Pattern patUNO = Pattern.compile(".*1(?!k).*");
		Matcher matUNO = patUNO.matcher(cadena);
		if(matUNO.find())
			System.out.println("Si");
		else
			System.out.println("No");
		
		
		//Si dentro de la cadena coincide el patron de tres conjuntos de caracteres
		Pattern patP = Pattern.compile(".*[mnl][aiasdlkjujou][mnd].*");
		Matcher matP = patP.matcher(cadena);
		System.out.println(matP.find()? "Si":"No");
	}

}
