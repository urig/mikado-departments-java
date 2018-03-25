package io.urig.mikadodepartments;

public class App {
	public static void main(String[] args) {
		User user = new User(new Brand());
		Brand brand = user.getBrand();
		System.out.println(brand.getPhone());
		System.out.println(brand.getEmailAddress());
	}
}
