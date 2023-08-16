package gg.zffu.simpleholograms.core.container;

import gg.zffu.simpleholograms.core.holograms.Hologram;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class HologramContainer {

    private List<Hologram> holograms = new ArrayList<>();

    public HologramContainer() {

    }

}
