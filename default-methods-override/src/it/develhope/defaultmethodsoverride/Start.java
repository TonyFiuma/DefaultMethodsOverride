package it.develhope.defaultmethodsoverride;


public class Start implements Cloneable{

    public static void main(String[] args) throws CloneNotSupportedException{

        SmartphonePrice forProducer1 = new SmartphonePrice("Euros ",100);
        SmartphonePrice forProducer2 = new SmartphonePrice("Rubles ",6000);
        SmartphonePrice forRetail1 = new SmartphonePrice("Euros ",400);
        SmartphonePrice forRetail2 = new SmartphonePrice("Rubles ",24000);


        Smartphone xiaomi = new Smartphone("Xiaomi","x11",5000,forProducer1,forRetail1);
        Smartphone samsung = new Smartphone("Samsung","galaxy9",3500,forProducer2,forRetail2);

        System.out.println(xiaomi);
        System.out.println(xiaomi.hashCode());

        System.out.println(samsung);
        System.out.println(samsung.hashCode());

        boolean o = xiaomi.equals(samsung);
        System.out.println("Is it xiaomi equals to samsung = " + o);

        // clone the object
        Smartphone clonedSamsung2 = samsung;


        // check if smartphone2 is equal to smartphone2Clone
        try{
            System.out.println("CLONE " + clonedSamsung2);
            System.out.println("Is samsung equals to clonedSamsung = " + samsung.equals(clonedSamsung2));
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("There is an Error");

        }

    }
}
