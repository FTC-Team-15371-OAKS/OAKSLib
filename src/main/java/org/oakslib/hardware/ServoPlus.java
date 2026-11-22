package org.oakslib.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;

public class ServoPlus extends HardwareDevice {
    CRServo m_servo;
    private double m_maxRPM = 312;
    public ServoPlus(Servo servo) {
        m_servo = crServo;
        m_hardwareDevice = crServo;
    }
    public int getPort() {
        return(m_servo.getPortNumber());
    }
    public ServoController getController() {
        return(m_servo.getController());
    }
    public void setPower(double power) {
        m_servo.setPower(power);
    }
    public void getPower() {
        m_servo.getPower();
    }
    public void setDirection(DcMotorSimple.Direction direction) {
        m_servo.setDirection(direction);
    }
    public DcMotorSimple.Direction getDirection() {
        return(m_servo.getDirection());
    }
    public void stop() {
        m_servo.setPower(0);
    }
}
