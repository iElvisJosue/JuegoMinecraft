import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaDiamante extends JFrame implements ActionListener, ChangeListener {

    private JFrame VentanaNivelDiamante;
    private JProgressBar BarraNivelDiamante;
    private JPanel Panel1, Panel2, Panel3, Panel4, Panel5, Panel6, Panel7, Panel8;
    private Image IconoNivel, IconoMostrar, IconoOcultar, Wallpaper, ImgP1O1, ImgP1O2, ImgP1O3, ImgP1O4, ImgP1O5,
            ImgP1O6, ImgP1O7, ImgP1O8, ImgP1O9, ImgP1O10, ImgP1O11, ImgP1O12, ImgP2O1, ImgP2O2, ImgP2O3, ImgP2O4,
            ImgP2O5, ImgP2O6, ImgP2O7, ImgP2O8, ImgP2O9, ImgP2O10, ImgP2O11, ImgP2O12, ImgP3O1, ImgP3O2, ImgP3O3,
            ImgP3O4, ImgP3O5, ImgP3O6, ImgP3O7, ImgP3O8, ImgP3O9, ImgP3O10, ImgP3O11, ImgP3O12, ImgP4O1, ImgP4O2,
            ImgP4O3, ImgP4O4, ImgP4O5, ImgP4O6, ImgP4O7, ImgP4O8, ImgP4O9, ImgP4O10, ImgP4O11, ImgP4O12, ImgP5O1,
            ImgP5O2, ImgP5O3, ImgP5O4, ImgP5O5, ImgP5O6, ImgP5O7, ImgP5O8, ImgP5O9, ImgP5O10, ImgP5O11, ImgP5O12,
            ImgP6O1, ImgP6O2, ImgP6O3, ImgP6O4, ImgP6O5, ImgP6O6, ImgP6O7, ImgP6O8, ImgP6O9, ImgP6O10, ImgP6O11,
            ImgP6O12;
    private ImageIcon IconoNivel2, IconoMostrar2, IconoOcultar2, Wallpaper2, ImgP1O1Num2, ImgP1O2Num2, ImgP1O3Num2,
            ImgP1O4Num2, ImgP1O5Num2, ImgP1O6Num2, ImgP1O7Num2, ImgP1O8Num2, ImgP1O9Num2, ImgP1O10Num2, ImgP1O11Num2,
            ImgP1O12Num2, ImgP2O1Num2, ImgP2O2Num2, ImgP2O3Num2, ImgP2O4Num2, ImgP2O5Num2, ImgP2O6Num2, ImgP2O7Num2,
            ImgP2O8Num2, ImgP2O9Num2, ImgP2O10Num2, ImgP2O11Num2, ImgP2O12Num2, ImgP3O1Num2, ImgP3O2Num2, ImgP3O3Num2,
            ImgP3O4Num2, ImgP3O5Num2, ImgP3O6Num2, ImgP3O7Num2, ImgP3O8Num2, ImgP3O9Num2, ImgP3O10Num2, ImgP3O11Num2,
            ImgP3O12Num2, ImgP4O1Num2, ImgP4O2Num2, ImgP4O3Num2, ImgP4O4Num2, ImgP4O5Num2, ImgP4O6Num2, ImgP4O7Num2,
            ImgP4O8Num2, ImgP4O9Num2, ImgP4O10Num2, ImgP4O11Num2, ImgP4O12Num2, ImgP5O1Num2, ImgP5O2Num2, ImgP5O3Num2,
            ImgP5O4Num2, ImgP5O5Num2, ImgP5O6Num2, ImgP5O7Num2, ImgP5O8Num2, ImgP5O9Num2, ImgP5O10Num2, ImgP5O11Num2,
            ImgP5O12Num2, ImgP6O1Num2, ImgP6O2Num2, ImgP6O3Num2, ImgP6O4Num2, ImgP6O5Num2, ImgP6O6Num2, ImgP6O7Num2,
            ImgP6O8Num2, ImgP6O9Num2, ImgP6O10Num2, ImgP6O11Num2, ImgP6O12Num2;
    private JLabel LblCover, LblWallpaper, LblScoreCobre, LblScoreHierro, LblScoreOro, LblScoreEsmeralda, LblIconoNivel,
            LblNivel, LblInstruccionesNivel, LblPregunta1, LblPregunta2, LblPregunta3, LblPregunta4, LblPregunta5,
            LblPregunta6, LblPregunta1Opcion1, LblPregunta1Opcion2, LblPregunta1Opcion3, LblPregunta1Opcion4,
            LblPregunta1Opcion5, LblPregunta1Opcion6, LblPregunta1Opcion7, LblPregunta1Opcion8, LblPregunta1Opcion9,
            LblPregunta1Opcion10, LblPregunta1Opcion11, LblPregunta1Opcion12, LblPregunta1BG, LblPregunta2Opcion1,
            LblPregunta2Opcion2, LblPregunta2Opcion3, LblPregunta2Opcion4, LblPregunta2Opcion5, LblPregunta2Opcion6,
            LblPregunta2Opcion7, LblPregunta2Opcion8, LblPregunta2Opcion9, LblPregunta2Opcion10, LblPregunta2Opcion11,
            LblPregunta2Opcion12, LblPregunta2BG, LblPregunta3Opcion1, LblPregunta3Opcion2, LblPregunta3Opcion3,
            LblPregunta3Opcion4, LblPregunta3Opcion5, LblPregunta3Opcion6, LblPregunta3Opcion7, LblPregunta3Opcion8,
            LblPregunta3Opcion9, LblPregunta3Opcion10, LblPregunta3Opcion11, LblPregunta3Opcion12, LblPregunta3BG,
            LblPregunta4Opcion1, LblPregunta4Opcion2, LblPregunta4Opcion3, LblPregunta4Opcion4, LblPregunta4Opcion5,
            LblPregunta4Opcion6, LblPregunta4Opcion7, LblPregunta4Opcion8, LblPregunta4Opcion9, LblPregunta4Opcion10,
            LblPregunta4Opcion11, LblPregunta4Opcion12, LblPregunta4BG, LblPregunta5Opcion1, LblPregunta5Opcion2,
            LblPregunta5Opcion3, LblPregunta5Opcion4, LblPregunta5Opcion5, LblPregunta5Opcion6, LblPregunta5Opcion7,
            LblPregunta5Opcion8, LblPregunta5Opcion9, LblPregunta5Opcion10, LblPregunta5Opcion11, LblPregunta5Opcion12,
            LblPregunta5BG, LblPregunta6Opcion1, LblPregunta6Opcion2, LblPregunta6Opcion3, LblPregunta6Opcion4,
            LblPregunta6Opcion5, LblPregunta6Opcion6, LblPregunta6Opcion7, LblPregunta6Opcion8, LblPregunta6Opcion9,
            LblPregunta6Opcion10, LblPregunta6Opcion11, LblPregunta6Opcion12, LblPregunta6BG;
    private JCheckBox Pregunta1Opcion1, Pregunta1Opcion2, Pregunta1Opcion3, Pregunta1Opcion4, Pregunta1Opcion5,
            Pregunta1Opcion6, Pregunta1Opcion7, Pregunta1Opcion8, Pregunta1Opcion9, Pregunta1Opcion10,
            Pregunta1Opcion11, Pregunta1Opcion12, Pregunta2Opcion1, Pregunta2Opcion2, Pregunta2Opcion3,
            Pregunta2Opcion4, Pregunta2Opcion5, Pregunta2Opcion6, Pregunta2Opcion7, Pregunta2Opcion8, Pregunta2Opcion9,
            Pregunta2Opcion10, Pregunta2Opcion11, Pregunta2Opcion12, Pregunta3Opcion1, Pregunta3Opcion2,
            Pregunta3Opcion3, Pregunta3Opcion4, Pregunta3Opcion5, Pregunta3Opcion6, Pregunta3Opcion7, Pregunta3Opcion8,
            Pregunta3Opcion9, Pregunta3Opcion10, Pregunta3Opcion11, Pregunta3Opcion12, Pregunta4Opcion1,
            Pregunta4Opcion2, Pregunta4Opcion3, Pregunta4Opcion4, Pregunta4Opcion5, Pregunta4Opcion6, Pregunta4Opcion7,
            Pregunta4Opcion8, Pregunta4Opcion9, Pregunta4Opcion10, Pregunta4Opcion11, Pregunta4Opcion12,
            Pregunta5Opcion1, Pregunta5Opcion2, Pregunta5Opcion3, Pregunta5Opcion4, Pregunta5Opcion5, Pregunta5Opcion6,
            Pregunta5Opcion7, Pregunta5Opcion8, Pregunta5Opcion9, Pregunta5Opcion10, Pregunta5Opcion11,
            Pregunta5Opcion12, Pregunta6Opcion1, Pregunta6Opcion2, Pregunta6Opcion3, Pregunta6Opcion4, Pregunta6Opcion5,
            Pregunta6Opcion6, Pregunta6Opcion7, Pregunta6Opcion8, Pregunta6Opcion9, Pregunta6Opcion10,
            Pregunta6Opcion11, Pregunta6Opcion12;
    private JButton BtnInstrucciones, BtnDiamante, BtnDiamante2, BtnDiamante3, BtnDiamante4, BtnDiamante5,
            BtnFinalizarDiamante;
    private String Fuente = "", Negro = "", Blanco = "", Rojo = "", Verde = "", Cobre = "", Diamante = "",
            TxtNivel = "", TxtInstruccionesNivel = "", TxtPregunta1 = "", TxtPregunta2 = "", TxtPregunta3 = "",
            TxtPregunta4 = "", TxtPregunta5 = "", TxtPregunta6 = "";
    private Font FuenteMinecraft;
    private int m = 1, te = 250, PuntajeNivelCobre = 0, PuntajeNivelHierro = 0, PuntajeNivelOro = 0,
            PuntajeNivelEsmeralda = 0;
    public static int PuntajeNivelDiamante = 0;

    public void CreandoVentanaNivelDiamante() {

        // PERSONALIZAMOS NUESTRA PLANTILLA DE NIVEL DIAMANTE
        PersonalizarPlantillaDiamante();

        // GUARDANAMOS NUESTRAS IMAGENES
        AlmacenarImagenesNivelDiamante();

        // COLOCAMOS LOS PUNTAJES EN EL SCOREBOARD
        ScoreBoardDiamante();

        // CREAMOS Y COLOCAMOS NUESTRO SIDEBAR LEFT
        CrearSidebarLeftDiamante();

        // CREAMOS NUESTROS PANELES PRINCIPALES
        CreacionDePanelesPrincipales();

        // CREAMOS NUESTRO PANEL DE LAS PRIMERAS PREGUNTAS
        PanelPreguntasNivelDiamante1();

        // INICIAMOS NUESTRO CRONOMETRO
        CronometroDiamante();

    }

    public void PersonalizarPlantillaDiamante() {
        // INSTANCIAMOS LA CLASE DE NUESTRA PLANTILLA GENERAL
        PlantillaGeneral plantillaGeneralParaNivelDiamante = new PlantillaGeneral();

        // OBTENEMOS LA PLANTILLA Y LA AGREAMOS A NUESTRO JFRAME
        VentanaNivelDiamante = plantillaGeneralParaNivelDiamante.CreandoPlantillaGeneral();

        // OBTENEMOS Y ALMACENAMOS LOS COLORES Y FUENTE A UTILIZAR
        FuenteMinecraft = plantillaGeneralParaNivelDiamante.FuenteMinecraft;
        Negro = plantillaGeneralParaNivelDiamante.Negro;
        Blanco = plantillaGeneralParaNivelDiamante.Blanco;
        Diamante = plantillaGeneralParaNivelDiamante.Diamante;
        Rojo = plantillaGeneralParaNivelDiamante.Rojo;
        Verde = plantillaGeneralParaNivelDiamante.Verde;
        Cobre = plantillaGeneralParaNivelDiamante.Cobre;

        // ASIGNAMOS EL ICONO A NUESTRA VENTANA
        VentanaNivelDiamante.setIconImage(
                new ImageIcon(getClass().getResource("ImgNivelDiamante/Diamante.png")).getImage());

        // OBTENEMOS EL PUNTAJE DEL NIVEL COBRE/HIERRO/ORO/ESMERALDA
        LblScoreCobre = plantillaGeneralParaNivelDiamante.LblScoreCobre4;
        LblScoreHierro = plantillaGeneralParaNivelDiamante.LblScoreHierro4;
        LblScoreOro = plantillaGeneralParaNivelDiamante.LblScoreOro4;
        LblScoreEsmeralda = plantillaGeneralParaNivelDiamante.LblScoreEsmeralda4;
    }

    public void AlmacenarImagenesNivelDiamante() {
        // GUARDAMOS LA IMAGEN DEL NIVEL Oro
        IconoNivel = new ImageIcon("ImgNivelDiamante/Diamante.png").getImage();
        IconoNivel2 = new ImageIcon(IconoNivel.getScaledInstance(125, 135,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE ICONO Oro
        IconoMostrar = new ImageIcon("ImgNivelDiamante/Mostrar.png").getImage();
        IconoMostrar2 = new ImageIcon(IconoMostrar.getScaledInstance(40, 30,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DEL ICONO Oro
        IconoOcultar = new ImageIcon("ImgNivelDiamante/Ocultar.png").getImage();
        IconoOcultar2 = new ImageIcon(IconoOcultar.getScaledInstance(40, 30,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 1
        ImgP1O1 = new ImageIcon("ImgNivelDiamante/Pregunta1/13.png").getImage();
        ImgP1O1Num2 = new ImageIcon(ImgP1O1.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 1
        ImgP1O2 = new ImageIcon("ImgNivelDiamante/Pregunta1/Blocks.png").getImage();
        ImgP1O2Num2 = new ImageIcon(ImgP1O2.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 1
        ImgP1O3 = new ImageIcon("ImgNivelDiamante/Pregunta1/Cat.png").getImage();
        ImgP1O3Num2 = new ImageIcon(ImgP1O3.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 1
        ImgP1O4 = new ImageIcon("ImgNivelDiamante/Pregunta1/Far.png").getImage();
        ImgP1O4Num2 = new ImageIcon(ImgP1O4.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 1
        ImgP1O5 = new ImageIcon("ImgNivelDiamante/Pregunta1/Mall.png").getImage();
        ImgP1O5Num2 = new ImageIcon(ImgP1O5.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 1
        ImgP1O6 = new ImageIcon("ImgNivelDiamante/Pregunta1/Mellohi.png").getImage();
        ImgP1O6Num2 = new ImageIcon(ImgP1O6.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 1
        ImgP1O7 = new ImageIcon("ImgNivelDiamante/Pregunta1/Stal.png").getImage();
        ImgP1O7Num2 = new ImageIcon(ImgP1O7.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 1
        ImgP1O8 = new ImageIcon("ImgNivelDiamante/Pregunta1/Chirp.png").getImage();
        ImgP1O8Num2 = new ImageIcon(ImgP1O8.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 1
        ImgP1O9 = new ImageIcon("ImgNivelDiamante/Pregunta1/Strad.png").getImage();
        ImgP1O9Num2 = new ImageIcon(ImgP1O9.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 1
        ImgP1O10 = new ImageIcon("ImgNivelDiamante/Pregunta1/Otherside.png").getImage();
        ImgP1O10Num2 = new ImageIcon(ImgP1O10.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 1
        ImgP1O11 = new ImageIcon("ImgNivelDiamante/Pregunta1/Wait.png").getImage();
        ImgP1O11Num2 = new ImageIcon(ImgP1O11.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 1
        ImgP1O12 = new ImageIcon("ImgNivelDiamante/Pregunta1/Ward.png").getImage();
        ImgP1O12Num2 = new ImageIcon(ImgP1O12.getScaledInstance(90, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 2
        ImgP2O1 = new ImageIcon("ImgNivelDiamante/Pregunta2/Araña.png").getImage();
        ImgP2O1Num2 = new ImageIcon(ImgP2O1.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 2
        ImgP2O2 = new ImageIcon("ImgNivelDiamante/Pregunta2/Cerdo.png").getImage();
        ImgP2O2Num2 = new ImageIcon(ImgP2O2.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 2
        ImgP2O3 = new ImageIcon("ImgNivelDiamante/Pregunta2/Creeper.png").getImage();
        ImgP2O3Num2 = new ImageIcon(ImgP2O3.getScaledInstance(70, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 2
        ImgP2O4 = new ImageIcon("ImgNivelDiamante/Pregunta2/Enderman.png").getImage();
        ImgP2O4Num2 = new ImageIcon(ImgP2O4.getScaledInstance(70, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 2
        ImgP2O5 = new ImageIcon("ImgNivelDiamante/Pregunta2/Esqueleto.png").getImage();
        ImgP2O5Num2 = new ImageIcon(ImgP2O5.getScaledInstance(70, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 2
        ImgP2O6 = new ImageIcon("ImgNivelDiamante/Pregunta2/Ghast.png").getImage();
        ImgP2O6Num2 = new ImageIcon(ImgP2O6.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 2
        ImgP2O7 = new ImageIcon("ImgNivelDiamante/Pregunta2/Guardian.png").getImage();
        ImgP2O7Num2 = new ImageIcon(ImgP2O7.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 2
        ImgP2O8 = new ImageIcon("ImgNivelDiamante/Pregunta2/Oveja.png").getImage();
        ImgP2O8Num2 = new ImageIcon(ImgP2O8.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 2
        ImgP2O9 = new ImageIcon("ImgNivelDiamante/Pregunta2/GuardianAnciano.png").getImage();
        ImgP2O9Num2 = new ImageIcon(ImgP2O9.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 2
        ImgP2O10 = new ImageIcon("ImgNivelDiamante/Pregunta2/Pollo.png").getImage();
        ImgP2O10Num2 = new ImageIcon(ImgP2O10.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 2
        ImgP2O11 = new ImageIcon("ImgNivelDiamante/Pregunta2/Ravager.png").getImage();
        ImgP2O11Num2 = new ImageIcon(ImgP2O11.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 2
        ImgP2O12 = new ImageIcon("ImgNivelDiamante/Pregunta2/Vaca.png").getImage();
        ImgP2O12Num2 = new ImageIcon(ImgP2O12.getScaledInstance(100, 80, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 3
        ImgP3O1 = new ImageIcon("ImgNivelDiamante/Pregunta3/Craftmine.png").getImage();
        ImgP3O1Num2 = new ImageIcon(ImgP3O1.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 3
        ImgP3O2 = new ImageIcon("ImgNivelDiamante/Pregunta3/Maincraft.png").getImage();
        ImgP3O2Num2 = new ImageIcon(ImgP3O2.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 3
        ImgP3O3 = new ImageIcon("ImgNivelDiamante/Pregunta3/Maincrafter.png").getImage();
        ImgP3O3Num2 = new ImageIcon(ImgP3O3.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 3
        ImgP3O4 = new ImageIcon("ImgNivelDiamante/Pregunta3/Miecraft.png").getImage();
        ImgP3O4Num2 = new ImageIcon(ImgP3O4.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 3
        ImgP3O5 = new ImageIcon("ImgNivelDiamante/Pregunta3/Miencraft.png").getImage();
        ImgP3O5Num2 = new ImageIcon(ImgP3O5.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 3
        ImgP3O6 = new ImageIcon("ImgNivelDiamante/Pregunta3/Minceraft.png").getImage();
        ImgP3O6Num2 = new ImageIcon(ImgP3O6.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 3
        ImgP3O7 = new ImageIcon("ImgNivelDiamante/Pregunta3/Minecraaft.png").getImage();
        ImgP3O7Num2 = new ImageIcon(ImgP3O7.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 3
        ImgP3O8 = new ImageIcon("ImgNivelDiamante/Pregunta3/Minecraf.png").getImage();
        ImgP3O8Num2 = new ImageIcon(ImgP3O8.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 3
        ImgP3O9 = new ImageIcon("ImgNivelDiamante/Pregunta3/Minecraft.png").getImage();
        ImgP3O9Num2 = new ImageIcon(ImgP3O9.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 3
        ImgP3O10 = new ImageIcon("ImgNivelDiamante/Pregunta3/Minecrat.png").getImage();
        ImgP3O10Num2 = new ImageIcon(ImgP3O10.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 3
        ImgP3O11 = new ImageIcon("ImgNivelDiamante/Pregunta3/Minecratf.png").getImage();
        ImgP3O11Num2 = new ImageIcon(ImgP3O11.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 3
        ImgP3O12 = new ImageIcon("ImgNivelDiamante/Pregunta3/Mineecraft.png").getImage();
        ImgP3O12Num2 = new ImageIcon(ImgP3O12.getScaledInstance(150, 40, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 4
        ImgP4O1 = new ImageIcon("ImgNivelDiamante/Pregunta4/Arena.png").getImage();
        ImgP4O1Num2 = new ImageIcon(ImgP4O1.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 4
        ImgP4O2 = new ImageIcon("ImgNivelDiamante/Pregunta4/Piedra.png").getImage();
        ImgP4O2Num2 = new ImageIcon(ImgP4O2.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 4
        ImgP4O3 = new ImageIcon("ImgNivelDiamante/Pregunta4/Tierra.png").getImage();
        ImgP4O3Num2 = new ImageIcon(ImgP4O3.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 4
        ImgP4O4 = new ImageIcon("ImgNivelDiamante/Pregunta4/Cesped.png").getImage();
        ImgP4O4Num2 = new ImageIcon(ImgP4O4.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 4
        ImgP4O5 = new ImageIcon("ImgNivelDiamante/Pregunta4/TierraFertil.png").getImage();
        ImgP4O5Num2 = new ImageIcon(ImgP4O5.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 4
        ImgP4O6 = new ImageIcon("ImgNivelDiamante/Pregunta4/PiedraMoss.png").getImage();
        ImgP4O6Num2 = new ImageIcon(ImgP4O6.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 4
        ImgP4O7 = new ImageIcon("ImgNivelDiamante/Pregunta4/AreniscaLisa.png").getImage();
        ImgP4O7Num2 = new ImageIcon(ImgP4O7.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 4
        ImgP4O8 = new ImageIcon("ImgNivelDiamante/Pregunta4/Roca.png").getImage();
        ImgP4O8Num2 = new ImageIcon(ImgP4O8.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 4
        ImgP4O9 = new ImageIcon("ImgNivelDiamante/Pregunta4/Grava.png").getImage();
        ImgP4O9Num2 = new ImageIcon(ImgP4O9.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 4
        ImgP4O10 = new ImageIcon("ImgNivelDiamante/Pregunta4/TierraCultivo.png").getImage();
        ImgP4O10Num2 = new ImageIcon(ImgP4O10.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 4
        ImgP4O11 = new ImageIcon("ImgNivelDiamante/Pregunta4/AreniscaCortada.png").getImage();
        ImgP4O11Num2 = new ImageIcon(ImgP4O11.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 4
        ImgP4O12 = new ImageIcon("ImgNivelDiamante/Pregunta4/TierraCultivoHumeda.png").getImage();
        ImgP4O12Num2 = new ImageIcon(ImgP4O12.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 5
        ImgP5O1 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoAbeja.png").getImage();
        ImgP5O1Num2 = new ImageIcon(ImgP5O1.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 5
        ImgP5O2 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoBlaze.png").getImage();
        ImgP5O2Num2 = new ImageIcon(ImgP5O2.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 5
        ImgP5O3 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoBurro.png").getImage();
        ImgP5O3Num2 = new ImageIcon(ImgP5O3.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 5
        ImgP5O4 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoDelfin.png").getImage();
        ImgP5O4Num2 = new ImageIcon(ImgP5O4.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 5
        ImgP5O5 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoMagma.png").getImage();
        ImgP5O5Num2 = new ImageIcon(ImgP5O5.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 5
        ImgP5O6 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoOcelote.png").getImage();
        ImgP5O6Num2 = new ImageIcon(ImgP5O6.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 5
        ImgP5O7 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoPanda.png").getImage();
        ImgP5O7Num2 = new ImageIcon(ImgP5O7.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 5
        ImgP5O8 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoPollo.png").getImage();
        ImgP5O8Num2 = new ImageIcon(ImgP5O8.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 5
        ImgP5O9 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoStrider.png").getImage();
        ImgP5O9Num2 = new ImageIcon(ImgP5O9.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 5
        ImgP5O10 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoVendedor.png").getImage();
        ImgP5O10Num2 = new ImageIcon(ImgP5O10.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 5
        ImgP5O11 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoVindicador.png").getImage();
        ImgP5O11Num2 = new ImageIcon(ImgP5O11.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 5
        ImgP5O12 = new ImageIcon("ImgNivelDiamante/Pregunta5/HuevoZorro.png").getImage();
        ImgP5O12Num2 = new ImageIcon(ImgP5O12.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 6
        ImgP6O1 = new ImageIcon("ImgNivelDiamante/Pregunta6/Zoglin.png").getImage();
        ImgP6O1Num2 = new ImageIcon(ImgP6O1.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 6
        ImgP6O2 = new ImageIcon("ImgNivelDiamante/Pregunta6/Shulker.png").getImage();
        ImgP6O2Num2 = new ImageIcon(ImgP6O2.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 6
        ImgP6O3 = new ImageIcon("ImgNivelDiamante/Pregunta6/Piglin.png").getImage();
        ImgP6O3Num2 = new ImageIcon(ImgP6O3.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 6
        ImgP6O4 = new ImageIcon("ImgNivelDiamante/Pregunta6/Panda.png").getImage();
        ImgP6O4Num2 = new ImageIcon(ImgP6O4.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 6
        ImgP6O5 = new ImageIcon("ImgNivelDiamante/Pregunta6/OsoPolar.png").getImage();
        ImgP6O5Num2 = new ImageIcon(ImgP6O5.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 6
        ImgP6O6 = new ImageIcon("ImgNivelDiamante/Pregunta6/Lobo.png").getImage();
        ImgP6O6Num2 = new ImageIcon(ImgP6O6.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 6
        ImgP6O7 = new ImageIcon("ImgNivelDiamante/Pregunta6/Llama.png").getImage();
        ImgP6O7Num2 = new ImageIcon(ImgP6O7.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 6
        ImgP6O8 = new ImageIcon("ImgNivelDiamante/Pregunta6/Invocador.png").getImage();
        ImgP6O8Num2 = new ImageIcon(ImgP6O8.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 6
        ImgP6O9 = new ImageIcon("ImgNivelDiamante/Pregunta6/Fantasma.png").getImage();
        ImgP6O9Num2 = new ImageIcon(ImgP6O9.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 6
        ImgP6O10 = new ImageIcon("ImgNivelDiamante/Pregunta6/Delfin.png").getImage();
        ImgP6O10Num2 = new ImageIcon(ImgP6O10.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 6
        ImgP6O11 = new ImageIcon("ImgNivelDiamante/Pregunta6/Cabra.png").getImage();
        ImgP6O11Num2 = new ImageIcon(ImgP6O11.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 6
        ImgP6O12 = new ImageIcon("ImgNivelDiamante/Pregunta6/Abeja.png").getImage();
        ImgP6O12Num2 = new ImageIcon(ImgP6O12.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE NUESTRO BACKGROUND
        Wallpaper = new ImageIcon("ImgNivelDiamante/Wallpaper.jpg").getImage();
        Wallpaper2 = new ImageIcon(
                Wallpaper.getScaledInstance(900, 700, Image.SCALE_SMOOTH));
    }

    public void ScoreBoardDiamante() {
        VentanaCobre VC = new VentanaCobre();
        VentanaHierro VH = new VentanaHierro();
        VentanaOro VO = new VentanaOro();
        VentanaEsmeralda VE = new VentanaEsmeralda();
        PuntajeNivelCobre = VC.PuntajeNivelCobre;
        PuntajeNivelHierro = VH.PuntajeNivelHierro;
        PuntajeNivelOro = VO.PuntajeNivelOro;
        PuntajeNivelEsmeralda = VE.PuntajeNivelEsmeralda;
        LblScoreCobre.setText(PuntajeNivelCobre + " DE 5");
        LblScoreHierro.setText(PuntajeNivelHierro + " DE 6");
        LblScoreOro.setText(PuntajeNivelOro + " DE 6");
        LblScoreEsmeralda.setText(PuntajeNivelEsmeralda + " DE 4");
    }

    public void CrearSidebarLeftDiamante() {
        // CREAMOS Y COLOCAMOS EL ICONO DEL NIVEL
        LblIconoNivel = new JLabel("", JLabel.CENTER);
        VentanaNivelDiamante.add(LblIconoNivel);

        // CREAMOS Y COLOCAMOS EL TEXTO DEL NIVEL
        TxtNivel = "<html><body>NIVEL 5 <b style=color:'" + Diamante + "'>DIAMANTE</b></body></html>";
        LblNivel = new JLabel(TxtNivel, JLabel.CENTER);
        VentanaNivelDiamante.add(LblNivel);

        // CREAMOS Y COLOCAMOS EL TEXTO CON LAS INSTRUCCIONES
        TxtInstruccionesNivel = "<html><body><center><b style=color:'" + Diamante
                + "'>DETALLES DEL NIVEL</b><br><br>CANTIDAD DE PREGUNTAS <b style=color:'" + Diamante
                + "'>6</b><br>TIPO DE PREGUNTAS <b style=color:'" + Diamante
                + "'>OPCION MULTIPLE DE RESPUESTA MULTIPLE</b><br>TIEMPO <b style=color:'"
                + Diamante
                + "'>240 SEGUNDOS</b></center></body></html>";
        LblInstruccionesNivel = new JLabel(TxtInstruccionesNivel, JLabel.CENTER);
        VentanaNivelDiamante.add(LblInstruccionesNivel);

        // CREAMOS Y COLOCAMOS EL BOTON DE VER INSTRUCCIONES
        BtnInstrucciones = new JButton();
        VentanaNivelDiamante.add(BtnInstrucciones);

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
        BtnInstrucciones.setBorder(BorderFactory.createLineBorder(Color.decode(Negro), 1));
        BtnInstrucciones.setFocusPainted(false);
        BtnInstrucciones.setIcon(IconoOcultar2);
        BtnInstrucciones.addActionListener(this);
    }

    public void CreacionDePanelesPrincipales() {
        // CREAMOS Y AGREGAMOS EL PANEL DE FONDO
        Panel1 = new JPanel();
        VentanaNivelDiamante.add(Panel1);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA PRIMERA PREGUNTA
        Panel2 = new JPanel();
        Panel1.add(Panel2);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA BARRA DE TIEMPO
        Panel3 = new JPanel();
        Panel1.add(Panel3);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA SEGUNDA PREGUNTA
        Panel4 = new JPanel();
        Panel1.add(Panel4);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA TERCERA PREGUNTA
        Panel5 = new JPanel();
        Panel1.add(Panel5);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA CUARTA PREGUNTA
        Panel6 = new JPanel();
        Panel1.add(Panel6);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA QUINTA PREGUNTA
        Panel7 = new JPanel();
        Panel1.add(Panel7);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA ULTIMA PREGUNTA
        Panel8 = new JPanel();
        Panel1.add(Panel8);

        // AGREGAMOS LA BARRA DE TIEMPO
        BarraNivelDiamante = new JProgressBar(0, te);
        Panel3.add(BarraNivelDiamante);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnDiamante = new JButton("SIGUIENTE");
        Panel3.add(BtnDiamante);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnDiamante2 = new JButton("SIGUIENTE");
        Panel3.add(BtnDiamante2);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnDiamante3 = new JButton("SIGUIENTE");
        Panel3.add(BtnDiamante3);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnDiamante4 = new JButton("SIGUIENTE");
        Panel3.add(BtnDiamante4);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnDiamante5 = new JButton("SIGUIENTE");
        Panel3.add(BtnDiamante5);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnFinalizarDiamante = new JButton("FINALIZAR NIVEL");
        Panel3.add(BtnFinalizarDiamante);

        // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
        LblCover = new JLabel();
        Panel1.add(LblCover);
        LblWallpaper = new JLabel();
        Panel1.add(LblWallpaper);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL QUE CONTIENE EL FONDO
        Panel1.setLayout(null);
        Panel1.setBounds(400, 30, 900, 700);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE BARRA
        Panel3.setLayout(null);
        Panel3.setBounds(10, 600, 880, 60);
        Panel3.setOpaque(true);
        Panel3.setBackground(new Color(0, 0, 0, 0));

        // DAMOS PROPIEDADES A NUESTRA BARRA DE TIEMPO
        BarraNivelDiamante.setBounds(0, 5, 730, 50);
        BarraNivelDiamante.setStringPainted(true);
        BarraNivelDiamante.setForeground(Color.decode(Diamante));
        BarraNivelDiamante.setString("");
        BarraNivelDiamante.setFont(new Font(Fuente, Font.BOLD, 20));
        BarraNivelDiamante.setBorder(null);
        BarraNivelDiamante.setValue(te);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnDiamante.setBounds(740, 5, 150, 50);
        BtnDiamante.setFocusPainted(false);
        BtnDiamante.setBackground(Color.decode(Diamante));
        BtnDiamante.setForeground(Color.decode(Negro));
        BtnDiamante.setFont(FuenteMinecraft.deriveFont(15f));
        BtnDiamante.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnDiamante.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA2
        BtnDiamante2.setBounds(740, 5, 150, 50);
        BtnDiamante2.setFocusPainted(false);
        BtnDiamante2.setBackground(Color.decode(Diamante));
        BtnDiamante2.setForeground(Color.decode(Negro));
        BtnDiamante2.setFont(FuenteMinecraft.deriveFont(15f));
        BtnDiamante2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnDiamante2.setVisible(false);
        BtnDiamante2.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA2
        BtnDiamante3.setBounds(740, 5, 150, 50);
        BtnDiamante3.setFocusPainted(false);
        BtnDiamante3.setBackground(Color.decode(Diamante));
        BtnDiamante3.setForeground(Color.decode(Negro));
        BtnDiamante3.setFont(FuenteMinecraft.deriveFont(15f));
        BtnDiamante3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnDiamante3.setVisible(false);
        BtnDiamante3.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA2
        BtnDiamante4.setBounds(740, 5, 150, 50);
        BtnDiamante4.setFocusPainted(false);
        BtnDiamante4.setBackground(Color.decode(Diamante));
        BtnDiamante4.setForeground(Color.decode(Negro));
        BtnDiamante4.setFont(FuenteMinecraft.deriveFont(15f));
        BtnDiamante4.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnDiamante4.setVisible(false);
        BtnDiamante4.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA2
        BtnDiamante5.setBounds(740, 5, 150, 50);
        BtnDiamante5.setFocusPainted(false);
        BtnDiamante5.setBackground(Color.decode(Diamante));
        BtnDiamante5.setForeground(Color.decode(Negro));
        BtnDiamante5.setFont(FuenteMinecraft.deriveFont(15f));
        BtnDiamante5.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnDiamante5.setVisible(false);
        BtnDiamante5.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnFinalizarDiamante.setBounds(690, 5, 200, 50);
        BtnFinalizarDiamante.setFocusPainted(false);
        BtnFinalizarDiamante.setBackground(Color.decode(Diamante));
        BtnFinalizarDiamante.setForeground(Color.decode(Negro));
        BtnFinalizarDiamante.setFont(FuenteMinecraft.deriveFont(15f));
        BtnFinalizarDiamante.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnFinalizarDiamante.setVisible(false);
        BtnFinalizarDiamante.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
        LblCover.setBounds(0, 0, 901, 701);
        LblCover.setOpaque(true);
        LblCover.setBackground(new Color(0, 0, 0, 100));

        LblWallpaper.setBounds(0, 0, 900, 700);
        LblWallpaper.setIcon(Wallpaper2);
    }

    public void PanelPreguntasNivelDiamante1() {
        TxtPregunta1 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #1:</b> SELECCIONA LOS DISCOS DE NOMBRE <b style=color:'" + Rojo
                + ">OTHERSIDE - 13 - CHIRP</b></body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta1 = new JLabel(TxtPregunta1, JLabel.CENTER);
        Panel2.add(LblPregunta1);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta1Opcion1 = new JCheckBox();
        Panel2.add(Pregunta1Opcion1);
        LblPregunta1Opcion1 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion1);

        Pregunta1Opcion2 = new JCheckBox();
        Panel2.add(Pregunta1Opcion2);
        LblPregunta1Opcion2 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion2);

        Pregunta1Opcion3 = new JCheckBox();
        Panel2.add(Pregunta1Opcion3);
        LblPregunta1Opcion3 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion3);

        Pregunta1Opcion4 = new JCheckBox();
        Panel2.add(Pregunta1Opcion4);
        LblPregunta1Opcion4 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion4);

        Pregunta1Opcion5 = new JCheckBox();
        Panel2.add(Pregunta1Opcion5);
        LblPregunta1Opcion5 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion5);

        Pregunta1Opcion6 = new JCheckBox();
        Panel2.add(Pregunta1Opcion6);
        LblPregunta1Opcion6 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion6);

        Pregunta1Opcion7 = new JCheckBox();
        Panel2.add(Pregunta1Opcion7);
        LblPregunta1Opcion7 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion7);

        Pregunta1Opcion8 = new JCheckBox();
        Panel2.add(Pregunta1Opcion8);
        LblPregunta1Opcion8 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion8);

        Pregunta1Opcion9 = new JCheckBox();
        Panel2.add(Pregunta1Opcion9);
        LblPregunta1Opcion9 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion9);

        Pregunta1Opcion10 = new JCheckBox();
        Panel2.add(Pregunta1Opcion10);
        LblPregunta1Opcion10 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion10);

        Pregunta1Opcion11 = new JCheckBox();
        Panel2.add(Pregunta1Opcion11);
        LblPregunta1Opcion11 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion11);

        Pregunta1Opcion12 = new JCheckBox();
        Panel2.add(Pregunta1Opcion12);
        LblPregunta1Opcion12 = new JLabel("", JLabel.CENTER);
        Panel2.add(LblPregunta1Opcion12);

        LblPregunta1BG = new JLabel();
        Panel2.add(LblPregunta1BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
        Panel2.setLayout(null);
        Panel2.setBounds(10, 10, 880, 580);
        Panel2.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta1.setBounds(0, 10, 670, 50);
        LblPregunta1.setOpaque(true);
        LblPregunta1.setBackground(Color.decode(Diamante));
        LblPregunta1.setForeground(Color.decode(Negro));
        LblPregunta1.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta1.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta1Opcion1.setBounds(110, 80, 20, 20);
        Pregunta1Opcion1.setContentAreaFilled(false);
        Pregunta1Opcion1.addChangeListener(this);
        LblPregunta1Opcion1.setBounds(10, 100, 220, 145);
        LblPregunta1Opcion1.setIcon(ImgP1O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta1Opcion2.setBounds(330, 80, 20, 20);
        Pregunta1Opcion2.setContentAreaFilled(false);
        Pregunta1Opcion2.addChangeListener(this);
        LblPregunta1Opcion2.setBounds(230, 100, 220, 145);
        LblPregunta1Opcion2.setIcon(ImgP1O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta1Opcion3.setBounds(550, 80, 20, 20);
        Pregunta1Opcion3.setContentAreaFilled(false);
        Pregunta1Opcion3.addChangeListener(this);
        LblPregunta1Opcion3.setBounds(450, 100, 220, 145);
        LblPregunta1Opcion3.setIcon(ImgP1O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta1Opcion4.setBounds(770, 80, 20, 20);
        Pregunta1Opcion4.setContentAreaFilled(false);
        Pregunta1Opcion4.addChangeListener(this);
        LblPregunta1Opcion4.setBounds(670, 100, 220, 145);
        LblPregunta1Opcion4.setIcon(ImgP1O4Num2);

        // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
        Pregunta1Opcion5.setBounds(110, 245, 20, 20);
        Pregunta1Opcion5.setContentAreaFilled(false);
        Pregunta1Opcion5.addChangeListener(this);
        LblPregunta1Opcion5.setBounds(10, 265, 220, 145);
        LblPregunta1Opcion5.setIcon(ImgP1O5Num2);

        // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
        Pregunta1Opcion6.setBounds(330, 245, 20, 20);
        Pregunta1Opcion6.setContentAreaFilled(false);
        Pregunta1Opcion6.addChangeListener(this);
        LblPregunta1Opcion6.setBounds(230, 265, 220, 145);
        LblPregunta1Opcion6.setIcon(ImgP1O6Num2);

        // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
        Pregunta1Opcion7.setBounds(550, 245, 20, 20);
        Pregunta1Opcion7.setContentAreaFilled(false);
        Pregunta1Opcion7.addChangeListener(this);
        LblPregunta1Opcion7.setBounds(450, 265, 220, 145);
        LblPregunta1Opcion7.setIcon(ImgP1O7Num2);

        // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
        Pregunta1Opcion8.setBounds(770, 245, 20, 20);
        Pregunta1Opcion8.setContentAreaFilled(false);
        Pregunta1Opcion8.addChangeListener(this);
        LblPregunta1Opcion8.setBounds(670, 265, 220, 145);
        LblPregunta1Opcion8.setIcon(ImgP1O8Num2);

        // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
        Pregunta1Opcion9.setBounds(110, 410, 20, 20);
        Pregunta1Opcion9.setContentAreaFilled(false);
        Pregunta1Opcion9.addChangeListener(this);
        LblPregunta1Opcion9.setBounds(10, 430, 220, 145);
        LblPregunta1Opcion9.setIcon(ImgP1O9Num2);

        // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
        Pregunta1Opcion10.setBounds(330, 410, 20, 20);
        Pregunta1Opcion10.setContentAreaFilled(false);
        Pregunta1Opcion10.addChangeListener(this);
        LblPregunta1Opcion10.setBounds(230, 430, 220, 145);
        LblPregunta1Opcion10.setIcon(ImgP1O10Num2);

        // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
        Pregunta1Opcion11.setBounds(550, 410, 20, 20);
        Pregunta1Opcion11.setContentAreaFilled(false);
        Pregunta1Opcion11.addChangeListener(this);
        LblPregunta1Opcion11.setBounds(450, 430, 220, 145);
        LblPregunta1Opcion11.setIcon(ImgP1O11Num2);

        // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
        Pregunta1Opcion12.setBounds(770, 410, 20, 20);
        Pregunta1Opcion12.setContentAreaFilled(false);
        Pregunta1Opcion12.addChangeListener(this);
        LblPregunta1Opcion12.setBounds(670, 430, 220, 145);
        LblPregunta1Opcion12.setIcon(ImgP1O12Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblPregunta1BG.setBounds(0, 70, 880, 520);
        LblPregunta1BG.setOpaque(true);
        LblPregunta1BG.setBackground(new Color(38, 38, 38, 150));

        VentanaNivelDiamante.repaint();
    }

    public void PanelPreguntasNivelDiamante2() {
        TxtPregunta2 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #2:</b> CUAL DE LOS SIGUIENTES MOBS FUE <b style=color:'" + Rojo
                + "'>CREADO POR ERROR</b></body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta2 = new JLabel(TxtPregunta2, JLabel.CENTER);
        Panel4.add(LblPregunta2);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta2Opcion1 = new JCheckBox();
        Panel4.add(Pregunta2Opcion1);
        LblPregunta2Opcion1 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion1);

        Pregunta2Opcion2 = new JCheckBox();
        Panel4.add(Pregunta2Opcion2);
        LblPregunta2Opcion2 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion2);

        Pregunta2Opcion3 = new JCheckBox();
        Panel4.add(Pregunta2Opcion3);
        LblPregunta2Opcion3 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion3);

        Pregunta2Opcion4 = new JCheckBox();
        Panel4.add(Pregunta2Opcion4);
        LblPregunta2Opcion4 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion4);

        Pregunta2Opcion5 = new JCheckBox();
        Panel4.add(Pregunta2Opcion5);
        LblPregunta2Opcion5 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion5);

        Pregunta2Opcion6 = new JCheckBox();
        Panel4.add(Pregunta2Opcion6);
        LblPregunta2Opcion6 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion6);

        Pregunta2Opcion7 = new JCheckBox();
        Panel4.add(Pregunta2Opcion7);
        LblPregunta2Opcion7 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion7);

        Pregunta2Opcion8 = new JCheckBox();
        Panel4.add(Pregunta2Opcion8);
        LblPregunta2Opcion8 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion8);

        Pregunta2Opcion9 = new JCheckBox();
        Panel4.add(Pregunta2Opcion9);
        LblPregunta2Opcion9 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion9);

        Pregunta2Opcion10 = new JCheckBox();
        Panel4.add(Pregunta2Opcion10);
        LblPregunta2Opcion10 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion10);

        Pregunta2Opcion11 = new JCheckBox();
        Panel4.add(Pregunta2Opcion11);
        LblPregunta2Opcion11 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion11);

        Pregunta2Opcion12 = new JCheckBox();
        Panel4.add(Pregunta2Opcion12);
        LblPregunta2Opcion12 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta2Opcion12);

        LblPregunta2BG = new JLabel();
        Panel4.add(LblPregunta2BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
        Panel4.setLayout(null);
        Panel4.setBounds(10, 10, 880, 580);
        Panel4.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta2.setBounds(0, 10, 640, 50);
        LblPregunta2.setOpaque(true);
        LblPregunta2.setBackground(Color.decode(Diamante));
        LblPregunta2.setForeground(Color.decode(Negro));
        LblPregunta2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta2.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta2Opcion1.setBounds(110, 80, 20, 20);
        Pregunta2Opcion1.setContentAreaFilled(false);
        Pregunta2Opcion1.addChangeListener(this);
        LblPregunta2Opcion1.setBounds(10, 100, 220, 145);
        LblPregunta2Opcion1.setIcon(ImgP2O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta2Opcion2.setBounds(330, 80, 20, 20);
        Pregunta2Opcion2.setContentAreaFilled(false);
        Pregunta2Opcion2.addChangeListener(this);
        LblPregunta2Opcion2.setBounds(230, 100, 220, 145);
        LblPregunta2Opcion2.setIcon(ImgP2O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta2Opcion3.setBounds(550, 80, 20, 20);
        Pregunta2Opcion3.setContentAreaFilled(false);
        Pregunta2Opcion3.addChangeListener(this);
        LblPregunta2Opcion3.setBounds(450, 100, 220, 145);
        LblPregunta2Opcion3.setIcon(ImgP2O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta2Opcion4.setBounds(770, 80, 20, 20);
        Pregunta2Opcion4.setContentAreaFilled(false);
        Pregunta2Opcion4.addChangeListener(this);
        LblPregunta2Opcion4.setBounds(670, 100, 220, 145);
        LblPregunta2Opcion4.setIcon(ImgP2O4Num2);

        // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
        Pregunta2Opcion5.setBounds(110, 245, 20, 20);
        Pregunta2Opcion5.setContentAreaFilled(false);
        Pregunta2Opcion5.addChangeListener(this);
        LblPregunta2Opcion5.setBounds(10, 265, 220, 145);
        LblPregunta2Opcion5.setIcon(ImgP2O5Num2);

        // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
        Pregunta2Opcion6.setBounds(330, 245, 20, 20);
        Pregunta2Opcion6.setContentAreaFilled(false);
        Pregunta2Opcion6.addChangeListener(this);
        LblPregunta2Opcion6.setBounds(230, 265, 220, 145);
        LblPregunta2Opcion6.setIcon(ImgP2O6Num2);

        // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
        Pregunta2Opcion7.setBounds(550, 245, 20, 20);
        Pregunta2Opcion7.setContentAreaFilled(false);
        Pregunta2Opcion7.addChangeListener(this);
        LblPregunta2Opcion7.setBounds(450, 265, 220, 145);
        LblPregunta2Opcion7.setIcon(ImgP2O7Num2);

        // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
        Pregunta2Opcion8.setBounds(770, 245, 20, 20);
        Pregunta2Opcion8.setContentAreaFilled(false);
        Pregunta2Opcion8.addChangeListener(this);
        LblPregunta2Opcion8.setBounds(670, 265, 220, 145);
        LblPregunta2Opcion8.setIcon(ImgP2O8Num2);

        // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
        Pregunta2Opcion9.setBounds(110, 410, 20, 20);
        Pregunta2Opcion9.setContentAreaFilled(false);
        Pregunta2Opcion9.addChangeListener(this);
        LblPregunta2Opcion9.setBounds(10, 430, 220, 145);
        LblPregunta2Opcion9.setIcon(ImgP2O9Num2);

        // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
        Pregunta2Opcion10.setBounds(330, 410, 20, 20);
        Pregunta2Opcion10.setContentAreaFilled(false);
        Pregunta2Opcion10.addChangeListener(this);
        LblPregunta2Opcion10.setBounds(230, 430, 220, 145);
        LblPregunta2Opcion10.setIcon(ImgP2O10Num2);

        // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
        Pregunta2Opcion11.setBounds(550, 410, 20, 20);
        Pregunta2Opcion11.setContentAreaFilled(false);
        Pregunta2Opcion11.addChangeListener(this);
        LblPregunta2Opcion11.setBounds(450, 430, 220, 145);
        LblPregunta2Opcion11.setIcon(ImgP2O11Num2);

        // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
        Pregunta2Opcion12.setBounds(770, 410, 20, 20);
        Pregunta2Opcion12.setContentAreaFilled(false);
        Pregunta2Opcion12.addChangeListener(this);
        LblPregunta2Opcion12.setBounds(670, 430, 220, 145);
        LblPregunta2Opcion12.setIcon(ImgP2O12Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblPregunta2BG.setBounds(0, 70, 880, 520);
        LblPregunta2BG.setOpaque(true);
        LblPregunta2BG.setBackground(new Color(38, 38, 38, 150));
    }

    public void PanelPreguntasNivelDiamante3() {
        TxtPregunta3 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #3:</b> ESTE NOMBRE <b style=color:'" + Rojo
                + "'>1 VEZ DE CADA 10 MIL</b> TIENE POSIBILIDADES DE <b style=color:'" + Rojo
                + "'>SUSTITUIR</b> LA PALABRA MINECRAFT</body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta3 = new JLabel(TxtPregunta3, JLabel.CENTER);
        Panel5.add(LblPregunta3);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta3Opcion1 = new JCheckBox();
        Panel5.add(Pregunta3Opcion1);
        LblPregunta3Opcion1 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion1);

        Pregunta3Opcion2 = new JCheckBox();
        Panel5.add(Pregunta3Opcion2);
        LblPregunta3Opcion2 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion2);

        Pregunta3Opcion3 = new JCheckBox();
        Panel5.add(Pregunta3Opcion3);
        LblPregunta3Opcion3 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion3);

        Pregunta3Opcion4 = new JCheckBox();
        Panel5.add(Pregunta3Opcion4);
        LblPregunta3Opcion4 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion4);

        Pregunta3Opcion5 = new JCheckBox();
        Panel5.add(Pregunta3Opcion5);
        LblPregunta3Opcion5 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion5);

        Pregunta3Opcion6 = new JCheckBox();
        Panel5.add(Pregunta3Opcion6);
        LblPregunta3Opcion6 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion6);

        Pregunta3Opcion7 = new JCheckBox();
        Panel5.add(Pregunta3Opcion7);
        LblPregunta3Opcion7 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion7);

        Pregunta3Opcion8 = new JCheckBox();
        Panel5.add(Pregunta3Opcion8);
        LblPregunta3Opcion8 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion8);

        Pregunta3Opcion9 = new JCheckBox();
        Panel5.add(Pregunta3Opcion9);
        LblPregunta3Opcion9 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion9);

        Pregunta3Opcion10 = new JCheckBox();
        Panel5.add(Pregunta3Opcion10);
        LblPregunta3Opcion10 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion10);

        Pregunta3Opcion11 = new JCheckBox();
        Panel5.add(Pregunta3Opcion11);
        LblPregunta3Opcion11 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion11);

        Pregunta3Opcion12 = new JCheckBox();
        Panel5.add(Pregunta3Opcion12);
        LblPregunta3Opcion12 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta3Opcion12);

        LblPregunta3BG = new JLabel();
        Panel5.add(LblPregunta3BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
        Panel5.setLayout(null);
        Panel5.setBounds(10, 10, 880, 580);
        Panel5.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta3.setBounds(0, 10, 880, 50);
        LblPregunta3.setOpaque(true);
        LblPregunta3.setBackground(Color.decode(Diamante));
        LblPregunta3.setForeground(Color.decode(Negro));
        LblPregunta3.setBorder(BorderFactory.createEmptyBorder(4, 25, 0, 0));
        LblPregunta3.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta3Opcion1.setBounds(110, 80, 20, 20);
        Pregunta3Opcion1.setContentAreaFilled(false);
        Pregunta3Opcion1.addChangeListener(this);
        LblPregunta3Opcion1.setBounds(10, 100, 220, 145);
        LblPregunta3Opcion1.setIcon(ImgP3O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta3Opcion2.setBounds(330, 80, 20, 20);
        Pregunta3Opcion2.setContentAreaFilled(false);
        Pregunta3Opcion2.addChangeListener(this);
        LblPregunta3Opcion2.setBounds(230, 100, 220, 145);
        LblPregunta3Opcion2.setIcon(ImgP3O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta3Opcion3.setBounds(550, 80, 20, 20);
        Pregunta3Opcion3.setContentAreaFilled(false);
        Pregunta3Opcion3.addChangeListener(this);
        LblPregunta3Opcion3.setBounds(450, 100, 220, 145);
        LblPregunta3Opcion3.setIcon(ImgP3O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta3Opcion4.setBounds(770, 80, 20, 20);
        Pregunta3Opcion4.setContentAreaFilled(false);
        Pregunta3Opcion4.addChangeListener(this);
        LblPregunta3Opcion4.setBounds(670, 100, 220, 145);
        LblPregunta3Opcion4.setIcon(ImgP3O4Num2);

        // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
        Pregunta3Opcion5.setBounds(110, 245, 20, 20);
        Pregunta3Opcion5.setContentAreaFilled(false);
        Pregunta3Opcion5.addChangeListener(this);
        LblPregunta3Opcion5.setBounds(10, 265, 220, 145);
        LblPregunta3Opcion5.setIcon(ImgP3O5Num2);

        // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
        Pregunta3Opcion6.setBounds(330, 245, 20, 20);
        Pregunta3Opcion6.setContentAreaFilled(false);
        Pregunta3Opcion6.addChangeListener(this);
        LblPregunta3Opcion6.setBounds(230, 265, 220, 145);
        LblPregunta3Opcion6.setIcon(ImgP3O6Num2);

        // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
        Pregunta3Opcion7.setBounds(550, 245, 20, 20);
        Pregunta3Opcion7.setContentAreaFilled(false);
        Pregunta3Opcion7.addChangeListener(this);
        LblPregunta3Opcion7.setBounds(450, 265, 220, 145);
        LblPregunta3Opcion7.setIcon(ImgP3O7Num2);

        // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
        Pregunta3Opcion8.setBounds(770, 245, 20, 20);
        Pregunta3Opcion8.setContentAreaFilled(false);
        Pregunta3Opcion8.addChangeListener(this);
        LblPregunta3Opcion8.setBounds(670, 265, 220, 145);
        LblPregunta3Opcion8.setIcon(ImgP3O8Num2);

        // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
        Pregunta3Opcion9.setBounds(110, 410, 20, 20);
        Pregunta3Opcion9.setContentAreaFilled(false);
        Pregunta3Opcion9.addChangeListener(this);
        LblPregunta3Opcion9.setBounds(10, 430, 220, 145);
        LblPregunta3Opcion9.setIcon(ImgP3O9Num2);

        // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
        Pregunta3Opcion10.setBounds(330, 410, 20, 20);
        Pregunta3Opcion10.setContentAreaFilled(false);
        Pregunta3Opcion10.addChangeListener(this);
        LblPregunta3Opcion10.setBounds(230, 430, 220, 145);
        LblPregunta3Opcion10.setIcon(ImgP3O10Num2);

        // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
        Pregunta3Opcion11.setBounds(550, 410, 20, 20);
        Pregunta3Opcion11.setContentAreaFilled(false);
        Pregunta3Opcion11.addChangeListener(this);
        LblPregunta3Opcion11.setBounds(450, 430, 220, 145);
        LblPregunta3Opcion11.setIcon(ImgP3O11Num2);

        // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
        Pregunta3Opcion12.setBounds(770, 410, 20, 20);
        Pregunta3Opcion12.setContentAreaFilled(false);
        Pregunta3Opcion12.addChangeListener(this);
        LblPregunta3Opcion12.setBounds(670, 430, 220, 145);
        LblPregunta3Opcion12.setIcon(ImgP3O12Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblPregunta3BG.setBounds(0, 70, 880, 520);
        LblPregunta3BG.setOpaque(true);
        LblPregunta3BG.setBackground(new Color(38, 38, 38, 150));
    }

    public void PanelPreguntasNivelDiamante4() {
        TxtPregunta4 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #4:</b> SELECCIONA LOS BLOQUES NECESARIOS PARA CRAFTEAR LA <b style=color:'" + Rojo
                + "'>TIERRA FERTIL</b></body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta4 = new JLabel(TxtPregunta4, JLabel.CENTER);
        Panel6.add(LblPregunta4);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta4Opcion1 = new JCheckBox();
        Panel6.add(Pregunta4Opcion1);
        LblPregunta4Opcion1 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion1);

        Pregunta4Opcion2 = new JCheckBox();
        Panel6.add(Pregunta4Opcion2);
        LblPregunta4Opcion2 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion2);

        Pregunta4Opcion3 = new JCheckBox();
        Panel6.add(Pregunta4Opcion3);
        LblPregunta4Opcion3 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion3);

        Pregunta4Opcion4 = new JCheckBox();
        Panel6.add(Pregunta4Opcion4);
        LblPregunta4Opcion4 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion4);

        Pregunta4Opcion5 = new JCheckBox();
        Panel6.add(Pregunta4Opcion5);
        LblPregunta4Opcion5 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion5);

        Pregunta4Opcion6 = new JCheckBox();
        Panel6.add(Pregunta4Opcion6);
        LblPregunta4Opcion6 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion6);

        Pregunta4Opcion7 = new JCheckBox();
        Panel6.add(Pregunta4Opcion7);
        LblPregunta4Opcion7 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion7);

        Pregunta4Opcion8 = new JCheckBox();
        Panel6.add(Pregunta4Opcion8);
        LblPregunta4Opcion8 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion8);

        Pregunta4Opcion9 = new JCheckBox();
        Panel6.add(Pregunta4Opcion9);
        LblPregunta4Opcion9 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion9);

        Pregunta4Opcion10 = new JCheckBox();
        Panel6.add(Pregunta4Opcion10);
        LblPregunta4Opcion10 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion10);

        Pregunta4Opcion11 = new JCheckBox();
        Panel6.add(Pregunta4Opcion11);
        LblPregunta4Opcion11 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion11);

        Pregunta4Opcion12 = new JCheckBox();
        Panel6.add(Pregunta4Opcion12);
        LblPregunta4Opcion12 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta4Opcion12);

        LblPregunta4BG = new JLabel();
        Panel6.add(LblPregunta4BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
        Panel6.setLayout(null);
        Panel6.setBounds(10, 10, 880, 580);
        Panel6.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta4.setBounds(0, 10, 790, 50);
        LblPregunta4.setOpaque(true);
        LblPregunta4.setBackground(Color.decode(Diamante));
        LblPregunta4.setForeground(Color.decode(Negro));
        LblPregunta4.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta4.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta4Opcion1.setBounds(110, 80, 20, 20);
        Pregunta4Opcion1.setContentAreaFilled(false);
        Pregunta4Opcion1.addChangeListener(this);
        LblPregunta4Opcion1.setBounds(10, 100, 220, 145);
        LblPregunta4Opcion1.setIcon(ImgP4O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta4Opcion2.setBounds(330, 80, 20, 20);
        Pregunta4Opcion2.setContentAreaFilled(false);
        Pregunta4Opcion2.addChangeListener(this);
        LblPregunta4Opcion2.setBounds(230, 100, 220, 145);
        LblPregunta4Opcion2.setIcon(ImgP4O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta4Opcion3.setBounds(550, 80, 20, 20);
        Pregunta4Opcion3.setContentAreaFilled(false);
        Pregunta4Opcion3.addChangeListener(this);
        LblPregunta4Opcion3.setBounds(450, 100, 220, 145);
        LblPregunta4Opcion3.setIcon(ImgP4O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta4Opcion4.setBounds(770, 80, 20, 20);
        Pregunta4Opcion4.setContentAreaFilled(false);
        Pregunta4Opcion4.addChangeListener(this);
        LblPregunta4Opcion4.setBounds(670, 100, 220, 145);
        LblPregunta4Opcion4.setIcon(ImgP4O4Num2);

        // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
        Pregunta4Opcion5.setBounds(110, 245, 20, 20);
        Pregunta4Opcion5.setContentAreaFilled(false);
        Pregunta4Opcion5.addChangeListener(this);
        LblPregunta4Opcion5.setBounds(10, 265, 220, 145);
        LblPregunta4Opcion5.setIcon(ImgP4O5Num2);

        // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
        Pregunta4Opcion6.setBounds(330, 245, 20, 20);
        Pregunta4Opcion6.setContentAreaFilled(false);
        Pregunta4Opcion6.addChangeListener(this);
        LblPregunta4Opcion6.setBounds(230, 265, 220, 145);
        LblPregunta4Opcion6.setIcon(ImgP4O6Num2);

        // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
        Pregunta4Opcion7.setBounds(550, 245, 20, 20);
        Pregunta4Opcion7.setContentAreaFilled(false);
        Pregunta4Opcion7.addChangeListener(this);
        LblPregunta4Opcion7.setBounds(450, 265, 220, 145);
        LblPregunta4Opcion7.setIcon(ImgP4O7Num2);

        // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
        Pregunta4Opcion8.setBounds(770, 245, 20, 20);
        Pregunta4Opcion8.setContentAreaFilled(false);
        Pregunta4Opcion8.addChangeListener(this);
        LblPregunta4Opcion8.setBounds(670, 265, 220, 145);
        LblPregunta4Opcion8.setIcon(ImgP4O8Num2);

        // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
        Pregunta4Opcion9.setBounds(110, 410, 20, 20);
        Pregunta4Opcion9.setContentAreaFilled(false);
        Pregunta4Opcion9.addChangeListener(this);
        LblPregunta4Opcion9.setBounds(10, 430, 220, 145);
        LblPregunta4Opcion9.setIcon(ImgP4O9Num2);

        // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
        Pregunta4Opcion10.setBounds(330, 410, 20, 20);
        Pregunta4Opcion10.setContentAreaFilled(false);
        Pregunta4Opcion10.addChangeListener(this);
        LblPregunta4Opcion10.setBounds(230, 430, 220, 145);
        LblPregunta4Opcion10.setIcon(ImgP4O10Num2);

        // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
        Pregunta4Opcion11.setBounds(550, 410, 20, 20);
        Pregunta4Opcion11.setContentAreaFilled(false);
        Pregunta4Opcion11.addChangeListener(this);
        LblPregunta4Opcion11.setBounds(450, 430, 220, 145);
        LblPregunta4Opcion11.setIcon(ImgP4O11Num2);

        // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
        Pregunta4Opcion12.setBounds(770, 410, 20, 20);
        Pregunta4Opcion12.setContentAreaFilled(false);
        Pregunta4Opcion12.addChangeListener(this);
        LblPregunta4Opcion12.setBounds(670, 430, 220, 145);
        LblPregunta4Opcion12.setIcon(ImgP4O12Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblPregunta4BG.setBounds(0, 70, 880, 520);
        LblPregunta4BG.setOpaque(true);
        LblPregunta4BG.setBackground(new Color(38, 38, 38, 150));
    }

    public void PanelPreguntasNivelDiamante5() {
        TxtPregunta5 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #5:</b> SELECCIONA LOS HUEVOS GENERADORES DE <b style=color:'" + Rojo
                + "'>SHULKER Y ZOMBI</b></body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta5 = new JLabel(TxtPregunta5, JLabel.CENTER);
        Panel7.add(LblPregunta5);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta5Opcion1 = new JCheckBox();
        Panel7.add(Pregunta5Opcion1);
        LblPregunta5Opcion1 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion1);

        Pregunta5Opcion2 = new JCheckBox();
        Panel7.add(Pregunta5Opcion2);
        LblPregunta5Opcion2 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion2);

        Pregunta5Opcion3 = new JCheckBox();
        Panel7.add(Pregunta5Opcion3);
        LblPregunta5Opcion3 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion3);

        Pregunta5Opcion4 = new JCheckBox();
        Panel7.add(Pregunta5Opcion4);
        LblPregunta5Opcion4 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion4);

        Pregunta5Opcion5 = new JCheckBox();
        Panel7.add(Pregunta5Opcion5);
        LblPregunta5Opcion5 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion5);

        Pregunta5Opcion6 = new JCheckBox();
        Panel7.add(Pregunta5Opcion6);
        LblPregunta5Opcion6 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion6);

        Pregunta5Opcion7 = new JCheckBox();
        Panel7.add(Pregunta5Opcion7);
        LblPregunta5Opcion7 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion7);

        Pregunta5Opcion8 = new JCheckBox();
        Panel7.add(Pregunta5Opcion8);
        LblPregunta5Opcion8 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion8);

        Pregunta5Opcion9 = new JCheckBox();
        Panel7.add(Pregunta5Opcion9);
        LblPregunta5Opcion9 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion9);

        Pregunta5Opcion10 = new JCheckBox();
        Panel7.add(Pregunta5Opcion10);
        LblPregunta5Opcion10 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion10);

        Pregunta5Opcion11 = new JCheckBox();
        Panel7.add(Pregunta5Opcion11);
        LblPregunta5Opcion11 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion11);

        Pregunta5Opcion12 = new JCheckBox();
        Panel7.add(Pregunta5Opcion12);
        LblPregunta5Opcion12 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta5Opcion12);

        LblPregunta5BG = new JLabel();
        Panel7.add(LblPregunta5BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
        Panel7.setLayout(null);
        Panel7.setBounds(10, 10, 880, 580);
        Panel7.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta5.setBounds(0, 10, 700, 50);
        LblPregunta5.setOpaque(true);
        LblPregunta5.setBackground(Color.decode(Diamante));
        LblPregunta5.setForeground(Color.decode(Negro));
        LblPregunta5.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta5.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta5Opcion1.setBounds(110, 80, 20, 20);
        Pregunta5Opcion1.setContentAreaFilled(false);
        Pregunta5Opcion1.addChangeListener(this);
        LblPregunta5Opcion1.setBounds(10, 100, 220, 145);
        LblPregunta5Opcion1.setIcon(ImgP5O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta5Opcion2.setBounds(330, 80, 20, 20);
        Pregunta5Opcion2.setContentAreaFilled(false);
        Pregunta5Opcion2.addChangeListener(this);
        LblPregunta5Opcion2.setBounds(230, 100, 220, 145);
        LblPregunta5Opcion2.setIcon(ImgP5O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta5Opcion3.setBounds(550, 80, 20, 20);
        Pregunta5Opcion3.setContentAreaFilled(false);
        Pregunta5Opcion3.addChangeListener(this);
        LblPregunta5Opcion3.setBounds(450, 100, 220, 145);
        LblPregunta5Opcion3.setIcon(ImgP5O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta5Opcion4.setBounds(770, 80, 20, 20);
        Pregunta5Opcion4.setContentAreaFilled(false);
        Pregunta5Opcion4.addChangeListener(this);
        LblPregunta5Opcion4.setBounds(670, 100, 220, 145);
        LblPregunta5Opcion4.setIcon(ImgP5O4Num2);

        // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
        Pregunta5Opcion5.setBounds(110, 245, 20, 20);
        Pregunta5Opcion5.setContentAreaFilled(false);
        Pregunta5Opcion5.addChangeListener(this);
        LblPregunta5Opcion5.setBounds(10, 265, 220, 145);
        LblPregunta5Opcion5.setIcon(ImgP5O5Num2);

        // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
        Pregunta5Opcion6.setBounds(330, 245, 20, 20);
        Pregunta5Opcion6.setContentAreaFilled(false);
        Pregunta5Opcion6.addChangeListener(this);
        LblPregunta5Opcion6.setBounds(230, 265, 220, 145);
        LblPregunta5Opcion6.setIcon(ImgP5O6Num2);

        // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
        Pregunta5Opcion7.setBounds(550, 245, 20, 20);
        Pregunta5Opcion7.setContentAreaFilled(false);
        Pregunta5Opcion7.addChangeListener(this);
        LblPregunta5Opcion7.setBounds(450, 265, 220, 145);
        LblPregunta5Opcion7.setIcon(ImgP5O7Num2);

        // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
        Pregunta5Opcion8.setBounds(770, 245, 20, 20);
        Pregunta5Opcion8.setContentAreaFilled(false);
        Pregunta5Opcion8.addChangeListener(this);
        LblPregunta5Opcion8.setBounds(670, 265, 220, 145);
        LblPregunta5Opcion8.setIcon(ImgP5O8Num2);

        // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
        Pregunta5Opcion9.setBounds(110, 410, 20, 20);
        Pregunta5Opcion9.setContentAreaFilled(false);
        Pregunta5Opcion9.addChangeListener(this);
        LblPregunta5Opcion9.setBounds(10, 430, 220, 145);
        LblPregunta5Opcion9.setIcon(ImgP5O9Num2);

        // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
        Pregunta5Opcion10.setBounds(330, 410, 20, 20);
        Pregunta5Opcion10.setContentAreaFilled(false);
        Pregunta5Opcion10.addChangeListener(this);
        LblPregunta5Opcion10.setBounds(230, 430, 220, 145);
        LblPregunta5Opcion10.setIcon(ImgP5O10Num2);

        // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
        Pregunta5Opcion11.setBounds(550, 410, 20, 20);
        Pregunta5Opcion11.setContentAreaFilled(false);
        Pregunta5Opcion11.addChangeListener(this);
        LblPregunta5Opcion11.setBounds(450, 430, 220, 145);
        LblPregunta5Opcion11.setIcon(ImgP5O11Num2);

        // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
        Pregunta5Opcion12.setBounds(770, 410, 20, 20);
        Pregunta5Opcion12.setContentAreaFilled(false);
        Pregunta5Opcion12.addChangeListener(this);
        LblPregunta5Opcion12.setBounds(670, 430, 220, 145);
        LblPregunta5Opcion12.setIcon(ImgP5O12Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblPregunta5BG.setBounds(0, 70, 880, 520);
        LblPregunta5BG.setOpaque(true);
        LblPregunta5BG.setBackground(new Color(38, 38, 38, 150));
    }

    public void PanelPreguntasNivelDiamante6() {
        TxtPregunta6 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA FINAL:</b> CUAL DE LOS SIGUIENTES MOBS FUE AGREGADO EN LA <b style=color:'" + Rojo
                + "'>VERSION 1.15</b></body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta6 = new JLabel(TxtPregunta6, JLabel.CENTER);
        Panel8.add(LblPregunta6);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta6Opcion1 = new JCheckBox();
        Panel8.add(Pregunta6Opcion1);
        LblPregunta6Opcion1 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion1);

        Pregunta6Opcion2 = new JCheckBox();
        Panel8.add(Pregunta6Opcion2);
        LblPregunta6Opcion2 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion2);

        Pregunta6Opcion3 = new JCheckBox();
        Panel8.add(Pregunta6Opcion3);
        LblPregunta6Opcion3 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion3);

        Pregunta6Opcion4 = new JCheckBox();
        Panel8.add(Pregunta6Opcion4);
        LblPregunta6Opcion4 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion4);

        Pregunta6Opcion5 = new JCheckBox();
        Panel8.add(Pregunta6Opcion5);
        LblPregunta6Opcion5 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion5);

        Pregunta6Opcion6 = new JCheckBox();
        Panel8.add(Pregunta6Opcion6);
        LblPregunta6Opcion6 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion6);

        Pregunta6Opcion7 = new JCheckBox();
        Panel8.add(Pregunta6Opcion7);
        LblPregunta6Opcion7 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion7);

        Pregunta6Opcion8 = new JCheckBox();
        Panel8.add(Pregunta6Opcion8);
        LblPregunta6Opcion8 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion8);

        Pregunta6Opcion9 = new JCheckBox();
        Panel8.add(Pregunta6Opcion9);
        LblPregunta6Opcion9 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion9);

        Pregunta6Opcion10 = new JCheckBox();
        Panel8.add(Pregunta6Opcion10);
        LblPregunta6Opcion10 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion10);

        Pregunta6Opcion11 = new JCheckBox();
        Panel8.add(Pregunta6Opcion11);
        LblPregunta6Opcion11 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion11);

        Pregunta6Opcion12 = new JCheckBox();
        Panel8.add(Pregunta6Opcion12);
        LblPregunta6Opcion12 = new JLabel("", JLabel.CENTER);
        Panel8.add(LblPregunta6Opcion12);

        LblPregunta6BG = new JLabel();
        Panel8.add(LblPregunta6BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE LA PRIMERA PREGUNTA
        Panel8.setLayout(null);
        Panel8.setBounds(10, 10, 880, 580);
        Panel8.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta6.setBounds(0, 10, 760, 50);
        LblPregunta6.setOpaque(true);
        LblPregunta6.setBackground(Color.decode(Diamante));
        LblPregunta6.setForeground(Color.decode(Negro));
        LblPregunta6.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
        LblPregunta6.setFont(FuenteMinecraft.deriveFont(15f));

        // JRADIOBUTTON OPCION 1 EN PREGUNTA 5|| IMAGEN EN OPCION 1 EN PREGUNTA 5
        Pregunta6Opcion1.setBounds(110, 80, 20, 20);
        Pregunta6Opcion1.setContentAreaFilled(false);
        Pregunta6Opcion1.addChangeListener(this);
        LblPregunta6Opcion1.setBounds(10, 100, 220, 145);
        LblPregunta6Opcion1.setIcon(ImgP6O1Num2);

        // JRADIOBUTTON OPCION 2 EN PREGUNTA 5|| IMAGEN EN OPCION 2 EN PREGUNTA 5
        Pregunta6Opcion2.setBounds(330, 80, 20, 20);
        Pregunta6Opcion2.setContentAreaFilled(false);
        Pregunta6Opcion2.addChangeListener(this);
        LblPregunta6Opcion2.setBounds(230, 100, 220, 145);
        LblPregunta6Opcion2.setIcon(ImgP6O2Num2);

        // JRADIOBUTTON OPCION 3 EN PREGUNTA 5|| IMAGEN EN OPCION 3 EN PREGUNTA 5
        Pregunta6Opcion3.setBounds(550, 80, 20, 20);
        Pregunta6Opcion3.setContentAreaFilled(false);
        Pregunta6Opcion3.addChangeListener(this);
        LblPregunta6Opcion3.setBounds(450, 100, 220, 145);
        LblPregunta6Opcion3.setIcon(ImgP6O3Num2);

        // JRADIOBUTTON OPCION 4 EN PREGUNTA 5|| IMAGEN EN OPCION 4 EN PREGUNTA 5
        Pregunta6Opcion4.setBounds(770, 80, 20, 20);
        Pregunta6Opcion4.setContentAreaFilled(false);
        Pregunta6Opcion4.addChangeListener(this);
        LblPregunta6Opcion4.setBounds(670, 100, 220, 145);
        LblPregunta6Opcion4.setIcon(ImgP6O4Num2);

        // JRADIOBUTTON OPCION 5 EN PREGUNTA 5|| IMAGEN EN OPCION 5 EN PREGUNTA 5
        Pregunta6Opcion5.setBounds(110, 245, 20, 20);
        Pregunta6Opcion5.setContentAreaFilled(false);
        Pregunta6Opcion5.addChangeListener(this);
        LblPregunta6Opcion5.setBounds(10, 265, 220, 145);
        LblPregunta6Opcion5.setIcon(ImgP6O5Num2);

        // JRADIOBUTTON OPCION 6 EN PREGUNTA 5|| IMAGEN EN OPCION 6 EN PREGUNTA 5
        Pregunta6Opcion6.setBounds(330, 245, 20, 20);
        Pregunta6Opcion6.setContentAreaFilled(false);
        Pregunta6Opcion6.addChangeListener(this);
        LblPregunta6Opcion6.setBounds(230, 265, 220, 145);
        LblPregunta6Opcion6.setIcon(ImgP6O6Num2);

        // JRADIOBUTTON OPCION 7 EN PREGUNTA 5|| IMAGEN EN OPCION 7 EN PREGUNTA 5
        Pregunta6Opcion7.setBounds(550, 245, 20, 20);
        Pregunta6Opcion7.setContentAreaFilled(false);
        Pregunta6Opcion7.addChangeListener(this);
        LblPregunta6Opcion7.setBounds(450, 265, 220, 145);
        LblPregunta6Opcion7.setIcon(ImgP6O7Num2);

        // JRADIOBUTTON OPCION 8 EN PREGUNTA 5|| IMAGEN EN OPCION 8 EN PREGUNTA 5
        Pregunta6Opcion8.setBounds(770, 245, 20, 20);
        Pregunta6Opcion8.setContentAreaFilled(false);
        Pregunta6Opcion8.addChangeListener(this);
        LblPregunta6Opcion8.setBounds(670, 265, 220, 145);
        LblPregunta6Opcion8.setIcon(ImgP6O8Num2);

        // JRADIOBUTTON OPCION 9 EN PREGUNTA 5|| IMAGEN EN OPCION 9 EN PREGUNTA 5
        Pregunta6Opcion9.setBounds(110, 410, 20, 20);
        Pregunta6Opcion9.setContentAreaFilled(false);
        Pregunta6Opcion9.addChangeListener(this);
        LblPregunta6Opcion9.setBounds(10, 430, 220, 145);
        LblPregunta6Opcion9.setIcon(ImgP6O9Num2);

        // JRADIOBUTTON OPCION 10 EN PREGUNTA 5|| IMAGEN EN OPCION 10 EN PREGUNTA 5
        Pregunta6Opcion10.setBounds(330, 410, 20, 20);
        Pregunta6Opcion10.setContentAreaFilled(false);
        Pregunta6Opcion10.addChangeListener(this);
        LblPregunta6Opcion10.setBounds(230, 430, 220, 145);
        LblPregunta6Opcion10.setIcon(ImgP6O10Num2);

        // JRADIOBUTTON OPCION 11 EN PREGUNTA 5|| IMAGEN EN OPCION 11 EN PREGUNTA 5
        Pregunta6Opcion11.setBounds(550, 410, 20, 20);
        Pregunta6Opcion11.setContentAreaFilled(false);
        Pregunta6Opcion11.addChangeListener(this);
        LblPregunta6Opcion11.setBounds(450, 430, 220, 145);
        LblPregunta6Opcion11.setIcon(ImgP6O11Num2);

        // JRADIOBUTTON OPCION 12 EN PREGUNTA 5|| IMAGEN EN OPCION 12 EN PREGUNTA 5
        Pregunta6Opcion12.setBounds(770, 410, 20, 20);
        Pregunta6Opcion12.setContentAreaFilled(false);
        Pregunta6Opcion12.addChangeListener(this);
        LblPregunta6Opcion12.setBounds(670, 430, 220, 145);
        LblPregunta6Opcion12.setIcon(ImgP6O12Num2);

        // AGREMOA UN COLOR DE FONDO A NUESTRAS OPCIONES DE LA PREGUNTA 5
        LblPregunta6BG.setBounds(0, 70, 880, 520);
        LblPregunta6BG.setOpaque(true);
        LblPregunta6BG.setBackground(new Color(38, 38, 38, 150));
    }

    public void CargarNivelNetherita() {
        VentanaNivelDiamante.setVisible(false);
        CargandoNivel CN = new CargandoNivel();
        CN.VentanaCargandoNivel();
        CN.AnimacionCargando("Diamante");
    }

    public void CronometroDiamante() {

        Thread hilo = new Thread() {
            public void run() {
                while (te >= 0) {
                    if (te == 120) {
                        BarraNivelDiamante.setForeground(Color.ORANGE);
                    }
                    if (te == 60) {
                        BarraNivelDiamante.setForeground(Color.decode(Rojo));
                    }
                    try {
                        Thread.sleep(1000);
                        BarraNivelDiamante.setValue(te);
                        te--;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                CargarNivelNetherita();
            }
        };
        hilo.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnDiamante) {
            if (Pregunta1Opcion1.isSelected() == true
                    && Pregunta1Opcion8.isSelected() == true
                    && Pregunta1Opcion10.isSelected() == true
                    && Pregunta1Opcion2.isSelected() == false
                    && Pregunta1Opcion3.isSelected() == false
                    && Pregunta1Opcion4.isSelected() == false
                    && Pregunta1Opcion5.isSelected() == false
                    && Pregunta1Opcion6.isSelected() == false
                    && Pregunta1Opcion7.isSelected() == false
                    && Pregunta1Opcion9.isSelected() == false
                    && Pregunta1Opcion11.isSelected() == false
                    && Pregunta1Opcion12.isSelected() == false) {
                PuntajeNivelDiamante++;
                Panel2.setVisible(false);
                BtnDiamante.setVisible(false);
                BtnDiamante2.setVisible(true);
                PanelPreguntasNivelDiamante2();
            } else {
                Panel2.setVisible(false);
                BtnDiamante.setVisible(false);
                BtnDiamante2.setVisible(true);
                PanelPreguntasNivelDiamante2();
            }
        }
        if (e.getSource() == BtnDiamante2) {
            if (Pregunta2Opcion3.isSelected() == true
                    && Pregunta2Opcion1.isSelected() == false
                    && Pregunta2Opcion2.isSelected() == false
                    && Pregunta2Opcion4.isSelected() == false
                    && Pregunta2Opcion5.isSelected() == false
                    && Pregunta2Opcion6.isSelected() == false
                    && Pregunta2Opcion7.isSelected() == false
                    && Pregunta2Opcion8.isSelected() == false
                    && Pregunta2Opcion9.isSelected() == false
                    && Pregunta2Opcion10.isSelected() == false
                    && Pregunta2Opcion11.isSelected() == false
                    && Pregunta2Opcion12.isSelected() == false) {
                PuntajeNivelDiamante++;
                BtnDiamante2.setVisible(false);
                BtnDiamante3.setVisible(true);
                Panel4.setVisible(false);
                PanelPreguntasNivelDiamante3();
            } else {
                BtnDiamante2.setVisible(false);
                BtnDiamante3.setVisible(true);
                Panel4.setVisible(false);
                PanelPreguntasNivelDiamante3();
            }
        }
        if (e.getSource() == BtnDiamante3) {
            if (Pregunta3Opcion6.isSelected() == true
                    && Pregunta3Opcion1.isSelected() == false
                    && Pregunta3Opcion2.isSelected() == false
                    && Pregunta3Opcion3.isSelected() == false
                    && Pregunta3Opcion4.isSelected() == false
                    && Pregunta3Opcion5.isSelected() == false
                    && Pregunta3Opcion7.isSelected() == false
                    && Pregunta3Opcion8.isSelected() == false
                    && Pregunta3Opcion9.isSelected() == false
                    && Pregunta3Opcion10.isSelected() == false
                    && Pregunta3Opcion11.isSelected() == false
                    && Pregunta3Opcion12.isSelected() == false) {
                PuntajeNivelDiamante++;
                BtnDiamante3.setVisible(false);
                BtnDiamante4.setVisible(true);
                Panel5.setVisible(false);
                PanelPreguntasNivelDiamante4();
            } else {
                BtnDiamante3.setVisible(false);
                BtnDiamante4.setVisible(true);
                Panel5.setVisible(false);
                PanelPreguntasNivelDiamante4();
            }
        }
        if (e.getSource() == BtnDiamante4) {
            if (Pregunta4Opcion3.isSelected() == true
                    && Pregunta4Opcion9.isSelected() == true
                    && Pregunta4Opcion1.isSelected() == false
                    && Pregunta4Opcion2.isSelected() == false
                    && Pregunta4Opcion4.isSelected() == false
                    && Pregunta4Opcion5.isSelected() == false
                    && Pregunta4Opcion6.isSelected() == false
                    && Pregunta4Opcion7.isSelected() == false
                    && Pregunta4Opcion8.isSelected() == false
                    && Pregunta4Opcion10.isSelected() == false
                    && Pregunta4Opcion11.isSelected() == false
                    && Pregunta4Opcion12.isSelected() == false) {
                PuntajeNivelDiamante++;
                BtnDiamante4.setVisible(false);
                BtnDiamante5.setVisible(true);
                Panel6.setVisible(false);
                PanelPreguntasNivelDiamante5();
            } else {
                BtnDiamante4.setVisible(false);
                BtnDiamante5.setVisible(true);
                Panel6.setVisible(false);
                PanelPreguntasNivelDiamante5();
            }
        }
        if (e.getSource() == BtnDiamante5) {
            if (Pregunta5Opcion1.isSelected() == false
                    && Pregunta5Opcion2.isSelected() == false
                    && Pregunta5Opcion3.isSelected() == false
                    && Pregunta5Opcion4.isSelected() == false
                    && Pregunta5Opcion5.isSelected() == false
                    && Pregunta5Opcion6.isSelected() == false
                    && Pregunta5Opcion7.isSelected() == false
                    && Pregunta5Opcion8.isSelected() == false
                    && Pregunta5Opcion9.isSelected() == false
                    && Pregunta5Opcion10.isSelected() == false
                    && Pregunta5Opcion11.isSelected() == false
                    && Pregunta5Opcion12.isSelected() == false) {
                PuntajeNivelDiamante++;
                BtnDiamante5.setVisible(false);
                BtnFinalizarDiamante.setVisible(true);
                BarraNivelDiamante.setSize(680, 50);
                Panel7.setVisible(false);
                PanelPreguntasNivelDiamante6();
            } else {
                BtnDiamante5.setVisible(false);
                BtnFinalizarDiamante.setVisible(true);
                BarraNivelDiamante.setSize(680, 50);
                Panel7.setVisible(false);
                PanelPreguntasNivelDiamante6();
            }
        }
        if (e.getSource() == BtnFinalizarDiamante) {
            if (Pregunta6Opcion12.isSelected() == true
                    && Pregunta6Opcion1.isSelected() == false
                    && Pregunta6Opcion2.isSelected() == false
                    && Pregunta6Opcion3.isSelected() == false
                    && Pregunta6Opcion4.isSelected() == false
                    && Pregunta6Opcion5.isSelected() == false
                    && Pregunta6Opcion6.isSelected() == false
                    && Pregunta6Opcion7.isSelected() == false
                    && Pregunta6Opcion8.isSelected() == false
                    && Pregunta6Opcion9.isSelected() == false
                    && Pregunta6Opcion10.isSelected() == false
                    && Pregunta6Opcion11.isSelected() == false) {
                PuntajeNivelDiamante++;
                CargarNivelNetherita();

            } else {
                CargarNivelNetherita();
            }
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

    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == Pregunta1Opcion1) {
            if (Pregunta1Opcion1.isSelected() == true) {
                Pregunta1Opcion1.setContentAreaFilled(true);
                Pregunta1Opcion1.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion2) {
            if (Pregunta1Opcion2.isSelected() == true) {
                Pregunta1Opcion2.setContentAreaFilled(true);
                Pregunta1Opcion2.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion3) {
            if (Pregunta1Opcion3.isSelected() == true) {
                Pregunta1Opcion3.setContentAreaFilled(true);
                Pregunta1Opcion3.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion4) {
            if (Pregunta1Opcion4.isSelected() == true) {
                Pregunta1Opcion4.setContentAreaFilled(true);
                Pregunta1Opcion4.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion5) {
            if (Pregunta1Opcion5.isSelected() == true) {
                Pregunta1Opcion5.setContentAreaFilled(true);
                Pregunta1Opcion5.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion6) {
            if (Pregunta1Opcion6.isSelected() == true) {
                Pregunta1Opcion6.setContentAreaFilled(true);
                Pregunta1Opcion6.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion7) {
            if (Pregunta1Opcion7.isSelected() == true) {
                Pregunta1Opcion7.setContentAreaFilled(true);
                Pregunta1Opcion7.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion8) {
            if (Pregunta1Opcion8.isSelected() == true) {
                Pregunta1Opcion8.setContentAreaFilled(true);
                Pregunta1Opcion8.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion9) {
            if (Pregunta1Opcion9.isSelected() == true) {
                Pregunta1Opcion9.setContentAreaFilled(true);
                Pregunta1Opcion9.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion10) {
            if (Pregunta1Opcion10.isSelected() == true) {
                Pregunta1Opcion10.setContentAreaFilled(true);
                Pregunta1Opcion10.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion11) {
            if (Pregunta1Opcion11.isSelected() == true) {
                Pregunta1Opcion11.setContentAreaFilled(true);
                Pregunta1Opcion11.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion12) {
            if (Pregunta1Opcion12.isSelected() == true) {
                Pregunta1Opcion12.setContentAreaFilled(true);
                Pregunta1Opcion12.setBackground(Color.decode(Diamante));
            } else {
                Pregunta1Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion1) {
            if (Pregunta2Opcion1.isSelected() == true) {
                Pregunta2Opcion1.setContentAreaFilled(true);
                Pregunta2Opcion1.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion2) {
            if (Pregunta2Opcion2.isSelected() == true) {
                Pregunta2Opcion2.setContentAreaFilled(true);
                Pregunta2Opcion2.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion3) {
            if (Pregunta2Opcion3.isSelected() == true) {
                Pregunta2Opcion3.setContentAreaFilled(true);
                Pregunta2Opcion3.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion4) {
            if (Pregunta2Opcion4.isSelected() == true) {
                Pregunta2Opcion4.setContentAreaFilled(true);
                Pregunta2Opcion4.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion5) {
            if (Pregunta2Opcion5.isSelected() == true) {
                Pregunta2Opcion5.setContentAreaFilled(true);
                Pregunta2Opcion5.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion6) {
            if (Pregunta2Opcion6.isSelected() == true) {
                Pregunta2Opcion6.setContentAreaFilled(true);
                Pregunta2Opcion6.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion7) {
            if (Pregunta2Opcion7.isSelected() == true) {
                Pregunta2Opcion7.setContentAreaFilled(true);
                Pregunta2Opcion7.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion8) {
            if (Pregunta2Opcion8.isSelected() == true) {
                Pregunta2Opcion8.setContentAreaFilled(true);
                Pregunta2Opcion8.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion9) {
            if (Pregunta2Opcion9.isSelected() == true) {
                Pregunta2Opcion9.setContentAreaFilled(true);
                Pregunta2Opcion9.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion10) {
            if (Pregunta2Opcion10.isSelected() == true) {
                Pregunta2Opcion10.setContentAreaFilled(true);
                Pregunta2Opcion10.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion11) {
            if (Pregunta2Opcion11.isSelected() == true) {
                Pregunta2Opcion11.setContentAreaFilled(true);
                Pregunta2Opcion11.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion12) {
            if (Pregunta2Opcion12.isSelected() == true) {
                Pregunta2Opcion12.setContentAreaFilled(true);
                Pregunta2Opcion12.setBackground(Color.decode(Diamante));
            } else {
                Pregunta2Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion1) {
            if (Pregunta3Opcion1.isSelected() == true) {
                Pregunta3Opcion1.setContentAreaFilled(true);
                Pregunta3Opcion1.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion2) {
            if (Pregunta3Opcion2.isSelected() == true) {
                Pregunta3Opcion2.setContentAreaFilled(true);
                Pregunta3Opcion2.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion3) {
            if (Pregunta3Opcion3.isSelected() == true) {
                Pregunta3Opcion3.setContentAreaFilled(true);
                Pregunta3Opcion3.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion4) {
            if (Pregunta3Opcion4.isSelected() == true) {
                Pregunta3Opcion4.setContentAreaFilled(true);
                Pregunta3Opcion4.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion5) {
            if (Pregunta3Opcion5.isSelected() == true) {
                Pregunta3Opcion5.setContentAreaFilled(true);
                Pregunta3Opcion5.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion6) {
            if (Pregunta3Opcion6.isSelected() == true) {
                Pregunta3Opcion6.setContentAreaFilled(true);
                Pregunta3Opcion6.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion7) {
            if (Pregunta3Opcion7.isSelected() == true) {
                Pregunta3Opcion7.setContentAreaFilled(true);
                Pregunta3Opcion7.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion8) {
            if (Pregunta3Opcion8.isSelected() == true) {
                Pregunta3Opcion8.setContentAreaFilled(true);
                Pregunta3Opcion8.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion9) {
            if (Pregunta3Opcion9.isSelected() == true) {
                Pregunta3Opcion9.setContentAreaFilled(true);
                Pregunta3Opcion9.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion10) {
            if (Pregunta3Opcion10.isSelected() == true) {
                Pregunta3Opcion10.setContentAreaFilled(true);
                Pregunta3Opcion10.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion11) {
            if (Pregunta3Opcion11.isSelected() == true) {
                Pregunta3Opcion11.setContentAreaFilled(true);
                Pregunta3Opcion11.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion12) {
            if (Pregunta3Opcion12.isSelected() == true) {
                Pregunta3Opcion12.setContentAreaFilled(true);
                Pregunta3Opcion12.setBackground(Color.decode(Diamante));
            } else {
                Pregunta3Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion1) {
            if (Pregunta4Opcion1.isSelected() == true) {
                Pregunta4Opcion1.setContentAreaFilled(true);
                Pregunta4Opcion1.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion2) {
            if (Pregunta4Opcion2.isSelected() == true) {
                Pregunta4Opcion2.setContentAreaFilled(true);
                Pregunta4Opcion2.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion3) {
            if (Pregunta4Opcion3.isSelected() == true) {
                Pregunta4Opcion3.setContentAreaFilled(true);
                Pregunta4Opcion3.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion4) {
            if (Pregunta4Opcion4.isSelected() == true) {
                Pregunta4Opcion4.setContentAreaFilled(true);
                Pregunta4Opcion4.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion5) {
            if (Pregunta4Opcion5.isSelected() == true) {
                Pregunta4Opcion5.setContentAreaFilled(true);
                Pregunta4Opcion5.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion6) {
            if (Pregunta4Opcion6.isSelected() == true) {
                Pregunta4Opcion6.setContentAreaFilled(true);
                Pregunta4Opcion6.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion7) {
            if (Pregunta4Opcion7.isSelected() == true) {
                Pregunta4Opcion7.setContentAreaFilled(true);
                Pregunta4Opcion7.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion8) {
            if (Pregunta4Opcion8.isSelected() == true) {
                Pregunta4Opcion8.setContentAreaFilled(true);
                Pregunta4Opcion8.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion9) {
            if (Pregunta4Opcion9.isSelected() == true) {
                Pregunta4Opcion9.setContentAreaFilled(true);
                Pregunta4Opcion9.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion10) {
            if (Pregunta4Opcion10.isSelected() == true) {
                Pregunta4Opcion10.setContentAreaFilled(true);
                Pregunta4Opcion10.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion11) {
            if (Pregunta4Opcion11.isSelected() == true) {
                Pregunta4Opcion11.setContentAreaFilled(true);
                Pregunta4Opcion11.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion12) {
            if (Pregunta4Opcion12.isSelected() == true) {
                Pregunta4Opcion12.setContentAreaFilled(true);
                Pregunta4Opcion12.setBackground(Color.decode(Diamante));
            } else {
                Pregunta4Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion1) {
            if (Pregunta5Opcion1.isSelected() == true) {
                Pregunta5Opcion1.setContentAreaFilled(true);
                Pregunta5Opcion1.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion2) {
            if (Pregunta5Opcion2.isSelected() == true) {
                Pregunta5Opcion2.setContentAreaFilled(true);
                Pregunta5Opcion2.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion3) {
            if (Pregunta5Opcion3.isSelected() == true) {
                Pregunta5Opcion3.setContentAreaFilled(true);
                Pregunta5Opcion3.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion4) {
            if (Pregunta5Opcion4.isSelected() == true) {
                Pregunta5Opcion4.setContentAreaFilled(true);
                Pregunta5Opcion4.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion5) {
            if (Pregunta5Opcion5.isSelected() == true) {
                Pregunta5Opcion5.setContentAreaFilled(true);
                Pregunta5Opcion5.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion6) {
            if (Pregunta5Opcion6.isSelected() == true) {
                Pregunta5Opcion6.setContentAreaFilled(true);
                Pregunta5Opcion6.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion7) {
            if (Pregunta5Opcion7.isSelected() == true) {
                Pregunta5Opcion7.setContentAreaFilled(true);
                Pregunta5Opcion7.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion8) {
            if (Pregunta5Opcion8.isSelected() == true) {
                Pregunta5Opcion8.setContentAreaFilled(true);
                Pregunta5Opcion8.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion9) {
            if (Pregunta5Opcion9.isSelected() == true) {
                Pregunta5Opcion9.setContentAreaFilled(true);
                Pregunta5Opcion9.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion10) {
            if (Pregunta5Opcion10.isSelected() == true) {
                Pregunta5Opcion10.setContentAreaFilled(true);
                Pregunta5Opcion10.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion11) {
            if (Pregunta5Opcion11.isSelected() == true) {
                Pregunta5Opcion11.setContentAreaFilled(true);
                Pregunta5Opcion11.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta5Opcion12) {
            if (Pregunta5Opcion12.isSelected() == true) {
                Pregunta5Opcion12.setContentAreaFilled(true);
                Pregunta5Opcion12.setBackground(Color.decode(Diamante));
            } else {
                Pregunta5Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion1) {
            if (Pregunta6Opcion1.isSelected() == true) {
                Pregunta6Opcion1.setContentAreaFilled(true);
                Pregunta6Opcion1.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion2) {
            if (Pregunta6Opcion2.isSelected() == true) {
                Pregunta6Opcion2.setContentAreaFilled(true);
                Pregunta6Opcion2.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion3) {
            if (Pregunta6Opcion3.isSelected() == true) {
                Pregunta6Opcion3.setContentAreaFilled(true);
                Pregunta6Opcion3.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion4) {
            if (Pregunta6Opcion4.isSelected() == true) {
                Pregunta6Opcion4.setContentAreaFilled(true);
                Pregunta6Opcion4.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion5) {
            if (Pregunta6Opcion5.isSelected() == true) {
                Pregunta6Opcion5.setContentAreaFilled(true);
                Pregunta6Opcion5.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion6) {
            if (Pregunta6Opcion6.isSelected() == true) {
                Pregunta6Opcion6.setContentAreaFilled(true);
                Pregunta6Opcion6.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion7) {
            if (Pregunta6Opcion7.isSelected() == true) {
                Pregunta6Opcion7.setContentAreaFilled(true);
                Pregunta6Opcion7.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion8) {
            if (Pregunta6Opcion8.isSelected() == true) {
                Pregunta6Opcion8.setContentAreaFilled(true);
                Pregunta6Opcion8.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion9) {
            if (Pregunta6Opcion9.isSelected() == true) {
                Pregunta6Opcion9.setContentAreaFilled(true);
                Pregunta6Opcion9.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion10) {
            if (Pregunta6Opcion10.isSelected() == true) {
                Pregunta6Opcion10.setContentAreaFilled(true);
                Pregunta6Opcion10.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion11) {
            if (Pregunta6Opcion11.isSelected() == true) {
                Pregunta6Opcion11.setContentAreaFilled(true);
                Pregunta6Opcion11.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta6Opcion12) {
            if (Pregunta6Opcion12.isSelected() == true) {
                Pregunta6Opcion12.setContentAreaFilled(true);
                Pregunta6Opcion12.setBackground(Color.decode(Diamante));
            } else {
                Pregunta6Opcion12.setContentAreaFilled(false);
            }
        }
    }

}
