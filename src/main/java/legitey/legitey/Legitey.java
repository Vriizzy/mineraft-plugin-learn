package legitey.legitey;

import legitey.legitey.Commands.Inv;
import legitey.legitey.Commands.killPlayer;
import legitey.legitey.handlers.BreakBlocks;
import legitey.legitey.Commands.Fly;
import legitey.legitey.handlers.SheepShearsEvent;
import legitey.legitey.handlers.TouchClass;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Legitey extends JavaPlugin {


    public void onEnable() {
        Bukkit.getLogger().info("[LEGITEY PL] ONLINE!");
        getServer().getPluginManager().registerEvents(new SheepShearsEvent(), this);
        getServer().getPluginManager().registerEvents(new BreakBlocks(), this);
        getCommand("Fly").setExecutor(new Fly());
        getCommand("killPlayer").setExecutor(new killPlayer());
        getCommand("Inv").setExecutor(new Inv());   
    }


    public void onDisable() {
        Bukkit.getLogger().info("to off agora!");
    }
}
