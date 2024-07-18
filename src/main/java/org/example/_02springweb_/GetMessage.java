package org.example._02springweb_;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GetMessage {

    List<Message> messages = new ArrayList<>();

    @PostMapping("/message")
    public Message addMessage(Message message) {
        messages.add(message);
        System.out.println(message.message);
        return message;
    }

}
