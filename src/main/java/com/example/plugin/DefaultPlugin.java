package com.example.plugin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DefaultPlugin implements PrintPlugin{
    @Override
    public void print(String message) {
        log.info("Printing from {} , {}: ",DefaultPlugin.class.getSimpleName(),message);
    }

    @Override
    public boolean supports(String s) {
        return s.equals(DefaultPlugin.class.getSimpleName());
    }
}
