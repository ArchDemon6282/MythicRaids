
package me.mrmadara.mythicraids;

import org.bukkit.plugin.java.JavaPlugin;
import me.mrmadara.mythicraids.commands.RaidCommand;
import me.mrmadara.mythicraids.listeners.CitizensListener;

public class MythicRaids extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MythicRaids ativado com sucesso.");
        saveDefaultConfig();
        getCommand("raid").setExecutor(new RaidCommand(this));
        if (getServer().getPluginManager().isPluginEnabled("Citizens")) {
            getServer().getPluginManager().registerEvents(new CitizensListener(this), this);
        }
    }

    @Override
    public void onDisable() {
        getLogger().info("MythicRaids desativado.");
    }
}
