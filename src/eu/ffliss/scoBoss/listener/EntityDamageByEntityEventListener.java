package eu.ffliss.scoBoss.listener;

import eu.ffliss.scoBoss.Main;
import eu.ffliss.scoBoss.entity.CustomEntity;
import org.bukkit.Bukkit;
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

        CustomEntity customEntity = Main.getInstance().getHandler().getCustomEntity(event.getEntity().getUniqueId().toString());
        customEntity.addDamage((float) event.getDamage());


    }
}
