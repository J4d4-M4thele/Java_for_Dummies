module org.example.book6_chap02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.book6_chap02 to javafx.fxml;
    exports org.example.book6_chap02;
}