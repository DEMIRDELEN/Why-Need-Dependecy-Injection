package main;


import service.MailService;
import service.MessageService;
import service.SMSService;
import service.WhatsAppService;

public class MyApplication {

    public static void main(String[] args) {

        String serviceName="mailService";
        if(args.length>0) {
            serviceName=args[0];
        }

        //

        MessageService messageService=null;


        if(serviceName.equalsIgnoreCase("whatsAppService")) {
            messageService=new WhatsAppService();
            messageService.sendMessage();
        }else if(serviceName.equalsIgnoreCase("smsService")) {
            messageService=new SMSService();
            messageService.sendMessage();
        }else {
            messageService=new MailService();
            messageService.sendMessage();
        }


//		MessageService whatsAppService=new WhatsAppService();
//		whatsAppService.sendMessage();
//
//		MessageService smsService=new SMSService();
//		smsService.sendMessage();
    }

}