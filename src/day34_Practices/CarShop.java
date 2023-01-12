package day34_Practices;

public class CarShop {

    public static void main(String[] args) {

        Audi audi = new Audi("Q5",2015,21700,"Silver");
        BMW bmw = new BMW("M5",2019,31000,"Black");
        Honda honda = new Honda("Civic",2020,16000,"White");
        Toyota toyota = new Toyota("Corolla",2018,13000,"Yellow");
       Mercedes mercedes = new Mercedes("E280",2010,6000,"Brown");
       Nio nio = new Nio("Spark",2023,36900,"Red");
       Tesla tesla = new Tesla("Model S",2021,65000,"Blue");
       CydeoCar cydeoCar = new CydeoCar("Batch-28",2022,99000,"Purple");

       audi.autoPark();
       audi.drive();
       audi.start();

       bmw.drive();
       bmw.start();

       honda.drive();
       honda.start();

       toyota.drive();
       toyota.start();



    }
}
