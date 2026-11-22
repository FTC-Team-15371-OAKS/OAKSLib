package org.oakslib.mecanum;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.oakslib.command.Subsystem;
import org.oakslib.command.SubsystemBase;
import org.oakslib.hardware.MotorPlus;

public class MecanumDriveBase extends SubsystemBase {

    private final MotorPlus m_lf;
    private final MotorPlus m_lb;
    private final MotorPlus m_rf;
    private final MotorPlus m_rb;
    private Gamepad m_gamepad;

    private int m_controlMode;
    private double m_maxPower = 1.0;
    private double m_maxSpeed = 1.0;
    public MecanumDriveBase(MotorPlus lf, MotorPlus lb, MotorPlus rf, MotorPlus rb, int controlMode, Gamepad gamepad) {
        m_lf = lf;
        m_lb = lb;
        m_rf = rf;
        m_rb = rb;
        m_controlMode = controlMode;
        m_gamepad = gamepad;
    }

    public void periodic() {
        double frontLeftPower = m_gamepad.left_stick_y + m_gamepad.left_stick_x - m_gamepad.right_stick_x;
        double frontRightPower = m_gamepad.left_stick_y + m_gamepad.left_stick_x + m_gamepad.right_stick_x;
        double backRightPower = m_gamepad.left_stick_y - m_gamepad.left_stick_x + m_gamepad.right_stick_x;
        double backLeftPower = m_gamepad.left_stick_y - m_gamepad.left_stick_x - m_gamepad.right_stick_x;
        switch(m_controlMode) {
            case 0:
                double maxPower = m_maxPower;
                double maxSpeed = m_maxSpeed;  // make this slower for outreaches

                // This is needed to make sure we don't pass > 1.0 to any wheel
                // It allows us to keep all of the motors in proportion to what they should
                // be and not get clipped
                maxPower = Math.max(maxPower, Math.abs(frontLeftPower));
                maxPower = Math.max(maxPower, Math.abs(frontRightPower));
                maxPower = Math.max(maxPower, Math.abs(backRightPower));
                maxPower = Math.max(maxPower, Math.abs(backLeftPower));

                // We multiply by maxSpeed so that it can be set lower for outreaches
                // When a young child is driving the robot, we may not want to allow full
                // speed.
                m_lf.setPower(maxSpeed * (frontLeftPower / maxPower));
                m_rf.setPower(maxSpeed * (frontRightPower / maxPower));
                m_lb.setPower(maxSpeed * (backLeftPower / maxPower));
                m_rb.setPower(maxSpeed * (backRightPower / maxPower));
        }
    }
}
