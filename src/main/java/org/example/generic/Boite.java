package org.example.generic;

public class Boite <T>{
    private T content;

    public Boite(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
