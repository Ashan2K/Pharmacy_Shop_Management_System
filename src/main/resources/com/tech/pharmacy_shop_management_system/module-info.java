module com.tech.pharmacy_shop_management_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires javafx.web;
    requires jasperreports;
    requires javafx.graphics;
    requires javafx.graphics;
    requires javafx.controls;
    requires de.jensd.fx.glyphs.fontawesome;

    opens com.tech.pharmacy_shop_management_system to javafx.fxml;
    exports com.tech.pharmacy_shop_management_system;
    exports RemortCustomer;
    opens RemortCustomer to javafx.fxml;

    opens Authourization to javafx.fxml;
    exports Authourization;

    exports SalesTransaction;
    opens SalesTransaction to javafx.fxml;
    exports User;
    opens User to javafx.fxml;

}