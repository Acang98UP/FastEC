package com.example.latte_core.app;

import java.util.WeakHashMap;

public class Configurator {
    private static final WeakHashMap<String,Object> LATTE_CONFIGS = new WeakHashMap<>();

    private Configurator(){
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(),false);
    }

    private static class Holder{
        private static final Configurator INSTANCE = new Configurator();
    }
}
