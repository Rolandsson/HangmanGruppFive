module com.example.hangmangruppfive {
    requires javafx.controls;
    requires javafx.fxml;


    opens Game to javafx.fxml;
    exports Game;
}