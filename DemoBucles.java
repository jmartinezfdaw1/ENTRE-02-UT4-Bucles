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
      generador = new Random();
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
        int resul = 1;
         while (numero >= resul * 2){
            resul *= 2;
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
        System.out.printf("%6d =", numero);
        int resul = 1;
        int contador = 1;
        int aux = numero;
        while (aux >= 1){
            if (aux >= 128){
                mayorPotencia2(aux);
                resul = 128;
                aux = aux % 128;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 64){
                mayorPotencia2(aux);
                resul = 64;
                aux = aux % 64;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 32){
                mayorPotencia2(aux);
                resul = 32;
                aux = aux % 32;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 16){
                mayorPotencia2(aux);
                resul = 16;
                aux = aux % 16;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 8){
                mayorPotencia2(aux);
                resul = 8;
                aux = aux % 8;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 4){
                mayorPotencia2(aux);
                resul = 4;
                aux = aux % 4;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 2){
                mayorPotencia2(aux);
                resul = 2;
                aux = aux % 2;
                System.out.printf("%6d", resul);
            }
            else if (aux >= 1){
                mayorPotencia2(aux);
                resul = 1;
                aux = aux % 1;
                System.out.printf("%6d", resul);
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
        int aleatorio = generador.nextInt(255);
        int contador = 0;
        System.out.println("Nºs aleatorios como suma de potencias de 2");
        while (contador < n && aleatorio != 0){
            System.out.println();
            aleatorio = generador.nextInt(255);
            escribirSumaPotencias(aleatorio);
            contador ++;
        }
        System.out.println("\nBucle terminado porque se han generado ya " + contador + " aleatorios");
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
        System.out.printf(figura);
    }

    /**
     *  Genera la figura tal como muestra el enunciado 
     *  con ayuda del método anterior
     *  
     *   Usa bucles for
     */
    public void mostrarEscalera(int escalones, int alto, int ancho) {
        int potencia = 0;
        for (int i = 1; escalones >= i; i ++){
            for (int f = 1; alto >= f; f ++){
                escribirCaracter(ancho * potencia, ESPACIO);
                escribirCaracter(ancho, ASTERISCO);
                System.out.println();
            }
            potencia ++;
        }
    }

}
