
package me.mrmadara.mythicraids.listeners;

import net.citizensnpcs.api.event.NPCClickEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import me.mrmadara.mythicraids.MythicRaids;

public class CitizensListener implements Listener {

    private final MythicRaids plugin;

    public CitizensListener(MythicRaids plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onNPCClick(NPCClickEvent event) {
        if (event.getClickType().isRightClick()) {
            event.getClicker().sendMessage("§eNPC clicado! Iniciando raid...");
            // Aqui você chamaria a lógica real da raid
        }
    }
}
