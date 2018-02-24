package com.danielpuiu.swing.layout;

import java.awt.Component;

class Bounds {

    int x;
    int y;

    int width;
    int height;

    Bounds() {
    }

    Bounds(Component component) {
        this.x = component.getX();
        this.y = component.getY();
        this.width = component.getWidth();
        this.height = component.getHeight();
    }

    @Override
    public String toString() {
        return String.format("%s{x=[%d], y=[%d], width=[%d], height=[%d]}", getClass().getSimpleName(), x, y, width, height);
    }
}
