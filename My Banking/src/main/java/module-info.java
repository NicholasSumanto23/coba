module com.example.projekjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projekjavafx to javafx.fxml;
    exports com.example.projekjavafx;
}