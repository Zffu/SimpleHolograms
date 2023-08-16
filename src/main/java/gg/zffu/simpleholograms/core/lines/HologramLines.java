package gg.zffu.simpleholograms.core.lines;

import gg.zffu.simpleholograms.core.holograms.Hologram;

import java.util.ArrayList;
import java.util.List;

public class HologramLines {

    private List<Object> lines = new ArrayList<>();

    // For Updating
    private Hologram hologram;

    public HologramLines(Hologram hologram) {
        this.hologram = hologram;
    }

    public void addLine(Object line) {
        this.lines.add(line);
    }

    public List<Object> getLines() {
        return lines;
    }



}
