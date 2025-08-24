package com.guessinggame.game_backend;

import java.util.UUID;

@Entity
public class Player {
    private String username;
    private String socketId;
    @ID
    @GeneratedValue
    private UUID uuid;

    protected Player() {
    }

    public Player(String username, String socketId) {
        this.username = username;
        this.socketId = socketId;
        this.uuid = UUID.randomUUID();
    }

    public String getUsername() {
        return this.username;
    }

    public String getSocketId() {
        return this.socketId;
    }

    public UUID getUUID() {
        return this.uuid;
    }

}
