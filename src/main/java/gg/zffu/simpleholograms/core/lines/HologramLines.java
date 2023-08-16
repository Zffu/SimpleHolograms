package gg.zffu.simpleholograms.core.lines;

import gg.zffu.simpleholograms.core.holograms.Hologram;

import java.util.ArrayList;

public class HologramLines {

    private ArrayList<String> lines = new ArrayList<>();

    // For Updating
    private Hologram hologram;

    public HologramLines(Hologram hologram) {
        this.hologram = hologram;
    }

    public void addLine(String line) {
        this.lines.add(line);
    }



}
