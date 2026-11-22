package org.oakslib.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;
import com.qualcomm.robotcore.hardware.ServoImplEx;

public class ServoPlus extends HardwareDevice {
    ServoImplEx m_servo;
    private double m_maxRPM = 312;
    public ServoPlus(ServoImplEx servo) {
        m_servo = servo;
        m_hardwareDevice = servo;
    }
    public int getPort() {
        return(m_servo.getPortNumber());
    }
    public ServoController getController() {
        return(m_servo.getController());
    }
    public void setPosition(double power) {
        m_servo.setPosition(power);
    }
    public void getPosition() {
        m_servo.getPosition();
    }
    public void setDirection(Servo.Direction direction) {
        m_servo.setDirection(direction);
    }
    public Servo.Direction getDirection() {
        return(m_servo.getDirection());
    }
}
