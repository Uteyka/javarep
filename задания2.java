import java.util.Scanner;



//private class City{
//    private String CityName;
//    private String RegionName;
//    private String CountryName;
//    private int Population ;
//    private int PochtIndex;
//    private int PhoneCode;
//
//    public City(String cityName, String regionName, String countryName, int population, int pochtIndex, int phoneCode){
//        this.CityName = cityName;
//        this.RegionName = regionName;
//        this.CountryName = countryName;
//        this.Population = population;
//        this.PochtIndex = pochtIndex;
//        this.PhoneCode = phoneCode;
//    }
//
//    public void setCityName(String cityName) {
//        CityName = cityName;
//    }
//
//    public void setRegionName(String regionName) {
//        RegionName = regionName;
//    }
//
//    public void setCountryName(String countryName) {
//        CountryName = countryName;
//    }
//
//    public void setPopulation(int population) {
//        Population = population;
//    }
//
//    public void setPochtIndex(int pochtIndex) {
//        PochtIndex = pochtIndex;
//    }
//
//    public void setPhoneCode(int phoneCode) {
//        PhoneCode = phoneCode;
//    }
//
//    public void printCity(){
//        IO.println(CityName);
//        IO.println(RegionName);
//        IO.println(CountryName);
//        IO.println(Population);
//        IO.println(PochtIndex);
//        IO.println(PhoneCode);
//    }
//
//    public String getCityName() {
//        return CityName;
//    }
//
//    public String getRegionName() {
//        return RegionName;
//    }
//
//    public String getCountryName() {
//        return CountryName;
//    }
//
//    public int getPopulation() {
//        return Population;
//    }
//
//    public int getPochtIndex() {
//        return PochtIndex;
//    }
//
//    public int getPhoneCode() {
//        return PhoneCode;
//    }
//
//    public String getCiryAddress(){
//        return  String.format("%s, %s, %s", CountryName, RegionName, CityName);
//    }
//}


private class Country {
    private String CountryName;
    private String ContinentName;
    private int Population;
    private String PhoneCode;
    private String StolName;

    public Country(String countryName, String continentName, int population, String phoneCode, String stolName) {
        CountryName = countryName;
        ContinentName = continentName;
        Population = population;
        PhoneCode = phoneCode;
        StolName = stolName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public void setContinentName(String continentName) {
        ContinentName = continentName;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public void setPhoneCode(String phoneCode) {
        PhoneCode = phoneCode;
    }

    public void setStolName(String stolName) {
        StolName = stolName;
    }

    public void printCountri(){
        IO.println(CountryName);
        IO.println(ContinentName);
        IO.println(Population);
        IO.println(PhoneCode);
        IO.println(StolName);
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getContinentName() {
        return ContinentName;
    }

    public int getPopulation() {
        return Population;
    }

    public String getPhoneCode() {
        return PhoneCode;
    }

    public String getStolName() {
        return StolName;
    }

}




void main() {
    Scanner scanner = new Scanner(System.in);


    Country country = new Country(
            "Россия",
            "Евразия",
            146000000,
            "+7",
            "Moscow "


    );

    country.printCountri();
    country.setPopulation(10000000);
    country.printCountri();
    IO.println(country.getStolName());
}

Scanner scanner = new Scanner(System.in);
