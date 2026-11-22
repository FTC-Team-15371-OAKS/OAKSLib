package org.oakslib.hardware;

public abstract class HardwareDevice {
    public com.qualcomm.robotcore.hardware.HardwareDevice m_hardwareDevice;
    public String getName() {
        return(m_hardwareDevice.getDeviceName());
    }
    public String getConnectionInfo() {
        return(m_hardwareDevice.getConnectionInfo());
    }
    public int getVersion() {
        return(m_hardwareDevice.getVersion());
    }
    public void close() {
        m_hardwareDevice.close();
    }
}