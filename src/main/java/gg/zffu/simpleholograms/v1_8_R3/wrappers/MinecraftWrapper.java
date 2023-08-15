package gg.zffu.simpleholograms.v1_8_R3.wrappers;

import gg.zffu.simpleholograms.core.wrappers.IMinecraftWrapper;
import net.minecraft.server.v1_8_R3.*;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class MinecraftWrapper implements IMinecraftWrapper {
    @Override
    public void sendPacket(Object packet, Player player) {
        if(!(packet instanceof Packet)) return;
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket((Packet) packet);
    }

    @Override
    public Object makeSpawnPacket(Object entity) {
        if(!(entity instanceof EntityLiving)) return null;
        PacketPlayOutSpawnEntityLiving spawnEntityLiving = new PacketPlayOutSpawnEntityLiving((EntityLiving) entity);
        return spawnEntityLiving;
    }

    @Override
    public Object makeDespawnPacket(int entityId) {
        PacketPlayOutEntityDestroy packetPlayOutEntityDestroy = new PacketPlayOutEntityDestroy(entityId);
        return packetPlayOutEntityDestroy;
    }
}
