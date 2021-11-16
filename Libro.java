
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
    private String referencia;
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
        referencia = "";
    }

    /**
     * Devuelveautor del libro
     */
    public String imprimeAutor() {
        return autor;
    }

    /**
     * Devuele el numero de referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Cambio de precio
     */
    public void setNumeroReferencia(String newReferencia) {
        if (referencia.length() > 3 ) {
            referencia = newReferencia;
        } 
        else {
            System.out.println("Se produjo un error");
        }
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
        if (referencia == "") {
            System.out.println("ZZZ");
        }
        else {
            System.out.println("Numero de referencia:" + referencia);
        }
    }

    /**
     * Devuelve los detalles
     */
    public String getDetalles() {
        if (referencia == "") {
            return ("Titulo:" + titulo ) + " " + ("Autor:" + autor) + " " + ("Paginas:" + paginas) + "" + ("ZZZ");
        }
        return ("Titulo:" + titulo ) + " " + ("Autor:" + autor) + " " + ("Paginas:" + paginas) + "" + ("Numero de referencia:" + referencia);
    }
}
