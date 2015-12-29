package elecciones;

import java.io.IOException;
import java.io.Serializable;

/**
 * @autor Raul Martin
 * @autor Jose Miguel Garcia
 * @autor Daniel Oliver
 */
public class Elecciones implements Serializable{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        PartidoPolitico podemos = new PartidoPolitico("Podemos", "PDM", "URLlogo");
        
        Militante pepito1 = new Militante(10.5,"Numero Socio:1","Pepito",30,"profesor",'m',"URJC");
        
        Simpatizante pepito2 = new Simpatizante("Pepito",30,"profesor",'m',"URJC");
        
        podemos.getTodos_votantes().add(pepito2);
        podemos.getTodos_votantes().add(pepito1);
        podemos.getMilitantes().add(pepito1);
        
        System.out.println(podemos.toString());
        
        
    };
};