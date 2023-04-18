package com.hemanth.AllinOneProgram.listener;

import com.hemanth.AllinOneProgram.configuration.EmailConfig;
import com.hemanth.AllinOneProgram.mailService.MailService;
import com.hemanth.AllinOneProgram.model.Student;
import com.hemanth.AllinOneProgram.model.University;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Listener
{

    @Autowired
    MailService mailService;


    @RabbitListener(queues = EmailConfig.login_queue)
    public void sendingMessage(University university)
    {
        String result=university.getStud().getEmail();
        System.out.println(result);

        mailService.sendMessage(result);

        System.out.println("Mail sent to"+result);



    }
}
