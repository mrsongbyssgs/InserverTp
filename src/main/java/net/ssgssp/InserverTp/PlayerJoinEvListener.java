package net.ssgssp.InserverTp;



import net.ssgssp.InserverTp.delayModule.Delay;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import net.ssgssp.InserverTp.api.InserverTpAPI;

import java.util.Objects;


public class PlayerJoinEvListener implements Listener {
    Plugin plug1 = inservertp.getPlugin(inservertp.class);
    @EventHandler
    public void PlayerjoinEv(PlayerJoinEvent pj){
        plug1.reloadConfig();
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
        boolean isparton1 = plug1.getConfig().getBoolean("isPartOn");
        boolean iscomon1 = plug1.getConfig().getBoolean("isComOn");
        boolean isdelayon = plug1.getConfig().getBoolean("isDelayOn");
        int Delaytimes = plug1.getConfig().getInt("Delay");
        String com1 = Objects.requireNonNull(plug1.getConfig().getString("Command"));
        if(isparton1){
            if(isdelayon){
                new Delay(step1,r,x1,y1,z1,offset1,part1,player,count1,Delaytimes,plug1).start();
            }
            else{
                InserverTpAPI.drawParticle(step1,r,x1,y1,z1,offset1,part1,player,count1);
            }
        }
        if(iscomon1){
            InserverTpAPI.disPatchPlayercommand(com1,player);
        }









    }
}
