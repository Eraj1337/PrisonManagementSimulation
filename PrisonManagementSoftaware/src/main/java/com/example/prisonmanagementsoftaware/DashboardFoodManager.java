package com.example.prisonmanagementsoftaware;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFoodManager {

    @FXML
    private AnchorPane foodmanagerpage;

    @FXML
    private Label foodmanagerwelcomelabel;

    @FXML
    void costmanagementlabel(ActionEvent event)throws IOException {switchScene("FoodManagerSecondGoal.fxml", event);

    }

    @FXML
    void foodmanagerbacklabel(ActionEvent event)throws IOException {switchScene("LoginPage.fxml", event);

    }

    @FXML
    void inventorymanagementlabel(ActionEvent event) throws IOException {switchScene("FoodManagerSixthGoal.fxml", event);

    }

    @FXML
    void mealplanninglabel(ActionEvent event) throws IOException {switchScene("FoodManagerFirstGoal.fxml", event);

    }

    @FXML
    void meldistributionlabel(ActionEvent event) throws IOException {switchScene("FoodManagerThirdGoal.fxml", event);

    }

    @FXML
    void nutritionalanalysislabel(ActionEvent event)throws IOException {switchScene("FoodManagerFifthGoal.fxml", event);

    }

    @FXML
    void specialdietlabel(ActionEvent event) throws IOException {switchScene("FoodManagerEighthGoal.fxml", event);

    }

    @FXML
    void suppliermanagementlabel(ActionEvent event) throws IOException {switchScene("FoodManagerFourthGoal.fxml", event);

    }

    @FXML
    void wastemanagementlabel(ActionEvent event) throws IOException {switchScene("FoodManagerSeventhGoal.fxml", event);

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
