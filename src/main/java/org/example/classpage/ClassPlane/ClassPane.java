package org.example.classpage.ClassPlane;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class ClassPane extends GridPane {
    Button add = new Button("+ Add new Assignment");
    Image profileImage = new Image("file:/Users/w0888370/IdeaProjects/ClassPage/Images/img.png");
    String className ="name";
    Text classNameT = new Text(className);

    ClassAssignment assignment1 = new ClassAssignment();
    ClassAssignment assignment2 = new ClassAssignment();
    public ClassPane(){



        this.setGridLinesVisible(true);

        Circle profile = new Circle(50);
        profile.setFill(new ImagePattern(profileImage));

        this.add(profile, 0, 0);
        GridPane.setHalignment(classNameT, HPos.CENTER);
        GridPane.setHalignment(profile, HPos.RIGHT);
        this.add(classNameT, 0, 1);
        this.add(add, 0, 2);
        GridPane.setHalignment(add, HPos.CENTER);
        add.setPadding(new Insets(5, 20, 5, 20));
        this.add(assignment1, 0, 3);
        this.add(assignment2, 0, 4);
        this.setAlignment(Pos.CENTER);

        for(Node element : this.getChildren()){
            GridPane.setMargin(this, new Insets(10));
        }




    }
}
