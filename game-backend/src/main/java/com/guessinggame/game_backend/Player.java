package com.guessinggame.game_backend;

public class Player {
    private String username;
    private String socketId;

    public Player(String username, String socketId) {
        this.username = username;
        this.socketId = socketId;
    }

    public String getUsername() {
        return this.username;
    }

    public String getSocketId() {
        return this.socketId;
    }
}
