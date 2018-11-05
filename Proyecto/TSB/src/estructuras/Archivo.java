package estructuras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Representa un archivo
 */
public class Archivo {

    // Tabla hash
    private TSB_OAHashtable<String, Integer> ht = new TSB_OAHashtable<>();
    private boolean flagHashLevantada; //Es true si levanta tabla serializada

    public Archivo() {
        File arch = new File("tabla.dat");
        if (arch.exists()){
            Reader reader = new Reader("tabla.dat");
            ht = (TSB_OAHashtable<String, Integer>)reader.read();
            flagHashLevantada = true;
        }
        else
        {
            flagHashLevantada = false;
        }
    }

    public boolean levantoHashTable()
    {
        return flagHashLevantada;
    }

    public void limpiar() {
        ht.clear();
        Writer writer = new Writer();
        writer.write(ht);
    }

    public String cargar(String path) {

        StringBuilder sb = null;

        try ( Scanner sc = new Scanner(new FileReader(path)) ){

            sb = new StringBuilder();

            while (sc.hasNext())
            {
                String palabra = sc.next();

                palabra = palabra.replaceAll("[-+.^:,?¿¡!_1234567890/*#():;]","");
                palabra = palabra.replaceAll("\\[", "").replaceAll("\\]","");
                palabra = palabra.toLowerCase();

                if(ht.get(palabra)== null){
                    ht.put(palabra, 1);
                    sb.append(palabra + "\n");
                }
                else{
                    int valorActual = ht.get(palabra);
                    int nuevoValor = valorActual + 1;
                    ht.put(palabra, nuevoValor);
                }
            }

        }
        catch (FileNotFoundException ex)
        {
            System.out.println("No existe el archivo...");
        }

        Writer writer = new Writer();
        writer.write(ht);

        return sb.toString();
    }


    public int buscar(String palabra) {
        Integer cantidad = ht.get(palabra);

        if (cantidad == null) return -1;
        return cantidad;
    }

}
