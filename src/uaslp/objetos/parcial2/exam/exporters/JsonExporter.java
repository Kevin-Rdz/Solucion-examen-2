package uaslp.objetos.parcial2.exam.exporters;

public class JsonExporter<T> implements ExporterFactory<T>{
    @Override
    public T export(T message) {
        return "{ \"message\":\"json format\"}";
    }
}