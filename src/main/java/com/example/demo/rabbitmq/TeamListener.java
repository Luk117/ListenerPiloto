package com.example.demo.rabbitmq;
import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TeamListener {

    @RabbitListener(queues= {"filaEquipo"})
    public void recibirResultados(String resultado){
        System.out.println("Llegaron los resultados de carrera: \n" + resultado);
    }
}
