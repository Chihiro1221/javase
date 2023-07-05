package com.test.study.Book;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock talkingClock = new TalkingClock(1000, true);
        talkingClock.start();
    }
}

class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start() {
//        TimePrinter timePrinter = this.new TimePrinter();
        ActionListener timePrinter = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone,the time is " + Instant.ofEpochMilli(e.getWhen()));
                if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer = new Timer(1000, timePrinter);
        timer.start();
    }

    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone,the time is " + Instant.ofEpochMilli(e.getWhen()));
            if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
        }

    }
}