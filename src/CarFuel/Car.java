package CarFuel;

class Car  {
    final double milage;
    final double oilcost;

     Car(double milage, double oilcost) {
        this.milage=milage;
        this.oilcost=oilcost;
    }

    void cost(double distance){
         double fuelcost= milage/100*distance;
         double oilloss= oilcost/1000*distance;
        System.out.println("Spritverbrauch: "+fuelcost+" Liter!");
        System.out.println("Ölverbrauch: "+ oilloss+" Liter!");

    }
    void cost(double distance,double cost){
        double fuelcost= (milage/100)*distance;
        double oilloss= (oilcost/1000)*distance;
        System.out.println("Spritverbrauch: "+fuelcost+" Liter!");
        System.out.println("Ölverbrauch: "+ oilloss+" Liter!");
        System.out.println("Für Sprit zahlen sie bei "+cost+"Euro pro Liter "+cost*fuelcost+"Euro!");

    }

}
