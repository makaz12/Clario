package org.example.classpage.ClassPlane;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
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


        //grid lines for debugging
        this.setGridLinesVisible(true);

        //create a circle and fill it with the profile image
        Circle profile = new Circle(50);
        profile.setFill(new ImagePattern(profileImage));

        //set a unique column to expand to 70% of the screen
        ColumnConstraints col0 = new ColumnConstraints();
        col0.setPercentWidth(70);
        col0.setHgrow(Priority.ALWAYS);
        this.getColumnConstraints().add(col0);

        //make the content grow to the size of the column
        RowConstraints rowProfile = new RowConstraints();
        RowConstraints rowName = new RowConstraints();
        RowConstraints rowButton = new RowConstraints();
        this.getRowConstraints().addAll(rowName, rowProfile, rowButton);

        //adjust the position of the elements in the gridpane
        this.add(profile, 0, 0);
        GridPane.setHalignment(classNameT, HPos.CENTER);
        GridPane.setHalignment(profile, HPos.RIGHT);
        GridPane.setHalignment(assignment1, HPos.CENTER);
        GridPane.setHalignment(assignment2, HPos.CENTER);
        this.add(classNameT, 0, 1);
        this.add(add, 0, 2);
        GridPane.setHalignment(add, HPos.CENTER);
        add.setPadding(new Insets(5, 20, 5, 20));
        this.add(assignment1, 0, 3);
        this.add(assignment2, 0, 4);
        this.setAlignment(Pos.CENTER);



        //loop through the elements and set the margin to 10
        for(Node element : this.getChildren()){
            GridPane.setMargin(this, new Insets(10));
        }

    }
}
