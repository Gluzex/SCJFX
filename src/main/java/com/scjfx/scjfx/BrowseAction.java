package com.scjfx.scjfx;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;

public class BrowseAction {
    public String FName1;
    public File file1;
    public String path_u;

    public BrowseAction(TextField txt_fld1, Stage primaryStage, Button chckBtn1, TextField txtf1) {
        FName1 = txt_fld1.getText();
        FileChooser fch = new FileChooser();
        fch.setTitle("Выбор файла");
        fch.setInitialDirectory(new File("C:\\Users\\"));
        fch.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Excel файлы", "*.xlsx"),
                new FileChooser.ExtensionFilter("Все файлы", "*.*")
        );
        file1 = fch.showOpenDialog(primaryStage);


        path_u = file1.getPath();
        chckBtn1.setDisable(false);
        txtf1.setText(path_u);

        //ScrBtn11.addActionListener(new ButtonListener2(file1, path_u, FName1, cp1, mnf));
    }

}

