import java.util.Scanner;

public class A236 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		String cad = sc.nextLine();
		
		int cont=0;
		int i=0;
		while(cad.length()>i) {
			String c = String.valueOf(cad.charAt(i));
			StringBuilder cadBuilder = new StringBuilder(cad);
			String aux = String.valueOf(cadBuilder.deleteCharAt(i));
			if(aux.contains(c)) {
				cad = cad.replaceAll(c, "");
				cont++;
			}
			else {
				i++;
			}
		}
		
		if((cad.length()+cont) %2==0)
			System.out.println("CHAT WITH HER!");
		else
			System.out.println("IGNORE HIM!");
		
	}

}