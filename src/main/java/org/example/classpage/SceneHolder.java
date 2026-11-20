package org.example.classpage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.classpage.classScene.ClassScene;

import java.io.IOException;

public class SceneHolder extends Application{
    public static Stage mainStage;
    Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        scene = ClassScene.getInstance();
        mainStage = stage;
        mainStage.setScene(scene);
        mainStage.show();
    }
}
