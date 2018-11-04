package estructuras;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Map;

public class Reader<E extends Map>
{
    private String arch = "tabla.dat";


    public Reader()
    {
    }


    public Reader(String nom)
    {
        arch = nom;
    }

    public E read() {

        E tabla;

        try {
            FileInputStream istream = new FileInputStream(arch);
            ObjectInputStream p = new ObjectInputStream(istream);
            tabla = (E) p.readObject();
            p.close();
            istream.close();

        }

        catch (Exception e) {
            tabla = null;
        }

        return tabla;
    }
}

