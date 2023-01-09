package net.ssgssp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class inservertp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("插件已加载");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        Bukkit.getPluginManager().registerEvents(new PlayerJoinEvListener(),this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("插件已卸载");
    }
}
