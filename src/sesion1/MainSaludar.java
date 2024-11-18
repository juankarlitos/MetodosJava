package sesion1;

public class MainSaludar {

    public static void main(String[] args) {
        Saludar saludarObjeto = new Saludar();

        Saludar nombreApellido = new Saludar();


        nombreApellido.nombreApellido("juan", "inostroza");

        saludarObjeto.saludar("juan");
        saludarObjeto.saludar("Pamela");
        saludarObjeto.saludar("Catalina");
        saludarObjeto.saludar("Geraldine");




    }
}
