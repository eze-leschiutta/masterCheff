package edu.it.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.it.UnaSolaInterfaz;
import java.util.HashMap;

public class FachadaJackson implements UnaSolaInterfaz {
    public String toJson(Object o) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            var envoltorio = new HashMap<String, Object>();
            // envoltorio.put("ConversonJackson", o);
            return mapper.writeValueAsString(o);
        }
        catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public <T> T fromJson(String inputText, Class<T> classOfT) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(inputText, classOfT);
        }
        catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
