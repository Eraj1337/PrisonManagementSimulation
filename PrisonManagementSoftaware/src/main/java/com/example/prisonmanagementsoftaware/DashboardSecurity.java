package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardSecurity {

    @FXML
    private AnchorPane securitymanagerpage;

    @FXML
    private Label securitymanagerwelcomelabel;

    @FXML
    void externernalcoordinationlabel(ActionEvent event) throws IOException {switchScene("SecuritySixthGoal.fxml", event);

    }

    @FXML
    void inmatemovementslabel(ActionEvent event) throws IOException { switchScene("SecuritySeCondGoal.fxml", event);

    }

    @FXML
    void reportsandanalyticslabel(ActionEvent event) throws IOException {switchScene("SecurityManagerEigthGoal.fxml", event);

    }

    @FXML
    void responseissuelabel(ActionEvent event) throws IOException {switchScene("SecurityFifthGoal.fxml", event);

    }

    @FXML
    void safetyandsecuritylabel(ActionEvent event) throws IOException { switchScene("SecurityFirstGoal.fxml", event);

    }




    @FXML
    void securitybacklabel(ActionEvent event) throws IOException { switchScene("LoginPage.fxml", event);

    }

    @FXML
    void securitydrillsandtraininglabel(ActionEvent event) throws IOException { switchScene("SecurityThirdGoal.fxml", event);

    }

    @FXML
    void securityequipmentslabel(ActionEvent event) throws IOException { switchScene("SecurityFourthGoal.fxml", event);

    }

    @FXML
    void securitypolicieslabel(ActionEvent event) throws IOException {switchScene("SecuritySeventhGoal.fxml", event);

    }
    private void switchScene(String fxmlFile, ActionEvent event) throws IOException {
        // Load the FXML file
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        AnchorPane newSceneRoot = loader.load();

        // Get the current stage
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();

        // Set the new scene
        Scene scene = new Scene(newSceneRoot);
        stage.setScene(scene);
        stage.show();
    }
}
