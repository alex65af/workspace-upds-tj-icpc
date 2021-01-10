package Clases;

import java.util.HashMap;

public class Mapss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<Key, Value> nombre = new HashMap<Key, Value>();
		
		HashMap<String, String> mapas = new HashMap<String, String>();
//		.put(key, value)		Agregar valores en el mapa
//		.clear					Vaciar los elementos de la lista
//		.get(key)				Retorna un valor
//		.remove(key)			Eleminar un elemento del mapa
//		.replace(key, newValue)	Remplezar el valor de un elemento
//		.isEmpty
//		.containsKey(key)		Retonarna un valor boolean, true en caso de que exista la llave dentro del mapa
//		.containsValue(value)	Retonarna un valor boolean, true en caso de que exista el valor dentro del mapa
//		.keySet()				foreach(Retorna unicamente las llaves de los elementos en el mapa)
//		.values()				foreach(Retorna unicamente los valores de los elementos en el mapa)
//		.size()					cantidad de elementos dentro del mapa
//		.getOrDefault(key, defaulValue) Busca una llave y retorna su valor, en caso de un existir retona un valor por defecto
		
		
		mapas.put("Carlos@gmail.com", "Mamani");
		
		mapas.put("Manuel@gmial.com", "Valverde");
		
		mapas.put("Carlos123@hotmail.com", "Prueba");
		
		
		System.out.println(mapas);
		
		HashMap<String, Integer> intMapa = new HashMap<String, Integer>();
		
		intMapa.put("a", 123);
		intMapa.put("b", 444);
		
		
		System.out.println(intMapa.getOrDefault("c", 500));
		
		
		
	}

}
