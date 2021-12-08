package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatMessageController {
    private ChatMessageRepository ChatMessageRepository;

    public ChatMessageController(ChatMessageRepository ChatMessageRepository) {
        this.ChatMessageRepository = ChatMessageRepository;
    }

    @GetMapping("/api/message")
    public List<String> getLastTenMessages() {
        return ChatMessageRepository.getLastTenMessages();
    }
}
