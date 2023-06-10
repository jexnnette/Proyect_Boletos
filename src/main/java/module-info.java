module com.mycompany.ventatickets {
    requires javafx.controls;
    requires java.base;
    requires javafx.fxml;
    requires java.sql;
    exports com.mycompany.ventatickets;
    exports controllers.HomeController;
    exports controllers.AuthController;
    exports Conexion;
    exports models;
}
