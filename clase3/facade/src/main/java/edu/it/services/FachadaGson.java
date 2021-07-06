package edu.it.services;

import com.google.gson.Gson;
import edu.it.UnaSolaInterfaz;
import java.util.HashMap;

public class FachadaGson implements UnaSolaInterfaz {
    @Override
    public String toJson(Object o) {
        var envoltorio = new HashMap<String, Object>();
        // envoltorio.put("ConversonGson", o);
        return new Gson().toJson(o);
    }

    @Override
    public <T> T fromJson(String inputText, Class<T> classOfT) {
        return new Gson().fromJson(inputText, classOfT);
    }
}
