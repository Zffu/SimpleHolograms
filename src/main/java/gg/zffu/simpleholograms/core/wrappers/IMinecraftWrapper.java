package gg.zffu.simpleholograms.core.wrappers;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface IMinecraftWrapper {

    void sendPacket(Object packet, Player player);

    Object makeSpawnPacket(Object entity);
    Object makeDespawnPacket(int entityId);

    Object convertAsNMSEntity(Entity entity);
}
