package me.ruende.rtp;

import me.ruende.rtp.commands.RandomTeleportCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Rtp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getCommandMap().register("", new RandomTeleportCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
