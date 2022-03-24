package uaslp.objetos.parcial2.exam.messagebuilder;

import uaslp.objetos.parcial2.exam.messagebuilder.MessageType;

public interface MessageBuilderFactory {
    static String getMessageBuilder ( MessageType messageType ) {
        return null;
    }

    String getDescription();
    String create();

}
