package uaslp.objetos.parcial2.exam.exporters;

public class HtmlExporter<T> implements ExporterFactory<T>{
    @Override
    public T export(T message) {
        return "<html><body>HTML format</body></html>";
    }
}