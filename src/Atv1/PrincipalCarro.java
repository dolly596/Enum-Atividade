package Atv1;

public class PrincipalCarro {
	public static void main(String[] args) {
		MarcaCarro.values();
		
		for(MarcaCarro lista : MarcaCarro.values()) {
			System.out.println(lista);
		}
	}
}
