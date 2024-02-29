module org.example.book6_chap01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.book6_chap01 to javafx.fxml;
    exports org.example.book6_chap01;
}