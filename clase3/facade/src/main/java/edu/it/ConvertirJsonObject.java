package edu.it;

public interface ConvertirJsonObject {
    public <T> T fromJson(String inputText, Class<T> classOfT);
}
