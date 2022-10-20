package dam.interfaces.uf2_vboxbtn;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class VBoxBtnController implements Initializable {
    @FXML
    private TextField txtfInput;

    @FXML
    private TextArea txtaOutput;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    protected void onBtnOkClick() {
        txtaOutput.setText(txtfInput.getText());
    }
}