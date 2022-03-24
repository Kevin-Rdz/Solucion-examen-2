package uaslp.objetos.parcial2.exam.exporters;

import java.lang.constant.Constable;

public class JsonExporter implements Exporter{
    @Override
    public String export( String message) {
        return "{ \"message\":\"json format\"}";
    }
}