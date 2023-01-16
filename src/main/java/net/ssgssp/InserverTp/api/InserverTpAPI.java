package net.ssgssp.InserverTp.api;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;

public final class InserverTpAPI {
    public static void  drawParticle(int step, int r, int x1, int y1, int z1, int offset, Particle part, Player player1, int count){
        for(int b = 0;b <= 360;b += step) {
            double xa = x1 + r * Math.sin((double) b * Math.PI / 180.0);
            double za = z1 + r * Math.cos((double) b * Math.PI / 180.0);
            double ya = y1 + offset;
            player1.spawnParticle(part, new Location(player1.getWorld(), xa, ya, za), count);
        }
        System.out.println("DRAW DONE");

    }
}
