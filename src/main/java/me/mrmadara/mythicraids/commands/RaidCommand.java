
package me.mrmadara.mythicraids.commands;

import me.mrmadara.mythicraids.MythicRaids;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class RaidCommand implements CommandExecutor {

    private final MythicRaids plugin;

    public RaidCommand(MythicRaids plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("mythicraids.admin")) {
            sender.sendMessage("§cVocê não tem permissão.");
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage("§eUse: /raid start <nome>");
            return true;
        }
        if (args[0].equalsIgnoreCase("start")) {
            sender.sendMessage("§aRaid iniciada: " + (args.length > 1 ? args[1] : "padrão"));
            // Lógica de spawn com MythicMobs seria adicionada aqui
        }
        return true;
    }
},
