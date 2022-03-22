package uaslp.objetos.parcial2.exam.exporters;

public interface ExporterFactory<T> {
    T getExporter ( T data );
}
