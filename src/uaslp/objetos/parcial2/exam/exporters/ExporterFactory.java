package uaslp.objetos.parcial2.exam.exporters;

public class ExporterFactory implements Exporter {
    //private String exporter;
     public static Exporter getExporter( ExporterType exporter){
        switch (exporter){
            case JSON:
                return new JsonExporter();
            case XML:
                return new XmlExporter();
            case HTML:
                return new HtmlExporter();
        }
        return null;
    }

    @Override
    public String export ( String message ) {
        return null;
    }
}
