package eu.ffliss.scoBoss.entity;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.HashMap;

public class Handler {

    private HashMap<String, CustomZombie> customEntitys = new HashMap<>();

    public void createNewEntity(Location location, String name, float health){
        CustomZombie customZombie = new CustomZombie(location, name, health);
        customEntitys.put(customZombie.getUniqueID().toString(), customZombie);
    }

    public CustomZombie getCustomEntity(String uuid){
        return customEntitys.get(uuid);
    }

    public void killCustomEntity(String uuid){
        customEntitys.get(uuid).killEntity();
        customEntitys.remove(uuid);
    }
}
