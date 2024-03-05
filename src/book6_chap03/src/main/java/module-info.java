module org.example.book6_chap03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.book6_chap03 to javafx.fxml;
    exports org.example.book6_chap03;
}