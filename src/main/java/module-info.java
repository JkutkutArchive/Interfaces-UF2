module dam.interfaces.uf2_vboxbtn {
    requires javafx.controls;
    requires javafx.fxml;


    opens dam.interfaces.uf2_vboxbtn to javafx.fxml;
    exports dam.interfaces.uf2_vboxbtn;
}