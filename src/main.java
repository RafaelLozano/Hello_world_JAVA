import com.doctor.Doctor;
import static ui.UiMenu.*;// se importa la clase completa
//static los metodos static se usa para llamarlos metodos sin necesidad de instancia la clase
public class main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.showId();

        Doctor doctor2 = new Doctor();
        doctor2.showId();

        showMenu();


    }
}
