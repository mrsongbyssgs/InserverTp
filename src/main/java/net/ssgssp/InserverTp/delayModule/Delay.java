package net.ssgssp.InserverTp.delayModule;

import net.ssgssp.InserverTp.api.InserverTpAPI;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class Delay extends BukkitRunnable {
    Plugin thisplugin;
    int step1;
    int r1;
    int x1;
    int y1;
    int z1;
    int offset1;
    Particle part1;
    Player player1;
    int count1;
    int delayti1;
    public Delay(int step, int r, int x, int y, int z, int offset, Particle part, Player player, int count, int delaytime, Plugin plugme) {
        this.thisplugin = plugme;
        this.step1 = step;
        this.r1 = r;
        this.x1 = x;
        this.y1 = y;
        this.z1 = z;
        this.offset1 = offset;
        this.part1 = part;
        this.player1 = player;
        this.count1 = count;
        this.delayti1 = delaytime;
    }
        @Override

        public void run () {
            delayti1--;
            if(delayti1==0){
                InserverTpAPI.drawParticle(step1,r1,x1,y1,z1,offset1,part1,player1,count1);
                cancel();
            }




        }
        public void start(){
        this.runTaskTimer(this.thisplugin,0,20L);

    }

}
