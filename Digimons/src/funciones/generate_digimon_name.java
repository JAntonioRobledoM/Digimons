package funciones;

/**
 * Clase utilitaria para generar nombres de Digimon.
 * 
 * @autor JARM
 */
public class generate_digimon_name {

    /**
     * Genera un nombre de Digimon basado en un número dado.
     * 
     * @param num Número utilizado para seleccionar el nombre del Digimon.
     * @return El nombre del Digimon correspondiente al número proporcionado.
     * @throws IllegalArgumentException si el número no está en el rango de 1 a 3.
     */
    public static String generar_nombre(int num) {
        String nombre = "";
        switch (num) {
            case 1:
                nombre = "Agumon";
                break;
            case 2:
                nombre = "Gabumon";
                break;
            case 3:
                nombre = "Patamon";
                break;
            default:
                throw new IllegalArgumentException("El número debe estar en el rango de 1 a 3.");
        }
        return nombre;
    }
}
