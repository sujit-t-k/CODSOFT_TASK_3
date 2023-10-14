module codsoft.sujit.quiz {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens codsoft.sujit.quiz to javafx.fxml;
    exports codsoft.sujit.quiz;
}