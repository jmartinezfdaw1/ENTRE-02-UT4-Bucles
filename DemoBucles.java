import java.util.Random;
/**
 *    @author - Jon Martinez
 */
public class DemoBucles
{
    private final char ASTERISCO = '*';
    private final char ESPACIO = ' ';
    private Random generador;
    /**
     * Constructor  
     */
    public DemoBucles()
    {
       Random generador = new Random();
    }

    /**
     * Calcular la mayor potencia de 2 que es menor o igual a numero
     * Asumimos numero > 0
     * 
     * Si numero = 7 devuelve 4             numero = 8 devuelve 8
     *    numero = 19 devuelve 16           numero = 32 devuelve 32
     *    numero = 74 devuelve 64           numero = 1 devuelve 1
     *    numero = 190 devuelve 128
     *    
     *  Usa bucles while
     */
    public int mayorPotencia2(int numero) {
        int resul = 0;
         while (numero >= 1){
            if (numero >= 128){
                numero = numero % (int)(Math.pow(2, 7));
                resul = 128;
            }
            else if (numero >= 64){
                numero = numero % (int)(Math.pow(2, 6));
                resul = 64;
            }
            else if (numero >= 32){
                numero = numero % (int)(Math.pow(2, 5));
                resul = 32;
            }
            else if (numero >= 16){
                numero = numero % (int)(Math.pow(2, 4));
                resul = 16;
            }
            else if (numero >= 8){
                numero = numero % (int)(Math.pow(2, 3));
                resul = 8;
            }
            else if (numero >= 4){
                numero = numero % (int)(Math.pow(2, 2));
                resul = 4;
            }
            else if (numero >= 2){
                numero = numero % (int)(Math.pow(2, 1));
                resul = 2;
            }
            else if (numero >= 1){
                numero = numero % (int)(Math.pow(2, 0));
                resul = 1;
            }
        }
        return resul;
    }

    /**
     * Escribir numero como suma de potencias de 2 
     * tal como indica el enunciado (Se asume numero > 0)
     * 
     * Todos los valores se muestran en pantalla fomateados a 6 posiciones 
     * y ajustados a la derecha
     * 
     * Hay que usar el método anterior - 
     * Utiliza bucles while
     * 
     *  77 =    64     8     4     1
     * 215 =   128    64    16     4     2     1
     *  18 =    16     2
     *  64 =    64
     */
    public void escribirSumaPotencias(int numero) {
        System.out.println(numero + "=");
        while (numero >= 1){
            if (numero >= 128){
                numero = numero % (int)(Math.pow(2, 7));
                System.out.println("128");
            }
            else if (numero >= 64){
                numero = numero % (int)(Math.pow(2, 6));
                System.out.println("64");
            }
            else if (numero >= 32){
                numero = numero % (int)(Math.pow(2, 5));
                System.out.println("32");
            }
            else if (numero >= 16){
                numero = numero % (int)(Math.pow(2, 4));
                System.out.println("16");
            }
            else if (numero >= 8){
                numero = numero % (int)(Math.pow(2, 3));
                System.out.println("8");
            }
            else if (numero >= 4){
                numero = numero % (int)(Math.pow(2, 2));
                System.out.println("4");
            }
            else if (numero >= 2){
                numero = numero % (int)(Math.pow(2, 1));
                System.out.println("2");
            }
            else if (numero >= 1){
                numero = numero % (int)(Math.pow(2, 0));
                System.out.println("1");
            }
        }
         

    }

    /**
     * Generar aleatorios entre 0 y 255
     * y escribir cada aleatorio como suma de potencias de 2
     * Parar al salir el 255 o despues de generar n aleatorios
     * (ver enunciado)
     * 
     * Hay que usar el método anterior
     * 
     * Utiliza bucles while
     * 
     */
    public void generarAleatorios(int n) {
        int aleatorio = generador.nextInt(256);
        int contador = 1;
        while (contador <= n && aleatorio != 0){
            System.out.println("Nºs aleatorios como suma de potencias de 2");
            escribirSumaPotencias(aleatorio);
            contador ++;
        }
        System.out.println("Bucle terminado porque se han generado ya " + contador + " aleatorios");
    }

    /**
     *  Escribe en pantalla caracter n veces en la misma línes
     *  
     *  Usa bucles for
     */
    public void escribirCaracter(int n, char caracter)
    {
        String figura = "";
        for (int contador = 1; contador <= n; contador ++){
             figura += caracter;
            }
        System.out.println(figura);
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public void mostrarEscalera(int escalones, int alto, int ancho) {
        for (int i = 1; i <= escalones; i ++){
            int f = 1;
            for (f = 1; f <= alto; f ++){
                System.out.println();
                int g = 1;
                for (g = 1; g <= ancho; g ++){
                       escribirCaracter(ancho, ASTERISCO);
                    }
            }
        }

         

    }

}
