package com.company;


import java.io.File;

public interface Parser {
    Object getObject ( String path, Class c );

    void saveObject ( String path, Object o );
}
