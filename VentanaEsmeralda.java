import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaEsmeralda implements ActionListener, ChangeListener {

    private JFrame VentanaNivelEsmeralda;
    private JProgressBar BarraNivelEsmeralda;
    private JPanel Panel1, Panel2, Panel3, Panel4, Panel5, Panel6, Panel7;
    private Image IconoNivel, IconoMostrar, IconoOcultar, ImgP1O1, ImgP1O2, ImgP1O3, ImgP1O4, ImgP1O5, ImgP1O6, ImgP1O7,
            ImgP1O8, ImgP1O9, ImgP1O10, ImgP1O11, ImgP1O12, ImgP2O1, ImgP2O2, ImgP2O3, ImgP2O4, ImgP2O5, ImgP2O6,
            ImgP2O7, ImgP2O8, ImgP2O9, ImgP2O10, ImgP2O11, ImgP2O12, ImgP3O1, ImgP3O2, ImgP3O3, ImgP3O4, ImgP3O5,
            ImgP3O6, ImgP3O7, ImgP3O8, ImgP3O9, ImgP3O10, ImgP3O11, ImgP3O12, ImgP4O1, ImgP4O2, ImgP4O3, ImgP4O4,
            ImgP4O5, ImgP4O6, ImgP4O7, ImgP4O8, ImgP4O9, ImgP4O10, ImgP4O11, ImgP4O12, Wallpaper;
    private ImageIcon IconoNivel2, IconoMostrar2, IconoOcultar2, ImgP1O1Num2, ImgP1O2Num2, ImgP1O3Num2, ImgP1O4Num2,
            ImgP1O5Num2, ImgP1O6Num2, ImgP1O7Num2, ImgP1O8Num2, ImgP1O9Num2, ImgP1O10Num2, ImgP1O11Num2, ImgP1O12Num2,
            ImgP2O1Num2, ImgP2O2Num2, ImgP2O3Num2, ImgP2O4Num2, ImgP2O5Num2, ImgP2O6Num2, ImgP2O7Num2, ImgP2O8Num2,
            ImgP2O9Num2, ImgP2O10Num2, ImgP2O11Num2, ImgP2O12Num2, ImgP3O1Num2, ImgP3O2Num2, ImgP3O3Num2, ImgP3O4Num2,
            ImgP3O5Num2, ImgP3O6Num2, ImgP3O7Num2, ImgP3O8Num2, ImgP3O9Num2, ImgP3O10Num2, ImgP3O11Num2, ImgP3O12Num2,
            ImgP4O1Num2, ImgP4O2Num2, ImgP4O3Num2, ImgP4O4Num2, ImgP4O5Num2, ImgP4O6Num2, ImgP4O7Num2, ImgP4O8Num2,
            ImgP4O9Num2, ImgP4O10Num2, ImgP4O11Num2, ImgP4O12Num2, Wallpaper2;
    private String TxtNivel = "", TxtInstruccionesNivel = "", TxtBarraPresentacion = "", TxtPregunta1 = "",
            TxtPregunta2 = "", TxtPregunta3 = "", TxtPregunta4 = "", UsuarioEsmeralda = "", Fuente = "", Negro = "",
            Blanco = "", Esmeralda = "", Rojo = "";
    private JLabel LblIconoNivel, LblNivel, LblInstruccionesNivel, LblPresentacionBarra, LblPregunta1, LblPregunta2,
            LblPregunta3, LblPregunta4, LblPregunta1Opcion1, LblPregunta1Opcion2, LblPregunta1Opcion3,
            LblPregunta1Opcion4, LblPregunta1Opcion5, LblPregunta1Opcion6, LblPregunta1Opcion7, LblPregunta1Opcion8,
            LblPregunta1Opcion9, LblPregunta1Opcion10, LblPregunta1Opcion11, LblPregunta1Opcion12, LblPregunta2Opcion1,
            LblPregunta2Opcion2, LblPregunta2Opcion3, LblPregunta2Opcion4, LblPregunta2Opcion5, LblPregunta2Opcion6,
            LblPregunta2Opcion7, LblPregunta2Opcion8, LblPregunta2Opcion9, LblPregunta2Opcion10, LblPregunta2Opcion11,
            LblPregunta2Opcion12, LblPregunta3Opcion1, LblPregunta3Opcion2, LblPregunta3Opcion3, LblPregunta3Opcion4,
            LblPregunta3Opcion5, LblPregunta3Opcion6, LblPregunta3Opcion7, LblPregunta3Opcion8, LblPregunta3Opcion9,
            LblPregunta3Opcion10, LblPregunta3Opcion11, LblPregunta3Opcion12, LblPregunta4Opcion1, LblPregunta4Opcion2,
            LblPregunta4Opcion3, LblPregunta4Opcion4, LblPregunta4Opcion5, LblPregunta4Opcion6, LblPregunta4Opcion7,
            LblPregunta4Opcion8, LblPregunta4Opcion9, LblPregunta4Opcion10, LblPregunta4Opcion11, LblPregunta4Opcion12,
            LblPregunta1BG, LblPregunta2BG, LblPregunta3BG, LblPregunta4BG, LblCover, LblWallpaper, LblScoreCobre,
            LblScoreHierro, LblScoreOro;
    private JCheckBox Pregunta1Opcion1, Pregunta1Opcion2, Pregunta1Opcion3, Pregunta1Opcion4, Pregunta1Opcion5,
            Pregunta1Opcion6, Pregunta1Opcion7, Pregunta1Opcion8, Pregunta1Opcion9, Pregunta1Opcion10,
            Pregunta1Opcion11, Pregunta1Opcion12, Pregunta2Opcion1, Pregunta2Opcion2, Pregunta2Opcion3,
            Pregunta2Opcion4, Pregunta2Opcion5, Pregunta2Opcion6, Pregunta2Opcion7, Pregunta2Opcion8, Pregunta2Opcion9,
            Pregunta2Opcion10, Pregunta2Opcion11, Pregunta2Opcion12, Pregunta3Opcion1, Pregunta3Opcion2,
            Pregunta3Opcion3, Pregunta3Opcion4, Pregunta3Opcion5, Pregunta3Opcion6, Pregunta3Opcion7, Pregunta3Opcion8,
            Pregunta3Opcion9, Pregunta3Opcion10, Pregunta3Opcion11, Pregunta3Opcion12, Pregunta4Opcion1,
            Pregunta4Opcion2, Pregunta4Opcion3, Pregunta4Opcion4, Pregunta4Opcion5, Pregunta4Opcion6, Pregunta4Opcion7,
            Pregunta4Opcion8, Pregunta4Opcion9, Pregunta4Opcion10, Pregunta4Opcion11, Pregunta4Opcion12;
    private JButton BtnInstrucciones, BtnComenzar, BtnSiguiente, BtnSiguiente2, BtnSiguiente3, BtnFinalizar;
    private int m = 1, te = 240, PuntajeNivelCobre = 0, PuntajeNivelHierro = 0, PuntaNivelOro = 0;
    private Font FuenteMinecraft;
    public static int PuntajeNivelEsmeralda = 0;

    public void CreandoVentanaNivelEsmeralda() {

        // PERSONALIZAMOS NUESTRA PLANTILLA DE NIVEL ESMERALDA
        PersonalizarPlantillaEsmeralda();

        // GUARDANAMOS NUESTRAS IMAGENES
        AlmacenarImagenesNivelEsmeralda();

        // COLOCAMOS LOS PUNTAJES EN EL SCOREBOARD
        ScoreBoardEsmeralda();

        // CREAMOS Y COLOCAMOS NUESTRO SIDEBAR LEFT
        CrearSidebarLeftEsmeralda();

        // CREAMOS NUESTRO PANEL DE PRESENTACION
        CreacionPanelPresentacion();

    }

    public void PersonalizarPlantillaEsmeralda() {
        // INSTANCIAMOS LA PLANTILLA Y NUESTRO LOGIN PARA OBTENER EL USUARIO
        PlantillaGeneral plantillaGeneralParaNivelEsmeralda = new PlantillaGeneral();
        VentanaLogin ObteniendoUsuario = new VentanaLogin();

        // OBTENEMOS LA PLANTILLA Y LA AGREAMOS A NUESTRO JFRAME
        VentanaNivelEsmeralda = plantillaGeneralParaNivelEsmeralda.CreandoPlantillaGeneral();

        // ASIGNAMOS EL ICONO A NUESTRA VENTANA
        VentanaNivelEsmeralda.setIconImage(
                new ImageIcon(getClass().getResource("ImgNivelEsmeralda/Esmeralda.png")).getImage());

        // OBTENEMOS Y ALMACENAMOS LOS COLORES Y FUENTE A UTILIZAR
        FuenteMinecraft = plantillaGeneralParaNivelEsmeralda.FuenteMinecraft;

        Fuente = plantillaGeneralParaNivelEsmeralda.Fuente;
        Negro = plantillaGeneralParaNivelEsmeralda.Negro;
        Blanco = plantillaGeneralParaNivelEsmeralda.Blanco;
        Esmeralda = plantillaGeneralParaNivelEsmeralda.Esmeralda;
        Rojo = plantillaGeneralParaNivelEsmeralda.Rojo;

        // OBTENEMOS NUESTRO NOMBRE DE USUARIO
        UsuarioEsmeralda = ObteniendoUsuario.Usuario;

        // OBTENEMOS EL PUNTAJE DEL NIVEL COBRE/HIERRO
        LblScoreCobre = plantillaGeneralParaNivelEsmeralda.LblScoreCobre4;
        LblScoreHierro = plantillaGeneralParaNivelEsmeralda.LblScoreHierro4;
        LblScoreOro = plantillaGeneralParaNivelEsmeralda.LblScoreOro4;

    }

    public void AlmacenarImagenesNivelEsmeralda() {
        // GUARDAMOS LA IMAGEN DEL NIVEL Oro
        IconoNivel = new ImageIcon("ImgNivelEsmeralda/Esmeralda.png").getImage();
        IconoNivel2 = new ImageIcon(IconoNivel.getScaledInstance(115, 135,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE ICONO Oro
        IconoMostrar = new ImageIcon("ImgNivelEsmeralda/Mostrar.png").getImage();
        IconoMostrar2 = new ImageIcon(IconoMostrar.getScaledInstance(40, 30,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DEL ICONO Oro
        IconoOcultar = new ImageIcon("ImgNivelEsmeralda/Ocultar.png").getImage();
        IconoOcultar2 = new ImageIcon(IconoOcultar.getScaledInstance(40, 30,
                Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 1
        ImgP1O1 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/PiedraMoss.png").getImage();
        ImgP1O1Num2 = new ImageIcon(ImgP1O1.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 1
        ImgP1O2 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/PuertaHierro.png").getImage();
        ImgP1O2Num2 = new ImageIcon(ImgP1O2.getScaledInstance(40, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 1
        ImgP1O3 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/PisoMadera.png").getImage();
        ImgP1O3Num2 = new ImageIcon(ImgP1O3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 1
        ImgP1O4 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/Obsidiana.png").getImage();
        ImgP1O4Num2 = new ImageIcon(ImgP1O4.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 1
        ImgP1O5 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/EscaleraPiedra.png").getImage();
        ImgP1O5Num2 = new ImageIcon(ImgP1O5.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 1
        ImgP1O6 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/Arenisca.png").getImage();
        ImgP1O6Num2 = new ImageIcon(ImgP1O6.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 1
        ImgP1O7 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/VallaMadera.png").getImage();
        ImgP1O7Num2 = new ImageIcon(ImgP1O7.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 1
        ImgP1O8 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/Lampara.png").getImage();
        ImgP1O8Num2 = new ImageIcon(ImgP1O8.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 1
        ImgP1O9 = new ImageIcon("ImgNivelEsmeralda/Pregunta1//BloqueHierro.png").getImage();
        ImgP1O9Num2 = new ImageIcon(ImgP1O9.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 1
        ImgP1O10 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/Hielo.png").getImage();
        ImgP1O10Num2 = new ImageIcon(ImgP1O10.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 1
        ImgP1O11 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/Horno.png").getImage();
        ImgP1O11Num2 = new ImageIcon(ImgP1O11.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 1
        ImgP1O12 = new ImageIcon("ImgNivelEsmeralda/Pregunta1/MenaDiamante.png").getImage();
        ImgP1O12Num2 = new ImageIcon(ImgP1O12.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 2
        ImgP2O1 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Antorcha.png").getImage();
        ImgP2O1Num2 = new ImageIcon(ImgP2O1.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 2
        ImgP2O2 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/VallaMadera.png").getImage();
        ImgP2O2Num2 = new ImageIcon(ImgP2O2.getScaledInstance(60, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 2
        ImgP2O3 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Trampilla.png").getImage();
        ImgP2O3Num2 = new ImageIcon(ImgP2O3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 2
        ImgP2O4 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/AntorchaRedstone.png").getImage();
        ImgP2O4Num2 = new ImageIcon(ImgP2O4.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 2
        ImgP2O5 = new ImageIcon("ImgNivelEsmeralda/Pregunta2//Boton.png").getImage();
        ImgP2O5Num2 = new ImageIcon(ImgP2O5.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 2
        ImgP2O6 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Repetidor.png").getImage();
        ImgP2O6Num2 = new ImageIcon(ImgP2O6.getScaledInstance(90, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 2
        ImgP2O7 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/BotonRaro.png").getImage();
        ImgP2O7Num2 = new ImageIcon(ImgP2O7.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 2
        ImgP2O8 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Palanca.png").getImage();
        ImgP2O8Num2 = new ImageIcon(ImgP2O8.getScaledInstance(90, 90, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 2
        ImgP2O9 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Lampara.png").getImage();
        ImgP2O9Num2 = new ImageIcon(ImgP2O9.getScaledInstance(50, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 2
        ImgP2O10 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Cartel.png").getImage();
        ImgP2O10Num2 = new ImageIcon(ImgP2O10.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 2
        ImgP2O11 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Hilo.png").getImage();
        ImgP2O11Num2 = new ImageIcon(ImgP2O11.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 2
        ImgP2O12 = new ImageIcon("ImgNivelEsmeralda/Pregunta2/Cuadro.png").getImage();
        ImgP2O12Num2 = new ImageIcon(ImgP2O12.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 3
        ImgP3O1 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/ClerigoDesierto.png").getImage();
        ImgP3O1Num2 = new ImageIcon(ImgP3O1.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 3
        ImgP3O2 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/HerreroHerramientasSabana.png").getImage();
        ImgP3O2Num2 = new ImageIcon(ImgP3O2.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 3
        ImgP3O3 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/ClerigoJungla.png").getImage();
        ImgP3O3Num2 = new ImageIcon(ImgP3O3.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 3
        ImgP3O4 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/HerreroHerramientasPantano.png").getImage();
        ImgP3O4Num2 = new ImageIcon(ImgP3O4.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 3
        ImgP3O5 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/ClerigoLlanura.png").getImage();
        ImgP3O5Num2 = new ImageIcon(ImgP3O5.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 3
        ImgP3O6 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/HerreroHerramientasNieve.png").getImage();
        ImgP3O6Num2 = new ImageIcon(ImgP3O6.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 3
        ImgP3O7 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/ClerigoNieve.png").getImage();
        ImgP3O7Num2 = new ImageIcon(ImgP3O7.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 3
        ImgP3O8 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/HerreroHerramientasLlanura.png").getImage();
        ImgP3O8Num2 = new ImageIcon(ImgP3O8.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 3
        ImgP3O9 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/ClerigoPantano.png").getImage();
        ImgP3O9Num2 = new ImageIcon(ImgP3O9.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 3
        ImgP3O10 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/HerreroHerramientasJungla.png").getImage();
        ImgP3O10Num2 = new ImageIcon(ImgP3O10.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 3
        ImgP3O11 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/ClerigoSabana.png").getImage();
        ImgP3O11Num2 = new ImageIcon(ImgP3O11.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 3
        ImgP3O12 = new ImageIcon("ImgNivelEsmeralda/Pregunta3/HerreroHerramientasDesierto.png").getImage();
        ImgP3O12Num2 = new ImageIcon(ImgP3O12.getScaledInstance(90, 120, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 1 EN PREGUNTA 5
        ImgP4O1 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/Berruga.png").getImage();
        ImgP4O1Num2 = new ImageIcon(ImgP4O1.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 2 EN PREGUNTA 5
        ImgP4O2 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/Azucar.png").getImage();
        ImgP4O2Num2 = new ImageIcon(ImgP4O2.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 3 EN PREGUNTA 5
        ImgP4O3 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/SandiaLuminosa.png").getImage();
        ImgP4O3Num2 = new ImageIcon(ImgP4O3.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 4 EN PREGUNTA 5
        ImgP4O4 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/Magma.png").getImage();
        ImgP4O4Num2 = new ImageIcon(ImgP4O4.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 5 EN PREGUNTA 5
        ImgP4O5 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/LagrimaDeGhast.png").getImage();
        ImgP4O5Num2 = new ImageIcon(ImgP4O5.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 6 EN PREGUNTA 5
        ImgP4O6 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/Polvora.png").getImage();
        ImgP4O6Num2 = new ImageIcon(ImgP4O6.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 7 EN PREGUNTA 5
        ImgP4O7 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/PezGlobo.png").getImage();
        ImgP4O7Num2 = new ImageIcon(ImgP4O7.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 8 EN PREGUNTA 5
        ImgP4O8 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/OjoDeArañaFermentado.png").getImage();
        ImgP4O8Num2 = new ImageIcon(ImgP4O8.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 9 EN PREGUNTA 5
        ImgP4O9 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/BotellaDeAgua.png").getImage();
        ImgP4O9Num2 = new ImageIcon(ImgP4O9.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 10 EN PREGUNTA 5
        ImgP4O10 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/ZanahoriaDorada.png").getImage();
        ImgP4O10Num2 = new ImageIcon(ImgP4O10.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 11 EN PREGUNTA 5
        ImgP4O11 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/Glowstone.png").getImage();
        ImgP4O11Num2 = new ImageIcon(ImgP4O11.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE LA OPCION 12 EN PREGUNTA 5
        ImgP4O12 = new ImageIcon("ImgNivelEsmeralda/Pregunta4/Redstone.png").getImage();
        ImgP4O12Num2 = new ImageIcon(ImgP4O12.getScaledInstance(70, 70, Image.SCALE_SMOOTH));

        // GUARDAMOS LA IMAGEN DE NUESTRO BACKGROUND
        Wallpaper = new ImageIcon("ImgNivelEsmeralda/Wallpaper.jpg").getImage();
        Wallpaper2 = new ImageIcon(
                Wallpaper.getScaledInstance(900, 700, Image.SCALE_SMOOTH));
    }

    public void ScoreBoardEsmeralda() {
        VentanaCobre VC = new VentanaCobre();
        VentanaHierro VH = new VentanaHierro();
        VentanaOro VO = new VentanaOro();
        PuntajeNivelCobre = VC.PuntajeNivelCobre;
        PuntajeNivelHierro = VH.PuntajeNivelHierro;
        PuntaNivelOro = VO.PuntajeNivelOro;
        LblScoreCobre.setText(PuntajeNivelCobre + " DE 5");
        LblScoreHierro.setText(PuntajeNivelHierro + " DE 6");
        LblScoreOro.setText(PuntaNivelOro + " DE 6");
    }

    public void CrearSidebarLeftEsmeralda() {
        // CREAMOS Y COLOCAMOS EL ICONO DEL NIVEL
        LblIconoNivel = new JLabel("", JLabel.CENTER);
        VentanaNivelEsmeralda.add(LblIconoNivel);

        // CREAMOS Y COLOCAMOS EL TEXTO DEL NIVEL
        TxtNivel = "<html><body>NIVEL 4 <b style=color:'" + Esmeralda + "'>ESMERALDA</b></body></html>";
        LblNivel = new JLabel(TxtNivel, JLabel.CENTER);
        VentanaNivelEsmeralda.add(LblNivel);

        // CREAMOS Y COLOCAMOS EL TEXTO CON LAS INSTRUCCIONES
        TxtInstruccionesNivel = "<html><body><center><b style=color:'" + Esmeralda
                + "'>DETALLES DEL NIVEL</b><br><br>CANTIDAD DE PREGUNTAS <b style=color:'" + Esmeralda
                + "'>4</b><br>TIPO DE PREGUNTAS <b style=color:'" + Esmeralda
                + "'>OPCION MULTIPLE<br>DE RESPUESTA MULTIPLE</b><br>TIEMPO <b style=color:'"
                + Esmeralda
                + "'>240 SEGUNDOS</b></center></body></html>";
        LblInstruccionesNivel = new JLabel(TxtInstruccionesNivel, JLabel.CENTER);
        VentanaNivelEsmeralda.add(LblInstruccionesNivel);

        // CREAMOS Y COLOCAMOS EL BOTON DE VER INSTRUCCIONES
        BtnInstrucciones = new JButton();
        VentanaNivelEsmeralda.add(BtnInstrucciones);

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

    public void CreacionPanelPresentacion() {
        // CREAMOS Y AGREGAMOS EL PANEL DE FONDO
        Panel1 = new JPanel();
        VentanaNivelEsmeralda.add(Panel1);

        // CREAMOS Y AGREGAMOS EL PANEL DE PRESENTACION DE BARRA TIEMPO
        Panel2 = new JPanel();
        Panel1.add(Panel2);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA BARRA DE TIEMPO
        Panel3 = new JPanel();
        Panel1.add(Panel3);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA PRIMERA PREGUNTA
        Panel4 = new JPanel();
        Panel1.add(Panel4);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA SEGUNDA PREGUNTA
        Panel5 = new JPanel();
        Panel1.add(Panel5);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA TERCERA PREGUNTA
        Panel6 = new JPanel();
        Panel1.add(Panel6);

        // CREAMOS Y AGREGAMOS EL PANEL DE LA TERCERA PREGUNTA
        Panel7 = new JPanel();
        Panel1.add(Panel7);

        // AGREGAMOS LA BARRA DE TIEMPO
        BarraNivelEsmeralda = new JProgressBar(0, te);
        Panel3.add(BarraNivelEsmeralda);

        // AGREGAMOS EL BOTON PARA COMENZAR EL NIVEL
        BtnComenzar = new JButton("COMENZAR");
        Panel3.add(BtnComenzar);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnSiguiente = new JButton("SIGUIENTE");
        Panel3.add(BtnSiguiente);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnSiguiente2 = new JButton("SIGUIENTE");
        Panel3.add(BtnSiguiente2);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnSiguiente3 = new JButton("SIGUIENTE");
        Panel3.add(BtnSiguiente3);

        // AGREGAMOS EL BOTON PARA MOSTRAR LAS SIGUIENTES PREGUNTAS
        BtnFinalizar = new JButton("FINALIZAR NIVEL");
        Panel3.add(BtnFinalizar);

        // AGREGAMOS NUESTRO WALLPAPER Y SU COVER
        LblCover = new JLabel();
        Panel1.add(LblCover);
        LblWallpaper = new JLabel();
        Panel1.add(LblWallpaper);

        TxtBarraPresentacion = "<html><body><center>YA ESTAS A LA MITAD DEL JUEGO <b style=color:'" + Negro
                + "'>" + UsuarioEsmeralda
                + "</b> QUE IMPRESIONTE.<br><br>COMO SABRAS EN TODO JUEGO ENTRE MAS AVANCES <b style=color:'"
                + Negro
                + "'>MAS DIFICIL SE PONE</b> Y NOSOTROS <br>NO SOMOS LA EXCEPCION<br><br> TE PRESENTO LA <b style=color:'"
                + Negro
                + "'>BARRA DE TIEMPO</b> LA CUAL REPRESENTA EL TIEMPO TOTAL QUE TIENES<br>PARA COMPLETAR EL NIVEL Y SU FINAL ES EL FINAL DEL NIVEL<br><b style=color:'"
                + Negro + "'>NO DEJES QUE SE TERMINE</b></center></body></html>";
        LblPresentacionBarra = new JLabel(TxtBarraPresentacion, JLabel.CENTER);
        Panel2.add(LblPresentacionBarra);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL QUE CONTIENE EL FONDO
        Panel1.setLayout(null);
        Panel1.setBounds(400, 30, 900, 700);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE PRESENTACION DEL TIEMPO
        Panel2.setLayout(null);
        Panel2.setBounds(10, 10, 880, 580);
        Panel2.setOpaque(true);
        Panel2.setBackground(new Color(23, 221, 98, 150));

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE BARRA
        Panel3.setLayout(null);
        Panel3.setBounds(10, 600, 880, 60);
        Panel3.setOpaque(true);
        Panel3.setBackground(new Color(0, 0, 0, 0));

        LblPresentacionBarra.setBounds(0, 0, 880, 580);
        LblPresentacionBarra.setForeground(Color.decode(Blanco));
        LblPresentacionBarra.setFont(FuenteMinecraft.deriveFont(27f));

        // DAMOS PROPIEDADES A NUESTRA BARRA DE TIEMPO
        BarraNivelEsmeralda.setBounds(0, 5, 730, 50);
        BarraNivelEsmeralda.setStringPainted(true);
        BarraNivelEsmeralda.setString("BARRA DE TIEMPO");
        BarraNivelEsmeralda.setForeground(Color.decode(Esmeralda));
        BarraNivelEsmeralda.setFont(FuenteMinecraft.deriveFont(15f));
        BarraNivelEsmeralda.setBorder(null);
        BarraNivelEsmeralda.setValue(te);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnComenzar.setBounds(740, 5, 150, 50);
        BtnComenzar.setFocusPainted(false);
        BtnComenzar.setBackground(Color.decode(Esmeralda));
        BtnComenzar.setForeground(Color.decode(Blanco));
        BtnComenzar.setFont(FuenteMinecraft.deriveFont(15f));
        BtnComenzar.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnComenzar.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnSiguiente.setBounds(740, 5, 150, 50);
        BtnSiguiente.setFocusPainted(false);
        BtnSiguiente.setBackground(Color.decode(Esmeralda));
        BtnSiguiente.setForeground(Color.decode(Blanco));
        BtnSiguiente.setFont(FuenteMinecraft.deriveFont(15f));
        BtnSiguiente.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnSiguiente.setVisible(false);
        BtnSiguiente.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnSiguiente2.setBounds(740, 5, 150, 50);
        BtnSiguiente2.setFocusPainted(false);
        BtnSiguiente2.setBackground(Color.decode(Esmeralda));
        BtnSiguiente2.setForeground(Color.decode(Blanco));
        BtnSiguiente2.setFont(FuenteMinecraft.deriveFont(15f));
        BtnSiguiente2.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnSiguiente2.setVisible(false);
        BtnSiguiente2.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnSiguiente3.setBounds(740, 5, 150, 50);
        BtnSiguiente3.setFocusPainted(false);
        BtnSiguiente3.setBackground(Color.decode(Esmeralda));
        BtnSiguiente3.setForeground(Color.decode(Blanco));
        BtnSiguiente3.setFont(FuenteMinecraft.deriveFont(15f));
        BtnSiguiente3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnSiguiente3.setVisible(false);
        BtnSiguiente3.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTRO BOTON DE SIGUIENTE PREGUNTA
        BtnFinalizar.setBounds(690, 5, 200, 50);
        BtnFinalizar.setFocusPainted(false);
        BtnFinalizar.setBackground(Color.decode(Esmeralda));
        BtnFinalizar.setForeground(Color.decode(Blanco));
        BtnFinalizar.setFont(FuenteMinecraft.deriveFont(15f));
        BtnFinalizar.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 8));
        BtnFinalizar.setVisible(false);
        BtnFinalizar.addActionListener(this);

        // DAMOS PROPIEDADES A NUESTROS COVER Y WALLPAPER DE FONDO
        LblCover.setBounds(0, 0, 901, 701);
        LblCover.setOpaque(true);
        LblCover.setBackground(new Color(0, 0, 0, 100));

        LblWallpaper.setBounds(0, 0, 900, 700);
        LblWallpaper.setIcon(Wallpaper2);

        VentanaNivelEsmeralda.repaint();
    }

    public void PanelPreguntasNivelEsmeralda1() {
        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta1 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #1:</b> ESTE OBJETO <b style=color:'" + Rojo
                + "'>TARDA EN ROMPERSE</b> 25 SEGUNDOS SIN HERRAMIENTAS</body></html>";
        // RESPUESTA, PUERTA DE HIERRO Y BLOQUE DE HIERRO
        LblPregunta1 = new JLabel(TxtPregunta1, JLabel.CENTER);
        Panel4.add(LblPregunta1);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta1Opcion1 = new JCheckBox();
        Panel4.add(Pregunta1Opcion1);
        LblPregunta1Opcion1 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion1);

        Pregunta1Opcion2 = new JCheckBox();
        Panel4.add(Pregunta1Opcion2);
        LblPregunta1Opcion2 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion2);

        Pregunta1Opcion3 = new JCheckBox();
        Panel4.add(Pregunta1Opcion3);
        LblPregunta1Opcion3 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion3);

        Pregunta1Opcion4 = new JCheckBox();
        Panel4.add(Pregunta1Opcion4);
        LblPregunta1Opcion4 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion4);

        Pregunta1Opcion5 = new JCheckBox();
        Panel4.add(Pregunta1Opcion5);
        LblPregunta1Opcion5 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion5);

        Pregunta1Opcion6 = new JCheckBox();
        Panel4.add(Pregunta1Opcion6);
        LblPregunta1Opcion6 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion6);

        Pregunta1Opcion7 = new JCheckBox();
        Panel4.add(Pregunta1Opcion7);
        LblPregunta1Opcion7 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion7);

        Pregunta1Opcion8 = new JCheckBox();
        Panel4.add(Pregunta1Opcion8);
        LblPregunta1Opcion8 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion8);

        Pregunta1Opcion9 = new JCheckBox();
        Panel4.add(Pregunta1Opcion9);
        LblPregunta1Opcion9 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion9);

        Pregunta1Opcion10 = new JCheckBox();
        Panel4.add(Pregunta1Opcion10);
        LblPregunta1Opcion10 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion10);

        Pregunta1Opcion11 = new JCheckBox();
        Panel4.add(Pregunta1Opcion11);
        LblPregunta1Opcion11 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion11);

        Pregunta1Opcion12 = new JCheckBox();
        Panel4.add(Pregunta1Opcion12);
        LblPregunta1Opcion12 = new JLabel("", JLabel.CENTER);
        Panel4.add(LblPregunta1Opcion12);

        LblPregunta1BG = new JLabel();
        Panel4.add(LblPregunta1BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE PRESENTACION DEL TIEMPO
        Panel4.setLayout(null);
        Panel4.setBounds(10, 10, 880, 580);
        Panel4.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta1.setBounds(0, 10, 740, 50);
        LblPregunta1.setOpaque(true);
        LblPregunta1.setBackground(Color.decode(Esmeralda));
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
    }

    public void PanelPreguntasNivelEsmeralda2() {
        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta2 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #2:</b> CON ESTOS OBJETOS PODIAS CREAR UNA <b style=color:'" + Rojo
                + "'>ENTRADA OCULTA</b></body></html>";
        LblPregunta2 = new JLabel(TxtPregunta2, JLabel.CENTER);
        Panel5.add(LblPregunta2);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta2Opcion1 = new JCheckBox();
        Panel5.add(Pregunta2Opcion1);
        LblPregunta2Opcion1 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion1);

        Pregunta2Opcion2 = new JCheckBox();
        Panel5.add(Pregunta2Opcion2);
        LblPregunta2Opcion2 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion2);

        Pregunta2Opcion3 = new JCheckBox();
        Panel5.add(Pregunta2Opcion3);
        LblPregunta2Opcion3 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion3);

        Pregunta2Opcion4 = new JCheckBox();
        Panel5.add(Pregunta2Opcion4);
        LblPregunta2Opcion4 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion4);

        Pregunta2Opcion5 = new JCheckBox();
        Panel5.add(Pregunta2Opcion5);
        LblPregunta2Opcion5 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion5);

        Pregunta2Opcion6 = new JCheckBox();
        Panel5.add(Pregunta2Opcion6);
        LblPregunta2Opcion6 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion6);

        Pregunta2Opcion7 = new JCheckBox();
        Panel5.add(Pregunta2Opcion7);
        LblPregunta2Opcion7 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion7);

        Pregunta2Opcion8 = new JCheckBox();
        Panel5.add(Pregunta2Opcion8);
        LblPregunta2Opcion8 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion8);

        Pregunta2Opcion9 = new JCheckBox();
        Panel5.add(Pregunta2Opcion9);
        LblPregunta2Opcion9 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion9);

        Pregunta2Opcion10 = new JCheckBox();
        Panel5.add(Pregunta2Opcion10);
        LblPregunta2Opcion10 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion10);

        Pregunta2Opcion11 = new JCheckBox();
        Panel5.add(Pregunta2Opcion11);
        LblPregunta2Opcion11 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion11);

        Pregunta2Opcion12 = new JCheckBox();
        Panel5.add(Pregunta2Opcion12);
        LblPregunta2Opcion12 = new JLabel("", JLabel.CENTER);
        Panel5.add(LblPregunta2Opcion12);

        LblPregunta2BG = new JLabel();
        Panel5.add(LblPregunta2BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE PRESENTACION DEL TIEMPO
        Panel5.setLayout(null);
        Panel5.setBounds(10, 10, 880, 580);
        Panel5.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta2.setBounds(0, 10, 660, 50);
        LblPregunta2.setOpaque(true);
        LblPregunta2.setBackground(Color.decode(Esmeralda));
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

    public void PanelPreguntasNivelEsmeralda3() {
        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta3 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #3</b> SELECCIONA AL ALDEANO <b style=color:'" + Rojo
                + "'>HERRERO DE HERRAMIENTAS</b> DEL BIOMA TAIGA</body></html>";
        LblPregunta3 = new JLabel(TxtPregunta3, JLabel.CENTER);
        Panel6.add(LblPregunta3);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta3Opcion1 = new JCheckBox();
        Panel6.add(Pregunta3Opcion1);
        LblPregunta3Opcion1 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion1);

        Pregunta3Opcion2 = new JCheckBox();
        Panel6.add(Pregunta3Opcion2);
        LblPregunta3Opcion2 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion2);

        Pregunta3Opcion3 = new JCheckBox();
        Panel6.add(Pregunta3Opcion3);
        LblPregunta3Opcion3 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion3);

        Pregunta3Opcion4 = new JCheckBox();
        Panel6.add(Pregunta3Opcion4);
        LblPregunta3Opcion4 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion4);

        Pregunta3Opcion5 = new JCheckBox();
        Panel6.add(Pregunta3Opcion5);
        LblPregunta3Opcion5 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion5);

        Pregunta3Opcion6 = new JCheckBox();
        Panel6.add(Pregunta3Opcion6);
        LblPregunta3Opcion6 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion6);

        Pregunta3Opcion7 = new JCheckBox();
        Panel6.add(Pregunta3Opcion7);
        LblPregunta3Opcion7 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion7);

        Pregunta3Opcion8 = new JCheckBox();
        Panel6.add(Pregunta3Opcion8);
        LblPregunta3Opcion8 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion8);

        Pregunta3Opcion9 = new JCheckBox();
        Panel6.add(Pregunta3Opcion9);
        LblPregunta3Opcion9 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion9);

        Pregunta3Opcion10 = new JCheckBox();
        Panel6.add(Pregunta3Opcion10);
        LblPregunta3Opcion10 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion10);

        Pregunta3Opcion11 = new JCheckBox();
        Panel6.add(Pregunta3Opcion11);
        LblPregunta3Opcion11 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion11);

        Pregunta3Opcion12 = new JCheckBox();
        Panel6.add(Pregunta3Opcion12);
        LblPregunta3Opcion12 = new JLabel("", JLabel.CENTER);
        Panel6.add(LblPregunta3Opcion12);

        LblPregunta3BG = new JLabel();
        Panel6.add(LblPregunta3BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE PRESENTACION DEL TIEMPO
        Panel6.setLayout(null);
        Panel6.setBounds(10, 10, 880, 580);
        Panel6.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta3.setBounds(0, 10, 760, 50);
        LblPregunta3.setOpaque(true);
        LblPregunta3.setBackground(Color.decode(Esmeralda));
        LblPregunta3.setForeground(Color.decode(Negro));
        LblPregunta3.setBorder(BorderFactory.createEmptyBorder(4, 0, 0, 0));
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

    public void PanelPreguntasNivelEsmeralda4() {
        // PRIMERO AGREGAMOS NUESTRAS PREGUNTAS
        TxtPregunta4 = "<html><body><b style=color:'" + Rojo
                + "'>PREGUNTA #4</b> SELECCIONA LOS INGREDIENTES NECESARIOS PARA CREAR UNA <b style=color:'" + Rojo
                + "'>POCION DE DANO II ARROJADIZA</b></body></html>";
        LblPregunta4 = new JLabel(TxtPregunta4, JLabel.CENTER);
        Panel7.add(LblPregunta4);

        // DESPUES AGREGAMOS NUESTRAS OPCIONES DE RESPUESTA A PREGUNTA 5
        Pregunta4Opcion1 = new JCheckBox();
        Panel7.add(Pregunta4Opcion1);
        LblPregunta4Opcion1 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion1);

        Pregunta4Opcion2 = new JCheckBox();
        Panel7.add(Pregunta4Opcion2);
        LblPregunta4Opcion2 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion2);

        Pregunta4Opcion3 = new JCheckBox();
        Panel7.add(Pregunta4Opcion3);
        LblPregunta4Opcion3 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion3);

        Pregunta4Opcion4 = new JCheckBox();
        Panel7.add(Pregunta4Opcion4);
        LblPregunta4Opcion4 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion4);

        Pregunta4Opcion5 = new JCheckBox();
        Panel7.add(Pregunta4Opcion5);
        LblPregunta4Opcion5 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion5);

        Pregunta4Opcion6 = new JCheckBox();
        Panel7.add(Pregunta4Opcion6);
        LblPregunta4Opcion6 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion6);

        Pregunta4Opcion7 = new JCheckBox();
        Panel7.add(Pregunta4Opcion7);
        LblPregunta4Opcion7 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion7);

        Pregunta4Opcion8 = new JCheckBox();
        Panel7.add(Pregunta4Opcion8);
        LblPregunta4Opcion8 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion8);

        Pregunta4Opcion9 = new JCheckBox();
        Panel7.add(Pregunta4Opcion9);
        LblPregunta4Opcion9 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion9);

        Pregunta4Opcion10 = new JCheckBox();
        Panel7.add(Pregunta4Opcion10);
        LblPregunta4Opcion10 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion10);

        Pregunta4Opcion11 = new JCheckBox();
        Panel7.add(Pregunta4Opcion11);
        LblPregunta4Opcion11 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion11);

        Pregunta4Opcion12 = new JCheckBox();
        Panel7.add(Pregunta4Opcion12);
        LblPregunta4Opcion12 = new JLabel("", JLabel.CENTER);
        Panel7.add(LblPregunta4Opcion12);

        LblPregunta4BG = new JLabel();
        Panel7.add(LblPregunta4BG);

        // EMPEZAMOS A DAR PROPIEDADES A NUESTRO PANEL DE PRESENTACION DEL TIEMPO
        Panel7.setLayout(null);
        Panel7.setBounds(10, 10, 880, 580);
        Panel7.setOpaque(false);

        // TITULO EN PREGUNTA 5
        LblPregunta4.setBounds(0, 10, 880, 50);
        LblPregunta4.setOpaque(true);
        LblPregunta4.setBackground(Color.decode(Esmeralda));
        LblPregunta4.setForeground(Color.decode(Negro));
        LblPregunta4.setBorder(BorderFactory.createEmptyBorder(4, 25, 0, 0));
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

    public void CargarNivelDiamante() {
        VentanaNivelEsmeralda.setVisible(false);
        CargandoNivel CN = new CargandoNivel();
        CN.VentanaCargandoNivel();
        CN.AnimacionCargando("Esmeralda");
    }

    public void CronometroEsmeralda() {

        BarraNivelEsmeralda.setString("");
        Panel2.setVisible(false);
        BtnComenzar.setVisible(false);
        BtnSiguiente.setVisible(true);
        PanelPreguntasNivelEsmeralda1();

        Thread Hilo = new Thread() {
            public void run() {
                while (te >= 0) {
                    if (te == 120) {
                        BarraNivelEsmeralda.setForeground(Color.ORANGE);
                    }
                    if (te == 60) {
                        BarraNivelEsmeralda.setForeground(Color.decode(Rojo));
                    }
                    try {
                        Thread.sleep(1000);
                        BarraNivelEsmeralda.setValue(te);
                        te--;
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
                CargarNivelDiamante();
            }
        };
        Hilo.start();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BtnComenzar) {
            CronometroEsmeralda();
        }
        if (e.getSource() == BtnSiguiente) {
            if (Pregunta1Opcion2.isSelected() == true
                    && Pregunta1Opcion9.isSelected() == true
                    && Pregunta1Opcion1.isSelected() == false
                    && Pregunta1Opcion3.isSelected() == false
                    && Pregunta1Opcion4.isSelected() == false
                    && Pregunta1Opcion5.isSelected() == false
                    && Pregunta1Opcion6.isSelected() == false
                    && Pregunta1Opcion7.isSelected() == false
                    && Pregunta1Opcion8.isSelected() == false
                    && Pregunta1Opcion10.isSelected() == false
                    && Pregunta1Opcion11.isSelected() == false
                    && Pregunta1Opcion12.isSelected() == false) {
                PuntajeNivelEsmeralda++;
                Panel4.setVisible(false);
                BtnSiguiente.setVisible(false);
                BtnSiguiente2.setVisible(true);
                PanelPreguntasNivelEsmeralda2();
            } else {
                Panel4.setVisible(false);
                BtnSiguiente.setVisible(false);
                BtnSiguiente2.setVisible(true);
                PanelPreguntasNivelEsmeralda2();
            }
        }
        if (e.getSource() == BtnSiguiente2) {
            if (Pregunta2Opcion10.isSelected() == true
                    && Pregunta2Opcion12.isSelected() == true
                    && Pregunta2Opcion1.isSelected() == false
                    && Pregunta2Opcion2.isSelected() == false
                    && Pregunta2Opcion3.isSelected() == false
                    && Pregunta2Opcion4.isSelected() == false
                    && Pregunta2Opcion5.isSelected() == false
                    && Pregunta2Opcion6.isSelected() == false
                    && Pregunta2Opcion7.isSelected() == false
                    && Pregunta2Opcion8.isSelected() == false
                    && Pregunta2Opcion9.isSelected() == false
                    && Pregunta2Opcion11.isSelected() == false) {
                PuntajeNivelEsmeralda++;
                Panel5.setVisible(false);
                BtnSiguiente2.setVisible(false);
                BtnSiguiente3.setVisible(true);
                PanelPreguntasNivelEsmeralda3();
            } else {
                Panel5.setVisible(false);
                BtnSiguiente2.setVisible(false);
                BtnSiguiente3.setVisible(true);
                PanelPreguntasNivelEsmeralda3();
            }
        }
        if (e.getSource() == BtnSiguiente3) {
            if (Pregunta3Opcion10.isSelected() == false
                    && Pregunta3Opcion12.isSelected() == false
                    && Pregunta3Opcion1.isSelected() == false
                    && Pregunta3Opcion2.isSelected() == false
                    && Pregunta3Opcion3.isSelected() == false
                    && Pregunta3Opcion4.isSelected() == false
                    && Pregunta3Opcion5.isSelected() == false
                    && Pregunta3Opcion6.isSelected() == false
                    && Pregunta3Opcion7.isSelected() == false
                    && Pregunta3Opcion8.isSelected() == false
                    && Pregunta3Opcion9.isSelected() == false
                    && Pregunta3Opcion11.isSelected() == false) {
                PuntajeNivelEsmeralda++;
                Panel6.setVisible(false);
                BtnSiguiente3.setVisible(false);
                BarraNivelEsmeralda.setSize(680, 50);
                BtnFinalizar.setVisible(true);
                PanelPreguntasNivelEsmeralda4();
            } else {
                Panel6.setVisible(false);
                BtnSiguiente3.setVisible(false);
                BarraNivelEsmeralda.setSize(680, 50);
                BtnFinalizar.setVisible(true);
                PanelPreguntasNivelEsmeralda4();
            }
        }
        if (e.getSource() == BtnFinalizar) {
            if (Pregunta4Opcion1.isSelected() == true
                    && Pregunta4Opcion3.isSelected() == true
                    && Pregunta4Opcion6.isSelected() == true
                    && Pregunta4Opcion8.isSelected() == true
                    && Pregunta4Opcion9.isSelected() == true
                    && Pregunta4Opcion11.isSelected() == true
                    && Pregunta4Opcion2.isSelected() == false
                    && Pregunta4Opcion4.isSelected() == false
                    && Pregunta4Opcion5.isSelected() == false
                    && Pregunta4Opcion7.isSelected() == false
                    && Pregunta4Opcion10.isSelected() == false
                    && Pregunta4Opcion12.isSelected() == false) {
                PuntajeNivelEsmeralda++;
                CargarNivelDiamante();
            } else {
                CargarNivelDiamante();
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
                Pregunta1Opcion1.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion2) {
            if (Pregunta1Opcion2.isSelected() == true) {
                Pregunta1Opcion2.setContentAreaFilled(true);
                Pregunta1Opcion2.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion3) {
            if (Pregunta1Opcion3.isSelected() == true) {
                Pregunta1Opcion3.setContentAreaFilled(true);
                Pregunta1Opcion3.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion4) {
            if (Pregunta1Opcion4.isSelected() == true) {
                Pregunta1Opcion4.setContentAreaFilled(true);
                Pregunta1Opcion4.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion5) {
            if (Pregunta1Opcion5.isSelected() == true) {
                Pregunta1Opcion5.setContentAreaFilled(true);
                Pregunta1Opcion5.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion6) {
            if (Pregunta1Opcion6.isSelected() == true) {
                Pregunta1Opcion6.setContentAreaFilled(true);
                Pregunta1Opcion6.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion7) {
            if (Pregunta1Opcion7.isSelected() == true) {
                Pregunta1Opcion7.setContentAreaFilled(true);
                Pregunta1Opcion7.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion8) {
            if (Pregunta1Opcion8.isSelected() == true) {
                Pregunta1Opcion8.setContentAreaFilled(true);
                Pregunta1Opcion8.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion9) {
            if (Pregunta1Opcion9.isSelected() == true) {
                Pregunta1Opcion9.setContentAreaFilled(true);
                Pregunta1Opcion9.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion10) {
            if (Pregunta1Opcion10.isSelected() == true) {
                Pregunta1Opcion10.setContentAreaFilled(true);
                Pregunta1Opcion10.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion11) {
            if (Pregunta1Opcion11.isSelected() == true) {
                Pregunta1Opcion11.setContentAreaFilled(true);
                Pregunta1Opcion11.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta1Opcion12) {
            if (Pregunta1Opcion12.isSelected() == true) {
                Pregunta1Opcion12.setContentAreaFilled(true);
                Pregunta1Opcion12.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta1Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion1) {
            if (Pregunta2Opcion1.isSelected() == true) {
                Pregunta2Opcion1.setContentAreaFilled(true);
                Pregunta2Opcion1.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion2) {
            if (Pregunta2Opcion2.isSelected() == true) {
                Pregunta2Opcion2.setContentAreaFilled(true);
                Pregunta2Opcion2.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion3) {
            if (Pregunta2Opcion3.isSelected() == true) {
                Pregunta2Opcion3.setContentAreaFilled(true);
                Pregunta2Opcion3.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion4) {
            if (Pregunta2Opcion4.isSelected() == true) {
                Pregunta2Opcion4.setContentAreaFilled(true);
                Pregunta2Opcion4.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion5) {
            if (Pregunta2Opcion5.isSelected() == true) {
                Pregunta2Opcion5.setContentAreaFilled(true);
                Pregunta2Opcion5.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion6) {
            if (Pregunta2Opcion6.isSelected() == true) {
                Pregunta2Opcion6.setContentAreaFilled(true);
                Pregunta2Opcion6.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion7) {
            if (Pregunta2Opcion7.isSelected() == true) {
                Pregunta2Opcion7.setContentAreaFilled(true);
                Pregunta2Opcion7.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion8) {
            if (Pregunta2Opcion8.isSelected() == true) {
                Pregunta2Opcion8.setContentAreaFilled(true);
                Pregunta2Opcion8.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion9) {
            if (Pregunta2Opcion9.isSelected() == true) {
                Pregunta2Opcion9.setContentAreaFilled(true);
                Pregunta2Opcion9.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion10) {
            if (Pregunta2Opcion10.isSelected() == true) {
                Pregunta2Opcion10.setContentAreaFilled(true);
                Pregunta2Opcion10.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion11) {
            if (Pregunta2Opcion11.isSelected() == true) {
                Pregunta2Opcion11.setContentAreaFilled(true);
                Pregunta2Opcion11.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta2Opcion12) {
            if (Pregunta2Opcion12.isSelected() == true) {
                Pregunta2Opcion12.setContentAreaFilled(true);
                Pregunta2Opcion12.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta2Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion1) {
            if (Pregunta3Opcion1.isSelected() == true) {
                Pregunta3Opcion1.setContentAreaFilled(true);
                Pregunta3Opcion1.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion2) {
            if (Pregunta3Opcion2.isSelected() == true) {
                Pregunta3Opcion2.setContentAreaFilled(true);
                Pregunta3Opcion2.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion3) {
            if (Pregunta3Opcion3.isSelected() == true) {
                Pregunta3Opcion3.setContentAreaFilled(true);
                Pregunta3Opcion3.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion4) {
            if (Pregunta3Opcion4.isSelected() == true) {
                Pregunta3Opcion4.setContentAreaFilled(true);
                Pregunta3Opcion4.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion5) {
            if (Pregunta3Opcion5.isSelected() == true) {
                Pregunta3Opcion5.setContentAreaFilled(true);
                Pregunta3Opcion5.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion6) {
            if (Pregunta3Opcion6.isSelected() == true) {
                Pregunta3Opcion6.setContentAreaFilled(true);
                Pregunta3Opcion6.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion7) {
            if (Pregunta3Opcion7.isSelected() == true) {
                Pregunta3Opcion7.setContentAreaFilled(true);
                Pregunta3Opcion7.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion8) {
            if (Pregunta3Opcion8.isSelected() == true) {
                Pregunta3Opcion8.setContentAreaFilled(true);
                Pregunta3Opcion8.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion9) {
            if (Pregunta3Opcion9.isSelected() == true) {
                Pregunta3Opcion9.setContentAreaFilled(true);
                Pregunta3Opcion9.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion10) {
            if (Pregunta3Opcion10.isSelected() == true) {
                Pregunta3Opcion10.setContentAreaFilled(true);
                Pregunta3Opcion10.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion11) {
            if (Pregunta3Opcion11.isSelected() == true) {
                Pregunta3Opcion11.setContentAreaFilled(true);
                Pregunta3Opcion11.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta3Opcion12) {
            if (Pregunta3Opcion12.isSelected() == true) {
                Pregunta3Opcion12.setContentAreaFilled(true);
                Pregunta3Opcion12.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta3Opcion12.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion1) {
            if (Pregunta4Opcion1.isSelected() == true) {
                Pregunta4Opcion1.setContentAreaFilled(true);
                Pregunta4Opcion1.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion1.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion2) {
            if (Pregunta4Opcion2.isSelected() == true) {
                Pregunta4Opcion2.setContentAreaFilled(true);
                Pregunta4Opcion2.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion2.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion3) {
            if (Pregunta4Opcion3.isSelected() == true) {
                Pregunta4Opcion3.setContentAreaFilled(true);
                Pregunta4Opcion3.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion3.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion4) {
            if (Pregunta4Opcion4.isSelected() == true) {
                Pregunta4Opcion4.setContentAreaFilled(true);
                Pregunta4Opcion4.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion4.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion5) {
            if (Pregunta4Opcion5.isSelected() == true) {
                Pregunta4Opcion5.setContentAreaFilled(true);
                Pregunta4Opcion5.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion5.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion6) {
            if (Pregunta4Opcion6.isSelected() == true) {
                Pregunta4Opcion6.setContentAreaFilled(true);
                Pregunta4Opcion6.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion6.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion7) {
            if (Pregunta4Opcion7.isSelected() == true) {
                Pregunta4Opcion7.setContentAreaFilled(true);
                Pregunta4Opcion7.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion7.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion8) {
            if (Pregunta4Opcion8.isSelected() == true) {
                Pregunta4Opcion8.setContentAreaFilled(true);
                Pregunta4Opcion8.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion8.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion9) {
            if (Pregunta4Opcion9.isSelected() == true) {
                Pregunta4Opcion9.setContentAreaFilled(true);
                Pregunta4Opcion9.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion9.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion10) {
            if (Pregunta4Opcion10.isSelected() == true) {
                Pregunta4Opcion10.setContentAreaFilled(true);
                Pregunta4Opcion10.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion10.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion11) {
            if (Pregunta4Opcion11.isSelected() == true) {
                Pregunta4Opcion11.setContentAreaFilled(true);
                Pregunta4Opcion11.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion11.setContentAreaFilled(false);
            }
        }
        if (e.getSource() == Pregunta4Opcion12) {
            if (Pregunta4Opcion12.isSelected() == true) {
                Pregunta4Opcion12.setContentAreaFilled(true);
                Pregunta4Opcion12.setBackground(Color.decode(Esmeralda));
            } else {
                Pregunta4Opcion12.setContentAreaFilled(false);
            }
        }
    }

    public static void main(String[] args) {
        VentanaEsmeralda VE = new VentanaEsmeralda();
        VE.CreandoVentanaNivelEsmeralda();
    }

}
