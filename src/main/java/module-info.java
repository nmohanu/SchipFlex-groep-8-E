module com.example.shipflex {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.shipflex to javafx.fxml;
    exports com.example.shipflex;
}