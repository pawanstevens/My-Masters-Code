//In this program I have taken diagonal between Atlanta and Savannah.
// So, the 1st triangle will be formed by Charlotte,Atlanta and Savannah.
// The 2nd triangle will be formed by Atlanta, Orlando and Savannah.
   
class Edition12C4E3EstimateAreas2 
{
	public static void main(String[] args) 
	{
        System.out.println("This program is about finding the area enclosed by four american cities,they are Atlanta, Orlando, Savannah and Charlotte");
        System.out.println("We have the latitude and longitude of these 4 cities from which we will find the area enclosed by them");
        System.out.println("latitude and longitude of Atlanta(33.7489954, -84.3879824)");
        System.out.println("latitude and longitude of Orlando(28.5383355, -81.3792365)");
        System.out.println("latitude and longitude of Savannah(32.0835407, -81.0998342)");
        System.out.println("latitude and longitude of Charlotte(35.2270869, -80.8431267)");

		double cha_lat,atl_lat,orl_lat,sav_lat,cha_long,atl_long,orl_long,sav_long,area1,area2,area,s1,s2,distanceBtwCharAndAtl,distanceBtwOrlAndSav,distanceBtwAtlAndOrl,distanceBtwSavAndChar,distanceBtwAtlAndSav;
		
		System.out.println("The mentioned latitudes and longitudes are in degrees, we first have to convert them to radians \n");
		cha_lat = Math.toRadians(35.2270869);
		atl_lat = Math.toRadians(33.7489954);
		cha_long = Math.toRadians(-80.8431267);
		atl_long = Math.toRadians(-84.3879824);
		orl_lat = Math.toRadians(28.5383355);
		sav_lat = Math.toRadians(32.0835407);
		orl_long = Math.toRadians(-81.3792365);
		sav_long = Math.toRadians(-81.0998342);
		
		System.out.println("Now we will find distance between these cities");
		distanceBtwCharAndAtl = 6371.01 * (Math.acos(Math.sin(cha_lat) * Math.sin(atl_lat) + Math.cos(cha_lat) * Math.cos(atl_lat) * Math.cos(atl_long - cha_long)));
		distanceBtwAtlAndOrl = 6371.01 * (Math.acos(Math.sin(atl_lat) * Math.sin(orl_lat) + Math.cos(atl_lat) * Math.cos(orl_lat) * Math.cos(orl_long - atl_long)));
		distanceBtwOrlAndSav = 6371.01 * (Math.acos(Math.sin(orl_lat) * Math.sin(sav_lat) + Math.cos(orl_lat) * Math.cos(sav_lat) * Math.cos(orl_long - sav_long)));
		distanceBtwSavAndChar = 6371.01 * Math.acos(Math.sin(sav_lat) * Math.sin(cha_lat) + Math.cos(sav_lat) * Math.cos(cha_lat) * Math.cos(sav_long - cha_long));
		distanceBtwAtlAndSav = 6371.01 * Math.acos(Math.sin(atl_lat) * Math.sin(sav_lat) + Math.cos(atl_lat) * Math.cos(sav_lat) * Math.cos(sav_long - atl_long));
		
		System.out.println("The distance between Charlotte and Atlanta is: " + distanceBtwCharAndAtl +"Km");
		System.out.println("The distance between Atlanta and Orlando is: " + distanceBtwAtlAndOrl + "Km");
		System.out.println("The distance between Orlando and Savannah is: " + distanceBtwOrlAndSav + "Km");
		System.out.println("The distance between Savannah and charlotte is: " + distanceBtwSavAndChar + "Km");
		System.out.println("The distance between Atlanta and Savannah is: " + distanceBtwAtlAndSav + "Km\n");
		
		s1 = (distanceBtwCharAndAtl + distanceBtwSavAndChar + distanceBtwAtlAndSav)/2;
		area1 = Math.pow((s1*(s1 - distanceBtwCharAndAtl )*(s1 - distanceBtwSavAndChar)*(s1 - distanceBtwAtlAndSav)), 0.5);
		System.out.println("The area of the triangle formed by Charlotte,Atlanta and Savannah is: " + area1 + "Km\u00B2");
		
		s2 = (distanceBtwAtlAndSav + distanceBtwAtlAndOrl + distanceBtwOrlAndSav)/2;
		area2 = Math.pow((s2 *(s2 - distanceBtwAtlAndSav)*(s2 - distanceBtwAtlAndOrl)*(s2 - distanceBtwOrlAndSav )), 0.5);
		System.out.println("The area of the triangle formed by Atlanta,Savannah and Orlando is: " + area2 + "Km\u00B2 \n");
        area = area1 + area2;
        System.out.println("So, the total area of the quadrilateral formed by these cities will be sum of both the triangles");
		System.out.println("The area of the quadrilateral formed by these cities is : " + area + "Km\u00B2");

		}
}
