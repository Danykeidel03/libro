
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
    private int prestado;
    private boolean texto;
    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroPaginas, boolean libroTexto )
    {
        autor = autorLibro;
        titulo = tituloLibro;
        paginas = numeroPaginas;
        referencia = "";
        prestado = 0;
        texto = libroTexto;
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
     * Devuele el numero de referencia
     */
    public boolean getEsLibroTexto() {
        return texto;
    }

    /**
     * Cambio de precio
     */
    public void setNumeroReferencia(String newReferencia) {
        if (referencia.length() >= 3 ) {
            referencia = newReferencia;
        } 
        else {
            System.out.println("Se produjo un error");
        }
    }

    public int getPrestado() {
        return prestado;
    }

    public void prestar() {
        prestado = prestado + 1;
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
        System.out.println("Prestado" + prestado + "veces"); 
        if (texto == true) {
            System.out.println("Es un libro de texto");
        }
        else {
            System.out.println("No es un libro de texto");
        }

    }

    /**
     * Devuelve los detalles
     */
    public String getDetalles() {
        String nombreDevolver= "";
        nombreDevolver = nombreDevolver + ("Titulo:" + titulo );
        nombreDevolver = nombreDevolver + ("Autor:" + autor) ;
        nombreDevolver = nombreDevolver + ("Paginas:" + paginas) ;
        if (referencia == "") {
            nombreDevolver = nombreDevolver + ("ZZZ") + " " +  ("Prestado" + prestado + "veces");
        }
        if (texto != true) {
            nombreDevolver = nombreDevolver + ("No es un libro de texto");
        }
        return nombreDevolver;
    }
}
