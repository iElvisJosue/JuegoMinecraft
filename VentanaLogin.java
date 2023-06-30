import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaLogin extends JFrame implements MouseListener, KeyListener, ActionListener {

    private JFrame VentanaLogin;
    private JTextField TxtUsuario;
    private JButton BtnJugar, BtnScore;
    private Image Logo, Jugar, Wallpaper;
    private ImageIcon Logo2, Jugar2, Wallpaper2;
    private JLabel LblTitulo, LblLogoMinecraft, LblSubtitulo, LblUsuario, LblCover, LblWallpaper;
    private String Verde = "", Gris = "", Blanco = "", Limon = "", Rojo = "";
    private Font FuenteMinecraft;
    public static String Usuario = "";

    public void CreandoVentanaLogin() {

        // PERSONALIZAMOS NUESTRA PLANTILLA DE NIVEL HIERRO
        PersonalizarPlantillaLogin();

        // GUARDANAMOS NUESTRAS IMAGENES
        ObtenerImagenesLogin();

        // COLOCAMOS NUESTRA IMAGEN DE FONDO
        PonerImagenDeFondo();

        // CREAMOS Y COLOCAMOS NUESTROS BOTONES
        CrearBotones();

        // CREAMOS Y COLOCAMOS NUESTRAS ETIQUETAS
        CrearEtiquetas();

        // CREAMOS Y COLOCAMOS NUESTRO INPUT TXT
        CrearTXT();

        // REPRODUCIMOS LA MUSICA DE FONDO
        ReproducirMusica();

    }

    public void ReproducirMusica() {
        Audio Reproducir = new Audio();
        Reproducir.PonerAudio();
    }

    public void PersonalizarPlantillaLogin() {
        // INSTANCIAMOS NUESTRA CLASE PLANTILLA GENERAL
        PlantillaGeneral ObteniendoPlantillaGeneral = new PlantillaGeneral();

        // CREAMOS EL JFRAME DE VETANA LOGIN Y ALMACENAMOS LA PLANTILLA GENERAL
        VentanaLogin = new JFrame();
        VentanaLogin = ObteniendoPlantillaGeneral.CreandoPlantillaGeneral();

        // OBTENEMOS LOS TIPOS DE FUENTE Y LOS COLORES
        FuenteMinecraft = ObteniendoPlantillaGeneral.FuenteMinecraft;

        Verde = ObteniendoPlantillaGeneral.Verde;
        Gris = ObteniendoPlantillaGeneral.Gris;
        Blanco = ObteniendoPlantillaGeneral.Blanco;
        Limon = ObteniendoPlantillaGeneral.Limon;
        Rojo = ObteniendoPlantillaGeneral.Rojo;

        // OCULTAMOS EL BOTON DE MOSTRAR SCORE
        BtnScore = ObteniendoPlantillaGeneral.BtnScore;
        BtnScore.setVisible(false);

    }

    public void ObtenerImagenesLogin() {
        // OBTENEMOS LA IMAGEN PARA NUESTRO LOGO
        Logo = new ImageIcon("ImgLogin/Minecraft.png").getImage();
        Logo2 = new ImageIcon(Logo.getScaledInstance(400, 200, Image.SCALE_SMOOTH));

        // OBTENEMOS LA IMAGEN PARA NUESTRO BOTON
        Jugar = new ImageIcon("ImgLogin/Jugar.png").getImage();
        Jugar2 = new ImageIcon(Jugar.getScaledInstance(120, 30, Image.SCALE_SMOOTH));

        // OBTENEMOS LA IMAGEN PARA NUESTRO FONDO
        Wallpaper = new ImageIcon("ImgLogin/MinecraftWallpaper.jpg").getImage();
        Wallpaper2 = new ImageIcon(Wallpaper.getScaledInstance(900, 700, Image.SCALE_SMOOTH));
    }

    public void PonerImagenDeFondo() {
        // CREAMOS Y COLOCAMOS NUESTRO COVER SEMIOSCURO
        LblCover = new JLabel();
        VentanaLogin.add(LblCover);

        // CREAMOS Y COLOCAMOS NUESTRO BACKGROUND
        LblWallpaper = new JLabel();
        VentanaLogin.add(LblWallpaper);

        // ASIGNAMOS PROPIEDADES A NUESTRO COVER TRANSPARENTE
        LblCover.setBounds(400, 0, 901, 701);
        LblCover.setOpaque(true);
        LblCover.setBackground(new Color(0, 0, 0, 100));
        LblCover.setBorder(BorderFactory.createLineBorder(Color.decode(Verde), 1));

        // ASIGNAMOS PROPIEDADES A NUESTRO WALLPAPER
        LblWallpaper.setBounds(400, 0, 900, 700);
        LblWallpaper.setIcon(Wallpaper2);
    }

    public void CrearBotones() {
        // CREAMOS Y AGREGAMOS NUESTRO BOTON DE JUGAR
        BtnJugar = new JButton();
        VentanaLogin.add(BtnJugar);

        // ASIGNAMOS PROPIEDADES A NUESTRO BOTON DE JUGAR
        BtnJugar.setBounds(10, 430, 380, 50);
        BtnJugar.setBackground(Color.decode(Verde));
        BtnJugar.setBorder(BorderFactory.createLineBorder(Color.decode(Verde)));
        BtnJugar.setFocusPainted(false);
        BtnJugar.setIcon(Jugar2);
        BtnJugar.addMouseListener(this);
        BtnJugar.addActionListener(this);
    }

    public void CrearEtiquetas() {

        // CREAMOS LA ETIQUETA PRINCIPAL
        LblTitulo = new JLabel("QUE TANTO SABES DE", JLabel.CENTER);
        VentanaLogin.add(LblTitulo);

        // CREAMOS EL LOGO DE LA ETIQUETA
        LblLogoMinecraft = new JLabel();
        VentanaLogin.add(LblLogoMinecraft);

        // CREAMOS LA ETIQUETA SECUNDARIA
        LblSubtitulo = new JLabel("AVERIGUALO", JLabel.CENTER);
        VentanaLogin.add(LblSubtitulo);

        // CREAMOS LA ETIQUETA DE NOMBRE DE USUARIO
        LblUsuario = new JLabel("INGRESA TU NOMBRE DE USUARIO");
        VentanaLogin.add(LblUsuario);

        // ASIGNAMOS PROPIEDADES A NUESTRO TITULO
        LblTitulo.setBounds(0, 60, 400, 40);
        LblTitulo.setFont(FuenteMinecraft.deriveFont(27f));
        LblTitulo.setForeground(Color.decode(Blanco));

        // ASIGNAMOS PROPIEDADES A NUESTRO LOGO
        LblLogoMinecraft.setBounds(0, 50, 400, 200);
        LblLogoMinecraft.setIcon(Logo2);

        // ASIGNAMOS PROPIEDADES A NUESTRO SUBTITULO
        LblSubtitulo.setBounds(0, 200, 400, 35);
        LblSubtitulo.setFont(FuenteMinecraft.deriveFont(27f));
        LblSubtitulo.setForeground(Color.decode(Blanco));

        // ASIGNAMOS PROPIEDADES A NUESTRO TXTUSUARIO
        LblUsuario.setBounds(10, 325, 380, 30);
        LblUsuario.setFont(FuenteMinecraft.deriveFont(15f));
        LblUsuario.setForeground(Color.decode(Blanco));
    }

    public void CrearTXT() {
        // CREAMOS Y AGREGAMOS NUESTRO TXT
        TxtUsuario = new JTextField();
        VentanaLogin.add(TxtUsuario);

        // ASIGNAMOS PROPIEDADES A NUESTRO TXT
        TxtUsuario.setBounds(10, 365, 380, 50);
        TxtUsuario.setBackground(Color.decode(Gris));
        TxtUsuario.setForeground(Color.decode(Verde));
        TxtUsuario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        TxtUsuario.setFont(FuenteMinecraft.deriveFont(13f));
        TxtUsuario.addMouseListener(this);
        TxtUsuario.addKeyListener(this);

        VentanaLogin.repaint();
    }

    public void keyTyped(KeyEvent e) {
        TxtUsuario.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        if (TxtUsuario.getText().length() >= 15) {
            e.consume();
        }
    }

    public void keyReleased(KeyEvent r) {
    }

    public void keyPressed(KeyEvent p) {
    }

    public void actionPerformed(ActionEvent e) {
        Usuario = TxtUsuario.getText().trim().toUpperCase();
        if (!Usuario.equals("")) {
            VentanaLogin.setVisible(false);
            VentanaNiveles AbriendoVentanaNiveles = new VentanaNiveles();
            AbriendoVentanaNiveles.CreandoVentanaNiveles();

        } else {
            TxtUsuario.setBorder(BorderFactory.createLineBorder(Color.decode(Rojo)));
        }
    }

    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == BtnJugar) {
            BtnJugar.setBackground(Color.decode(Limon));
        }
    }

    public void mouseExited(MouseEvent e) {
        BtnJugar.setBackground(Color.decode(Verde));
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public static void main(String[] args) {
        VentanaLogin AbrirLogin = new VentanaLogin();
        AbrirLogin.CreandoVentanaLogin();
    }

}
