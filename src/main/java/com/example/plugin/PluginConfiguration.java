package com.example.plugin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.PluginRegistry;

@Configuration
@Slf4j
public class PluginConfiguration {
    private final PluginRegistry<PrintPlugin,String>registry;

    public PluginConfiguration(PluginRegistry<PrintPlugin, String> registry,
                               @Value("${custom.spring.plugin}")String pluginName) {
        this.registry = registry;
//        registry.getPluginFor(pluginName).get().print("plugin message");
        log.info("Printing all the plugins: {}",registry.getPlugins());
//        log.info("Printing plugin for delimiter {} , {}",pluginName, registry.getPluginsFor(pluginName));
        log.info("Printing plugin for delimiter {}",registry.getPluginOrDefaultFor(pluginName,new DefaultPlugin()));
    }
}
