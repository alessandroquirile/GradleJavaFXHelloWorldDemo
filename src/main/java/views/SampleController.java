package views;

import javafx.fxml.FXML;

import java.awt.*;

/**
 * @author Alessandro Quirile, Mauro Telese
 */
public class SampleController {
    @FXML
    private Label label;

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }
}
