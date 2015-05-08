package request;

import java.util.Scanner;

public class Request {

    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        System.out.println("Elige una de estas cinco opciones: \n 1-Información del equipo \n 2- \n 3- \n 4- \n 5-");
        int x = option.nextInt();
        switch (x) {
            case 1:
                infSeleccion();


        }

    }

    private static void infSeleccion() {

        Scanner option = new Scanner(System.in);
        System.out.println("Elija una selección de las siguientes:");
        for (int i = 0; i < 31; i++) {
            System.out.println(teams().getTTeamInfo().get(i).getSName());
        }
        String country = option.nextLine();
        System.out.println(allGoalKeepers(country).getString());

    }

    private static ArrayOftTeamInfo teams() {
        request.Info service = new request.Info();
        request.InfoSoapType port = service.getInfoSoap();
        return port.teams();
    }

    private static ArrayOfString allGoalKeepers(java.lang.String sCountryName) {
        request.Info service = new request.Info();
        request.InfoSoapType port = service.getInfoSoap();
        return port.allGoalKeepers(sCountryName);
    }
}
