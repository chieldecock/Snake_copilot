package com.sogeti.java.snake.snakegame.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters and setters
}