package org.example._02springweb_;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class GetMessage {

    List<Message> messages = new ArrayList<>();

    @PostMapping("/message")
    public Message addMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return messages;
    }

    @DeleteMapping("/message/{id}")
    public Message deleteMessage(@PathVariable String id) {
        for (Message message : messages) {
            if (message.id().equals(id)) {
                messages.remove(message);
                System.out.println("Message removed");
                return message;
            } else {
                System.out.println("Message not found");
            }
        }
        return null;
    }

}