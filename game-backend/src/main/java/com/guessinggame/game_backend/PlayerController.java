package com.guessinggame.game_backend;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class PlayerController {

    @MessageMapping("/join")
    @SendTo("/topic/lobby")
    public Player getPlayer(Player player) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Player(HtmlUtils.htmlEscape(player.getUsername()), HtmlUtils.htmlEscape(player.getSocketId()));
    }

}