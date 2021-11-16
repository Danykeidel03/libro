
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int paginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
    }
    
     /**
     * Devuelveautor del libro
     */
    public String imprimeAutor() {
        return autor;
    }
    
     /**
     * Devuelve el titulo del libro
     */
    public String imprimeTitulo() {
        return titulo;
    }
    
     /**
     * Devuelve el numero de paginas
     */
    public int numeroPaginas() {
        return paginas;
    }
    
     /**
     * Devuelve los detalles
     */
    public void imprimirDetalles() {
        System.out.println("Titulo:" + titulo );
        System.out.println("Autor:" + autor);
        System.out.println("Paginas:" + paginas); 
    }
    
     /**
     * Devuelve los detalles
     */
    public String getDetalles() {
        return autor + "" + titulo + "" + paginas;
    }
}
