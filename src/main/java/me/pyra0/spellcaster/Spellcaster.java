package me.pyra0.spellcaster;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spellcaster extends JavaPlugin {

    private static Spellcaster instance;

    @Override
    public void onEnable() {
        instance = this;
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            // register placeholder expansion
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Spellcaster getInstance() {
        return instance;
    }
}
