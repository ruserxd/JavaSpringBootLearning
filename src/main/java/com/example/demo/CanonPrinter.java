package com.example.demo;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class CanonPrinter implements Printer {
    @Override
    public void print(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("Canon印表機: " + message + " at " + timestamp);
    }
}