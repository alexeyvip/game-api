package ru.klepekov.game.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import ru.klepekov.game.GameConstants;

import java.io.UnsupportedEncodingException;

/**
 * Created by alexey on 20.03.16.
 */
public class WebSocketHandler extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message) {
        try {
            System.out.println("Session: " + session.getId() + ", message: " + new String(message.asBytes(),
                    GameConstants.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}
