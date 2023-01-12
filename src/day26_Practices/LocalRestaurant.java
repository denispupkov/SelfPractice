package day26_Practices;

import java.time.LocalDate;

public class LocalRestaurant {

    public static void main(String[] args) {

        Restaurant r1 = new Restaurant("John","Broadway",4);

        Server[] servers = {new Server("Mike",125,25.5,false,
                LocalDate.of(2020,10,10)),
                new Server("Hamsa",135,24.5,true,
                        LocalDate.of(2019,02,28)),
                new Server("Malika",145,23.5,true,
                        LocalDate.of(2018,05,11))};

        r1.hireServer(servers);
        Chef[] chefs = {new Chef("Abbas",155,26.5,true),
                new Chef("Bekzot",165,26.5,true),
                new Chef("Mila",175,26.5,false)};
        r1.hireChef(chefs);

        System.out.println(r1);





    }
}
