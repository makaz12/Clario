package org.example.classpage.classScene;

import javafx.scene.Scene;
import org.example.classpage.ClassPlane.ClassPane;

public class ClassScene extends Scene {
    public static ClassScene instance;
    private ClassScene(){
        super(new ClassPane(), 800, 550);
    }
    public static ClassScene getInstance(){
        if(instance == null){
            instance = new ClassScene();
        }
        return instance;
    }
}
