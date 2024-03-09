package org.example.dependencyInversion.example.good;

public class TextReader implements Reader{
    public String getUsername() {
        return "mikesmith";
    }
}
