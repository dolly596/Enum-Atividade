package Atv1;



public class PrincipalMarca {

	public static void main(String[] args) {
		MarcaRoupa marca = MarcaRoupa.NIKE;
		MarcaRoupa.values();
		
		for(MarcaRoupa lista : MarcaRoupa.values()) {
			System.out.println(lista);
		}

	}

}
