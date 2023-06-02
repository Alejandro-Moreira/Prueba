public class Literatura {//Creamos loa atributos de la clase Literatura
    String tipo;
    String autor;
    int anio;
    int edicion;
    String titulo;
    //Constructor
    public Literatura(String tipo, String autor, int anio, int edicion, String titulo) {//Realizamos el constructor
        this.tipo = tipo;
        this.autor = autor;
        this.anio = anio;
        this.edicion = edicion;
        this.titulo = titulo;
    }
    //Metodos
    public String getTipo() {//Setters y getters
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}

