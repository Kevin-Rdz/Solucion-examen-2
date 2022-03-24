package uaslp.objetos.parcial2.exam.messagebuilder;

import uaslp.objetos.parcial2.exam.exporters.Exporter;

public class MessageBuilderFactory extends MessageBuilder {
    public static MessageBuilder getMessageBuilder(MessageType messageType){
       switch (messageType) {
           case RESERVATION_CREATE:
               return new Create();
           case RESERVATION_MODIFY:
               return new Modify();
           case RESERVATION_CHECKIN:
               return new Checkin();
           case RESERVATION_CHECKOUT:
               return new Checkout();
       };
        return null;
    }

    @Override
    protected String getDescription () {
        return null;
    }
}
