package eu.ffliss.scoBoss.commands;

import eu.ffliss.scoBoss.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class spawnCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {

        if (!(commandSender instanceof Player)){
            return true;
        }

        Player player = (Player) commandSender;

        if (args.length == 0){
            Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.1 §cZombie", 20);
            player.sendMessage("§cLv.1 §amob gespawnd");
        }

        if (args.length == 1){
            if (args[0].equalsIgnoreCase("lv1")){
                Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.1 §cZombie", 20);
                player.sendMessage("§cLv.1 §amob gespawnd");
            }
            if (args[0].equalsIgnoreCase("lv2")){
               Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.2 §cZombie", 40);
                player.sendMessage("§cLv.2 §amob gespawnd");
            }
            if (args[0].equalsIgnoreCase("lv3")){
                Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.3 §cZombie", 60);
                player.sendMessage("§cLv.3 §amob gespawnd");
            }
            if (args[0].equalsIgnoreCase("lv4")){
                Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.4 §cZombie", 80);
                player.sendMessage("§cLv.4 §amob gespawnd");
            }
            if (args[0].equalsIgnoreCase("lv5")){
                Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.5 §cZombie", 100);
                player.sendMessage("§cLv.5 §amob gespawnd");
            }

            if (args[0].equalsIgnoreCase("boss")){
                Main.getInstance().getHandler().createNewEntity(player.getLocation(), "§7Lv.5 §cBOSS", 200);
                player.sendMessage("§cLv.5 §aBoss §agespawnd");
            }
        }

        return false;
    }
}
