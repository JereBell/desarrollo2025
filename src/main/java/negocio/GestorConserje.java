package negocio;

import java.util.Scanner;

import dao.daoImp.ConserjeImp;
import dto.ConserjeDTO;

public class GestorConserje {
    private ConserjeImp conserjeImp;
    private ConserjeDTO conserjeDTO;

    public void autenticarUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su username: ");
        String username = sc.nextLine();
        
        System.out.print("Ingrese su password: ");
        String password = sc.nextLine();

        conserjeDTO = new ConserjeDTO(username, password);
        conserjeImp = new ConserjeImp();
        
        if(conserjeImp.autenticarUsuario(conserjeDTO)) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Autenticación fallida. Usuario o contraseña incorrectos.");
        }
    }
}
