package uaslp.objetos.parcial2.exam.exporters;

public class ExporterFactory implements Exporter {
    //private String exporter;
    public ExporterType getExporter( ExporterType exporter){
        return exporter;
    }

    @Override
    public String export ( String message ) {
        return null;
    }
}
