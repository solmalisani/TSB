package sample;

import estructuras.Archivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Archivo archivo;

    @FXML
    private TextField txtPalabra;

    @FXML
    private Label lblResultado;

    @FXML
    private TextArea txtArchivo;

    @FXML
    private Label lblContRes;


    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        archivo = new Archivo();
        if(archivo.levantoHashTable())
        {

        }


    }

    @FXML
    private void btnCargarClick(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setTitle("Seleccionar archivo de texto");
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Documento de texto (*.txt)", "*.txt"));
        File file = fc.showOpenDialog(null);
        if (file != null)
        {
            txtArchivo.appendText(archivo.cargar(file.getAbsolutePath()));
        }

    }

    @FXML
    private void btnBuscarClick(ActionEvent event) {
        if(txtPalabra.getText().isEmpty())
            lblResultado.setText("No ingresó una palabra");
        else
        {
            String x = txtPalabra.getText();
            int cant = archivo.buscar(x);

            if(cant != -1) {
                lblResultado.setText("Palabra encontrada");
                lblContRes.setText("Aparece " + cant + " veces");
            }
            else {
                lblResultado.setText("Palabra No encontrada");
                lblContRes.setText("");
            }

        }

    }

    @FXML
    private void btnLimpiarClick(ActionEvent event) {
        archivo.limpiar();
        txtArchivo.setText("");
        txtPalabra.setText("");
        lblResultado.setText("");
        lblContRes.setText("");
    }
}
