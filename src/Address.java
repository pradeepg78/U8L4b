public class Address {
    private String streetNumber;
    private String streetName;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;

    public Address(String streetNumber, String streetName, String aptNumber, String city, String state, String zipCode)
    {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.aptNumber = aptNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public Address(String addy)
    {
        String add = addy;
        if (addy.contains("Apt"))
        {
            String apt = addy;
            int apa = apt.indexOf("A");
            apt = apt.substring(apa);
            int end = apt.indexOf(",");
            aptNumber = apt.substring(0,end);
        }
        else
        {
            aptNumber = "";
        }

        int number = add.indexOf(" ");
        streetNumber = add.substring(0,number);
        add = add.substring(number+1);
        int name = addy.indexOf(",");
        streetName = add.substring(0,name);
        add = add.substring(name+2);
        int cit = add.indexOf(",");
        city = add.substring(0,cit);
        add = add.substring(cit+2);
        int sta = add.indexOf(" ");
        state = add.substring(0,sta);
        zipCode = add.substring(sta+1);
    }

    public String getStreetNumber()
    {
        return streetNumber;
    }
    public String getStreetName()
    {
        return streetName;
    }
    public String getAptNumber()
    {
        return aptNumber;
    }
    public String getCity()
    {
        return city;
    }
    public String getState()
    {
        return state;
    }
    public String getZipCode()
    {
        return zipCode;
    }

    public String toString()
    {
        return streetNumber + " " + streetName + " " + aptNumber + ", " + city + ", " + state + " " + zipCode;
    }
}
