package com.projectmanager.libraryFunctions;

public interface iPrintable {
    //Gets the fields which are printable from the objects
    //Format of printable fields should be "Forename: Value, Surname: Value, ... "
    public String getPrintableString();
}
