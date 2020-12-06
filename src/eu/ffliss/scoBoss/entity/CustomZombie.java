package eu.ffliss.scoBoss.entity;

import net.minecraft.server.v1_16_R2.*;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_16_R2.CraftWorld;
import org.bukkit.entity.Entity;

public class CustomZombie extends EntityZombie {

    private float health;
    private float maxHealth;

    public CustomZombie(Location location, String name, float health) {
        super(EntityTypes.ZOMBIE, ((CraftWorld)location.getWorld()).getHandle());
        this.setPosition(location.getX(), location.getY(), location.getZ());
        this.setBaby(false);
        this.setCustomName(new ChatComponentText(name));
        this.setCustomNameVisible(true);
        this.health = health;
        this.maxHealth = health;
        this.setHealth(health);
        ((CraftWorld)location.getWorld()).getHandle().addEntity(this);
    }

    public void addDamage(float damage){
        this.health = this.health - damage;
        this.setHealth(20);
    }

    public float getMaxHealt() {
        return this.maxHealth;
    }

    public float getHealth(){
        return this.health;
    }
}
