package estructuras;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

public class Writer<E extends Map>
{

    private String arch = "tabla.dat";


    public Writer()
    {
    }

    public Writer(String nom)
    {
        arch = nom;
    }


    public boolean write(E tabla) {

        try (FileOutputStream ostream = new FileOutputStream(arch)) {
            ObjectOutputStream p = new ObjectOutputStream(ostream);
            p.writeObject(tabla);
            p.flush();
            ostream.close();


        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
