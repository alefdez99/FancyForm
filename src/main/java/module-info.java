module es.ieslosmontecillos.fancyform {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.fancyform to javafx.fxml;
    exports es.ieslosmontecillos.fancyform;
}