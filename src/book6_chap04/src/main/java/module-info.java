module org.example.book6_chap04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.book6_chap04 to javafx.fxml;
    exports org.example.book6_chap04;
}