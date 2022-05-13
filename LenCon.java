import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LenConv {
    public static void main(String[] args) {
        JFrame window = new LenGUI();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}

class LenGUI extends JFrame {
    private Container c;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;
    String[] choice_1 = {"mile", "meter", "feet", "kilometer"};
    private JComboBox c1;
    String[] choice_2 = {"mile", "meter", "feet", "kilometer"};
    private JComboBox c2;
    public LenGUI() {

        setTitle("Length Convertor");
        setBounds(500, 250, 350, 280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        //c.setLayout(null);
        c.setSize(400, 250);
        c.setLayout(null);
        c.setVisible(true);

        t1 = new JTextField();
        t1.setFont(new Font("CAMBRIA", Font.BOLD, 15));
        t1.setSize(100, 30);
        t1.setLocation(180, 40);
        c.add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("CAMBRIA", Font.BOLD, 15));
        t2.setSize(100, 30);
        t2.setLocation(180, 100);
        c.add(t2);

        c1 = new JComboBox<>(choice_1);
        c1.setFont(new Font("CAMBRIA", Font.BOLD, 15));
        c1.setSize(100, 30);
        c1.setLocation(50, 40);
        c.add(c1);

        c2 = new JComboBox<>(choice_2);
        c2.setFont(new Font("CAMBRIA", Font.BOLD, 15));
        c2.setSize(100, 30);
        c2.setLocation(50, 100);
        c.add(c2);

        b1 = new JButton("Convert");
        b1.setFont(new Font("CAMBRIA", Font.BOLD, 15));
        b1.setSize(100, 30);
        b1.setLocation(120, 170);
        c.add(b1);

        b1.addActionListener(new ConvertBtnListener());

        setVisible(true);
    }


    class ConvertBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String Str = t1.getText();
            double km = Double.parseDouble(Str);
            double f = Double.parseDouble(Str);
            double mil = Double.parseDouble(Str);
            double m = Double.parseDouble(Str);
            if (c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("mile")){
                double mile = convertKmToMi(km);
                t2.setText("" + mile);
            }
            else if(c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("meter")){
                double meter = convertKmToMeter(f);
                t2.setText("" + meter);
            }
            else if(c1.getSelectedItem().equals("kilometer") && c2.getSelectedItem().equals("feet")) {
                double feet = convertKmToFeet(km);
                t2.setText("" + feet);
            }
            else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("kilometer")) {
                double kilometer = convertMiToKm(mil);
                t2.setText("" + kilometer);
            }
            else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("meter")) {
                double meter = convertMiToMeter(mil);
                t2.setText("" + meter);
            }
            else if(c1.getSelectedItem().equals("mile") && c2.getSelectedItem().equals("feet")) {
                double feet = convertMiToFeet(mil);
                t2.setText("" + feet);
            }
            else if(c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("kilometer")) {
                double kilometer = convertFeetToKm(f);
                t2.setText("" + kilometer);
            }
            else if(c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("meter")) {
                double meter = convertFeetToMeter(f);
                t2.setText("" + meter);
            }
            else if (c1.getSelectedItem().equals("feet") && c2.getSelectedItem().equals("mile")){
                double mile = convertFeetToMi(f);
                t2.setText("" + mile);
            }
            else if(c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("kilometer")) {
                double kilometer = convertMeterToKm(m);
                t2.setText("" + kilometer);
            }
            else if(c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("feet")) {
                double feet = convertMeterToFeet(m);
                t2.setText("" + feet);
            }
            else if (c1.getSelectedItem().equals("meter") && c2.getSelectedItem().equals("mile")){
                double mile = convertMeterToMi(m);
                t2.setText("" + mile);
            }
        }
    }

    // CONVERSION OF KILOMETER
    public static double convertKmToMi(double kilometer) {
        double mile = kilometer * 0.621;
        return mile;
    }
    public static double convertKmToMeter(double kilometer) {
        double meter = kilometer * 1000;
        return meter;
    }
    public static double convertKmToFeet(double kilometer) {
        double feet = kilometer * 3280.84;
        return feet;
    }

    // CONVERSION OF MILES
    public static double convertMiToKm(double mile) {
        double kilometer = mile * 1.60934;
        return kilometer;
    }
    public static double convertMiToMeter(double mile) {
        double meter = mile * 1609.34;
        return meter;
    }
    public static double convertMiToFeet(double mile) {
        double feet = mile * 5280;
        return feet;
    }

    // CONVERSION OF FOOT
    public static double convertFeetToKm(double feet) {
        double kilometer = feet * 0.0003048;
        return kilometer;
    }
    public static double convertFeetToMeter(double feet) {
        double meter = feet * 0.3048;
        return meter;
    }
    public static double convertFeetToMi(double feet) {
        double mile = feet * 0.000189394;
        return mile;
    }

    // CONVERSION OF METER
    public static double convertMeterToKm(double meter) {
        double kilometer = meter * 0.001;
        return kilometer;
    }
    public static double convertMeterToFeet(double meter) {
        double feet = meter * 3.28084;
        return feet;
    }
    public static double convertMeterToMi(double meter) {
        double mile = meter * 0.000621371;
        return mile;
    }

}
