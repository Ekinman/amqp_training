package fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    private final ChatMessageRepository ChatMessageRepository;

    public void onMessage(String message){
        System.out.println(message);
        ChatMessageRepository.addChatMessage(message);
    }
    public ChatMessageListener(ChatMessageRepository chatMessageRepository) {
        this.ChatMessageRepository = chatMessageRepository;
    }

}

