package Clases;

import java.util.*;

public class Introduccion {

	public static void main(String[] args) {

		//Datos primitivos en Java
		//-128 a 127
		byte v_byte = -128; 
		
		//-32.768. y el valor máximo a 32.767
		short v_short = -32768;
		
		//32bits // - 2^31(-2147483648) y el máximo (2^31)-1(2147483647)
		int v_int = -2147483648;
		
		//decimal		0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16, 17,...
		//Hexadecimal	0,1,2,3,4,5,6,7,8,9,a, b, c, d, e, f, 10, 11,...
		v_int = 0x10;
		//System.out.println(v_int);
		// 64 Bits // - 2^63(-9,223,372,036,854,775,808) 
		// y el máximo (2^63)-1(9,223,372,036,854,775,807).
		long v_long =  -9223372036854775808l;
		v_long = 9223372036854775807L;
		
		//Literales subrayados
		v_long = 368_547_758_083L;
		//System.out.println(v_long);
		//No podremos utilizar el literal de subrayado al principio o final del número, 
		//alrededor de un punto decimal, 
		//ni entre el número y un literal de entero o decimal (D, F o L)
		
		//8 decimales. Redondea el ultimo digito
		float v_float = 0.1231_1123_8F;
		//System.out.println(v_float);
		//17 decimales, no redondea
		double v_double = 0.12345678912345678_9D;
		//System.out.println(v_double);
		boolean v_bool = true; //true o false
		
		char v_char = 'g';
		
//		String v_string = "Hola \\Mundo\" ";
//		System.out.println(v_string);
		//Secuencias de escape
//		Secuencia	Significado
//			\t		tabular la cadena
//			\n		salto de línea
//			\'		comilla simple
//			\"		comilla doble
//			\\		barra invertida
		
//		\b	retroceso
//		\f	form feed
//		\r	retorno de carro
//		System.out.println(v_long);
//		System.out.println(v_string);
//		
//		//Expresiones
//		System.out.println(2 + 10 / 5); 
//		System.out.println((2 + 10) / 5);
//		System.out.println(2 + (10 / 5));
		
		//Sentencias de declaración
	//	int variable = 1;
		//Sentenia de asignacion 
//		varible = 1;
///		System.out.println(varible);
//		Sentencias de asignación
//		varible = 2;
		
//		Sentencias de incremento o decremento
		//variable++;
//		System.out.println(variable);
//		variable--;
//		System.out.println(variable);
//		
//		++ variable;
//		variable ++;
//		-- variable;
//		variable --;
//		++variable;
////		System.out.println(variable);
//		if(++variable == 1) {
//			System.out.println("Son iguales");
//		}else {
//			System.out.println("No son iguales");
//		}
//		System.out.println(variable);
//		
//		System.out.println(variable);
//		
//		Es más sencillo verlo en código:
//
//			suma = ++vble1;
//			Sería lo mismo que poner
//
//			vble1 = vble1 + 1;
//			suma = vble1;
//			Mientras que si escribimos:
//
//			suma = vble1++;
//			Sería lo mismo que poner:
//
//			suma = vble1;
//			vble1 = vble1 + 1;
//		
//		int variable = 1;
//		if(2 == variable + 1) {
//			System.out.println("Son iguales");
//		}else {
//			System.out.println("No son iguales");
//		}
//		System.out.println(variable);
//		
		
		//Operadores aritmeticos
//		+	Operador de Suma. Concatena cadenas para la suma de String
//		-	Operador de Resta
//		*	Operador de Multiplicación
//		/	Operador de División
//		%	Operador de Resto
		
//		int suma = 3 + 7;             // Retorna 10
//		int resta = 5 - 2;            // Retorna 3
//		int multiplicacion = 3 * 2;   // Retorna 6
//		int division = 4 / 2;         // Retorna 2
//		int resto = 5 % 3;            // Retorna 2
		
		//Operador	Descripción
//			==		igual a
//			!=		diferente
//			>		mayor que
//			>=		mayor o igual que
//			<		menor que
//			<=		menor o igual que
		
//			&&	Operador condicional AND
//			||	Operador condicional OR
//			?:	Operador Ternario
		
//		int x = 8;
////		
//		if(x >= 1 || x!=8 || x<=10) {
//			System.out.println("Cumple");
//		}
//		else {
//			System.out.println("No cumple");
//		}
//		
		int v1 = 4;
		int v2 = 4;
		int mayor;

		mayor = (v1 > v2)?v1:v2;
		System.out.println(mayor);
		
		String cad = (v1 == v2)?"Verdadero":"Falso";
		System.out.println(cad);
	}

}
