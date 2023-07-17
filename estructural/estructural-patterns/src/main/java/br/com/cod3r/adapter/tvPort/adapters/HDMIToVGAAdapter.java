package br.com.cod3r.adapter.tvPort.adapters;

import br.com.cod3r.adapter.tvPort.devices.OldMonitor;
import br.com.cod3r.adapter.tvPort.intefaces.HDMI;

public class HDMIToVGAAdapter implements HDMI {
    OldMonitor monitor = null;

    public HDMIToVGAAdapter(OldMonitor monitor){
        this.monitor = monitor;
    }

    @Override
    public void setImage(String image) {
        monitor.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sound is not supported on VGA monitors | sound: " + sound);
    }
}
