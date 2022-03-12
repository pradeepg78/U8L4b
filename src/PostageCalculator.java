public class PostageCalculator {

    //takes in two zip codes and the weight of the package
    public static double calculatePostage(int o,int d,double w)
    {
        double tenth = w / .1;
        double cost = 3.75 + tenth * .05;
        double diff = (Math.abs(o - d)) / 100.0;
        cost += diff;
        return cost;
    }

    //takes in two address' and thr weight of the package
    public static double calculatePostage(Address o, Address d, double w)
    {
        double tenth = w / .1;
        double cost = 3.75 + tenth *.05;
        double diff = (Math.abs((Integer.parseInt(o.getZipCode()))-Integer.parseInt(d.getZipCode()))) / 100.0;
        cost += diff;
        return cost;
    }

    //takes in the package
    public static double calculatePostage(Package p)
    {
        double cost = 0;
        double pMass = p.getMass();
        if (pMass > 40)
        {
            double greater = pMass-40;
            cost += greater;
            cost += 2;
        }
        else
        {
            double tenth = pMass / .1;
            cost += 3.75 + tenth * .05;
        }

        double diff = (Math.abs(Integer.parseInt(p.getDestination().getZipCode())-Integer.parseInt(p.getOrigin().getZipCode())))/100.0;
        cost += diff;
        if (p.getHeight() + p.getLength() + p.getWidth() > 36){
            cost += p.getHeight() * .1 + p.getWidth() * .1 + p.getLength() * .1;
        }
        return cost;
    }
}
