package com.question1;
//author -sejal
    import java.util.ArrayList;
	import java.util.Collections;

	public class Productmain {

		public static void main(String[] args) {   
			Product p1=new Product(1,"ZARA",15000);//adding product details
			Product p2=new Product(2,"Myntra",5000);
			Product p3=new Product(3,"Trends",7000);
			Product p4=new Product(4,"Pantalons",4000);
			ArrayList<Product> pl=new ArrayList<>();
			pl.add(p1);
			pl.add(p2);
			pl.add(p3);
			pl.add(p4);
			Collections.sort(pl,new ProductPriceComparator());
			System.out.println("Sorting based on price of product"); //sorting product by price
			for(Product p:pl)
			{
				System.out.println(p.price+" "+p.Pname);
			}
			System.out.println("-------------------------");
			System.out.println("Sorting based on name of product");  //sorting product by name
			Collections.sort(pl, new ProductNameComparator());
			for(Product p:pl)
			{
				System.out.println(p.Pname);
			}

		}

	}
}
