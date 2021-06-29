package com.jarchitect.menu.repository;

import com.google.gson.Gson;
import com.jarchitect.menu.model.MetadataMenu;
import org.apache.commons.io.FileUtils;

import java.io.File;

public class LectorMetadataMenu {
    public MetadataMenu leer() {
        try {
            String jsonFile = FileUtils.readFileToString(
                    new File("C:/cursos/masterCheff/clase2/inversionofdependency/menu.json"),
                    "UTF-8"
            );
            MetadataMenu mm = new Gson().fromJson(jsonFile, MetadataMenu.class);
            return mm;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException();
        }
    }
}
