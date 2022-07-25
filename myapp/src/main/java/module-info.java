/**
 * Module for SMS Backup & Restore file viewer application.
 */
open module com.myapp {
    // Java SDK dependencies
    requires java.base;
    requires java.desktop;
    requires jdk.jsobject;

    // Other libraries dependencies
    requires org.apache.commons.lang3;
    requires org.jsoup;
    requires emojijava;
    requires json;

    // Public API :
    exports com.myapp;
}