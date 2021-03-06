package elecciones;
/**
 * @autor Raul Martin
 * @autor Jose Miguel Garcia
 * @autor Daniel Oliver
 */

public abstract class Votantes {
//Atributos
    protected String nombreApellidos;
    protected int edad;
    protected String profesion;
    protected char genero;
    protected String siglasPartido;
    protected String[] encuesta;

//Contructores
    public Votantes(String nombreApellidos){
        this.nombreApellidos= nombreApellidos;
    }
    public Votantes(String nombreApellidos, int edad, String profesion, char genero, String siglasPartido) {
        this.nombreApellidos = nombreApellidos;
        this.edad = edad;
        this.profesion = profesion;
        this.genero = genero;
        this.siglasPartido = siglasPartido;
    }
    
//GETs y SETs
    public String getNombreApellidos() {
        return nombreApellidos;
    }
    public void setNombreApellidos(String nombre) {
        this.nombreApellidos = nombre;
    }

    @Override
    public String toString() {
        return "Votantes{" + "Nombre y Apellidos=" + nombreApellidos + ", edad=" + edad + ", profesion=" + profesion + ", genero=" + genero + ", siglasPartido=" + siglasPartido + ", encuesta=" + encuesta + '}';
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String getSiglasPartido() {
        return siglasPartido;
    }
    public void setSiglasPartido(String siglasPartido) {
        this.siglasPartido = siglasPartido;
    }
    public String[] getEncuesta() {
        return encuesta;
    }
    public void setEncuesta(String[] encuesta) {
        this.encuesta = encuesta;
    }

//Metodos Publicos
/**    public String[] enviarEncuesta(){
        String[] pregMil = {"pregunta1", "pregunta2", "pregunta3"};
        String[] pregSimp = {"pregunta1", "pregunta2", "pregunta3"};
        if (this instanceof Simpatizante) {
            return encuesta=pregSimp.clone();
        } else {
            return encuesta=pregMil.clone();
        }
    };
    */
    public abstract void enviarEncuesta();
//Metodos Privados




}

