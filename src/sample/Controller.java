package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    @FXML
    public TextArea jta;
    @FXML
    public TextField jtf;

    public void sendMsg(){
        String str = jtf.getText();
        jtf.clear();
        String user = "User";
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd  HH:mm:ss");
        jta.appendText(user+ " (" + dateFormat.format(today) + ") :\n" + str + "\n");
    }
}
