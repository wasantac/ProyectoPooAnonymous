package logicBusiness;

import data.Nutritionist;
import data.Patient;
import data.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/*
 * @author ANONYMOUS
 * @author JULIAN C
 * @author DANIEL R
 * @author JUAN B
 */
public class BodymeterMainManager {

    public static void main(String[] args) throws Exception {
        
        BodymeterUIManager.showLoginScreen();
        
        /*----------------------------Bloque  pruebas-----------------------------------*/
        /*
        char opcion;
        Scanner keyboard = new Scanner(System.in);
        Login login = new Login();
        List<User> userList = new ArrayList<>();

        while (login.isActiveSession() == false) {

            System.out.println("\nBODYMETRIC");
            System.out.println("\n1. Iniciar sesión");
            System.out.println("2. Registrarse");
            System.out.println("3. Salir.");
            System.out.print("\nOpcion: ");

            opcion = keyboard.next().charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("Sección -LOGIN-\n");
                    //login.logIn();
                    //login.deleteDataUser("jbarrantes");
                    break;
                case '2':
                    System.out.println("Sección -REGISTRARSE-\n");
                    login.signUp();
                    break;
                case '3':
                    login.exit();
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        }//End While sesion

        while(login.isActiveSession() == true) {
            System.out.println("\nBODYMETRIC");
            System.out.println("\n1. Pacientes");
            System.out.println("2. Mediciones");
            System.out.println("3. Salir.");
            System.out.print("\nOpcion: ");

            opcion = keyboard.next().charAt(0);
            switch (opcion) {
                case '1':
                    System.out.println("\nSección -Pacientes-");
                    
                    Patient patient = new Patient("1062085362", "1", "Julian", "Castro", "1", "08/11/1993",
                            "3059117035", "juacastropa@unal.edu.co", "25", "0");
                    patient.saveData();
                    patient.getListOfPatientData();
                    
                    Nutritionist nutritionist = new Nutritionist("1061456492", "0", "Gabriela", "Rodríguez", "0",
                            "14/09/1997", "3222294208", "grodriguez@unal.edu.co", "22", login.createIdentifier());
                    nutritionist.saveData();
                    nutritionist.getListOfNutritionistsData();
                    break;
                case '2':
                    System.out.println("\nSección -Mediciones-");
                    CalculateAnthropometry allMeasures = 
                            new CalculateAnthropometry(64, 171, 89, 165.5,
                            8, 13, 4.5, 12, 6.5, 10, 13, 6, 0,
                            58.8,35.8, 29.8, 32, 26.7, 16.3, 96.3, 73.4, 75, 89.5, 50.5, 50.9, 34.5, 22.3,
                            41, 19.4, 25.6, 28.3, 20.6, 7.1, 5.6, 10.2 );
                    allMeasures.saveData();
                    //getMeasurements();
                    break;
                case '3':
                    login.exit();
                    //System.out.println("Sección -Mediciones-");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
                    break;
            }
        }
        
        //C-R-U-D
        //CREATE
        //login.signUp();
        //login.saveData("admin", "password", "id");
        //login.saveData("yo", "password", "");
        //UPDATE
        //login.setId("1062085362");
        /*System.out.print("Ingrese contraseña nueva: ");
        String password = keyboard.nextLine();
        System.out.print("Ingrese usuario nuevo: ");
        String user = keyboard.nextLine();
        password = password.replaceAll(" ", "").trim();
        login.setUser(user);
        login.setPassword(password);
        login.saveData(login.getUser(), password, login.getId());*/
        /*//DELETE
        System.out.print("Ingrese usuario a eliminar: ");
        String user = keyboard.nextLine();
        login.deleteDataUser(user);
        login.deleteDataUser("admin");//*/
        //READ
        //System.out.println("Usuario: " + login.getUser() + "  Contraseña: " + login.getPassword() + " Identificación: " + login.getId());
        
        
        
        //-------------- Bloque Pruebas -------------------------------------------//
        /*
        userList.add(new User("juacastropa", "1234", "juacastropa@unal.edu.co", false));
        userList.add(new Patient("julianscastro", "4321", "julians993@gmail.com", true));
        userList.add(new Patient("jbarrantes", "5678", "jbrrantes@unal.edu.co", false));
        userList.add(new User("drobayo", "9876", "drobayo@unal.edu.co", true));
        

        System.out.println("\nLista de usuarios por tipo de perfil");
        System.out.println("-----------------------------------");
        for (int i = 0; i <= userList.size() - 1; i++) {
            System.out.println(userList.get(i).toString());
        }

        System.out.print("\nIngrese sexo (1)Femenino (2) Masculino: ");
        String sex = null;

        //opcion = keyboard.next().charAt(0);
        opcion = '2';
        switch (opcion) {
            case '1':
                sex = "female";
                System.out.println("Seleccionó -Femenino-");
                break;
            case '2':
                sex = "male";
                System.out.println("Seleccionó -Masculino-");
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        System.out.print("Ingrese edad: ");
        keyboard.nextLine();
        String stringAge = keyboard.nextLine();
        //int age = Integer.parseInt(stringAge);
        int age = 25;
        System.out.println(age);

        CalculateAnthropometry basicMeasures = new CalculateAnthropometry(64, 171, 89, 165.5);
        double skinMass = basicMeasures.calculateSkinMass(sex, age, basicMeasures.getPeso(),
                basicMeasures.getTallaAltura());

        CalculateAnthropometry skinfoldMeasurements = new CalculateAnthropometry(8, 13, 4.5, 12, 6.5, 10, 13, 6, 0);
        double adiposeMass = skinfoldMeasurements.adiposeMassPrediction(basicMeasures.getTallaAltura());

        CalculateAnthropometry perimeterMeasurements = new CalculateAnthropometry(58.8,
                35.8, 29.8, 32, 26.7, 16.3, 96.3, 73.4, 75, 89.5, 50.5, 50.9, 34.5, 22.3);
        double muscleMass = perimeterMeasurements.muscleMassPrediction(basicMeasures.getTallaAltura(),
                skinfoldMeasurements.getPliegueTriceps(), skinfoldMeasurements.getPliegueSubescapular(),
                skinfoldMeasurements.getPliegueAnteriorMuslo(), skinfoldMeasurements.getPliegueMedialPierna());

        CalculateAnthropometry diameterMeasurements = new CalculateAnthropometry(41, 19.4, 25.6, 28.3, 20.6, 7.1, 5.6, 10.2);
        double boneMass = diameterMeasurements.boneMassPrediction(basicMeasures.getTallaAltura(),
                perimeterMeasurements.getPerimetroCabeza());

        double residualMass = diameterMeasurements.residualMassPrediction(basicMeasures.getTallaSentado(),
                perimeterMeasurements.getPerimetroAbdominalCinturaMinimo(), skinfoldMeasurements.getPliegueAbdominal());

        CalculateAnthropometry ca = new CalculateAnthropometry();
        ca.predictionTotalBodyMass(basicMeasures.getPeso(), skinMass, adiposeMass, muscleMass, boneMass, residualMass);

        //-------------- Fin Bloque Pruebas -------------------------------------------//*/
        
        

    }//End Main
}
