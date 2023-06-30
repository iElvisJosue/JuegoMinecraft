import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class PlantillaGeneral extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    JFrame PlantillaGeneral;
    private JPanel PanelScore;
    private Image Mover, Minimizar, Cerrar, Score, CerrarScore, LogoQTSDM, ImgCobre, ImgHierro,
            ImgOro, ImgEsmeralda, ImgDiamante, ImgNetherita, Facebook, Twitter, Linkedin, WhatsApp;
    private ImageIcon Mover2, Minimizar2, Cerrar2, Score2, CerrarScore2, LogoQTSDM2, ImgCobre2,
            ImgHierro2, ImgOro2, ImgEsmeralda2, ImgDiamante2, ImgNetherita2, Facebook2, Twitter2, Linkedin2, WhatsApp2;
    private JButton BtnMover, BtnMinimizar, BtnCerrar, BtnCerrarScore, BtnFacebook,
            BtnTwitter, BtnLinkedin, BtnWhatsApp;
    private JLabel LblBarra, LblQTSDM, LblTituloScore, LblScoreCobre1, LblScoreCobre2, LblScoreCobre3,
            LblScoreHierro1, LblScoreHierro2, LblScoreHierro3, LblScoreOro1, LblScoreOro2,
            LblScoreOro3, LblScoreEsmeralda1, LblScoreEsmeralda2, LblScoreEsmeralda3,
            LblScoreDiamante1, LblScoreDiamante2, LblScoreDiamante3, LblScoreNetherita1,
            LblScoreNetherita2, LblScoreNetherita3, LblContactame, LblVersion;
    private int x = 0, y = 0;
    public static String Negro = "#262626", Gris = "#131313", Verde = "#01884b", Limon = "#22b739", Rojo = "#c63637",
            Blanco = "#ffffff", Cobre = "#e77c56", Oro = "#dede00", Hierro = "#969696",
            Esmeralda = "#17dd62", Diamante = "#8cf4e2", Netherita = "#747174", Fuente = "Agency FB";
    public static JLabel LblScoreCobre4, LblScoreHierro4, LblScoreOro4, LblScoreEsmeralda4, LblScoreDiamante4,
            LblScoreNetherita4;
    public static Font FuenteMinecraft;
    public static JButton BtnScore;

    public JFrame CreandoPlantillaGeneral() {

        // CREAMOS NUESTRA PLANTILLA
        PlantillaGeneral = new JFrame();
        PlantillaGeneral.setIconImage(new ImageIcon(getClass().getResource("Images/MinecraftIcono.png")).getImage());
        PlantillaGeneral.setLayout(null);
        PlantillaGeneral.setUndecorated(true);
        PlantillaGeneral.setBounds(0, 0, 1300, 700); // 500 y 800
        PlantillaGeneral.getContentPane().setBackground(Color.decode(Negro));
        PlantillaGeneral.getRootPane().setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        PlantillaGeneral.setResizable(false);
        PlantillaGeneral.setLocationRelativeTo(null);
        PlantillaGeneral.setVisible(true);

        // ALMACENAMOS NUESTRAS IMAGENES
        ObtenerImagenesPrincipales();

        // OBTENEMOS LA FUENTE
        AñadirFuente();

        // CAMBIAMOS EL CURSOR
        CambiarCursorPrincipal();

        // CREAMOS NUESTRA BARRAR SUPERIOR
        CrearBarraSuperior();

        // CREAMOS NUESTRA TABLA DE SCORE
        CrearTablaScore();

        // CREAMOS NUESTRA SECCION DE CONTACTAR
        CrearSeccionContactar();

        return PlantillaGeneral;

    }

    public void ObtenerImagenesPrincipales() {
        // ALMACENAMOS NUESTRA IMAGEN DE MOVER
        Mover = new ImageIcon("Images/Mover.png").getImage();
        Mover2 = new ImageIcon(
                Mover.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE MINIMIZAR
        Minimizar = new ImageIcon("Images/Minimizar.png").getImage();
        Minimizar2 = new ImageIcon(
                Minimizar.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE CERRAR
        Cerrar = new ImageIcon("Images/Cerrar.png").getImage();
        Cerrar2 = new ImageIcon(
                Cerrar.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE CERRAR
        Score = new ImageIcon("Images/Score.png").getImage();
        Score2 = new ImageIcon(
                Score.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE CERRAR
        CerrarScore = new ImageIcon("Images/CerrarScore.png").getImage();
        CerrarScore2 = new ImageIcon(
                CerrarScore.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
        ImgCobre = new ImageIcon("Images/Cobre.png").getImage();
        ImgCobre2 = new ImageIcon(
                ImgCobre.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
        ImgHierro = new ImageIcon("Images/Hierro.png").getImage();
        ImgHierro2 = new ImageIcon(
                ImgHierro.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
        ImgOro = new ImageIcon("Images/Oro.png").getImage();
        ImgOro2 = new ImageIcon(
                ImgOro.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
        ImgEsmeralda = new ImageIcon("Images/Esmeralda.png").getImage();
        ImgEsmeralda2 = new ImageIcon(
                ImgEsmeralda.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
        ImgDiamante = new ImageIcon("Images/Diamante.png").getImage();
        ImgDiamante2 = new ImageIcon(
                ImgDiamante.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DE NIVEL COBRE
        ImgNetherita = new ImageIcon("Images/Netherita.png").getImage();
        ImgNetherita2 = new ImageIcon(
                ImgNetherita.getScaledInstance(20, 20,
                        Image.SCALE_SMOOTH));

        // ALMACENAMOS NUESTRA IMAGEN DEL LOGO
        LogoQTSDM = new ImageIcon("Images/QTSDM.png").getImage();
        LogoQTSDM2 = new ImageIcon(
                LogoQTSDM.getScaledInstance(100, 30, Image.SCALE_SMOOTH));
    }

    public void AñadirFuente() {
        try {
            // ALMACENAMOS LAS FUENTES
            FuenteMinecraft = Font.createFont(Font.TRUETYPE_FONT, new File("Tipografia/Minecrafter.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            // REGISTRAMOS LAS FUENTES
            ge.registerFont(FuenteMinecraft);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

    public void CambiarCursorPrincipal() {
        ImageIcon Cursor1 = new ImageIcon(getClass().getResource("Images/CursorMinecraft.png"));
        Cursor Cursor2 = getToolkit().createCustomCursor(Cursor1.getImage(), new Point(0, 0), "Cursor Minecraft");

        PlantillaGeneral.setCursor(Cursor2);
    }

    public void CrearBarraSuperior() {

        // CREAMOS Y AGREGAMOS EL BOTON DE MINIMIZAR
        BtnMinimizar = new JButton();
        PlantillaGeneral.add(BtnMinimizar);

        // CREAMOS Y AGREGAMOS EL BOTON DE MOVER
        BtnMover = new JButton();
        PlantillaGeneral.add(BtnMover);

        // CREAMOS Y AGREGAMOS EL BOTON DE CERRAR
        BtnCerrar = new JButton();
        PlantillaGeneral.add(BtnCerrar);

        // CREAMOS Y AGREGAMOS EL LOGO
        LblQTSDM = new JLabel();
        PlantillaGeneral.add(LblQTSDM);

        // CREAMOS Y AGREGAMOS LA BARRA SUPERIOR
        LblBarra = new JLabel();
        PlantillaGeneral.add(LblBarra);

        // ASIGNAMOS PROPIEDADES A BOTON DE MOVER VENTANA
        BtnMover.setBounds(1215, 5, 20, 20);
        BtnMover.setContentAreaFilled(false);
        BtnMover.setFocusPainted(false);
        BtnMover.setBorder(null);
        BtnMover.setIcon(Mover2);
        BtnMover.addActionListener(this);
        BtnMover.addMouseListener(this);
        BtnMover.addMouseMotionListener(this);

        // ASIGNAMOS PROPIEDADES A BOTON DE MINIMIZAR
        BtnMinimizar.setBounds(1245, 5, 20, 20);
        BtnMinimizar.setContentAreaFilled(false);
        BtnMinimizar.setFocusPainted(false);
        BtnMinimizar.setBorder(null);
        BtnMinimizar.setIcon(Minimizar2);
        BtnMinimizar.addActionListener(this);
        BtnMinimizar.addMouseListener(this);

        // ASIGNAMOS PROPIEDADES A BOTON DE CERRAR
        BtnCerrar.setBounds(1275, 5, 20, 20);
        BtnCerrar.setContentAreaFilled(false);
        BtnCerrar.setFocusPainted(false);
        BtnCerrar.setBorder(null);
        BtnCerrar.setIcon(Cerrar2);
        BtnCerrar.addActionListener(this);
        BtnCerrar.addMouseListener(this);

        // CREAMOS EL LOGO DE PRESENTACION DEL JUEGO
        LblQTSDM.setBounds(0, 0, 100, 30);
        LblQTSDM.setIcon(LogoQTSDM2);

        // CREAMOS LA BARRA DE OPCIONES
        LblBarra.setBounds(0, 0, 1300, 30);
        LblBarra.setOpaque(true);
        LblBarra.setBackground(Color.decode(Verde));
    }

    public void CrearTablaScore() {
        // CREAMOS Y AGREGAMOS NUESTRO PANEL DE SCORE
        PanelScore = new JPanel();
        PanelScore.setLayout(null);
        PlantillaGeneral.add(PanelScore);

        // CREAMOS Y AGREGAMOS EL BOTON DE SCORE
        BtnScore = new JButton();
        PlantillaGeneral.add(BtnScore);

        // CREAMOS Y AGREGAMOS EL BOTON DE CERRAR SCORE
        BtnCerrarScore = new JButton();
        PlantillaGeneral.add(BtnCerrarScore);

        // AGREGAMOS NUESTRO TITULO
        LblTituloScore = new JLabel("RESULTADOS POR NIVEL");
        PanelScore.add(LblTituloScore);

        // AGREGAMOS EL NUMERO DEL NIVEL COBRE
        LblScoreCobre1 = new JLabel("1", JLabel.CENTER);
        PanelScore.add(LblScoreCobre1);

        // AGREGAMOS EL NUMERO ICONO DEL NIVEL COBRE
        LblScoreCobre2 = new JLabel("", JLabel.CENTER);
        PanelScore.add(LblScoreCobre2);

        // AGREGAMOS EL NOMBRE DEL NIVEL COBRE
        LblScoreCobre3 = new JLabel("NIVEL COBRE", JLabel.LEFT);
        PanelScore.add(LblScoreCobre3);

        // AGREGAMOS EL RESULTADO DEL NIVEL COBRE
        LblScoreCobre4 = new JLabel("NA", JLabel.CENTER);
        PanelScore.add(LblScoreCobre4);

        // AGREGAMOS EL NUMERO DEL NIVEL HIERRO
        LblScoreHierro1 = new JLabel("2", JLabel.CENTER);
        PanelScore.add(LblScoreHierro1);

        // AGREGAMOS EL NUMERO ICONO DEL NIVEL HIERRO
        LblScoreHierro2 = new JLabel("", JLabel.CENTER);
        PanelScore.add(LblScoreHierro2);

        // AGREGAMOS EL NOMBRE DEL NIVEL HIERRO
        LblScoreHierro3 = new JLabel("NIVEL HIERRO", JLabel.LEFT);
        PanelScore.add(LblScoreHierro3);

        // AGREGAMOS EL RESULTADO DEL NIVEL HIERRO
        LblScoreHierro4 = new JLabel("NA", JLabel.CENTER);
        PanelScore.add(LblScoreHierro4);

        // AGREGAMOS EL NUMERO DEL NIVEL ORO
        LblScoreOro1 = new JLabel("3", JLabel.CENTER);
        PanelScore.add(LblScoreOro1);

        // AGREGAMOS EL NUMERO ICONO DEL NIVEL ORO
        LblScoreOro2 = new JLabel("", JLabel.CENTER);
        PanelScore.add(LblScoreOro2);

        // AGREGAMOS EL NOMBRE DEL NIVEL ORO
        LblScoreOro3 = new JLabel("NIVEL ORO", JLabel.LEFT);
        PanelScore.add(LblScoreOro3);

        // AGREGAMOS EL RESULTADO DEL NIVEL ORO
        LblScoreOro4 = new JLabel("NA", JLabel.CENTER);
        PanelScore.add(LblScoreOro4);

        // AGREGAMOS EL NUMERO DEL NIVEL ESMERALDA
        LblScoreEsmeralda1 = new JLabel("4", JLabel.CENTER);
        PanelScore.add(LblScoreEsmeralda1);

        // AGREGAMOS EL NUMERO ICONO DEL NIVEL ESMERALDA
        LblScoreEsmeralda2 = new JLabel("", JLabel.CENTER);
        PanelScore.add(LblScoreEsmeralda2);

        // AGREGAMOS EL NOMBRE DEL NIVEL ESMERALDA
        LblScoreEsmeralda3 = new JLabel("NIVEL ESMERALDA", JLabel.LEFT);
        PanelScore.add(LblScoreEsmeralda3);

        // AGREGAMOS EL RESULTADO DEL NIVEL ESMERALDA
        LblScoreEsmeralda4 = new JLabel("NA", JLabel.CENTER);
        PanelScore.add(LblScoreEsmeralda4);

        // AGREGAMOS EL NUMERO DEL NIVEL DIAMANTE
        LblScoreDiamante1 = new JLabel("5", JLabel.CENTER);
        PanelScore.add(LblScoreDiamante1);

        // AGREGAMOS EL NUMERO ICONO DEL NIVEL DIAMANTE
        LblScoreDiamante2 = new JLabel("", JLabel.CENTER);
        PanelScore.add(LblScoreDiamante2);

        // AGREGAMOS EL NOMBRE DEL NIVEL DIAMANTE
        LblScoreDiamante3 = new JLabel("NIVEL DIAMANTE", JLabel.LEFT);
        PanelScore.add(LblScoreDiamante3);

        // AGREGAMOS EL RESULTADO DEL NIVEL DIAMANTE
        LblScoreDiamante4 = new JLabel("NA", JLabel.CENTER);
        PanelScore.add(LblScoreDiamante4);

        // AGREGAMOS EL NUMERO DEL NIVEL NETHERITA
        LblScoreNetherita1 = new JLabel("6", JLabel.CENTER);
        PanelScore.add(LblScoreNetherita1);

        // AGREGAMOS EL NUMERO ICONO DEL NIVEL NETHERITA
        LblScoreNetherita2 = new JLabel("", JLabel.CENTER);
        PanelScore.add(LblScoreNetherita2);

        // AGREGAMOS EL NOMBRE DEL NIVEL NETHERITA
        LblScoreNetherita3 = new JLabel("NIVEL NETHERITA", JLabel.LEFT);
        PanelScore.add(LblScoreNetherita3);

        // AGREGAMOS EL RESULTADO DEL NIVEL NETHERITA
        LblScoreNetherita4 = new JLabel("NA", JLabel.CENTER);
        PanelScore.add(LblScoreNetherita4);

        // ASIGNAMOS PROPIEDADES A NUESTRO PANEL DE SCORE
        PanelScore.setBounds(-400, 80, 400, 485);

        // ASIGNAMOS PROPIEDADES A NUESTRO TITULO DE SCORE
        LblTituloScore.setBounds(0, 0, 400, 35);
        LblTituloScore.setFont(FuenteMinecraft.deriveFont(17f));
        LblTituloScore.setBorder(BorderFactory.createEmptyBorder(4, 37, 0, 0));
        LblTituloScore.setOpaque(true);
        LblTituloScore.setForeground(Color.decode(Blanco));
        LblTituloScore.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 1 DE COBRE
        LblScoreCobre1.setBounds(0, 35, 75, 75);
        LblScoreCobre1.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreCobre1.setOpaque(true);
        LblScoreCobre1.setForeground(Color.decode(Cobre));
        LblScoreCobre1.setBackground(Color.decode(Negro));

        // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 1 DE COBRE
        LblScoreCobre2.setBounds(75, 35, 50, 75);
        LblScoreCobre2.setOpaque(true);
        LblScoreCobre2.setBackground(Color.decode(Negro));
        LblScoreCobre2.setIcon(ImgCobre2);

        // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 1 DE COBRE
        LblScoreCobre3.setBounds(125, 35, 200, 75);
        LblScoreCobre3.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreCobre3.setOpaque(true);
        LblScoreCobre3.setBackground(Color.decode(Negro));
        LblScoreCobre3.setForeground(Color.decode(Cobre));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 1 DE COBRE
        LblScoreCobre4.setBounds(325, 35, 75, 75);
        LblScoreCobre4.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreCobre4.setOpaque(true);
        LblScoreCobre4.setBackground(Color.decode(Negro));
        LblScoreCobre4.setForeground(Color.decode(Cobre));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 2 DE HIERRO
        LblScoreHierro1.setBounds(0, 110, 75, 75);
        LblScoreHierro1.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreHierro1.setOpaque(true);
        LblScoreHierro1.setForeground(Color.decode(Hierro));
        LblScoreHierro1.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 2 DE HIERRO
        LblScoreHierro2.setBounds(75, 110, 50, 75);
        LblScoreHierro2.setIcon(ImgHierro2);
        LblScoreHierro2.setOpaque(true);
        LblScoreHierro2.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 2 DE HIERRO
        LblScoreHierro3.setBounds(125, 110, 200, 75);
        LblScoreHierro3.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreHierro3.setOpaque(true);
        LblScoreHierro3.setForeground(Color.decode(Hierro));
        LblScoreHierro3.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 2 DE HIERRO
        LblScoreHierro4.setBounds(325, 110, 75, 75);
        LblScoreHierro4.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreHierro4.setOpaque(true);
        LblScoreHierro4.setForeground(Color.decode(Hierro));
        LblScoreHierro4.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 3 DE ORO
        LblScoreOro1.setBounds(0, 185, 75, 75);
        LblScoreOro1.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreOro1.setOpaque(true);
        LblScoreOro1.setBackground(Color.decode(Negro));
        LblScoreOro1.setForeground(Color.decode(Oro));

        // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 3 DE ORO
        LblScoreOro2.setBounds(75, 185, 50, 75);
        LblScoreOro2.setOpaque(true);
        LblScoreOro2.setBackground(Color.decode(Negro));
        LblScoreOro2.setIcon(ImgOro2);

        // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 3 DE ORO
        LblScoreOro3.setBounds(125, 185, 200, 75);
        LblScoreOro3.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreOro3.setOpaque(true);
        LblScoreOro3.setBackground(Color.decode(Negro));
        LblScoreOro3.setForeground(Color.decode(Oro));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 3 DE ORO
        LblScoreOro4.setBounds(325, 185, 75, 75);
        LblScoreOro4.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreOro4.setOpaque(true);
        LblScoreOro4.setBackground(Color.decode(Negro));
        LblScoreOro4.setForeground(Color.decode(Oro));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 4 DE ESMERALDA
        LblScoreEsmeralda1.setBounds(0, 260, 75, 75);
        LblScoreEsmeralda1.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreEsmeralda1.setOpaque(true);
        LblScoreEsmeralda1.setForeground(Color.decode(Esmeralda));
        LblScoreEsmeralda1.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 4 DE ESMERALDA
        LblScoreEsmeralda2.setBounds(75, 260, 50, 75);
        LblScoreEsmeralda2.setIcon(ImgEsmeralda2);
        LblScoreEsmeralda2.setOpaque(true);
        LblScoreEsmeralda2.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 4 DE ESMERALDA
        LblScoreEsmeralda3.setBounds(125, 260, 200, 75);
        LblScoreEsmeralda3.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreEsmeralda3.setOpaque(true);
        LblScoreEsmeralda3.setForeground(Color.decode(Esmeralda));
        LblScoreEsmeralda3.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 4 DE ESMERALDA
        LblScoreEsmeralda4.setBounds(325, 260, 75, 75);
        LblScoreEsmeralda4.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreEsmeralda4.setOpaque(true);
        LblScoreEsmeralda4.setForeground(Color.decode(Esmeralda));
        LblScoreEsmeralda4.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 5 DE DIAMANTE
        LblScoreDiamante1.setBounds(0, 335, 75, 75);
        LblScoreDiamante1.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreDiamante1.setOpaque(true);
        LblScoreDiamante1.setBackground(Color.decode(Negro));
        LblScoreDiamante1.setForeground(Color.decode(Diamante));

        // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 5 DE DIAMANTE
        LblScoreDiamante2.setBounds(75, 335, 50, 75);
        LblScoreDiamante2.setOpaque(true);
        LblScoreDiamante2.setBackground(Color.decode(Negro));
        LblScoreDiamante2.setIcon(ImgDiamante2);

        // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 5 DE DIAMANTE
        LblScoreDiamante3.setBounds(125, 335, 200, 75);
        LblScoreDiamante3.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreDiamante3.setOpaque(true);
        LblScoreDiamante3.setBackground(Color.decode(Negro));
        LblScoreDiamante3.setForeground(Color.decode(Diamante));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 5 DE DIAMANTE
        LblScoreDiamante4.setBounds(325, 335, 75, 75);
        LblScoreDiamante4.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreDiamante4.setOpaque(true);
        LblScoreDiamante4.setBackground(Color.decode(Negro));
        LblScoreDiamante4.setForeground(Color.decode(Diamante));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 6 DE NETHERITA
        LblScoreNetherita1.setBounds(0, 410, 75, 75);
        LblScoreNetherita1.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreNetherita1.setOpaque(true);
        LblScoreNetherita1.setForeground(Color.decode(Netherita));
        LblScoreNetherita1.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO ICONO DE SCORE NIVEL 6 DE NETHERITA
        LblScoreNetherita2.setBounds(75, 410, 50, 75);
        LblScoreNetherita2.setIcon(ImgNetherita2);
        LblScoreNetherita2.setOpaque(true);
        LblScoreNetherita2.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO NOMBRE SCORE NIVEL 6 DE NETHERITA
        LblScoreNetherita3.setBounds(125, 410, 200, 75);
        LblScoreNetherita3.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreNetherita3.setOpaque(true);
        LblScoreNetherita3.setForeground(Color.decode(Netherita));
        LblScoreNetherita3.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A NUESTRO SCORE NIVEL 6 DE NETHERITA
        LblScoreNetherita4.setBounds(325, 410, 75, 75);
        LblScoreNetherita4.setFont(FuenteMinecraft.deriveFont(15f));
        LblScoreNetherita4.setOpaque(true);
        LblScoreNetherita4.setForeground(Color.decode(Netherita));
        LblScoreNetherita4.setBackground(Color.decode(Gris));

        // ASIGNAMOS PROPIEDADES A BOTON DE CERRAR
        BtnScore.setBounds(370, 45, 20, 20);
        BtnScore.setContentAreaFilled(false);
        BtnScore.setFocusPainted(false);
        BtnScore.setBorder(null);
        BtnScore.setIcon(Score2);
        BtnScore.addActionListener(this);
        BtnScore.addMouseListener(this);

        // ASIGNAMOS PROPIEDADES A BOTON DE CERRAR
        BtnCerrarScore.setBounds(370, 45, 20, 20);
        BtnCerrarScore.setContentAreaFilled(false);
        BtnCerrarScore.setFocusPainted(false);
        BtnCerrarScore.setBorder(null);
        BtnCerrarScore.setIcon(CerrarScore2);
        BtnCerrarScore.setVisible(false);
        BtnCerrarScore.addActionListener(this);
        BtnCerrarScore.addMouseListener(this);
    }

    public void CrearSeccionContactar() {
        LblContactame = new JLabel("CONTACTAME");
        PlantillaGeneral.add(LblContactame);

        BtnFacebook = new JButton();
        PlantillaGeneral.add(BtnFacebook);

        BtnTwitter = new JButton();
        PlantillaGeneral.add(BtnTwitter);

        BtnLinkedin = new JButton();
        PlantillaGeneral.add(BtnLinkedin);

        BtnWhatsApp = new JButton();
        PlantillaGeneral.add(BtnWhatsApp);

        LblVersion = new JLabel("VERSION ACTUAL 1", JLabel.RIGHT);
        PlantillaGeneral.add(LblVersion);

        LblContactame.setBounds(10, 570, 380, 30);
        LblContactame.setFont(FuenteMinecraft.deriveFont(12f));
        LblContactame.setForeground(Color.decode(Blanco));

        BtnFacebook.setBounds(10, 610, 87, 30);
        BtnFacebook.setBackground(Color.decode(Verde));
        BtnFacebook.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnFacebook.setFocusPainted(false);
        Facebook = new ImageIcon("Images/Facebook.png").getImage();
        Facebook2 = new ImageIcon(Facebook.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        BtnFacebook.setIcon(Facebook2);
        BtnFacebook.addMouseListener(this);
        BtnFacebook.addActionListener(this);

        BtnTwitter.setBounds(108, 610, 87, 30);
        BtnTwitter.setBackground(Color.decode(Verde));
        BtnTwitter.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnTwitter.setFocusPainted(false);
        Twitter = new ImageIcon("Images/Twitter.png").getImage();
        Twitter2 = new ImageIcon(Twitter.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        BtnTwitter.setIcon(Twitter2);
        BtnTwitter.addMouseListener(this);
        BtnTwitter.addActionListener(this);

        BtnLinkedin.setBounds(205, 610, 87, 30);
        BtnLinkedin.setBackground(Color.decode(Verde));
        BtnLinkedin.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnLinkedin.setFocusPainted(false);
        Linkedin = new ImageIcon("Images/Linkedin.png").getImage();
        Linkedin2 = new ImageIcon(Linkedin.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        BtnLinkedin.setIcon(Linkedin2);
        BtnLinkedin.addMouseListener(this);
        BtnLinkedin.addActionListener(this);

        BtnWhatsApp.setBounds(302, 610, 87, 30);
        BtnWhatsApp.setFocusPainted(false);
        BtnWhatsApp.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnWhatsApp.setBackground(Color.decode(Verde));
        WhatsApp = new ImageIcon("Images/WhatsApp.png").getImage();
        WhatsApp2 = new ImageIcon(WhatsApp.getScaledInstance(20, 20, Image.SCALE_SMOOTH));
        BtnWhatsApp.setIcon(WhatsApp2);
        BtnWhatsApp.addMouseListener(this);
        BtnWhatsApp.addActionListener(this);

        LblVersion.setBounds(10, 660, 380, 30);
        LblVersion.setFont(FuenteMinecraft.deriveFont(10f));
        LblVersion.setForeground(Color.decode(Blanco));
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BtnMinimizar) {
            PlantillaGeneral.setState(1);
        }
        if (e.getSource() == BtnCerrar) {
            System.exit(0);
        }
        if (e.getSource() == BtnScore) {
            // INVOCAR PANEL
            // PanelScore.setBounds(-400, 80, 400, 485);
            PanelScore.setLocation(0, 80);
            BtnScore.setVisible(false);
            BtnCerrarScore.setVisible(true);
        }
        if (e.getSource() == BtnCerrarScore) {
            // CERRAR PANEL
            PanelScore.setLocation(-400, 80);
            BtnCerrarScore.setVisible(false);
            BtnScore.setVisible(true);
        }
        if (e.getSource() == BtnFacebook) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop Link = Desktop.getDesktop();
                    Link.browse(new URI("https://www.facebook.com/elvis.josue.754"));
                }
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
        if (e.getSource() == BtnTwitter) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop Link = Desktop.getDesktop();
                    Link.browse(new URI("https://twitter.com/"));
                }
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
        if (e.getSource() == BtnLinkedin) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop Link = Desktop.getDesktop();
                    Link.browse(new URI("https://www.linkedin.com/in/elvisjosuecr/"));
                }
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
        if (e.getSource() == BtnWhatsApp) {
            try {
                if (Desktop.isDesktopSupported()) {
                    Desktop Link = Desktop.getDesktop();
                    Link.browse(new URI(
                            "https://api.whatsapp.com/send/?phone=527441595198&text&type=phone_number&app_absent=0"));
                }
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
    }

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == BtnFacebook) {
            BtnFacebook.setBackground(Color.decode("#3b5998"));
            BtnFacebook.setBorder(BorderFactory.createLineBorder(Color.decode("#3b5998")));
        }
        if (e.getSource() == BtnTwitter) {
            BtnTwitter.setBackground(Color.decode("#00acee"));
            BtnTwitter.setBorder(BorderFactory.createLineBorder(Color.decode("#00acee")));
        }
        if (e.getSource() == BtnLinkedin) {
            BtnLinkedin.setBackground(Color.decode("#0072b1"));
            BtnLinkedin.setBorder(BorderFactory.createLineBorder(Color.decode("#0072b1")));
        }
        if (e.getSource() == BtnWhatsApp) {
            BtnWhatsApp.setBackground(Color.decode("#075e54"));
            BtnWhatsApp.setBorder(BorderFactory.createLineBorder(Color.decode("#075e54")));
        }
    }

    public void mouseExited(MouseEvent e) {
        BtnFacebook.setBackground(Color.decode(Verde));
        BtnFacebook.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnTwitter.setBackground(Color.decode(Verde));
        BtnTwitter.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnLinkedin.setBackground(Color.decode(Verde));
        BtnLinkedin.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnWhatsApp.setBackground(Color.decode(Verde));
        BtnWhatsApp.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
    }

    public void mousePressed(MouseEvent e) {
        if (e.getSource() == BtnMover) {
            x = e.getX();
            y = e.getY();
        }
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    // EVENTOS DE TIPO ARRASTRAS
    public void mouseMoved(MouseEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
        PlantillaGeneral.setLocation(PlantillaGeneral.getLocation().x + e.getX() - x,
                PlantillaGeneral.getLocation().y + e.getY() - y);
    }

}
