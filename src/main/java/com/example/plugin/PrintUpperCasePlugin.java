package com.example.plugin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PrintUpperCasePlugin implements PrintPlugin{
    @Override
    public void print(String message) {
        log.info("Plugin name {} , message {}",PrintUpperCasePlugin.class.getSimpleName(),message);
    }

    @Override
    public boolean supports(String delimiter) {
        return delimiter.equals(PrintUpperCasePlugin.class.getSimpleName());
    }
}
