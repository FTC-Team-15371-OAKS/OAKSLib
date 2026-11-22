package org.oakslib.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.configuration.typecontainers.MotorConfigurationType;

import org.firstinspires.ftc.robotcore.external.navigation.AngularVelocity;

public class MotorPlus extends HardwareDevice {
    DcMotorEx m_motor;
    private double m_maxRPM = 312;
    public MotorPlus(DcMotorEx motor) {
        m_motor = motor;
    }
    public MotorPlus(DcMotorEx motor, double maxRPM) {
        m_motor = motor;
        m_maxRPM = maxRPM;
    }
    public void setMode(DcMotor.RunMode runMode) {
        m_motor.setMode(runMode);
    }
    public void setVelocity(double angularRate) {
        m_motor.setVelocity(angularRate);
    }
    public double getVelocity() {
        return(m_motor.getVelocity());
    }
    public DcMotor.RunMode getMode() {
        return(m_motor.getMode());
    }
    public void setPower(double power) {
        m_motor.setPower(power);
    }
    public void getPower() {
        m_motor.getPower();
    }
    public void setTargetPosition(int position) {
        m_motor.setTargetPosition(position);
    }
    public int getPosition() {
        return(m_motor.getCurrentPosition());
    }
    public void enableMotor() {
        m_motor.setMotorEnable();
    }
    public void disableMotor() {
        m_motor.setMotorDisable();
    }
    public int getTargetPosition() {
        return(m_motor.getTargetPosition());
    }
    public void setRPM(double RPM) {
        m_motor.setPower(RPM/m_maxRPM);
    }
    public double getRPM() {
        return(m_motor.getPower()*m_maxRPM);
    }
    public void setDirection(DcMotorSimple.Direction direction) {
        m_motor.setDirection(direction);
    }
    public DcMotorSimple.Direction getDirection() {
        return(m_motor.getDirection());
    }
    public void stop() {
        m_motor.setPower(0);
    }
    public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior zeroPowerBehavior) {
        m_motor.setZeroPowerBehavior(zeroPowerBehavior);
    }
    public DcMotor.ZeroPowerBehavior getZeroPowerBehavior() {
        return m_motor.getZeroPowerBehavior();
    }
}
