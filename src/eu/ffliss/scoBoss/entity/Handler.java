package eu.ffliss.scoBoss.entity;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.HashMap;

public class Handler {

    private HashMap<String, CustomEntity> customEntitys = new HashMap<>();

    public void createNewEntity(Location location, String name, float health){
        CustomEntity customEntity = new CustomEntity(location, name, health);
        Bukkit.broadcastMessage(health + " soll");
        Bukkit.broadcastMessage( customEntity.getHealth() + " hat");

        customEntitys.put(customEntity.getUniqueID().toString(), customEntity);
    }

    public CustomEntity getCustomEntity(String uuid){
        return customEntitys.get(uuid);
    }

    public void killCustomEntity(String uuid){
        customEntitys.get(uuid).killEntity();
        customEntitys.remove(uuid);
    }
}
