module org.example.classpage {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.classpage to javafx.fxml;
    exports org.example.classpage;
}