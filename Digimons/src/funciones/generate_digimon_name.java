package funciones;

public class generate_digimon_name {
	public static String generar_nombre(int num){
		String nombre = "";
		if(num == 1) {
			nombre = "Agumon";
		}else if(num == 2) {
			nombre = "Gabumon";
		}else if(num == 3) {
			nombre = "Patamon";
		}
		
		return nombre;
	}
}
