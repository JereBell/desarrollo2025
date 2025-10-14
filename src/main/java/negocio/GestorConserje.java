package negocio;

import java.util.Scanner;

import dao.daoImp.ConserjeImp;
import dto.ConserjeDTO;

public class GestorConserje {


    public boolean autenticarUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su username: ");
        String username = sc.nextLine();
        
        System.out.print("Ingrese su password: ");
        String password = sc.nextLine();

        ConserjeDTO conserjeDTO = new ConserjeDTO(username, password);
        ConserjeImp conserjeDAO = new ConserjeImp();

        return conserjeDAO.autenticarUsuario(conserjeDTO);
    }
}
