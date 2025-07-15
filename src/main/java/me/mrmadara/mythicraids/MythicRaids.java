
package me.mrmadara.mythicraids;

import org.bukkit.plugin.java.JavaPlugin;
import me.mrmadara.mythicraids.commands.RaidCommand;

public class MythicRaids extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MythicRaids ativado com sucesso.");
        saveDefaultConfig();
        getCommand("raid").setExecutor(new RaidCommand(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("MythicRaids desativado.");
    }
}
