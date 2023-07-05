package com.test.study.Book;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.time.Instant;

class Greeter {
    public void greet(ActionEvent event) {
        System.out.println("Hello, the time is " + Instant.ofEpochMilli(event.getWhen()));
    }
}

public class RepeatedGreeter extends Greeter {
    public void greet() {
        Timer timer = new Timer(1000, super::greet);
        timer.start();
    }
}