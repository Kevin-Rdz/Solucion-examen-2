package uaslp.objetos.parcial2.exam.exporters;

public abstract class HtmlExporter implements Exporter{
    @Override
    public String export(String message) {
        return "<html><body>HTML format</body></html>";
    }

}