
package legitey.legitey.handlers;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class TouchClass implements Listener {


    public void onTouch_low(BlockPlaceEvent event) {
        if (event.getBlock().getType() == Material.FIRE) {
            event.getBlock().setType(Material.WOOL);
        }
    }


    public void onTouch(BlockPlaceEvent event) {
        Block block = event.getBlock();
        if (block.getType() != Material.TORCH) {
            Bukkit.getLogger().info("Não sou uma tocha");
        }
        Bukkit.getLogger().info("Oii, sou a tocha!");
    }
}

