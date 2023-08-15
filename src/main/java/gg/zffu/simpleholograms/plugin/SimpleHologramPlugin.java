package gg.zffu.simpleholograms.plugin;

import gg.zffu.simpleholograms.api.SimpleHologramsAPI;
import org.bukkit.plugin.java.JavaPlugin;

public final class SimpleHologramPlugin extends JavaPlugin {

    private SimpleHologramsAPI api;

    @Override
    public void onEnable() {

        // Init the plugin API
        this.api = new SimpleHologramsAPI(this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
