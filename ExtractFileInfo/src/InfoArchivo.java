
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author esau.brizuela
 */
public class InfoArchivo {

    protected String archivo;
    protected String directorio;
    protected String nombreArchivo;
    protected Path ruta;
    protected Path pathDirectorio = Paths.get("");

    public InfoArchivo() {
    }

    public InfoArchivo(String archivo) {
        this.archivo = archivo;
    }

    protected void ExtraeInfo() {
        try {

        } catch (Exception e) {
            System.out.println("InfoArchivo>ExtraeInfo> Error ==> " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    }

    private String ObtieneDirectorio() {
        try {

            this.directorio = this.pathDirectorio.getFileName().toString();
            return null;
        } catch (Exception e) {
            System.out.println("InfoArchivo>ObtieneDirectorio> Error ==> " + e.getMessage() + "\n");
            e.printStackTrace();
            return null;
        }
    }
}
