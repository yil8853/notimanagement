package bookrentalcheon;

import bookrentalcheon.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PolicyHandler{

    @Autowired
    ReservationMirrorRepository reservationMirrorRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRevUpdate(@Payload Reserved reserved){
        if (reserved.isMe()) {

        }
    }
}
