package elecciones;
import java.util.ArrayList;
/**
 * @autor Raul Martin
 * @autor Jose Miguel Garcia
 * @autor Daniel Oliver
 */
public class Coalicion extends FormacionPolitica{
    private ArrayList<PartidoPolitico> coalicion_partidos;

    
//Contructores
    public Coalicion(String nombre, String siglas, String logo) {
        super(nombre, siglas, logo);
    }
//GETs y SETs
    public ArrayList<PartidoPolitico> getCoalicion_partidos() {
        return coalicion_partidos;
    }

    public void setCoalicion_partidos(ArrayList<PartidoPolitico> coalicion_partidos) {
        this.coalicion_partidos = coalicion_partidos;
    }
    
//Metodos Publicos
    @Override
    public ArrayList elaborarListas(){
        return super.elaborarListas();
    };
//Metodos Privados

}