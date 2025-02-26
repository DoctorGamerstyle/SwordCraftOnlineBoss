package eu.ffliss.scoBoss.listener;

import eu.ffliss.scoBoss.Main;
import eu.ffliss.scoBoss.entity.CustomZombie;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamageByEntityEventListener implements Listener {

    public EntityDamageByEntityEventListener() {
        Main.getInstance().getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }

    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event){

        if (Main.getInstance().getHandler().getCustomEntity(event.getEntity().getUniqueId().toString()) == null){
            return;
        }

        CustomZombie customZombie = Main.getInstance().getHandler().getCustomEntity(event.getEntity().getUniqueId().toString());
        customZombie.addDamage((float) event.getDamage());

        if (event.getDamager() instanceof Player){
            Player player = (Player)event.getDamager();
            player.sendMessage("§aHealth§7:§a" + customZombie.getHealth() + "§7/§c" + customZombie.getMaxHealt());
        }


    }
}
