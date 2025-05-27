import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderOrnegi {
    public static void main(String[] args) {
        // Ana pencere
        JFrame pencere = new JFrame("Slider Örneği");
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setSize(400, 200);
        pencere.setLayout(new FlowLayout());

        // Slider oluşturuluyor
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // min:0, max:100, başlangıç:50
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Etiketi göstermek için
        JLabel degerEtiketi = new JLabel("Seçilen Değer: 50");

        // Slider dinleyicisi
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int deger = slider.getValue();
                degerEtiketi.setText("Seçilen Değer: " + deger);
            }
        });

        // Bileşenleri pencereye ekle
        pencere.add(slider);
        pencere.add(degerEtiketi);

        // Pencereyi görünür yap
        pencere.setVisible(true);
    }
}
