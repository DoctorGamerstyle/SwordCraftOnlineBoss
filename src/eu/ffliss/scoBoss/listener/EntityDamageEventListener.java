package eu.ffliss.scoBoss.listener;

import eu.ffliss.scoBoss.Main;
import eu.ffliss.scoBoss.entity.CustomZombie;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamageEventListener implements Listener {

    public EntityDamageEventListener() {
        Main.getInstance().getServer().getPluginManager().registerEvents(this, Main.getInstance());
    }

    @EventHandler
    public void onDamage(EntityDamageEvent event){

        if (Main.getInstance().getHandler().getCustomEntity(event.getEntity().getUniqueId().toString()) == null){
            return;
        }

        CustomZombie customZombie = Main.getInstance().getHandler().getCustomEntity(event.getEntity().getUniqueId().toString());
        customZombie.addDamage((float) event.getDamage());

    }
}
