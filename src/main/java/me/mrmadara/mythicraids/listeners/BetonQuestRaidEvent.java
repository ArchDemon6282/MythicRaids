
package me.mrmadara.mythicraids.listeners;

import pl.betoncraft.betonquest.api.Objective;
import org.bukkit.entity.Player;

public class BetonQuestRaidEvent extends Objective {

    public BetonQuestRaidEvent(String instruction) {
        super(instruction);
    }

    @Override
    public void start() {
        // Aqui você colocaria lógica para iniciar a raid via BetonQuest
    }

    @Override
    public void stop() {}

    @Override
    public String getDefaultData() {
        return "";
    }

    @Override
    public String getCurrentData() {
        return "";
    }

    @Override
    public void reset() {}
}
