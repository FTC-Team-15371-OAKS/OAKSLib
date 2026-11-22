package org.oakslib.hardware;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.CRServoImplEx;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.ServoController;

public class CRServoPlus extends HardwareDevice {
    CRServoImplEx m_crServo;
    private double m_maxRPM = 312;
    public CRServoPlus(CRServoImplEx crServo) {
        m_crServo = crServo;
        m_hardwareDevice = crServo;
    }
    public int getPort() {
        return(m_crServo.getPortNumber());
    }
    public ServoController getController() {
        return(m_crServo.getController());
    }
//    public void setPosition() {
//        m_crServo.set
//    }
    public void setPower(double power) {
        m_crServo.setPower(power);
    }
    public void getPower() {
        m_crServo.getPower();
    }
    public void setDirection(DcMotorSimple.Direction direction) {
        m_crServo.setDirection(direction);
    }
    public DcMotorSimple.Direction getDirection() {
        return(m_crServo.getDirection());
    }
    public void stop() {
        m_crServo.setPower(0);
    }
}
