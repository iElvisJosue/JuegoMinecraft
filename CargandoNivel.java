import javax.swing.*;
import java.awt.*;

public class CargandoNivel extends JFrame {

    private JFrame CargandoNivel;
    private JLabel TituloCargando, TituloResultados, IconoCargando1, IconoCargando2, IconoCargando3;
    private Image ImgIconoCargando1;
    private ImageIcon ImgIconoCargando1Num2, ImgIconoCargando2Num2, ImgIconoCargando3Num2;
    private Font FuenteMinecraft;
    private String Verde = "", Blanco = "";
    private int Loading = 3;

    public void VentanaCargandoNivel() {

        // IMPORTAMOS COLORES Y FUENTE
        PlantillaGeneral PG = new PlantillaGeneral();
        PG.AñadirFuente();
        FuenteMinecraft = PG.FuenteMinecraft;
        Verde = PG.Verde;
        Blanco = PG.Blanco;

        // TRABAJAREMOS CON NUESTRAS PROPIAS COORDENADAS
        setLayout(null);

        // OBTENEMOS LA IMAGEN DEL ICONO
        ImgIconoCargando1 = new ImageIcon("Images/Cargando.png").getImage();
        ImgIconoCargando1Num2 = new ImageIcon(ImgIconoCargando1.getScaledInstance(25, 25, Image.SCALE_SMOOTH));
        ImgIconoCargando2Num2 = new ImageIcon(ImgIconoCargando1.getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        ImgIconoCargando3Num2 = new ImageIcon(ImgIconoCargando1.getScaledInstance(75, 75, Image.SCALE_SMOOTH));

        // DAMOS PROPIEDAS A NUESTRA VENTANA
        CargandoNivel = new JFrame();
        CargandoNivel.setUndecorated(true);
        CargandoNivel.setBounds(0, 0, 450, 250);
        CargandoNivel.getContentPane().setBackground(Color.decode(Verde));
        CargandoNivel.setLocationRelativeTo(null);
        CargandoNivel.setResizable(false);
        CargandoNivel.setVisible(true);

        // ASIGNAMOS EL ICONO A NUESTRA VENTANA
        CargandoNivel.setIconImage(
                new ImageIcon(getClass().getResource("Images/CargandoIcono.png")).getImage());

        // AGREGAMOS EL TITULO DE NUESTRO RESULTADO
        TituloResultados = new JLabel("OBTENIENDO RESULTADOS", JLabel.CENTER);
        TituloResultados.setBounds(-450, 0, 450, 100);
        TituloResultados.setOpaque(true);
        TituloResultados.setBackground(Color.decode(Verde));
        TituloResultados.setForeground(Color.decode(Blanco));
        TituloResultados.setFont(FuenteMinecraft.deriveFont(20f));
        CargandoNivel.add(TituloResultados);

        // AGREGAMOS EL TITULO DE NUESTRA VENTANA
        TituloCargando = new JLabel("CARGANDO EL SIGUIENTE NIVEL", JLabel.CENTER);
        TituloCargando.setBounds(0, 0, 450, 100);
        TituloCargando.setOpaque(true);
        TituloCargando.setBackground(Color.decode(Verde));
        TituloCargando.setForeground(Color.decode(Blanco));
        TituloCargando.setFont(FuenteMinecraft.deriveFont(20f));
        CargandoNivel.add(TituloCargando);

        // AGREGAMOS LOS ICONOS DE CARGANDO
        IconoCargando1 = new JLabel("", JLabel.CENTER);
        IconoCargando1.setBounds(0, 100, 0, 0);
        IconoCargando1.setIcon(ImgIconoCargando1Num2);
        CargandoNivel.add(IconoCargando1);

        IconoCargando2 = new JLabel("", JLabel.CENTER);
        IconoCargando2.setBounds(150, 100, 0, 0);
        IconoCargando2.setIcon(ImgIconoCargando2Num2);
        CargandoNivel.add(IconoCargando2);

        IconoCargando3 = new JLabel("", JLabel.CENTER);
        IconoCargando3.setBounds(300, 100, 0, 0);
        IconoCargando3.setIcon(ImgIconoCargando3Num2);
        CargandoNivel.add(IconoCargando3);
    }

    public void AnimacionCargando(String Nivel) {
        Thread HiloAnimado = new Thread() {
            public void run() {
                for (int i = 0; i <= Loading; i++) {
                    if (i == 0) {
                        IconoCargando1.setSize(150, 150);
                    }
                    if (i == 1) {
                        IconoCargando2.setSize(150, 150);
                    }
                    if (i == 2) {
                        IconoCargando3.setSize(150, 150);
                    }
                    if (i == 3) {
                        IconoCargando1.setSize(0, 0);
                        IconoCargando2.setSize(0, 0);
                        IconoCargando3.setSize(0, 0);
                        CargandoNivel.setVisible(false);
                        if (Nivel.equals("Niveles")) {
                            VentanaCobre VC = new VentanaCobre();
                            VC.CreandoVentanaNivelCobre();
                        }
                        if (Nivel.equals("Cobre")) {
                            VentanaHierro VH = new VentanaHierro();
                            VH.CreandoVentanaNivelHierro();
                        }
                        if (Nivel.equals("Hierro")) {
                            VentanaOro VO = new VentanaOro();
                            VO.CreandoVentanaNivelOro();
                        }
                        if (Nivel.equals("Oro")) {
                            VentanaEsmeralda VE = new VentanaEsmeralda();
                            VE.CreandoVentanaNivelEsmeralda();
                        }
                        if (Nivel.equals("Esmeralda")) {
                            VentanaDiamante VD = new VentanaDiamante();
                            VD.CreandoVentanaNivelDiamante();
                        }
                        if (Nivel.equals("Diamante")) {
                            VentanaNetherita VN = new VentanaNetherita();
                            VN.CreandoVentanaNivelNetherita();
                        }
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        HiloAnimado.start();
    }

    public void CargarResultados() {
        TituloResultados.setLocation(0, 0);
        Thread HiloFinal = new Thread() {
            public void run() {
                for (int i = 0; i <= Loading; i++) {
                    if (i == 0) {
                        IconoCargando1.setSize(150, 150);
                    }
                    if (i == 1) {
                        IconoCargando2.setSize(150, 150);
                    }
                    if (i == 2) {
                        IconoCargando3.setSize(150, 150);
                    }
                    if (i == 3) {
                        CargandoNivel.setVisible(false);
                        ResultadoFinal RF = new ResultadoFinal();
                        RF.CreandoVentanaScoreFinal();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
        };
        HiloFinal.start();
    }
}
