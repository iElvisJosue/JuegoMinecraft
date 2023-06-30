import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaCobre extends JFrame implements ActionListener {

    private JFrame VentanaNivelCobre;
    private JPanel Panel1, Panel2, Panel3;
    private Image IconoNivel, IconoMostrar, IconoOcultar, Wallpaper, ImgP1O1, ImgP1O2, ImgP1O3, ImgP1O4, ImgP2O1,
            ImgP2O2, ImgP2O3, ImgP2O4, ImgP3O1, ImgP3O2, ImgP3O3, ImgP3O4, ImgP4O1, ImgP4O2, ImgP4O3, ImgP4O4, ImgP5O1,
            ImgP5O2, ImgP5O3, ImgP5O4;
    private ImageIcon IconoNivel2, IconoMostrar2, IconoOcultar2, Wallpaper2, ImgP1O1Num2, ImgP1O2Num2, ImgP1O3Num2,
            ImgP1O4Num2, ImgP2O1Num2,
            ImgP2O2Num2, ImgP2O3Num2, ImgP2O4Num2, ImgP3O1Num2, ImgP3O2Num2, ImgP3O3Num2, ImgP3O4Num2, ImgP4O1Num2,
            ImgP4O2Num2, ImgP4O3Num2, ImgP4O4Num2, ImgP5O1Num2, ImgP5O2Num2, ImgP5O3Num2, ImgP5O4Num2;
    private JLabel LblIconoNivel, LblNivel, LblInstruccionesNivel, LblWallpaper, LblWallpaper2, LblWallpaper3, LblCover,
            LblCover2, LblCover3, LblPregunta1, LblPregunta2, LblPregunta3, LblPregunta4, LblPregunta5, LblRadio1,
            LblRadio2, LblRadio3, LblRadio4, LblRadio5, LblPregunta1Opcion1, LblPregunta1Opcion2, LblPregunta1Opcion3,
            LblPregunta1Opcion4, LblPregunta2Opcion1, LblPregunta2Opcion2, LblPregunta2Opcion3, LblPregunta2Opcion4,
            LblPregunta3Opcion1, LblPregunta3Opcion2, LblPregunta3Opcion3, LblPregunta3Opcion4, LblPregunta4Opcion1,
            LblPregunta4Opcion2, LblPregunta4Opcion3, LblPregunta4Opcion4, LblPregunta5Opcion1, LblPregunta5Opcion2,
            LblPregunta5Opcion3, LblPregunta5Opcion4;
    private JButton BtnInstrucciones, BtnSiguiente, BtnSiguiente2, BtnFinalizar;
    private JRadioButton Pregunta1Opcion1, Pregunta1Opcion2, Pregunta1Opcion3, Pregunta1Opcion4, Pregunta2Opcion1,
            Pregunta2Opcion2, Pregunta2Opcion3, Pregunta2Opcion4, Pregunta3Opcion1, Pregunta3Opcion2, Pregunta3Opcion3,
            Pregunta3Opcion4, Pregunta4Opcion1, Pregunta4Opcion2, Pregunta4Opcion3, Pregunta4Opcion4, Pregunta5Opcion1,
            Pregunta5Opcion2, Pregunta5Opcion3, Pregunta5Opcion4;
    private String TxtNivel = "", TxtInstruccionesNivel = "", Cobre = "", Blanco = "",
            Verde = "", Negro = "", Diamante = "", TxtPregunta1 = "", TxtPregunta2 = "", TxtPregunta3 = "",
            TxtPregunta4 = "",
            TxtPregunta5 = "";
    private ButtonGroup Pregunta1, Pregunta2, Pregunta3, Pregunta4, Pregunta5;
    private Font FuenteMinecraft;
    private int m = 1;
    public static int PuntajeNivelCobre = 0;

    public void CreandoVentanaNivelCobre() {

        // PERSONALIZAMOS NUESTRA PLANTILLA DE NIVEL COBRE
        PersonalizarPlantillaCobre();

        // GUARDANAMOS NUESTRAS IMAGENES
        AlmacenarImagenesNivelCobre();

        // CREAMOS Y COLOCAMOS NUESTRO SIDEBAR LEFT
        CrearSidebarLeftCobre();

        // CREAMOS NUESTRO PANEL DE LAS PRIMERAS PREGUNTAS
        PanelPreguntasNivelCobre1();

    }

    private void PersonalizarPlantillaCobre() {
        PlantillaGeneral PlantillaGeneralParaNivelCobre = new PlantillaGeneral();

        // OBTENEMOS LA PLANTILLA Y LA AGREAMOS A NUESTRO JFRAME
        VentanaNivelCobre = PlantillaGeneralParaNivelCobre.CreandoPlantillaGeneral();

        // ASIGNAMOS EL ICONO A NUESTRA VENTANA
        VentanaNivelCobre.setIconImage(new ImageIcon(getClass().getResource("ImgNivelCobre/Cobre.png")).getImage());

        // OBTENEMOS LAS FUENTES Y COLORES A UTILIZAR
        FuenteMinecraft = PlantillaGeneralParaNivelCobre.FuenteMinecraft;

        Cobre = PlantillaGeneralParaNivelCobre.Cobre;
        Blanco = PlantillaGeneralParaNivelCobre.Blanco;
        Negro = PlantillaGeneralParaNivelCobre.Negro;
        Verde = PlantillaGeneralParaNivelCobre.Verde;
    }

    public void AlmacenarImagenesNivelCobre() {

        // GUARDAMOS LA IMAGEN DEL NIVEL COBRE
        IconoNivel = new ImageIcon("ImgNivelCobre/Cobre.png").getImage();
        IconoNivel2 = new ImageIcon(IconoNivel.getScaledInstance(135, 115,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE ICONO MOSTRAR
        IconoMostrar = new ImageIcon("ImgNivelCobre/Mostrar.png").getImage();
        IconoMostrar2 = new ImageIcon(IconoMostrar.getScaledInstance(40, 30,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DEL ICONO OCULTAR
        IconoOcultar = new ImageIcon("ImgNivelCobre/Ocultar.png").getImage();
        IconoOcultar2 = new ImageIcon(IconoOcultar.getScaledInstance(40, 30,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 1
        ImgP1O1 = new ImageIcon("ImgNivelCobre/Pregunta1/Arena.png").getImage();
        ImgP1O1Num2 = new ImageIcon(ImgP1O1.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 1
        ImgP1O2 = new ImageIcon("ImgNivelCobre/Pregunta1/Piedra.png").getImage();
        ImgP1O2Num2 = new ImageIcon(ImgP1O2.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 1
        ImgP1O3 = new ImageIcon("ImgNivelCobre/Pregunta1/Tierra.png").getImage();
        ImgP1O3Num2 = new ImageIcon(ImgP1O3.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 1
        ImgP1O4 = new ImageIcon("ImgNivelCobre/Pregunta1/Roca.png").getImage();
        ImgP1O4Num2 = new ImageIcon(ImgP1O4.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 2
        ImgP2O1 = new ImageIcon("ImgNivelCobre/Pregunta2/Creeper.png").getImage();
        ImgP2O1Num2 = new ImageIcon(ImgP2O1.getScaledInstance(80, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 2
        ImgP2O2 = new ImageIcon("ImgNivelCobre/Pregunta2/Aldeano.png").getImage();
        ImgP2O2Num2 = new ImageIcon(ImgP2O2.getScaledInstance(80, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 2
        ImgP2O3 = new ImageIcon("ImgNivelCobre/Pregunta2/Esqueleto.png").getImage();
        ImgP2O3Num2 = new ImageIcon(ImgP2O3.getScaledInstance(80, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 2
        ImgP2O4 = new ImageIcon("ImgNivelCobre/Pregunta2/Zombi.png").getImage();
        ImgP2O4Num2 = new ImageIcon(ImgP2O4.getScaledInstance(80, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 3
        ImgP3O1 = new ImageIcon("ImgNivelCobre/Pregunta3/Cartografia.png").getImage();
        ImgP3O1Num2 = new ImageIcon(ImgP3O1.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 3
        ImgP3O2 = new ImageIcon("ImgNivelCobre/Pregunta3/Horno.png").getImage();
        ImgP3O2Num2 = new ImageIcon(ImgP3O2.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 3
        ImgP3O3 = new ImageIcon("ImgNivelCobre/Pregunta3/MesaCrafteo.png").getImage();
        ImgP3O3Num2 = new ImageIcon(ImgP3O3.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 3
        ImgP3O4 = new ImageIcon("ImgNivelCobre/Pregunta3/MesaHerreria.png").getImage();
        ImgP3O4Num2 = new ImageIcon(ImgP3O4.getScaledInstance(115, 115, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 4
        ImgP4O1 = new ImageIcon("ImgNivelCobre/Pregunta4/Espada.png").getImage();
        ImgP4O1Num2 = new ImageIcon(ImgP4O1.getScaledInstance(80, 85, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 4
        ImgP4O2 = new ImageIcon("ImgNivelCobre/Pregunta4/Hacha.png").getImage();
        ImgP4O2Num2 = new ImageIcon(ImgP4O2.getScaledInstance(80, 85, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 4
        ImgP4O3 = new ImageIcon("ImgNivelCobre/Pregunta4/Pala.png").getImage();
        ImgP4O3Num2 = new ImageIcon(ImgP4O3.getScaledInstance(80, 85, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 4
        ImgP4O4 = new ImageIcon("ImgNivelCobre/Pregunta4/Pico.png").getImage();
        ImgP4O4Num2 = new ImageIcon(ImgP4O4.getScaledInstance(80, 85, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 5
        ImgP5O1 = new ImageIcon("ImgNivelCobre/Pregunta5/Garena.png").getImage();
        ImgP5O1Num2 = new ImageIcon(ImgP5O1.getScaledInstance(130, 60, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 5
        ImgP5O2 = new ImageIcon("ImgNivelCobre/Pregunta5/NetEase.png").getImage();
        ImgP5O2Num2 = new ImageIcon(ImgP5O2.getScaledInstance(130, 60, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 5
        ImgP5O3 = new ImageIcon("ImgNivelCobre/Pregunta5/RiotGames.png").getImage();
        ImgP5O3Num2 = new ImageIcon(ImgP5O3.getScaledInstance(130, 60, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 5
        ImgP5O4 = new ImageIcon("ImgNivelCobre/Pregunta5/Mojang.png").getImage();
        ImgP5O4Num2 = new ImageIcon(ImgP5O4.getScaledInstance(130, 60, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE NUESTRO BACKGROUND
        Wallpaper = new ImageIcon("ImgNivelCobre/Wallpaper.jpeg").getImage();
        Wallpaper2 = new ImageIcon(
                Wallpaper.getScaledInstance(900, 700, Image.SCALE_SMOOTH));
    }

    private void CrearSidebarLeftCobre() {
        // CREAMOS Y COLOCAMOS EL ICONO DEL NIVEL
        LblIconoNivel = new JLabel("", JLabel.CENTER);
        VentanaNivelCobre.add(LblIconoNivel);

        // CREAMOS Y COLOCAMOS EL TEXTO DEL NIVEL
        TxtNivel = "<html><body>NIVEL 1<b style=color:'" + Cobre + "'> COBRE</b></body></html>";
        LblNivel = new JLabel(TxtNivel, JLabel.CENTER);
        VentanaNivelCobre.add(LblNivel);

        // CREAMOS Y COLOCAMOS EL TEXTO CON LAS INSTRUCCIONES
        TxtInstruccionesNivel = "<html><body><center><b style=color:'" + Cobre
                + "'>DETALLES DEL NIVEL</b><br><br>CANTIDAD DE PREGUNTAS <b style=color:'" + Cobre
                + "'>5</b><br>TIPO DE PREGUNTAS <b style=color:'" + Cobre
                + "'>OPCION MULTIPLE<br>DE RESPUESTA UNICA</b><br>TIEMPO <b style=color:'" + Cobre
                + "'>ILIMITADO</b></center></body></html>";
        LblInstruccionesNivel = new JLabel(TxtInstruccionesNivel, JLabel.CENTER);
        VentanaNivelCobre.add(LblInstruccionesNivel);

        // CREAMOS Y COLOCAMOS EL BOTON DE VER INSTRUCCIONES
        BtnInstrucciones = new JButton();
        VentanaNivelCobre.add(BtnInstrucciones);

        // ASIGNAMOS PROPIEDADES AL ICONO DEL NIVEL
        LblIconoNivel.setBounds(0, 100, 400, 150);
        LblIconoNivel.setIcon(IconoNivel2);

        // ASIGNAMOS PROPIEDADES AL TEXTO DEL NIVEL
        LblNivel.setBounds(10, 270, 380, 40);
        LblNivel.setForeground(Color.decode(Blanco));
        LblNivel.setFont(FuenteMinecraft.deriveFont(27f));

        // ASIGNAMOS PROPIEDADES AL TEXTO CON LAS INSTRUCCIONES
        LblInstruccionesNivel.setBounds(10, 330, 380, 150);
        LblInstruccionesNivel.setForeground(Color.decode(Blanco));
        LblInstruccionesNivel.setFont(FuenteMinecraft.deriveFont(17f));

        // ASIGNAMOS PROPIEDADES AL BOTON DE VER INSTRUCCIONES
        BtnInstrucciones.setBounds(180, 500, 40, 30);
        BtnInstrucciones.setContentAreaFilled(false);
        BtnInstrucciones.setBackground(Color.decode(Negro));
        BtnInstrucciones.setFocusPainted(false);
        BtnInstrucciones.setBorder(BorderFactory.createLineBorder(Color.decode(Negro), 1));
        BtnInstrucciones.setIcon(IconoOcultar2);
        BtnInstrucciones.addActionListener(this);
    }

    private void PanelPreguntasNivelCobre1() {
        // CREAMOS Y AGREGAMOS EL PANEL
        Panel1 = new JPanel();
        VentanaNivelCobre.add(Panel1);

        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta1 = "<html><body><b style=color:'" + Negro
                + "'>PREGUNTA #1:</b> CUAL DE LOS SIGUIENTES BLOQUES REPRESENTA LA <b style=color:'" + Negro
                + "'>PIEDRA</b></body></html>";
        LblPregunta1 = new JLabel(TxtPregunta1, JLabel.CENTER);
        Panel1.add(LblPregunta1);
        TxtPregunta2 = "<html><body><b style=color:'" + Negro
                + "'>PREGUNTA #2:</b> CUAL DE LOS SIGUIENTES MOBS ES UN <b style=color:'" + Negro
                + "'>CREEPER</b></body></html>";
        LblPregunta2 = new JLabel(TxtPregunta2, JLabel.CENTER);
        Panel1.add(LblPregunta2);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 1
        Pregunta1Opcion1 = new JRadioButton();
        Panel1.add(Pregunta1Opcion1);
        LblPregunta1Opcion1 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta1Opcion1);

        Pregunta1Opcion2 = new JRadioButton();
        Panel1.add(Pregunta1Opcion2);
        LblPregunta1Opcion2 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta1Opcion2);

        Pregunta1Opcion3 = new JRadioButton();
        Panel1.add(Pregunta1Opcion3);
        LblPregunta1Opcion3 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta1Opcion3);

        Pregunta1Opcion4 = new JRadioButton();
        Panel1.add(Pregunta1Opcion4);
        LblPregunta1Opcion4 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta1Opcion4);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 2
        Pregunta2Opcion1 = new JRadioButton();
        Panel1.add(Pregunta2Opcion1);
        LblPregunta2Opcion1 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta2Opcion1);

        Pregunta2Opcion2 = new JRadioButton();
        Panel1.add(Pregunta2Opcion2);
        LblPregunta2Opcion2 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta2Opcion2);

        Pregunta2Opcion3 = new JRadioButton();
        Panel1.add(Pregunta2Opcion3);
        LblPregunta2Opcion3 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta2Opcion3);

        Pregunta2Opcion4 = new JRadioButton();
        Panel1.add(Pregunta2Opcion4);
        LblPregunta2Opcion4 = new JLabel("", JLabel.CENTER);
        Panel1.add(LblPregunta2Opcion4);

        // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 1
        Pregunta1 = new ButtonGroup();
        Pregunta1.add(Pregunta1Opcion1);
        Pregunta1.add(Pregunta1Opcion2);
        Pregunta1.add(Pregunta1Opcion3);
        Pregunta1.add(Pregunta1Opcion4);

        // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 2
        Pregunta2 = new ButtonGroup();
        Pregunta2.add(Pregunta2Opcion1);
        Pregunta2.add(Pregunta2Opcion2);
        Pregunta2.add(Pregunta2Opcion3);
        Pregunta2.add(Pregunta2Opcion4);

        // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
        LblRadio1 = new JLabel();
        Panel1.add(LblRadio1);
        LblRadio2 = new JLabel();
        Panel1.add(LblRadio2);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnSiguiente = new JButton("SIGUIENTE");
        Panel1.add(BtnSiguiente);

        // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
        LblCover = new JLabel();
        Panel1.add(LblCover);
        LblWallpaper = new JLabel();
        Panel1.add(LblWallpaper);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
        Panel1.setLayout(null);
        Panel1.setBounds(400, 30, 900, 700);

        // TITULO EN PREGUNTA 1
        LblPregunta1.setBounds(10, 10, 650, 50);
        LblPregunta1.setOpaque(true);
        LblPregunta1.setBackground(Color.decode(Cobre));
        LblPregunta1.setForeground(Color.decode(Blanco));
        LblPregunta1.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta1.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 1|| IMAGEN EN OPCION 1 EN PREGUNTA 1
        Pregunta1Opcion1.setBounds(110, 80, 20, 20);
        Pregunta1Opcion1.setContentAreaFilled(false);
        LblPregunta1Opcion1.setBounds(10, 100, 220, 195);
        LblPregunta1Opcion1.setIcon(ImgP1O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 1|| IMAGEN EN OPCION 2 EN PREGUNTA 1
        Pregunta1Opcion2.setBounds(330, 80, 20, 20);
        Pregunta1Opcion2.setContentAreaFilled(false);
        LblPregunta1Opcion2.setBounds(230, 100, 220, 195);
        LblPregunta1Opcion2.setIcon(ImgP1O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 1|| IMAGEN EN OPCION 3 EN PREGUNTA 1
        Pregunta1Opcion3.setBounds(550, 80, 20, 20);
        Pregunta1Opcion3.setContentAreaFilled(false);
        LblPregunta1Opcion3.setBounds(450, 100, 220, 195);
        LblPregunta1Opcion3.setIcon(ImgP1O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 1|| IMAGEN EN OPCION 4 EN PREGUNTA 1
        Pregunta1Opcion4.setBounds(770, 80, 20, 20);
        Pregunta1Opcion4.setContentAreaFilled(false);
        LblPregunta1Opcion4.setBounds(670, 100, 220, 195);
        LblPregunta1Opcion4.setIcon(ImgP1O4Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 1
        LblRadio1.setBounds(10, 70, 880, 225);
        LblRadio1.setOpaque(true);
        LblRadio1.setBackground(new Color(38, 38, 38, 150));
        LblRadio1.setForeground(Color.decode(Blanco));
        LblRadio1.setFont(FuenteMinecraft.deriveFont(15f));

        // TITULO PREGUNTA 2
        LblPregunta2.setBounds(10, 305, 570, 50);
        LblPregunta2.setOpaque(true);
        LblPregunta2.setBackground(Color.decode(Cobre));
        LblPregunta2.setForeground(Color.decode(Blanco));
        LblPregunta2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta2.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 2|| IMAGEN EN OPCION 1 EN PREGUNTA 2
        Pregunta2Opcion1.setBounds(110, 375, 20, 20);
        Pregunta2Opcion1.setContentAreaFilled(false);
        LblPregunta2Opcion1.setBounds(10, 395, 220, 195);
        LblPregunta2Opcion1.setIcon(ImgP2O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 2|| IMAGEN EN OPCION 2 EN PREGUNTA 2
        Pregunta2Opcion2.setBounds(330, 375, 20, 20);
        Pregunta2Opcion2.setContentAreaFilled(false);
        LblPregunta2Opcion2.setBounds(230, 395, 220, 195);
        LblPregunta2Opcion2.setIcon(ImgP2O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 2|| IMAGEN EN OPCION 3 EN PREGUNTA 2
        Pregunta2Opcion3.setBounds(550, 375, 20, 20);
        Pregunta2Opcion3.setContentAreaFilled(false);
        LblPregunta2Opcion3.setBounds(450, 395, 220, 195);
        LblPregunta2Opcion3.setIcon(ImgP2O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 2|| IMAGEN EN OPCION 4 EN PREGUNTA 2
        Pregunta2Opcion4.setBounds(770, 375, 20, 20);
        Pregunta2Opcion4.setContentAreaFilled(false);
        LblPregunta2Opcion4.setBounds(670, 395, 220, 195);
        LblPregunta2Opcion4.setIcon(ImgP2O4Num2);

        LblRadio2.setBounds(10, 365, 880, 225);
        LblRadio2.setOpaque(true);
        LblRadio2.setBackground(new Color(38, 38, 38, 150));
        LblRadio2.setForeground(Color.decode(Blanco));
        LblRadio2.setFont(FuenteMinecraft.deriveFont(15f));

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnSiguiente.setBounds(740, 605, 150, 50);
        BtnSiguiente.setBackground(Color.decode(Cobre));
        BtnSiguiente.setForeground(Color.decode(Blanco));
        BtnSiguiente.setFocusPainted(false);
        BtnSiguiente.setFont(FuenteMinecraft.deriveFont(15f));
        BtnSiguiente.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        BtnSiguiente.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
        LblCover.setBounds(0, 0, 901, 701);
        LblCover.setOpaque(true);
        LblCover.setBackground(new Color(0, 0, 0, 100));
        LblCover.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

        LblWallpaper.setBounds(0, 0, 900, 700);
        LblWallpaper.setIcon(Wallpaper2);

        VentanaNivelCobre.repaint();
    }

    private void PanelPreguntasNivelCobre2() {
        Panel2 = new JPanel();
        VentanaNivelCobre.add(Panel2);

        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta3 = "<html><body><b style=color:'" + Negro
                + "'>PREGUNTA #3:</b> CUAL DE LOS SIGUIENTES BLOQUES ES LA <b style=color:'" + Negro
                + "'>MESA DE CRAFTEO</b></body></html>";
        LblPregunta3 = new JLabel(TxtPregunta3, JLabel.CENTER);
        Panel2.add(LblPregunta3);
        TxtPregunta4 = "<html><body><b style=color:'" + Negro
                + "'>PREGUNTA #4:</b> QUE HERRAMIENTA <b style=color:'" + Negro
                + "'>FACILITA LA MINERIA</b></body></html>";
        LblPregunta4 = new JLabel(TxtPregunta4, JLabel.CENTER);
        Panel2.add(LblPregunta4);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 3
        Pregunta3Opcion1 = new JRadioButton();
        Panel2.add(Pregunta3Opcion1);
        LblPregunta3Opcion1 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta3Opcion1);

        Pregunta3Opcion2 = new JRadioButton();
        Panel2.add(Pregunta3Opcion2);
        LblPregunta3Opcion2 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta3Opcion2);

        Pregunta3Opcion3 = new JRadioButton();
        Panel2.add(Pregunta3Opcion3);
        LblPregunta3Opcion3 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta3Opcion3);

        Pregunta3Opcion4 = new JRadioButton();
        Panel2.add(Pregunta3Opcion4);
        LblPregunta3Opcion4 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta3Opcion4);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 4
        Pregunta4Opcion1 = new JRadioButton();
        Panel2.add(Pregunta4Opcion1);
        LblPregunta4Opcion1 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta4Opcion1);

        Pregunta4Opcion2 = new JRadioButton();
        Panel2.add(Pregunta4Opcion2);
        LblPregunta4Opcion2 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta4Opcion2);

        Pregunta4Opcion3 = new JRadioButton();
        Panel2.add(Pregunta4Opcion3);
        LblPregunta4Opcion3 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta4Opcion3);

        Pregunta4Opcion4 = new JRadioButton();
        Panel2.add(Pregunta4Opcion4);
        LblPregunta4Opcion4 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta4Opcion4);

        // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 3
        Pregunta3 = new ButtonGroup();
        Pregunta3.add(Pregunta3Opcion1);
        Pregunta3.add(Pregunta3Opcion2);
        Pregunta3.add(Pregunta3Opcion3);
        Pregunta3.add(Pregunta3Opcion4);

        // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 4
        Pregunta4 = new ButtonGroup();
        Pregunta4.add(Pregunta4Opcion1);
        Pregunta4.add(Pregunta4Opcion2);
        Pregunta4.add(Pregunta4Opcion3);
        Pregunta4.add(Pregunta4Opcion4);

        // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
        LblRadio3 = new JLabel();
        Panel2.add(LblRadio3);
        LblRadio4 = new JLabel();
        Panel2.add(LblRadio4);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnSiguiente2 = new JButton("SIGUIENTE");
        Panel2.add(BtnSiguiente2);

        // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
        LblCover2 = new JLabel();
        Panel2.add(LblCover2);
        LblWallpaper2 = new JLabel();
        Panel2.add(LblWallpaper2);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
        Panel2.setLayout(null);
        Panel2.setBounds(400, 30, 900, 700);

        // TITULO EN PREGUNTA 3
        LblPregunta3.setBounds(10, 10, 670, 50);
        LblPregunta3.setOpaque(true);
        LblPregunta3.setBackground(Color.decode(Cobre));
        LblPregunta3.setForeground(Color.decode(Blanco));
        LblPregunta3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta3.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 3|| IMAGEN EN OPCION 1 EN PREGUNTA 3
        Pregunta3Opcion1.setBounds(110, 80, 20, 20);
        Pregunta3Opcion1.setContentAreaFilled(false);
        LblPregunta3Opcion1.setBounds(10, 100, 220, 195);
        LblPregunta3Opcion1.setIcon(ImgP3O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 3|| IMAGEN EN OPCION 2 EN PREGUNTA 3
        Pregunta3Opcion2.setBounds(330, 80, 20, 20);
        Pregunta3Opcion2.setContentAreaFilled(false);
        LblPregunta3Opcion2.setBounds(230, 100, 220, 195);
        LblPregunta3Opcion2.setIcon(ImgP3O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 3|| IMAGEN EN OPCION 3 EN PREGUNTA 3
        Pregunta3Opcion3.setBounds(550, 80, 20, 20);
        Pregunta3Opcion3.setContentAreaFilled(false);
        LblPregunta3Opcion3.setBounds(450, 100, 220, 195);
        LblPregunta3Opcion3.setIcon(ImgP3O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 3|| IMAGEN EN OPCION 4 EN PREGUNTA 3
        Pregunta3Opcion4.setBounds(770, 80, 20, 20);
        Pregunta3Opcion4.setContentAreaFilled(false);
        LblPregunta3Opcion4.setBounds(670, 100, 220, 195);
        LblPregunta3Opcion4.setIcon(ImgP3O4Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 1
        LblRadio3.setBounds(10, 70, 880, 225);
        LblRadio3.setOpaque(true);
        LblRadio3.setBackground(new Color(38, 38, 38, 150));

        // TITULO PREGUNTA 2
        LblPregunta4.setBounds(10, 305, 490, 50);
        LblPregunta4.setOpaque(true);
        LblPregunta4.setBackground(Color.decode(Cobre));
        LblPregunta4.setForeground(Color.decode(Blanco));
        LblPregunta4.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta4.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 4|| IMAGEN EN OPCION 1 EN PREGUNTA 4
        Pregunta4Opcion1.setBounds(110, 375, 20, 20);
        Pregunta4Opcion1.setContentAreaFilled(false);
        LblPregunta4Opcion1.setBounds(10, 395, 220, 195);
        LblPregunta4Opcion1.setIcon(ImgP4O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 4|| IMAGEN EN OPCION 2 EN PREGUNTA 4
        Pregunta4Opcion2.setBounds(330, 375, 20, 20);
        Pregunta4Opcion2.setContentAreaFilled(false);
        LblPregunta4Opcion2.setBounds(230, 395, 220, 195);
        LblPregunta4Opcion2.setIcon(ImgP4O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 4|| IMAGEN EN OPCION 3 EN PREGUNTA 4
        Pregunta4Opcion3.setBounds(550, 375, 20, 20);
        Pregunta4Opcion3.setContentAreaFilled(false);
        LblPregunta4Opcion3.setBounds(450, 395, 220, 195);
        LblPregunta4Opcion3.setIcon(ImgP4O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 4|| IMAGEN EN OPCION 4 EN PREGUNTA 4
        Pregunta4Opcion4.setBounds(770, 375, 20, 20);
        Pregunta4Opcion4.setContentAreaFilled(false);
        LblPregunta4Opcion4.setBounds(670, 395, 220, 195);
        LblPregunta4Opcion4.setIcon(ImgP4O4Num2);

        LblRadio4.setBounds(10, 365, 880, 225);
        LblRadio4.setOpaque(true);
        LblRadio4.setBackground(new Color(38, 38, 38, 150));

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnSiguiente2.setBounds(740, 605, 150, 50);
        BtnSiguiente2.setBackground(Color.decode(Cobre));
        BtnSiguiente2.setForeground(Color.decode(Blanco));
        BtnSiguiente2.setFocusPainted(false);
        BtnSiguiente2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        BtnSiguiente2.setFont(FuenteMinecraft.deriveFont(15f));
        BtnSiguiente2.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
        LblCover2.setBounds(0, 0, 901, 701);
        LblCover2.setOpaque(true);
        LblCover2.setBackground(new Color(0, 0, 0, 100));
        LblCover2.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

        LblWallpaper2.setBounds(0, 0, 900, 700);
        LblWallpaper2.setIcon(Wallpaper2);
    }

    private void PanelPreguntasNivelCobre3() {
        Panel3 = new JPanel();
        VentanaNivelCobre.add(Panel3);

        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta5 = "<html><body><b style=color:'" + Negro
                + "'>PREGUNTA FINAL:</b> CUAL ES LA EMPRESA ENCARGARDA DEL <b style=color:'" + Negro
                + "'>DESARROLLO DEL JUEGO</b></body></html>";
        LblPregunta5 = new JLabel(TxtPregunta5, JLabel.CENTER);
        Panel3.add(LblPregunta5);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta5Opcion1 = new JRadioButton();
        Panel3.add(Pregunta5Opcion1);
        LblPregunta5Opcion1 = new JLabel("", JLabel.CENTER);
        Panel3.add(LblPregunta5Opcion1);

        Pregunta5Opcion2 = new JRadioButton();
        Panel3.add(Pregunta5Opcion2);
        LblPregunta5Opcion2 = new JLabel("", JLabel.CENTER);
        Panel3.add(LblPregunta5Opcion2);

        Pregunta5Opcion3 = new JRadioButton();
        Panel3.add(Pregunta5Opcion3);
        LblPregunta5Opcion3 = new JLabel("", JLabel.CENTER);
        Panel3.add(LblPregunta5Opcion3);

        Pregunta5Opcion4 = new JRadioButton();
        Panel3.add(Pregunta5Opcion4);
        LblPregunta5Opcion4 = new JLabel("", JLabel.CENTER);
        Panel3.add(LblPregunta5Opcion4);

        // AGRUPAMOS NUESTRAS OPCIONES DE PREGUNTA 5
        Pregunta5 = new ButtonGroup();
        Pregunta5.add(Pregunta5Opcion1);
        Pregunta5.add(Pregunta5Opcion2);
        Pregunta5.add(Pregunta5Opcion3);
        Pregunta5.add(Pregunta5Opcion4);

        // AGREGAMOS EL LABEL DONDE IRAN NUESTRAS OPCIONES DE RESPUESTA
        LblRadio5 = new JLabel();
        Panel3.add(LblRadio5);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnFinalizar = new JButton("FINALIZAR NIVEL");
        Panel3.add(BtnFinalizar);

        // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
        LblCover3 = new JLabel();
        Panel3.add(LblCover3);
        LblWallpaper3 = new JLabel();
        Panel3.add(LblWallpaper3);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL
        Panel3.setLayout(null);
        Panel3.setBounds(400, 30, 900, 700);

        // TITULO EN PREGUNTA 5
        LblPregunta5.setBounds(10, 10, 730, 50);
        LblPregunta5.setOpaque(true);
        LblPregunta5.setBackground(Color.decode(Cobre));
        LblPregunta5.setForeground(Color.decode(Blanco));
        LblPregunta5.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta5.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta5Opcion1.setBounds(110, 80, 20, 20);
        Pregunta5Opcion1.setContentAreaFilled(false);
        LblPregunta5Opcion1.setBounds(10, 100, 220, 195);
        LblPregunta5Opcion1.setIcon(ImgP5O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta5Opcion2.setBounds(330, 80, 20, 20);
        Pregunta5Opcion2.setContentAreaFilled(false);
        LblPregunta5Opcion2.setBounds(230, 100, 220, 195);
        LblPregunta5Opcion2.setIcon(ImgP5O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta5Opcion3.setBounds(550, 80, 20, 20);
        Pregunta5Opcion3.setContentAreaFilled(false);
        LblPregunta5Opcion3.setBounds(450, 100, 220, 195);
        LblPregunta5Opcion3.setIcon(ImgP5O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta5Opcion4.setBounds(770, 80, 20, 20);
        Pregunta5Opcion4.setContentAreaFilled(false);
        LblPregunta5Opcion4.setBounds(670, 100, 220, 195);
        LblPregunta5Opcion4.setIcon(ImgP5O4Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblRadio5.setBounds(10, 70, 880, 225);
        LblRadio5.setOpaque(true);
        LblRadio5.setBackground(new Color(38, 38, 38, 150));

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnFinalizar.setBounds(690, 310, 200, 50);
        BtnFinalizar.setBackground(Color.decode(Cobre));
        BtnFinalizar.setForeground(Color.decode(Blanco));
        BtnFinalizar.setFocusPainted(false);
        BtnFinalizar.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        BtnFinalizar.setFont(FuenteMinecraft.deriveFont(15f));
        BtnFinalizar.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
        LblCover3.setBounds(0, 0, 901, 701);
        LblCover3.setOpaque(true);
        LblCover3.setBackground(new Color(0, 0, 0, 100));
        LblCover3.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

        LblWallpaper3.setBounds(0, 0, 900, 700);
        LblWallpaper3.setIcon(Wallpaper2);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnSiguiente) {
            if (Pregunta1Opcion2.isSelected()) {
                PuntajeNivelCobre++;
            }
            if (Pregunta2Opcion1.isSelected()) {
                PuntajeNivelCobre++;
            }
            Panel1.setVisible(false);
            // CREAMOS NUESTRO PANEL DE LAS SIGUIENTES PREGUNTAS
            PanelPreguntasNivelCobre2();
        }
        if (e.getSource() == BtnSiguiente2) {
            if (Pregunta3Opcion3.isSelected()) {
                PuntajeNivelCobre++;
            }
            if (Pregunta4Opcion4.isSelected()) {
                PuntajeNivelCobre++;
            }
            Panel2.setVisible(false);
            // CREAMOS NUESTRO PANEL DE LAS ULTIMAS PREGUNTAS
            PanelPreguntasNivelCobre3();
        }
        if (e.getSource() == BtnFinalizar) {
            if (Pregunta5Opcion4.isSelected()) {
                PuntajeNivelCobre++;
            }
            VentanaNivelCobre.setVisible(false);
            CargandoNivel CN = new CargandoNivel();
            CN.VentanaCargandoNivel();
            CN.AnimacionCargando("Cobre");
        }
        if (e.getSource() == BtnInstrucciones) {
            if (m == 1) {
                LblInstruccionesNivel.setVisible(false);
                BtnInstrucciones.setBounds(180, 330, 40, 30);
                BtnInstrucciones.setIcon(IconoMostrar2);
                m = 0;
            } else {
                LblInstruccionesNivel.setVisible(true);
                BtnInstrucciones.setBounds(180, 500, 40, 30);
                BtnInstrucciones.setIcon(IconoOcultar2);
                m = 1;
            }
        }
    }

}
