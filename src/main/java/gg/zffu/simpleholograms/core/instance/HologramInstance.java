package gg.zffu.simpleholograms.core.instance;

import gg.zffu.simpleholograms.core.holograms.Hologram;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class HologramInstance {

    private Hologram hologram;
    private List<Object> entities;

    private List<Player> viewing = new ArrayList<>();

    public HologramInstance(Hologram hologram) {
        this.hologram = hologram;
    }

}
