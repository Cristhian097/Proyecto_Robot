package cuestionario;

/**
 *
 * @author Cristhian
 */
public class Preguntas {

    String vector[] = new String[40];//22
    String matriz[][] = new String[40][2];//22 2

    public String recorrer(int parametro) {
        vector[0] = "Qué es la ";
        vector[1] = "Qué es la ";
        vector[2] = "Qué son los ";
        vector[3] = "Qué es la ";
        vector[4] = "Qué es la ";
        vector[5] = "Qué es la ";
        vector[6] = "Qué es la ";
        vector[7] = "Qué son los ";
        vector[8] = "Qué es un robot ";
        vector[9] = "Qué es un robot ";
        vector[10] = "Qué es un robot ";
        vector[11] = "Qué es un robot ";
        vector[12] = "Qué es un robot ";
        vector[13] = "Qué son los ";
        vector[14] = "Qué son las ";
        vector[15] = "Qué es una ";
        vector[16] = "Qué son los ";
        vector[17] = "Qué es una ";
        vector[18] = "Qué es un ";
        vector[19] = "Qué es una ";
        vector[20] = "Qué es un ";
        vector[21] = "Qué es un ";
        vector[22] = "Qué es ";
        vector[23] = "Qué es un sistema ";
        vector[24] = "Qué es un ";
        vector[25] = "Qué es la ";
        vector[26] = "Qué es la ";
        vector[27] = "Qué es el ";
        vector[28] = "Qué es el ";
        vector[29] = "Qué es la ";
        vector[30] = "Qué es la ";
        vector[31] = "Qué es la ";
        vector[32] = "Qué es la ";
        vector[33] = "Qué es la ";
        vector[34] = "Qué son los ";
        vector[35] = "Qué es la ";
        vector[36] = "Qué son los ";//
        vector[37] = "Qué es la ";
        vector[38] = "Qué es la ";
        vector[39] = "Qué es la ";
       

        return vector[parametro];
    }

    public String matrizPalabras(int parametro1, int parametro2) {
        matriz[0][0] = "Tecnología ";
        matriz[0][1] = "<html>Es la combinación de diversas técnicas, habilidades, métodos y procesos empleados en un <br>determinado campo o sector.</html>";

        matriz[1][0] = "Robótica ";
        matriz[1][1] = "<html>Es una disciplina científica multidisciplinar que aborda temas relacionados a la investigación <br>y el desarrollo tecnológico en el diseño, construcciòn, operaciòn y aplicaciòn de los robots.</html>";

        matriz[2][0] = "Sistemas Computacionales ";
        matriz[2][1] = "<html>Representa la convergencia de muchas series de técnicas, artefactos y máquinas, que calculan <br>y guardan información y se encargan de un cierto grado de control automático. </html>";

        matriz[3][0] = "Informática ";
        matriz[3][1] = "<html> Es un conjunto de conocimientos técnicos que se ocupan del tratamiento automático de la información <br>por medio de computadoras.</html>";

        matriz[4][0] = "Mecánica ";
        matriz[4][1] = "<html> Es la parte física que estudia el movimiento y el equilibrio de los cuerpos, así como las <br>fuerzas que lo producen.</html>";

        matriz[5][0] = "Electrónica ";
        matriz[5][1] = "<html> Es la parte física que estudia los cambios y los movimientos de los electrones libres y la <br>acción de las fuerzas electromagnéticas.</html>";

        matriz[6][0] = "Morfologia aplicada a robots";
        matriz[6][1] = "<html>Es la forma y la estructura de los robots que condicionan en gran manera su funcionamiento <br>y prestaciones así como su campo de aplicación.</html>";

        matriz[7][0] = "Robots Manipuladores ";
        matriz[7][1] = "<html>Son un tipo de mecanismos creados específicamente para realizar tareas como desplazar <br>y sostener objetos. Están unidos mediante articulaciones que permiten producir el movimiento.</html>";

        matriz[8][0] = "Cartesiano ";
        matriz[8][1] = "<html>Es un robot industrial cuyos tres ejes principales de control son lineales y forman <br>ángulos rectos unos respectos de los otros.</html> ";

        matriz[9][0] = "Cilíndrico ";
        matriz[9][1] = "<html>Tiene tres articulaciones, la primera de base rotacional, mientras que la segunda y tercera <br>articulación son prismáticas para dar una mejor elasticidad en un plano, las cuales son de tipo lineal. <html>";

        matriz[10][0] = "Esférico ";
        matriz[10][1] = "<html>Articula 3 grados de libertad equivalente en analogía al cuerpo humano con: cintura, hombro y codo, <br>siendo este último prismático, permitiendo realizar movimientos como rotacional, angular y lineal.</html> ";

        matriz[11][0] = "Scara ";
        matriz[11][1] = "<html>Es un manipulador serial de 4 grados de libertad con posicionamiento horizontal que tiene como<br>principales características de ser un sistema no lineal, altamente acoplado y variable en el tiempo.</html>";

        matriz[12][0] = "Antropomórfico ";
        matriz[12][1] = "<html>Emula el comportamiento de un ser vivo, es decir son capaces de manipular objetos y realizar diversas<br>operaciones automáticas, programables y multifuncionales, mediante  3 o más ejes.</html>";

        matriz[13][0] = "Actuadores ";
        matriz[13][1] = "<html>Son los que suministran las señales necesarias a las articulaciones para producir movimiento <br>rotacional o lineal, algunos de los que se emplean suelen ser de tipo neumáticos, electrónicos o hidráulicos.</html>";

        matriz[14][0] = "Articulaciones ";
        matriz[14][1] = "<html>Son formadas por motores que le proporcionan el dinamismo, igualmente permiten la conexión y el <br>movimiento relativo entre eslabones consecutivos de un robot, pueden ser de tipo rotacional o lineal.</html>";

        matriz[15][0] = "Tarjeta de control ";
        matriz[15][1] = "<html>Es un sistema de adquisición y procesamiento de datos, la cual brinda la conexión con diferentes<br> dispositivos para darle función de entrada o salida.</html>";

        matriz[16][0] = "Receptores o sensores ";
        matriz[16][1] = "<html>Es un dispositivo que transforma una cantidad física (temperatura, posición, intensidad de la luz,<br> etc.) en una cantidad eléctrica que luego puede ser usada en el procesamiento de señales.</html>";

        matriz[17][0] = "Fuente de energía ";
        matriz[17][1] = "Es un fenómeno físico o químico del que es posible explotar su energía con fines económicos o biofísicos.";

        matriz[18][0] = "Proceso ";
        matriz[18][1] = "<html>Una unidad de actividad que se caracteriza por la ejecución de una secuencia de instrucciones, un<br>estado actual, y un conjunto de recursos del sistema asociados.​</html>";

        matriz[19][0] = "Computadora ";
        matriz[19][1] = "<html>Es una máquina digital programable que ejecuta una serie de comandos para procesar los datos de<br>entrada, obteniendo información que posteriormente se envía a las unidades de salida.</html>";

        matriz[20][0] = "Lenguaje de programación ";
        matriz[20][1] = "<html> Es un lenguaje informático especialmente diseñado para describir el conjunto de acciones <br>consecutivas o instrucciones que un equipo informático debe ejecutar.</html>";

        matriz[21][0] = "Algoritmo ";
        matriz[21][1] = "<html>Es un conjunto de instrucciones o reglas definidas, ordenadas y finitas que permite, solucionar<br> un problema, realizar un cómputo, procesar datos y llevar a cabo otras tareas o actividades.</html>";

        matriz[22][0] = "Procesamiento de datos ";
        matriz[22][1] = "<html>Es en general, la acumulación y manipulación de elementos de datos para producir información<br> significativa.<html>";

        matriz[23][0] = "BCI ";
        matriz[23][1] = "<html>Interfaz cerebro-ordenador, como un sistema de comunicación que monitoriza la actividad cerebral y <br>traduce determinadas características, correspondientes a las intenciones del usuario.</html>";

        matriz[24][0] = "Cerebro ";
        matriz[24][1] = "Es como una computadora que controla las funciones del organismo y el sistema nervioso ";

        matriz[25][0] = "Actividad cerebral ";
        matriz[25][1] = "<html>Es la actividad eléctrica producida por el cerebro. Estas ondas son de muy baja amplitud, son del <br>orden de microvoltios (en humanos) y no siempre siguen una sinusoide regular.</html>";

        matriz[26][0] = "Neurociencia ";
        matriz[26][1] = "<html>Es el estudio de cómo se desarrolla el sistema nervioso, su estructura y lo que hace. Estudia los<br>aspectos celulares, evolutivo, computacional, molecular y médico del sistema nervioso.</html>";

        matriz[27][0] = "Movimiento ";
        matriz[27][1] = "Es un cambio de la posición de un cuerpo a lo largo del tiempo respecto de un sistema de referencia.";

        matriz[28][0] = "Sistema Nervioso ";
        matriz[28][1] = "<html>Es un conjunto de células especializadas en la conducción de señales eléctricas y está formado<br>por neuronas y células gliales.</html>";

        matriz[29][0] = "Ictus ";
        matriz[29][1] = "<html>Es la principal causa de Daño Cerebral Adquirido. Se produce por la interrupción del flujo sanguíneo<br>en alguna zona del cerebro, que provoca la pérdida de capacidad asociada a esa zona del cerebro.</html>";

        matriz[30][0] = "Motricidad ";
        matriz[30][1] = "<html>Movimientos complejos y coordinados que realiza una persona y que implican al sistema locomotor,<br>siendo coordinados por la corteza cerebral y estructuras secundarias que lo modulan.</html>";

        matriz[31][0] = "Discapacidad Motriz ";
        matriz[31][1] = "<html>Discapacidad física motórica de una persona que tiene un estado físico que le impide de forma<br>permanente e irreversible moverse con la plena funcionalidad de su sistema motriz.</html>";

        matriz[32][0] = "Discapacidad gruesa ";
        matriz[32][1] = "<html>Implica una disminución de la movilidad total o parcial de uno o más miembros del cuerpo, la cual<br>dificulta la realización de actividades motoras convencionales.</html>";

        matriz[33][0] = "Movimientos incontrolados ";
        matriz[33][1] = "<html>Comprenden muchos tipos de movimientos que uno no puede controlar. Ellos pueden afectar los brazos,<br>las piernas, la cara, el cuello u otras partes del cuerpo.<html> ";


        matriz[34][0] = "Actividad diaria ";
        matriz[34][1] = "<html>Actividades del día a día necesarias para que una persona pueda mantener una correcta salud mental y<br>física. Estas actividades tienen una finalidad o propósito y pueden ser básicas o productivas.</html>";

        
        matriz[35][0] = "Procesos fisiológicos ";
        matriz[35][1] = "Es un proceso relativo al funcionamiento y las funciones de los seres vivos o unidades vivas integradas";
        
        matriz[36][0] = "Prótesis";
        matriz[36][1] = "Es una extensión artificial que reemplaza o provee una parte del cuerpo que falta por diversas razones.";
        
        matriz[37][0] = "Electromiografía ";
        matriz[37][1] = "Es la técnica de registro gráfico de la actividad eléctrica producida por los músculos esqueléticos.​";

        matriz[38][0] = "Electroencefalografia ";
        matriz[38][1] = "<html>Es una exploración neurofisiológica que se basa en el registro de la actividad bioeléctrica<br>cerebral en condiciones de reposo, en vigilia o sueño, y durante diversas activaciones.</html>";

        matriz[39][0] = "Unidad de Medición Inercial ";
        matriz[39][1] = "<html>Es un dispositivo electrónico que mide e informa acerca de la velocidad, orientación y fuerzas<br>gravitacionales de un aparato, usando una combinación de acelerómetros y giróscopos</html>";

        
        
        return matriz[parametro1][parametro2];
    }
}
