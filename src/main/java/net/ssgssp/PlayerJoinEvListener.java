package net.ssgssp;



import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

import java.util.Objects;


public class PlayerJoinEvListener implements Listener {
    Plugin plug1 = net.ssgssp.inservertp.getPlugin(net.ssgssp.inservertp.class);
    @EventHandler
    public void PlayerjoinEv(PlayerJoinEvent pj){
        Player player = pj.getPlayer();
        World world1 = Bukkit.getWorld(Objects.requireNonNull(plug1.getConfig().getString("world")));
        int x1 = plug1.getConfig().getInt("x1");
        int y1 = plug1.getConfig().getInt("y1");
        int z1 = plug1.getConfig().getInt("z1");
        player.teleport(new Location(world1,x1,y1,z1));
        int r = plug1.getConfig().getInt("r");
        int count1 = plug1.getConfig().getInt("count");
        int offset1 = plug1.getConfig().getInt("offset");
        String str11 = plug1.getConfig().getString("particle");
        Particle part1 = Particle.valueOf(str11);
        int step1 = plug1.getConfig().getInt("step");
        for(int b = 0;b <= 360;b += step1) {
            double xa = x1 + r * Math.sin((double) b * Math.PI / 180.0);
            double za = z1 + r * Math.cos((double) b * Math.PI / 180.0);
            double ya = y1 + offset1;
            player.spawnParticle(part1, new Location(player.getWorld(), xa, ya, za), count1);
        }
        System.out.println("DRAW DONE");








    }
}
