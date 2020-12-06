package eu.ffliss.scoBoss.entity;

import net.minecraft.server.v1_16_R2.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R2.CraftWorld;
import org.bukkit.entity.Entity;

public class CustomEntity extends EntityZombie {

    private float health;

    public CustomEntity(Location location, String name, float health) {
        super(EntityTypes.ZOMBIE, ((CraftWorld)location.getWorld()).getHandle());
        this.setPosition(location.getX(), location.getY(), location.getZ());
        this.setBaby(false);
        this.setCustomName(new ChatComponentText(name));
        this.setCustomNameVisible(true);
        this.health = health;
        this.setHealth(health);
        ((CraftWorld)location.getWorld()).getHandle().addEntity(this);
    }

    public void addDamage(float damage){
        this.health = this.health - damage;
        this.setHealth(20);
    }

    public float getHealth(){
        return this.health;
    }
}
