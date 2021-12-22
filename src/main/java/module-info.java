module com.projectmanager {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.projectmanager to javafx.fxml;
    exports com.projectmanager;
    exports com.projectmanager.GUIs;
    opens com.projectmanager.GUIs to javafx.fxml;
}