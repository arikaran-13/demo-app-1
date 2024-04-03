package com.example.plugin;

import org.springframework.plugin.core.Plugin;

public interface PrintPlugin extends Plugin<String> {

    void print(String message);
}
