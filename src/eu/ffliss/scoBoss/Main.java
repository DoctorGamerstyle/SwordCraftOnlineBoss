package eu.ffliss.scoBoss;

import eu.ffliss.scoBoss.commands.spawnCommand;
import eu.ffliss.scoBoss.entity.Handler;
import eu.ffliss.scoBoss.listener.EntityDamageByBlockEventListener;
import eu.ffliss.scoBoss.listener.EntityDamageByEntityEventListener;
import eu.ffliss.scoBoss.listener.EntityDamageEventListener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    private Handler handler;

    @Override
    public void onEnable() {
        instance = this;
        this.handler = new Handler();

        getCommand("spawn").setExecutor(new spawnCommand());

        new EntityDamageByEntityEventListener();
        new EntityDamageByBlockEventListener();
        new EntityDamageEventListener();
    }

    public static Main getInstance() {
        return instance;
    }

    public Handler getHandler() {
        return handler;
    }
}
