public class s033GeoPoint
{
    public static void main(String[] args)
    {
        double latitude1 = 37.52127220511242;
        double longitude1 = 127.0074462890625;
        double latitude2 = 35.137879119634185;
        double longitude2 = 129.04541015625;

        s033Geo geo1 = new s033Geo();
        geo1.latitude = latitude1;
        geo1.longitude = longitude1;
        System.out.println(geo1.latitude + "\t" + geo1.longitude);
        s033Geo geo2 = new s033Geo();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;
        System.out.println(geo2.latitude + "\t" + geo2.longitude);

        s033Geo geo = geo1;
        System.out.println(geo.latitude + "\t" + geo.longitude);
    }
}
