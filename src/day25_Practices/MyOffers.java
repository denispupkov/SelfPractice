package day25_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer("LA","Miramax","Editor",85000,true,true,false,true);
        Offer offer2 = new Offer("CO","Dish","Installer",60000,true,false,false,false);
        Offer offer3 = new Offer("NY","Amex","Developer",120000,true,true,true,true);
        Offer offer4 = new Offer("WA","Boeing","Mechanic",65000,true,true,false,true);
        Offer offer5 = new Offer("NC","Coca-Cola","Driver",55000,false,true,false,false);
        Offer offer6 = new Offer("HI","Scooba Diving","Diver",45000,false,false,false,false);
        Offer offer7 = new Offer("IL","RealEstate Chicago","Broker",100000,false,false,false,false);

        Offer [] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));
        System.out.println(fullTimeOffers);
        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println(fullTimeOffers);
        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p -> !p.isWFH);
        System.out.println(localOffers);
        ArrayList<Offer> offerWithBenefits = new ArrayList<>(Arrays.asList(myOffers));
        offerWithBenefits.removeIf(p -> !p.hasBenefit && !p.hasPTO);
        System.out.println(offerWithBenefits);
        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(myOffers));
        devOffers.removeIf(p -> !p.jobTitle.toLowerCase().contains("developer"));
        System.out.println(devOffers);
        ArrayList<Offer> offersWith100k = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100k.removeIf(p -> p.salary<100000);
        System.out.println(offersWith100k);




    }

}
