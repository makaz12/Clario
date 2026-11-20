package org.example.classpage.ClassPlane;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class ClassAssignment extends BorderPane {
    //Assignment text
    Text assignment1 = new Text("Assignment name\n" +
            "Information\n" +
            "Information\n" );

    Button edit =new Button("Edit");
    Button options = new Button("options");

    public ClassAssignment(){
        HBox assignments = new HBox(assignment1, options, edit);
        for(Node node : assignments.getChildren()){
            HBox.setMargin(node, new Insets(9));
        }
        HBox.setMargin(options, new Insets(9, 1, 9, 9));
        this.setCenter(assignments);
    }
}
