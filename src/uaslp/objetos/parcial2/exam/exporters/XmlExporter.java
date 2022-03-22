package uaslp.objetos.parcial2.exam.exporters;

public class XmlExporter<T> implements ExporterFactory<T>{
    @Override
    public T export(T message) {
        return "<message>XML format</message>";
    }
}