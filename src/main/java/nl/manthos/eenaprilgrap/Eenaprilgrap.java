package nl.manthos.eenaprilgrap;

import nl.manthos.eenaprilgrap.events.JoinEvent;
import nl.manthos.eenaprilgrap.events.WorldEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Eenaprilgrap extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        Bukkit.getPluginManager().registerEvents(new JoinEvent(), this);
        Bukkit.getPluginManager().registerEvents(new WorldEvent(), this);

    }
}
