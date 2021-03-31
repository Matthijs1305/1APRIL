package nl.manthos.eenaprilgrap.events;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class JoinEvent implements Listener {

    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (player.getWorld().getName() == "spawn") {
            player.setAllowFlight(true);
            player.setFlying(true);

            player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 1000000000, 1));
            player.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 1000000000, 1));
        }
    }
}
